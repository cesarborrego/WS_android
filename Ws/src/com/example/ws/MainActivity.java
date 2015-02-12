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
import com.neology.pet.dominio.TblAsistencias;
import com.neology.pet.dominio.TblAsociacionBeneficiarios;

public class MainActivity extends ActionBarActivity {
	//IMAGEN
	private static final String KEY_BLOB_IMG = "lstImages";
	private static final String KEY_TYPE_IMG = "image_Type";
	private static final String KEY_BLOB_SGM = "blob_Segment";
	
	public static final int INSERTA_UBICACION = 0;
	public static final int CATALOGO_PROGRAMAS = 1;
	public static final int CONSULTA_ASISTENCIAS = 2;



	Button btn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn = (Button)findViewById(R.id.button1);
		btn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				wsSoap(INSERTA_UBICACION);
			}
		});

	}

	public void wsSoap(int typeConsult){
		switch (typeConsult) {
		case INSERTA_UBICACION:
			insertaUbicacionParams();
			break;

		case CATALOGO_PROGRAMAS:
			catalogoProgramas();
			break;
			
		case CONSULTA_ASISTENCIAS:
			break;
		}
	}
	
	private void insertaUbicacionParams() {
		TblAsistencias ep = null;
		TblAsociacionBeneficiarios tb = null;
		EpiPerson p = null;
		ep = new TblAsistencias();
		tb = new TblAsociacionBeneficiarios();
		p = new EpiPerson();
		p.setPersonID("5600456659");
		tb.setPersonID(p);
		//		ep.setBeneficiarioID("5600456659");
		ep.setBeneficiarioID(tb);
		ep.setLatitud(102.5);
		ep.setLongitud(12.5);
		ep.setAsistenciaID(1);

		WsInsertaUbicacion wsaAsync = new WsInsertaUbicacion();
		wsaAsync.execute(ep);
	}
	
	private void catalogoProgramas() {
		Generic dominio = new Generic();
		dominio.setFirst(0);
		dominio.setPageSize(1);
		
		WsConsultaCatalogoProgramas ws = new WsConsultaCatalogoProgramas();
		ws.execute(dominio);
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
