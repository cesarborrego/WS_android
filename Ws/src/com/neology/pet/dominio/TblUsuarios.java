/**
 * Todos los Derechos Reservados © 2015 Neology Sistema Integral de
 * Enrolamiento. Este software contiene información propiedad exclusiva de
 * Neology considerada Confidencial. Queda totalmente prohibido su uso o
 * divulgación en forma parcial o total.
 * -----------------------------------------------------------------------------------------------------------------
 * Sitio web: http://www.neology-rfid.com Nombre de Aplicacion: Programa de
 * Empleo Temporal Nombre de archivo: TblUsuarios.java Fecha de creacion: 2015
 *
 * @author: Miguel Angel López Renteria
 * @version 1.0
 *
 * Bitácora de modificaciones: CR/Defecto Fecha Autor Descripción del cambio
 * -----------------------------------------------------------------------------------------------------------------
*
 */
package com.neology.pet.dominio;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Sergio Alberto Cortés Rios
 */
public class TblUsuarios implements Serializable {

    private static final long serialVersionUID = -1232152665735352109L;
    private Integer intIdUsuario;
    private String strUsuario;
    private String strPassword;
    private Integer intEstatus;
    private Integer intTipoUsuario;
    private TblTrabajadores intIdTrabajadores;
    private String strHuellaDigital;
    private List<TblAccesos> tblAccesosList;
    private Date fechaRegistro;
    private Boolean autenticado;
    private Boolean edit;
    private Integer position;
    private TblModulos moduloElegido;
    private TblPerfiles perfilElegido;

    public TblModulos getModuloElegido() {
        return moduloElegido;
    }

    public void setModuloElegido(TblModulos moduloElegido) {
        this.moduloElegido = moduloElegido;
    }

    public TblPerfiles getPerfilElegido() {
        return perfilElegido;
    }

    public void setPerfilElegido(TblPerfiles perfilElegido) {
        this.perfilElegido = perfilElegido;
    }

    /**
     * @return the intIdUsuario
     */
    public Integer getIntIdUsuario() {
        return intIdUsuario;
    }

    /**
     * @param intIdUsuario the intIdUsuario to set
     */
    public void setIntIdUsuario(Integer intIdUsuario) {
        this.intIdUsuario = intIdUsuario;
    }

    /**
     * @return the strUsuario
     */
    public String getStrUsuario() {
        return strUsuario;
    }

    /**
     * @param strUsuario the strUsuario to set
     */
    public void setStrUsuario(String strUsuario) {
        this.strUsuario = strUsuario;
    }

    /**
     * @return the strPassword
     */
    public String getStrPassword() {
        return strPassword;
    }

    /**
     * @param strPassword the strPassword to set
     */
    public void setStrPassword(String strPassword) {
        this.strPassword = strPassword;
    }

    /**
     * @return the intEstatus
     */
    public Integer getIntEstatus() {
        return intEstatus;
    }

    /**
     * @param intEstatus the intEstatus to set
     */
    public void setIntEstatus(Integer intEstatus) {
        this.intEstatus = intEstatus;
    }

    /**
     * @return the intTipoUsuario
     */
    public Integer getIntTipoUsuario() {
        return intTipoUsuario;
    }

    /**
     * @param intTipoUsuario the intTipoUsuario to set
     */
    public void setIntTipoUsuario(Integer intTipoUsuario) {
        this.intTipoUsuario = intTipoUsuario;
    }

    /**
     * @return the intIdTrabajadores
     */
    public TblTrabajadores getIntIdTrabajadores() {
        return intIdTrabajadores;
    }

    /**
     * @param intIdTrabajadores the intIdTrabajadores to set
     */
    public void setIntIdTrabajadores(TblTrabajadores intIdTrabajadores) {
        this.intIdTrabajadores = intIdTrabajadores;
    }

    /**
     * @return the strHuellaDigital
     */
    public String getStrHuellaDigital() {
        return strHuellaDigital;
    }

    /**
     * @param strHuellaDigital the strHuellaDigital to set
     */
    public void setStrHuellaDigital(String strHuellaDigital) {
        this.strHuellaDigital = strHuellaDigital;
    }

    /**
     * @return the tblAccesosList
     */
    public List<TblAccesos> getTblAccesosList() {
        return tblAccesosList;
    }

    /**
     * @param tblAccesosList the tblAccesosList to set
     */
    public void setTblAccesosList(List<TblAccesos> tblAccesosList) {
        this.tblAccesosList = tblAccesosList;
    }

    /**
     * @return the fechaRegistro
     */
    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * @param fechaRegistro the fechaRegistro to set
     */
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    /**
     * @return the autenticado
     */
    public Boolean getAutenticado() {
        return autenticado;
    }

    /**
     * @param autenticado the autenticado to set
     */
    public void setAutenticado(Boolean autenticado) {
        this.autenticado = autenticado;
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
}
