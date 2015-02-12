/**
 * Todos los Derechos Reservados © 2015 Neology Sistema Integral de
 * Enrolamiento. Este software contiene información propiedad exclusiva de
 * Neology considerada Confidencial. Queda totalmente prohibido su uso o
 * divulgación en forma parcial o total.
 * -----------------------------------------------------------------------------------------------------------------
 * Sitio web: http://www.neology.com Nombre de Aplicacion: Programa de Empleo
 * Temporal Nombre de archivo: TblPerfiles.java Fecha de creacion: 2015
 *
 * @author: MALR
 * @version 1.0
 *
 * Bitácora de modificaciones: CR/Defecto Fecha Autor Descripción del cambio
 * -----------------------------------------------------------------------------------------------------------------
*
 */
package com.neology.pet.dominio;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author MALR
 */
public class TblPerfiles implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer intIdPerfil;
    private String strNombre;
    private int intEstatus;
    private List<TblAcciones> tblAccionesList;
    private List<TblAccesos> tblAccesosList;

    public TblPerfiles() {
    }

    public Integer getIntIdPerfil() {
        return intIdPerfil;
    }

    public void setIntIdPerfil(Integer intIdPerfil) {
        this.intIdPerfil = intIdPerfil;
    }

    public String getStrNombre() {
        return strNombre;
    }

    public void setStrNombre(String strNombre) {
        this.strNombre = strNombre;
    }

    public int getIntEstatus() {
        return intEstatus;
    }

    public void setIntEstatus(int intEstatus) {
        this.intEstatus = intEstatus;
    }

    public List<TblAcciones> getTblAccionesList() {
        return tblAccionesList;
    }

    public void setTblAccionesList(List<TblAcciones> tblAccionesList) {
        this.tblAccionesList = tblAccionesList;
    }

    public List<TblAccesos> getTblAccesosList() {
        return tblAccesosList;
    }

    public void setTblAccesosList(List<TblAccesos> tblAccesosList) {
        this.tblAccesosList = tblAccesosList;
    }

}
