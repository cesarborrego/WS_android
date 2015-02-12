package com.example.ws;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;

import android.os.AsyncTask;
import android.util.Log;

import com.google.gson.Gson;
import com.neology.pet.dominio.Generic;
import com.neology.pet.dominio.TblAsistencias;


/**
 * 
 * @author Cesar Segura
 *
 */
public class WsInsertaUbicacion extends AsyncTask<Object, Void, String> {

	private static final String metodo = "insertaUbicacion";
	private static final String namespace = "http://iface.service.web.pet.neology.com/";
	private static final String actionSoap = "";
	private static final String url = "http://192.168.32.34:8080/Sie/services/wsUbicacion";

	@Override
	protected String doInBackground(Object... params) {
		try {

			SoapObject request = new SoapObject(namespace, metodo);

			PropertyInfo genEpi = new PropertyInfo();
			genEpi.setName("objeto");
			genEpi.setValue(params[0]);
			//Aqui solo hay que cambiar la clase que vamos a mandar al WS en formato json
			genEpi.setType(TblAsistencias.class);
			String gson = new Gson().toJson(params[0]);
			Generic dominio = new Generic();
			dominio.setObjeto(gson);
			System.out.println("Data: "+dominio.getObjeto());

			PropertyInfo genProperty = new PropertyInfo();
			genProperty.setName("arg0");
			genProperty.setValue(dominio);
			genProperty.setType(Generic.class);
			request.addProperty(genProperty);
			SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
			soapEnvelope.setOutputSoapObject(request);

			soapEnvelope.addMapping(namespace, "Generic", dominio.getClass());

			Auth transport = new Auth(url, "petAdmin", "Admin2o15");

			try {
				transport.debug = true;
				Log.i("Examples", "Connecting to internet...");
				transport.call(actionSoap, soapEnvelope);
				Log.d("dump Request: " ,transport.requestDump);
				Log.d("dump response: " ,transport.responseDump);
				Object response = soapEnvelope.bodyIn;
				Log.i("Examples", "Result:"+response); 
			} catch (Exception e) {
				Log.e("Examples", e.getMessage());
				e.printStackTrace();
			}			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "";
	}

	@Override
	protected void onPostExecute(String result) {
		super.onPostExecute(result);
		Log.d("RESULT", result);
	}		
}