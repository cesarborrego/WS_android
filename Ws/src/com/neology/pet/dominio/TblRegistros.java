/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neology.pet.dominio;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author SergioToshiba
 */
public class TblRegistros implements Serializable {

    private static final long serialVersionUID = -5131742315123939393L;
    private Long intIdRegistro;
    private Date dtmFechaEmision;
    private Date dtmFechaVencimiento;
    private String strObservaciones;
    private EpiPerson personID;
    private TblEstatusRegistros intIdEstatusRegistro;
    private TblModulos intIdModulo;

    /**
     * @return the intIdRegistro
     */
    public Long getIntIdRegistro() {
        return intIdRegistro;
    }

    /**
     * @param intIdRegistro the intIdRegistro to set
     */
    public void setIntIdRegistro(Long intIdRegistro) {
        this.intIdRegistro = intIdRegistro;
    }

    /**
     * @return the dtmFechaEmision
     */
    public Date getDtmFechaEmision() {
        return dtmFechaEmision;
    }

    /**
     * @param dtmFechaEmision the dtmFechaEmision to set
     */
    public void setDtmFechaEmision(Date dtmFechaEmision) {
        this.dtmFechaEmision = dtmFechaEmision;
    }

    /**
     * @return the dtmFechaVencimiento
     */
    public Date getDtmFechaVencimiento() {
        return dtmFechaVencimiento;
    }

    /**
     * @param dtmFechaVencimiento the dtmFechaVencimiento to set
     */
    public void setDtmFechaVencimiento(Date dtmFechaVencimiento) {
        this.dtmFechaVencimiento = dtmFechaVencimiento;
    }

    /**
     * @return the strObservaciones
     */
    public String getStrObservaciones() {
        return strObservaciones;
    }

    /**
     * @param strObservaciones the strObservaciones to set
     */
    public void setStrObservaciones(String strObservaciones) {
        this.strObservaciones = strObservaciones;
    }

    /**
     * @return the personID
     */
    public EpiPerson getPersonID() {
        return personID;
    }

    /**
     * @param personID the personID to set
     */
    public void setPersonID(EpiPerson personID) {
        this.personID = personID;
    }

    /**
     * @return the intIdEstatusRegistro
     */
    public TblEstatusRegistros getIntIdEstatusRegistro() {
        return intIdEstatusRegistro;
    }

    /**
     * @param intIdEstatusRegistro the intIdEstatusRegistro to set
     */
    public void setIntIdEstatusRegistro(TblEstatusRegistros intIdEstatusRegistro) {
        this.intIdEstatusRegistro = intIdEstatusRegistro;
    }

    /**
     * @return the intIdModulo
     */
    public TblModulos getIntIdModulo() {
        return intIdModulo;
    }

    /**
     * @param intIdModulo the intIdModulo to set
     */
    public void setIntIdModulo(TblModulos intIdModulo) {
        this.intIdModulo = intIdModulo;
    }
}
