/**
 * Todos los Derechos Reservados © 2015 Neology
 * Sistema Integral de Enrolamiento.
 * Este software contiene información propiedad exclusiva de Neology considerada Confidencial.
 * Queda totalmente prohibido su uso o divulgación en forma parcial o total.
 * -----------------------------------------------------------------------------------------------------------------
 * Sitio web: http://www.neology-rfid.com
 * Nombre de Aplicacion: Programa de Empleo Temporal
 * Nombre de archivo: TblAsociacionBeneficiarios.java
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
import java.util.List;

/**
 *
 * @author Cesar Segura Granados
 */
public class TblAsociacionBeneficiarios implements Serializable{
    private static final long serialVersionUID = -2129212410123637323L;
    private Integer beneficiarioID;
    private int intEstatus;
    private List<TblAsistencias> tblAsistenciasList;
    private TblProgramas programaID;
    private EpiPerson personID;

    /**
     * @return the beneficiarioID
     */
    public Integer getBeneficiarioID() {
        return beneficiarioID;
    }

    /**
     * @param beneficiarioID the beneficiarioID to set
     */
    public void setBeneficiarioID(Integer beneficiarioID) {
        this.beneficiarioID = beneficiarioID;
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
     * @return the tblAsistenciasList
     */
    public List<TblAsistencias> getTblAsistenciasList() {
        return tblAsistenciasList;
    }

    /**
     * @param tblAsistenciasList the tblAsistenciasList to set
     */
    public void setTblAsistenciasList(List<TblAsistencias> tblAsistenciasList) {
        this.tblAsistenciasList = tblAsistenciasList;
    }

    /**
     * @return the programaID
     */
    public TblProgramas getProgramaID() {
        return programaID;
    }

    /**
     * @param programaID the programaID to set
     */
    public void setProgramaID(TblProgramas programaID) {
        this.programaID = programaID;
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
    
    
}