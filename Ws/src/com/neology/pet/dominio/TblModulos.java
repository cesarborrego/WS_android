/**
 * Todos los Derechos Reservados © 2015 Neology
 * Sistema Integral de Enrolamiento.
 * Este software contiene información propiedad exclusiva de Neology considerada Confidencial.
 * Queda totalmente prohibido su uso o divulgación en forma parcial o total.
 * -----------------------------------------------------------------------------------------------------------------
 * Sitio web: http://www.neology-rfid.com
 * Nombre de Aplicacion: Programa de Empleo Temporal
 * Nombre de archivo: TblModulos.java
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
public class TblModulos implements Serializable {
    private static final long serialVersionUID = -8812143365325918392L;
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
