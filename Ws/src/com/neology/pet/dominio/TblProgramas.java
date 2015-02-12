/**
 * Todos los Derechos Reservados © 2015 Neology Sistema Integral de
 * Enrolamiento. Este software contiene información propiedad exclusiva de
 * Neology considerada Confidencial. Queda totalmente prohibido su uso o
 * divulgación en forma parcial o total.
 * -----------------------------------------------------------------------------------------------------------------
 * Sitio web: http://www.neology-rfid.com Nombre de Aplicacion: Programa de
 * Empleo Temporal Nombre de archivo: Programas.java Fecha de creacion: 2015
 *
 * @author: Cristian Medina Hernandez
 * @version 1.0
 *
 * Bitácora de modificaciones: CR/Defecto Fecha Autor Descripción del cambio
 * -----------------------------------------------------------------------------------------------------------------
*
 */
package com.neology.pet.dominio;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Cristian Medina Hernandez
 */
public class TblProgramas implements Serializable {

    private static final long serialVersionUID = -8114167310123343340L;
    private Integer intIdPrograma;
    private Integer IntEstatus;
    private Date dtmFechaInicio;
    private Date dtmFechaTermino;
    private String strInstitucion;
    private String strNombre;
    private String strNombreResponsable;
    private String strApPaternoResponsable;
    private String apMaternoResponsable;
    private String strTelefono1;
    private String strTelefono2;
    private String strUrl;
    private String strDescripcion;
    private String strCalle;
    private String strNumeroExterior;
    private String strNumeroInterior;
    private String strColonia;
    private String strLocalidad;
    private Double dblLatitude;
    private Double dblLongitude;
    private TblMunicipios intIdMunicipio;
    private TblEstados intIdEstado;
    private Integer position;
    private Boolean edit;

    /**
     * @return the intIdPrograma
     */
    public Integer getIntIdPrograma() {
        return intIdPrograma;
    }

    /**
     * @param intIdPrograma the intIdPrograma to set
     */
    public void setIntIdPrograma(Integer intIdPrograma) {
        this.intIdPrograma = intIdPrograma;
    }

    /**
     * @return the strNombre
     */
    public String getStrNombre() {
        return strNombre;
    }

    /**
     * @param strNombre the strNombre to set
     */
    public void setStrNombre(String strNombre) {
        this.strNombre = strNombre;
    }

    /**
     * @return the strNombreResponsable
     */
    public String getStrNombreResponsable() {
        return strNombreResponsable;
    }

    /**
     * @param strNombreResponsable the strNombreResponsable to set
     */
    public void setStrNombreResponsable(String strNombreResponsable) {
        this.strNombreResponsable = strNombreResponsable;
    }

    /**
     * @return the strApPaternoResponsable
     */
    public String getStrApPaternoResponsable() {
        return strApPaternoResponsable;
    }

    /**
     * @param strApPaternoResponsable the strApPaternoResponsable to set
     */
    public void setStrApPaternoResponsable(String strApPaternoResponsable) {
        this.strApPaternoResponsable = strApPaternoResponsable;
    }

    /**
     * @return the apMaternoResponsable
     */
    public String getApMaternoResponsable() {
        return apMaternoResponsable;
    }

    /**
     * @param apMaternoResponsable the apMaternoResponsable to set
     */
    public void setApMaternoResponsable(String apMaternoResponsable) {
        this.apMaternoResponsable = apMaternoResponsable;
    }

    /**
     * @return the strTelefono1
     */
    public String getStrTelefono1() {
        return strTelefono1;
    }

    /**
     * @param strTelefono1 the strTelefono1 to set
     */
    public void setStrTelefono1(String strTelefono1) {
        this.strTelefono1 = strTelefono1;
    }

    /**
     * @return the strTelefono2
     */
    public String getStrTelefono2() {
        return strTelefono2;
    }

    /**
     * @param strTelefono2 the strTelefono2 to set
     */
    public void setStrTelefono2(String strTelefono2) {
        this.strTelefono2 = strTelefono2;
    }

    /**
     * @return the strUrl
     */
    public String getStrUrl() {
        return strUrl;
    }

    /**
     * @param strUrl the strUrl to set
     */
    public void setStrUrl(String strUrl) {
        this.strUrl = strUrl;
    }

    /**
     * @return the strDescripcion
     */
    public String getStrDescripcion() {
        return strDescripcion;
    }

