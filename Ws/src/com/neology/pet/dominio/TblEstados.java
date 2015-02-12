/**
 * Todos los Derechos Reservados © 2015 Neology
 * Sistema Integral de Enrolamiento.
 * Este software contiene información propiedad exclusiva de Neology considerada Confidencial.
 * Queda totalmente prohibido su uso o divulgación en forma parcial o total.
 * -----------------------------------------------------------------------------------------------------------------
 * Sitio web: http://www.neology-rfid.com
 * Nombre de Aplicacion: Programa de Empleo Temporal
 * Nombre de archivo: TblEstados.java
 * Fecha de creacion: 2015
 * @author: Cristian Medina Hernandez
 * @version 1.0
 *
 * Bitácora de modificaciones:
 * CR/Defecto    Fecha             Autor    Descripción del cambio
 * -----------------------------------------------------------------------------------------------------------------
**/
package com.neology.pet.dominio;

import java.io.Serializable;

/**
 *
 * @author Cristian Medina Hernandez
 */
public class TblEstados implements Serializable{
    private static final long serialVersionUID = -6115867230563023394L;
    private Integer intIdEstado;
    private String strNombre;

    /**
     * @return the intIdEstado
     */
    public Integer getIntIdEstado() {
        return intIdEstado;
    }

    /**
     * @param intIdEstado the intIdEstado to set
     */
    public void setIntIdEstado(Integer intIdEstado) {
        this.intIdEstado = intIdEstado;
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

}
