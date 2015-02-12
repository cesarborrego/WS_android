/**
 * Todos los Derechos Reservados © 2015 Neology
 * Sistema Integral de Enrolamiento.
 * Este software contiene información propiedad exclusiva de Neology considerada Confidencial.
 * Queda totalmente prohibido su uso o divulgación en forma parcial o total.
 * -----------------------------------------------------------------------------------------------------------------
 * Sitio web: http://www.neology-rfid.com
 * Nombre de Aplicacion: Programa de Empleo Temporal
 * Nombre de archivo: TblTrabajadores.java
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
public class TblTrabajadores implements Serializable {
    private static final long serialVersionUID = -911234675789632164L;
    private Integer intIdTrabajadores;
    private String strNombre;
    private String strApPaterno;
    private String strApMaterno;
    private String strOrganizacion;
    private Integer intIdDepartamento;
    private Integer intIdPuesto;

    /**
     * @return the intIdTrabajadores
     */
    public Integer getIntIdTrabajadores() {
        return intIdTrabajadores;
    }

    /**
     * @param intIdTrabajadores the intIdTrabajadores to set
     */
    public void setIntIdTrabajadores(Integer intIdTrabajadores) {
        this.intIdTrabajadores = intIdTrabajadores;
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
     * @return the strApPaterno
     */
    public String getStrApPaterno() {
        return strApPaterno;
    }

    /**
     * @param strApPaterno the strApPaterno to set
     */
    public void setStrApPaterno(String strApPaterno) {
        this.strApPaterno = strApPaterno;
    }

    /**
     * @return the strApMaterno
     */
    public String getStrApMaterno() {
        return strApMaterno;
    }

    /**
     * @param strApMaterno the strApMaterno to set
     */
    public void setStrApMaterno(String strApMaterno) {
        this.strApMaterno = strApMaterno;
    }

    /**
     * @return the strOrganizacion
     */
    public String getStrOrganizacion() {
        return strOrganizacion;
    }

    /**
     * @param strOrganizacion the strOrganizacion to set
     */
    public void setStrOrganizacion(String strOrganizacion) {
        this.strOrganizacion = strOrganizacion;
    }

    /**
     * @return the intIdDepartamento
     */
    public Integer getIntIdDepartamento() {
        return intIdDepartamento;
    }

    /**
     * @param intIdDepartamento the intIdDepartamento to set
     */
    public void setIntIdDepartamento(Integer intIdDepartamento) {
        this.intIdDepartamento = intIdDepartamento;
    }

    /**
     * @return the intIdPuesto
     */
    public Integer getIntIdPuesto() {
        return intIdPuesto;
    }

    /**
     * @param intIdPuesto the intIdPuesto to set
     */
    public void setIntIdPuesto(Integer intIdPuesto) {
        this.intIdPuesto = intIdPuesto;
    }
}