    /**
     * @param strDescripcion the strDescripcion to set
     */
    public void setStrDescripcion(String strDescripcion) {
        this.strDescripcion = strDescripcion;
    }

    /**
     * @return the strCalle
     */
    public String getStrCalle() {
        return strCalle;
    }

    /**
     * @param strCalle the strCalle to set
     */
    public void setStrCalle(String strCalle) {
        this.strCalle = strCalle;
    }

    /**
     * @return the strNumeroExterior
     */
    public String getStrNumeroExterior() {
        return strNumeroExterior;
    }

    /**
     * @param strNumeroExterior the strNumeroExterior to set
     */
    public void setStrNumeroExterior(String strNumeroExterior) {
        this.strNumeroExterior = strNumeroExterior;
    }

    /**
     * @return the strNumeroInterior
     */
    public String getStrNumeroInterior() {
        return strNumeroInterior;
    }

    /**
     * @param strNumeroInterior the strNumeroInterior to set
     */
    public void setStrNumeroInterior(String strNumeroInterior) {
        this.strNumeroInterior = strNumeroInterior;
    }

    /**
     * @return the strColonia
     */
    public String getStrColonia() {
        return strColonia;
    }

    /**
     * @param strColonia the strColonia to set
     */
    public void setStrColonia(String strColonia) {
        this.strColonia = strColonia;
    }

    /**
     * @return the strLocalidad
     */
    public String getStrLocalidad() {
        return strLocalidad;
    }

    /**
     * @param strLocalidad the strLocalidad to set
     */
    public void setStrLocalidad(String strLocalidad) {
        this.strLocalidad = strLocalidad;
    }

    /**
     * @return the dblLatitude
     */
    public Double getDblLatitude() {
        return dblLatitude;
    }

    /**
     * @param dblLatitude the dblLatitude to set
     */
    public void setDblLatitude(Double dblLatitude) {
        this.dblLatitude = dblLatitude;
    }

    /**
     * @return the dblLongitude
     */
    public Double getDblLongitude() {
        return dblLongitude;
    }

    /**
     * @param dblLongitude the dblLongitude to set
     */
    public void setDblLongitude(Double dblLongitude) {
        this.dblLongitude = dblLongitude;
    }

    /**
     * @return the intIdMunicipio
     */
    public TblMunicipios getIntIdMunicipio() {
        return intIdMunicipio;
    }

    /**
     * @param intIdMunicipio the intIdMunicipio to set
     */
    public void setIntIdMunicipio(TblMunicipios intIdMunicipio) {
        this.intIdMunicipio = intIdMunicipio;
    }

    /**
     * @return the intIdEstado
     */
    public TblEstados getIntIdEstado() {
        return intIdEstado;
    }

    /**
     * @param intIdEstado the intIdEstado to set
     */
    public void setIntIdEstado(TblEstados intIdEstado) {
        this.intIdEstado = intIdEstado;
    }

    /**
     * @return the IntEstatus
     */
    public Integer getIntEstatus() {
        return IntEstatus;
    }

    /**
     * @param IntEstatus the IntEstatus to set
     */
    public void setIntEstatus(Integer IntEstatus) {
        this.IntEstatus = IntEstatus;
    }

    /**
     * @return the dtmFechaInicio
     */
    public Date getDtmFechaInicio() {
        return dtmFechaInicio;
    }

    /**
     * @param dtmFechaInicio the dtmFechaInicio to set
     */
    public void setDtmFechaInicio(Date dtmFechaInicio) {
        this.dtmFechaInicio = dtmFechaInicio;
    }

    /**
     * @return the dtmFechaTermino
     */
    public Date getDtmFechaTermino() {
        return dtmFechaTermino;
    }

    /**
     * @param dtmFechaTermino the dtmFechaTermino to set
     */
    public void setDtmFechaTermino(Date dtmFechaTermino) {
        this.dtmFechaTermino = dtmFechaTermino;
    }

    /**
     * @return the strInstitucion
     */
    public String getStrInstitucion() {
        return strInstitucion;
    }

    /**
     * @param strInstitucion the strInstitucion to set
     */
    public void setStrInstitucion(String strInstitucion) {
        this.strInstitucion = strInstitucion;
    }

    /**
     * @return the position
     */
    public Integer getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(Integer position) {
        this.position = position;
    }

    /**
     * @return the edit
     */
    public Boolean getEdit() {
        return edit;
    }

    /**
     * @param edit the edit to set
     */
    public void setEdit(Boolean edit) {
        this.edit = edit;
    }

}
