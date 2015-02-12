package com.example.ws;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;

import android.os.AsyncTask;
import android.util.Log;

import com.neology.pet.dominio.Generic;


/**
 * 
 * @author Cesar Segura
 *
 */
public class WsConsultaCatalogoProgramas extends AsyncTask<Object, Void, String> {

	private static final String metodo = "consultaDatos";
	private static final String namespace = "http://iface.service.web.pet.neology.com/";
	private static final String actionSoap = "";
	private static final String url = "http://192.168.32.34:8080/Sie/services/wsProgramas?wsdl";

	@Override
	protected String doInBackground(Object... params) {
		try {

			SoapObject request = new SoapObject(namespace, metodo);

			PropertyInfo genProperty = new PropertyInfo();
			genProperty.setName("arg0");
			genProperty.setValue(params[0]);
			genProperty.setType(Generic.class);
			request.addProperty(genProperty);
			SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
			soapEnvelope.setOutputSoapObject(request);

			soapEnvelope.addMapping(namespace, "Generic", params[0].getClass());

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