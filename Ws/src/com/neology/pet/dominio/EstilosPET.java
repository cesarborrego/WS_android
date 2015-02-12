/**
 * Todos los Derechos Reservados © 2015 Neology
 * Sistema Integral de Enrolamiento.
 * Este software contiene información propiedad exclusiva de Neology considerada Confidencial.
 * Queda totalmente prohibido su uso o divulgación en forma parcial o total.
 * -----------------------------------------------------------------------------------------------------------------
 * Sitio web: http://www.neology.com
 * Nombre de Aplicacion: Programa de Empleo Temporal
 * Nombre de archivo: EstilosPET.java
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
public class EstilosPET implements Serializable, Comparable {
    private static final long serialVersionUID = -1910346110012363123L;
    private String id;
    private String estilo;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the estilo
     */
    public String getEstilo() {
        return estilo;
    }

    /**
     * @param estilo the estilo to set
     */
    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    @Override
    public int compareTo(Object o) {
        EstilosPET style = (EstilosPET)o;
        return this.estilo.compareTo(style.estilo);
    }
}
