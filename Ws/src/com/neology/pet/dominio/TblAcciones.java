/**
 * Todos los Derechos Reservados © 2015 Neology Sistema Integral de
 * Enrolamiento. Este software contiene información propiedad exclusiva de
 * Neology considerada Confidencial. Queda totalmente prohibido su uso o
 * divulgación en forma parcial o total.
 * -----------------------------------------------------------------------------------------------------------------
 * Sitio web: http://www.neology-rfid.com Nombre de Aplicacion: Programa de
 * Empleo Temporal Nombre de archivo: TblAcciones.java Fecha de creacion: 2015
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

/**
 *
 * @author MALR
 */
public class TblAcciones implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer intIdAccion;
    private String strEtiquetaESP;
    private String strEtiquetaING;
    private String strEtiquetaFRA;
    private String strEtiquetaALE;
    private String strEtiquetaPOR;
    private String strEtiquetaITA;
    private String strEtiquetaID1;
    private String strEtiquetaID2;
    private Integer intEstatus;
    private String strAccion;
    private Integer intTipo;

    public TblAcciones() {
    }

    public Integer getIntIdAccion() {
        return intIdAccion;
    }

    public void setIntIdAccion(Integer intIdAccion) {
        this.intIdAccion = intIdAccion;
    }

    public String getStrEtiquetaESP() {
        return strEtiquetaESP;
    }

    public void setStrEtiquetaESP(String strEtiquetaESP) {
        this.strEtiquetaESP = strEtiquetaESP;
    }

    public String getStrEtiquetaING() {
        return strEtiquetaING;
    }

    public void setStrEtiquetaING(String strEtiquetaING) {
        this.strEtiquetaING = strEtiquetaING;
    }

    public String getStrEtiquetaFRA() {
        return strEtiquetaFRA;
    }

    public void setStrEtiquetaFRA(String strEtiquetaFRA) {
        this.strEtiquetaFRA = strEtiquetaFRA;
    }

    public String getStrEtiquetaALE() {
        return strEtiquetaALE;
    }

    public void setStrEtiquetaALE(String strEtiquetaALE) {
        this.strEtiquetaALE = strEtiquetaALE;
    }

    public String getStrEtiquetaPOR() {
        return strEtiquetaPOR;
    }

    public void setStrEtiquetaPOR(String strEtiquetaPOR) {
        this.strEtiquetaPOR = strEtiquetaPOR;
    }

    public String getStrEtiquetaITA() {
        return strEtiquetaITA;
    }

    public void setStrEtiquetaITA(String strEtiquetaITA) {
        this.strEtiquetaITA = strEtiquetaITA;
    }

    public String getStrEtiquetaID1() {
        return strEtiquetaID1;
    }

    public void setStrEtiquetaID1(String strEtiquetaID1) {
        this.strEtiquetaID1 = strEtiquetaID1;
    }

    public String getStrEtiquetaID2() {
        return strEtiquetaID2;
    }

    public void setStrEtiquetaID2(String strEtiquetaID2) {
        this.strEtiquetaID2 = strEtiquetaID2;
    }

    public Integer getIntEstatus() {
        return intEstatus;
    }

    public void setIntEstatus(Integer intEstatus) {
        this.intEstatus = intEstatus;
    }

    public String getStrAccion() {
        return strAccion;
    }

    public void setStrAccion(String strAccion) {
        this.strAccion = strAccion;
    }

    public Integer getIntTipo() {
        return intTipo;
    }

    public void setIntTipo(Integer intTipo) {
        this.intTipo = intTipo;
    }

}
