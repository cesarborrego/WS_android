package com.example.utils;

import java.io.IOException;

import org.ksoap2.serialization.Marshal;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/**
 * 
 * @author Cesar Segura
 *
 */
public class MarshalDouble implements Marshal{

	@Override
	public Object readInstance(XmlPullParser arg0, String arg1, String arg2,
			PropertyInfo arg3) throws IOException, XmlPullParserException {
		return Double.parseDouble(arg0.nextText());
	}

	@Override
	public void register(SoapSerializationEnvelope arg0) {
		arg0.addMapping(arg0.xsd, "double", Double.class, this);
	}

	@Override
	public void writeInstance(XmlSerializer arg0, Object arg1) throws IOException {
		arg0.text(arg1.toString());
	}

}
