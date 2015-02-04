/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neology.pet.dominio;

import java.io.Serializable;
/**
 *
 * @author SergioToshiba
 */
public class TblModulos implements Serializable {
    private static final long serialVersionUID = -8812143365325918391L;
    private Integer intIdModulo;
    private String strNombre;
    private Integer intEstatus;
    private Integer intTipo;

    /**
     * @return the intIdModulo
     */
    public Integer getIntIdModulo() {
        return intIdModulo;
    }

    /**
     * @param intIdModulo the intIdModulo to set
     */
    public void setIntIdModulo(Integer intIdModulo) {
        this.intIdModulo = intIdModulo;
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
     * @return the intTipo
     */
    public Integer getIntTipo() {
        return intTipo;
    }

    /**
     * @param intTipo the intTipo to set
     */
    public void setIntTipo(Integer intTipo) {
        this.intTipo = intTipo;
    }
}
