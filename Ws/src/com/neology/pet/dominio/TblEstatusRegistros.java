/**
 * Todos los Derechos Reservados © 2015 Neology
 * Sistema Integral de Enrolamiento.
 * Este software contiene información propiedad exclusiva de Neology considerada Confidencial.
 * Queda totalmente prohibido su uso o divulgación en forma parcial o total.
 * -----------------------------------------------------------------------------------------------------------------
 * Sitio web: http://www.neology-rfid.com
 * Nombre de Aplicacion: Programa de Empleo Temporal
 * Nombre de archivo: TblEstatusRegistros.java
 * Fecha de creacion: 2015
 * @author: Sergio Alberto Cortés Rios
 * @version 1.0
 *
 * Bitácora de modificaciones:
 * CR/Defecto    Fecha             Autor 			Descripción del cambio
 * -----------------------------------------------------------------------------------------------------------------
**/
package com.neology.pet.dominio;

import java.io.Serializable;
/**
 *
 * @author Sergio Alberto Cortés Rios
 */
public class TblEstatusRegistros implements Serializable {
    private static final long serialVersionUID = -4257384285123939393L;
    private Integer intIdEstatusRegistro;
    private String strNombreESP;
    private String strNombreING;
    private String strNombreFRA;
    private String strNombreALE;
    private String strNombrePOR;
    private String strNombreITA;
    private String strNombreID1;
    private String strNombreID2;
    private Integer intEstatus;

    /**
     * @return the intIdEstatusRegistro
     */
    public Integer getIntIdEstatusRegistro() {
        return intIdEstatusRegistro;
    }

    /**
     * @param intIdEstatusRegistro the intIdEstatusRegistro to set
     */
    public void setIntIdEstatusRegistro(Integer intIdEstatusRegistro) {
        this.intIdEstatusRegistro = intIdEstatusRegistro;
    }

    /**
     * @return the strNombreESP
     */
    public String getStrNombreESP() {
        return strNombreESP;
    }

    /**
     * @param strNombreESP the strNombreESP to set
     */
    public void setStrNombreESP(String strNombreESP) {
        this.strNombreESP = strNombreESP;
    }

    /**
     * @return the strNombreING
     */
    public String getStrNombreING() {
        return strNombreING;
    }

    /**
     * @param strNombreING the strNombreING to set
     */
    public void setStrNombreING(String strNombreING) {
        this.strNombreING = strNombreING;
    }

    /**
     * @return the strNombreFRA
     */
    public String getStrNombreFRA() {
        return strNombreFRA;
    }

    /**
     * @param strNombreFRA the strNombreFRA to set
     */
    public void setStrNombreFRA(String strNombreFRA) {
        this.strNombreFRA = strNombreFRA;
    }

    /**
     * @return the strNombreALE
     */
    public String getStrNombreALE() {
        return strNombreALE;
    }

    /**
     * @param strNombreALE the strNombreALE to set
     */
    public void setStrNombreALE(String strNombreALE) {
        this.strNombreALE = strNombreALE;
    }

    /**
     * @return the strNombrePOR
     */
    public String getStrNombrePOR() {
        return strNombrePOR;
    }

    /**
     * @param strNombrePOR the strNombrePOR to set
     */
    public void setStrNombrePOR(String strNombrePOR) {
        this.strNombrePOR = strNombrePOR;
    }

    /**
     * @return the strNombreITA
     */
    public String getStrNombreITA() {
        return strNombreITA;
    }

    /**
     * @param strNombreITA the strNombreITA to set
     */
    public void setStrNombreITA(String strNombreITA) {
        this.strNombreITA = strNombreITA;
    }

    /**
     * @return the strNombreID1
     */
    public String getStrNombreID1() {
        return strNombreID1;
    }

    /**
     * @param strNombreID1 the strNombreID1 to set
     */
    public void setStrNombreID1(String strNombreID1) {
        this.strNombreID1 = strNombreID1;
    }

    /**
     * @return the strNombreID2
     */
    public String getStrNombreID2() {
        return strNombreID2;
    }

    /**
     * @param strNombreID2 the strNombreID2 to set
     */
    public void setStrNombreID2(String strNombreID2) {
        this.strNombreID2 = strNombreID2;
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
}
