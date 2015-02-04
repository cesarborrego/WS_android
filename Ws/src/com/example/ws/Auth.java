package com.example.ws;

import java.io.IOException;

import org.kobjects.base64.Base64;
import org.ksoap2.transport.HttpTransportSE;
import org.ksoap2.transport.ServiceConnection;
/**
 * 
 * @author Cesar Segura
 *
 */

public class Auth extends HttpTransportSE{
	
	private String usr;
	private String pwd;

	public Auth(String url, String usr, String pwd) {
		super(url);
		this.usr = usr;
		this.pwd = pwd;
	}
	
	@Override
	public ServiceConnection getServiceConnection() throws IOException {
		ServiceConnection serviceConnection = super.getServiceConnection();
	    addBasicAuthentication(serviceConnection);
	    return serviceConnection;
	}
	
	protected void addBasicAuthentication(ServiceConnection serviceConnection) 
		      throws IOException {
		if (usr != null && pwd != null) {
		      StringBuffer buffer = new StringBuffer(usr);
		      buffer.append(':').append(pwd);
		      byte[] bytes = buffer.toString().getBytes();
		      buffer.setLength(0);
		      buffer.append("Basic ");
		      Base64.encode(bytes, 0, bytes.length, buffer);
		      serviceConnection.setRequestProperty
		        ("Authorization", buffer.toString());
		    }
		
	}

}
