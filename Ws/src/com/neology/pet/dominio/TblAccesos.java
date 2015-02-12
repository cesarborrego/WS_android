/**
 * Todos los Derechos Reservados © 2015 Neology Sistema Integral de
 * Enrolamiento. Este software contiene información propiedad exclusiva de
 * Neology considerada Confidencial. Queda totalmente prohibido su uso o
 * divulgación en forma parcial o total.
 * -----------------------------------------------------------------------------------------------------------------
 * Sitio web: http://www.neology-rfid.com Nombre de Aplicacion: Programa de
 * Empleo Temporal Nombre de archivo: TblAccesos.java Fecha de creacion: 2015
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
public class TblAccesos implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer intIdUsuario;
    private TblPerfiles tblPerfile;
    private TblModulos tblModulo;

    public TblAccesos() {
    }

    /**
     *
     * @return
     */
    public Integer getIntIdUsuario() {
        return intIdUsuario;
    }

    /**
     *
     * @param intIdUsuario
     */
    public void setIntIdUsuario(Integer intIdUsuario) {
        this.intIdUsuario = intIdUsuario;
    }

    /**
     *
     * @return
     */
    public TblPerfiles getTblPerfile() {
        return tblPerfile;
    }

    /**
     *
     * @param tblPerfile
     */
    public void setTblPerfile(TblPerfiles tblPerfile) {
        this.tblPerfile = tblPerfile;
    }

    /**
     *
     * @return
     */
    public TblModulos getTblModulo() {
        return tblModulo;
    }

    /**
     *
     * @param tblModulos
     */
    public void setTblModulo(TblModulos tblModulos) {
        this.tblModulo = tblModulos;
    }

}
