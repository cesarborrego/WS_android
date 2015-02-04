/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neology.pet.dominio;

import java.util.Hashtable;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;

/**
 *
 * @author SergioToshiba
 */
public class Generic implements KvmSerializable {

	private static final long serialVersionUID = -1819714420724627723L;
    private Boolean status;
    private String mensaje;
    private Integer totalRegistros = 0;
    private Integer registrosInsertados = 0;
    private Integer registrosFallidos = 0;
    private String titulo;
    private String userToken;
    private String passwordToken;
    private Object objeto;    
    private Integer first;
    private Integer pageSize;
    private Boolean ascending;
    private Boolean descending;
    
    public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Integer getTotalRegistros() {
		return totalRegistros;
	}

	public void setTotalRegistros(Integer totalRegistros) {
		this.totalRegistros = totalRegistros;
	}

	public Integer getRegistrosInsertados() {
		return registrosInsertados;
	}

	public void setRegistrosInsertados(Integer registrosInsertados) {
		this.registrosInsertados = registrosInsertados;
	}

	public Integer getRegistrosFallidos() {
		return registrosFallidos;
	}

	public void setRegistrosFallidos(Integer registrosFallidos) {
		this.registrosFallidos = registrosFallidos;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getUserToken() {
		return userToken;
	}

	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}

	public String getPasswordToken() {
		return passwordToken;
	}

	public void setPasswordToken(String passwordToken) {
		this.passwordToken = passwordToken;
	}

	public Object getObjeto() {
		return objeto;
	}

	public void setObjeto(Object objeto) {
		this.objeto = objeto;
	}

	public Integer getFirst() {
		return first;
	}

	public void setFirst(Integer first) {
		this.first = first;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Boolean getAscending() {
		return ascending;
	}

	public void setAscending(Boolean ascending) {
		this.ascending = ascending;
	}

	public Boolean getDescending() {
		return descending;
	}

	public void setDescending(Boolean descending) {
		this.descending = descending;
	}

	@Override
	public Object getProperty(int arg0) {
		switch (arg0) {
		case 0:
			return status;
		case 1:
			return mensaje;
		case 2:
			return totalRegistros;
		case 3:
			return registrosInsertados;
		case 4:
			return registrosFallidos;
		case 5:
			return titulo;
		case 6:
			return userToken;
		case 7:
			return passwordToken;
		case 8:
			return objeto;
		case 9:
			return first;
		case 10:
			return pageSize;
		case 11:
			return ascending;
		case 12:
			return descending;
		}
		return null;
	}

	@Override
	public int getPropertyCount() {
		return 13;
	}

	@Override
	public void getPropertyInfo(int arg0, Hashtable arg1, PropertyInfo arg2) {
		switch (arg0) {
		case 0:	
			arg2.type =PropertyInfo.BOOLEAN_CLASS;
			arg2.name = "status";
			break;
		case 1:			
			arg2.type =PropertyInfo.STRING_CLASS;
			arg2.name = "mensaje";
			break;
		case 2:
			arg2.type =PropertyInfo.INTEGER_CLASS;
			arg2.name = "totalRegistros";
			break;
		case 3:
			arg2.type =PropertyInfo.INTEGER_CLASS;
			arg2.name = "registrosInsertados";
			break;
		case 4:
			arg2.type =PropertyInfo.INTEGER_CLASS;
			arg2.name = "registrosFallidos";
			break;
		case 5:
			arg2.type =PropertyInfo.STRING_CLASS;
			arg2.name = "titulo";
			break;
		case 6:
			arg2.type =PropertyInfo.STRING_CLASS;
			arg2.name = "userToken";
			break;
		case 7:
			arg2.type =PropertyInfo.STRING_CLASS;
			arg2.name = "passwordToken";
			break;
		case 8:
			arg2.type =PropertyInfo.OBJECT_CLASS;
			arg2.name = "objeto";
			break;
		case 9:
			arg2.type =PropertyInfo.INTEGER_CLASS;
			arg2.name = "first";
			break;
		case 10:
			arg2.type =PropertyInfo.INTEGER_CLASS;
			arg2.name = "pageSize";
			break;
		case 11:
			arg2.type =PropertyInfo.BOOLEAN_CLASS;
			arg2.name = "ascending";
			break;
		case 12:
			arg2.type =PropertyInfo.BOOLEAN_CLASS;
			arg2.name = "descending";
			break;
		default:
			break;
		}
	}

	@Override
	public void setProperty(int arg0, Object arg1) {
		switch (arg0) {
		case 0:	
			status = Boolean.parseBoolean(arg1.toString());
			break;
		case 1:			
			mensaje = arg1.toString();
			break;
		case 2:
			totalRegistros = Integer.parseInt(arg1.toString());
			break;
		case 3:
			registrosInsertados = Integer.parseInt(arg1.toString());
			break;
		case 4:
			registrosFallidos = Integer.parseInt(arg1.toString());
			break;
		case 5:
			titulo = arg1.toString();
			break;
		case 6:
			userToken = arg1.toString();
			break;
		case 7:
			passwordToken = arg1.toString();
			break;
		case 8:
			objeto = arg1;
			break;
		case 9:
			first = Integer.parseInt(arg1.toString());
			break;
		case 10:
			pageSize = Integer.parseInt(arg1.toString());
			break;
		case 11:
			ascending = Boolean.parseBoolean(arg1.toString());
			break;
		case 12:
			descending = Boolean.parseBoolean(arg1.toString());
			break;
		default:
			break;
		}
	}

	@Override
	public String getInnerText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setInnerText(String arg0) {
		// TODO Auto-generated method stub
		
	}

}
