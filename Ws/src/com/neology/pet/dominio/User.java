/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neology.pet.dominio;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author SergioToshiba
 */
public class User implements Serializable {

    private static final long serialVersionUID = -3131167321153533340L;
    private Integer idUser;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String email;
    private Integer enabled;
    private UserRole idUserRole;
    private Date fechaRegistro;
    private Boolean autenticado;

    /**
     * @return the idUser
     */
    public Integer getIdUser() {
        return idUser;
    }

    /**
     * @param idUser the idUser to set
     */
    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the enabled
     */
    public Integer getEnabled() {
        return enabled;
    }

    /**
     * @param enabled the enabled to set
     */
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    /**
     * @return the idUserRole
     */
    public UserRole getIdUserRole() {
        return idUserRole;
    }

    /**
     * @param idUserRole the idUserRole to set
     */
    public void setIdUserRole(UserRole idUserRole) {
        this.idUserRole = idUserRole;
    }

    /**
     * @return the fechaRegistro
     */
    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * @param fechaRegistro the fechaRegistro to set
     */
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    /**
     * @return the autenticado
     */
    public Boolean getAutenticado() {
        return autenticado;
    }

    /**
     * @param autenticado the autenticado to set
     */
    public void setAutenticado(Boolean autenticado) {
        this.autenticado = autenticado;
    }

}
