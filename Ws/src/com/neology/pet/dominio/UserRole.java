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
public class UserRole implements Serializable {
    private static final long serialVersionUID = -2045123039100137392L;
    private Integer idUserRole;
    private String userName;
    private String role;

    /**
     * @return the idUserRole
     */
    public Integer getIdUserRole() {
        return idUserRole;
    }

    /**
     * @param idUserRole the idUserRole to set
     */
    public void setIdUserRole(Integer idUserRole) {
        this.idUserRole = idUserRole;
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
     * @return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(String role) {
        this.role = role;
    }
}
