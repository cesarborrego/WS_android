package com.example.ws;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.neology.pet.dominio.EpiPerson;
import com.neology.pet.dominio.Generic;

public class MainActivity extends ActionBarActivity {
	//IMAGEN
	private static final String KEY_BLOB_IMG = "lstImages";
	private static final String KEY_TYPE_IMG = "image_Type";
	private static final String KEY_BLOB_SGM = "blob_Segment";

	// Metodo que queremos ejecutar en el servicio web
	private static final String metodo = "insertaUbicacion";
	// Namespace definido en el servicio web
	private static final String namespace = "http://iface.service.web.pet.neology.com/";
	// namespace + metodo
	//private static final String actionSoap = namespace+metodo;
	private static final String actionSoap = "";
	// Fichero de definicion del servcio web
//	private static final String url = "http://162.144.86.163:8086/Sie/wsUbicacion?wsdl";
	private static final String url = "http://192.168.32.78:8080/Sie/services/wsUbicacion";

	Button btn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn = (Button)findViewById(R.id.button1);
		btn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				wsSoap();
			}
		});

	}
	
	public void wsSoap(){
		wsAsync wsaAsync = new wsAsync();
		wsaAsync.execute();
	}
	
	public class wsAsync extends AsyncTask<Void, Void, String> {
		@Override
		protected String doInBackground(Void... params) {
			try {
				Generic dominio = null;
				EpiPerson ep = null;
				SoapObject request = new SoapObject(namespace, metodo);
				dominio = new Generic();
				ep = new EpiPerson();
				ep.setPersonID("5600456659");
				ep.setdLatitud(102.5);
				ep.setdLongitude(12.5);
				PropertyInfo genEpi = new PropertyInfo();
				genEpi.setName("objeto");
				genEpi.setValue(ep);
				genEpi.setType(EpiPerson.class);
				String gson = new Gson().toJson(ep);
				dominio.setObjeto(gson);
				//dominio.setObjeto("<EpiPerson><personID>5600456659</personID><dLatitud>1.2</dLatitud><dLongitude>2.3</dLongitude></EpiPerson>");
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
	
	
	public void ws(){
		AsyncHttpClient asyncHttpClient = new AsyncHttpClient();
		asyncHttpClient.setBasicAuth("alex", "admin");
		asyncHttpClient.get("http://162.144.86.163:8086/RegistroBeneficiarios-web/rest/registros/searchByClvImg/5600456659", new AsyncHttpResponseHandler(){
			@Override
			public void onSuccess(String response) {
				if(response!=null){
					try {
						JSONObject obj = new JSONObject(response);
						JSONObject firstParentInfo = (JSONObject) obj.get("person_ID");
						String secondParentInfo = firstParentInfo.getString("first_Name");
						JSONArray dataImg = (JSONArray)obj.get(KEY_BLOB_IMG);
						Log.d("NOMBRE", secondParentInfo);

						String [] sImage = new String[dataImg.length()];
						String [] tipoImg = new String [dataImg.length()];

						for(int i=0; i<dataImg.length(); i++ ){
							JSONObject jsonImgData = new JSONObject(dataImg.get(i).toString());
							tipoImg [i] = jsonImgData.getString(KEY_TYPE_IMG);
							Log.d("TYPE_IMG", tipoImg[i]);
							sImage[i]=jsonImgData.getString(KEY_BLOB_SGM);
							Log.d("JSON IMG", sImage[i]);
						}	

					} catch (JSONException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
	}
}
