/**
 * Todos los Derechos Reservados © 2015 Neology
 * Sistema Integral de Enrolamiento.
 * Este software contiene información propiedad exclusiva de Neology considerada Confidencial.
 * Queda totalmente prohibido su uso o divulgación en forma parcial o total.
 * -----------------------------------------------------------------------------------------------------------------
 * Sitio web: http://www.neology-rfid.com
 * Nombre de Aplicacion: Programa de Empleo Temporal
 * Nombre de archivo: TblAsistencias.java
 * Fecha de creacion: 2015
 * @author: Cesar Segura Granados
 * @version 1.0
 *
 * Bitácora de modificaciones:
 * CR/Defecto    Fecha             Autor    Descripción del cambio
 * -----------------------------------------------------------------------------------------------------------------
**/
package com.neology.pet.dominio;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Cesar Segura Granados
 */
public class TblAsistencias implements Serializable{
    private static final long serialVersionUID = -2029212410123637323L;
    private Integer asistenciaID;
    private Date fechaAsistencia;
    private Double latitud;
    private Double longitud;
    private int intEstatus;
    private TblAsociacionBeneficiarios beneficiarioID;

    /**
     * @return the asistenciaID
     */
    public Integer getAsistenciaID() {
        return asistenciaID;
    }

    /**
     * @param asistenciaID the asistenciaID to set
     */
    public void setAsistenciaID(Integer asistenciaID) {
        this.asistenciaID = asistenciaID;
    }

    /**
     * @return the fechaAsistencia
     */
    public Date getFechaAsistencia() {
        return fechaAsistencia;
    }

    /**
     * @param fechaAsistencia the fechaAsistencia to set
     */
    public void setFechaAsistencia(Date fechaAsistencia) {
        this.fechaAsistencia = fechaAsistencia;
    }

    /**
     * @return the latitud
     */
    public Double getLatitud() {
        return latitud;
    }

    /**
     * @param latitud the latitud to set
     */
    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    /**
     * @return the longitud
     */
    public Double getLongitud() {
        return longitud;
    }

    /**
     * @param longitud the longitud to set
     */
    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    /**
     * @return the intEstatus
     */
    public int getIntEstatus() {
        return intEstatus;
    }

    /**
     * @param intEstatus the intEstatus to set
     */
    public void setIntEstatus(int intEstatus) {
        this.intEstatus = intEstatus;
    }

    /**
     * @return the beneficiarioID
     */
    public TblAsociacionBeneficiarios getBeneficiarioID() {
        return beneficiarioID;
    }

    /**
     * @param beneficiarioID the beneficiarioID to set
     */
    public void setBeneficiarioID(TblAsociacionBeneficiarios beneficiarioID) {
        this.beneficiarioID = beneficiarioID;
    }
    
    

}