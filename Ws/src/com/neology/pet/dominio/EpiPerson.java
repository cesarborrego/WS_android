/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neology.pet.dominio;

import java.util.Date;
import java.util.List;
/**
 *
 * @author SergioToshiba
 */
public class EpiPerson {

//    private static final long serialVersionUID = -2829212410123637323L;
    private String personID;
    private String strNumeroPersonal;
    private Date creationDate;
    private Date lastModified;
    private String firstName;
    private String strOtrosNombres;
    private String lastName;
    private String strApellidoMaterno;
    private String employeeNumber;
    private String title;
    private String department;
    private String address;
    private String city;
    private String state;
    private String province;
    private String zipCode;
    private String country;
    private String company;
    private String office;
    private String assistant;
    private String homePhone;
    private String fax;
    private String workPhone;
    private String emailAddress;
    private String pager;
    private String mobile;
    private String strTelefonoExtra1;
    private String strTelefonoExtra2;
    private String strTelefonoExtra3;
    private String postalCode;
    private String socialSecurity;
    private Date dateOfBirth;
    private String strLugarNacimiento;
    private String strNacionalidad;
    private String sex;
    private Double height;
    private Double weight;
    private String hairColor;
    private String eyeColor;
    private String strPruebaCiudadania;
    private String strInformacionCustodia;
    private String strOtrosDocumentos;
    private String strSenasParticulares;
    private String strTarjetaSiVale;
    private String strNumeroPlastico;
    private String strTID;
    private Integer statusEnvio;
    private Date fechaEnvio;
    private List<GaImage> imagenes;
    private String mensaje;
    private TblRegistros registro;
    private Double dLatitud;
    private Double dLongitude;

    /**
     * @return the personID
     */
    public String getPersonID() {
        return personID;
    }

    /**
     * @param personID the personID to set
     */
    public void setPersonID(String personID) {
        this.personID = personID;
    }

    /**
     * @return the strNumeroPersonal
     */
    public String getStrNumeroPersonal() {
        return strNumeroPersonal;
    }

    /**
     * @param strNumeroPersonal the strNumeroPersonal to set
     */
    public void setStrNumeroPersonal(String strNumeroPersonal) {
        this.strNumeroPersonal = strNumeroPersonal;
    }

    /**
     * @return the creationDate
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * @param creationDate the creationDate to set
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * @return the lastModified
     */
    public Date getLastModified() {
        return lastModified;
    }

    /**
     * @param lastModified the lastModified to set
     */
    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
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
     * @return the strOtrosNombres
     */
    public String getStrOtrosNombres() {
        return strOtrosNombres;
    }

    /**
     * @param strOtrosNombres the strOtrosNombres to set
     */
    public void setStrOtrosNombres(String strOtrosNombres) {
        this.strOtrosNombres = strOtrosNombres;
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
     * @return the strApellidoMaterno
     */
    public String getStrApellidoMaterno() {
        return strApellidoMaterno;
    }

    /**
     * @param strApellidoMaterno the strApellidoMaterno to set
     */
    public void setStrApellidoMaterno(String strApellidoMaterno) {
        this.strApellidoMaterno = strApellidoMaterno;
    }

    /**
     * @return the employeeNumber
     */
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    /**
     * @param employeeNumber the employeeNumber to set
     */
    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the province
     */
    public String getProvince() {
        return province;
    }

    /**
     * @param province the province to set
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * @return the zipCode
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * @param zipCode the zipCode to set
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the company
     */
    public String getCompany() {
        return company;
    }

    /**
     * @param company the company to set
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * @return the office
     */
    public String getOffice() {
        return office;
    }

    /**
     * @param office the office to set
     */
    public void setOffice(String office) {
        this.office = office;
    }

    /**
     * @return the assistant
     */
    public String getAssistant() {
        return assistant;
    }

    /**
     * @param assistant the assistant to set
     */
    public void setAssistant(String assistant) {
        this.assistant = assistant;
    }

    /**
     * @return the homePhone
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * @param homePhone the homePhone to set
     */
    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    /**
     * @return the fax
     */
    public String getFax() {
        return fax;
    }

    /**
     * @param fax the fax to set
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * @return the workPhone
     */
    public String getWorkPhone() {
        return workPhone;
    }

    /**
     * @param workPhone the workPhone to set
     */
    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    /**
     * @return the emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * @param emailAddress the emailAddress to set
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * @return the pager
     */
    public String getPager() {
        return pager;
    }

    /**
     * @param pager the pager to set
     */
    public void setPager(String pager) {
        this.pager = pager;
    }

    /**
     * @return the mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile the mobile to set
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return the strTelefonoExtra1
     */
    public String getStrTelefonoExtra1() {
        return strTelefonoExtra1;
    }

    /**
     * @param strTelefonoExtra1 the strTelefonoExtra1 to set
     */
    public void setStrTelefonoExtra1(String strTelefonoExtra1) {
        this.strTelefonoExtra1 = strTelefonoExtra1;
    }

    /**
     * @return the strTelefonoExtra2
     */
    public String getStrTelefonoExtra2() {
        return strTelefonoExtra2;
    }

    /**
     * @param strTelefonoExtra2 the strTelefonoExtra2 to set
     */
    public void setStrTelefonoExtra2(String strTelefonoExtra2) {
        this.strTelefonoExtra2 = strTelefonoExtra2;
    }

    /**
     * @return the strTelefonoExtra3
     */
    public String getStrTelefonoExtra3() {
        return strTelefonoExtra3;
    }

    /**
     * @param strTelefonoExtra3 the strTelefonoExtra3 to set
     */
    public void setStrTelefonoExtra3(String strTelefonoExtra3) {
        this.strTelefonoExtra3 = strTelefonoExtra3;
    }

    /**
     * @return the postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * @param postalCode the postalCode to set
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * @return the socialSecurity
     */
    public String getSocialSecurity() {
        return socialSecurity;
    }

    /**
     * @param socialSecurity the socialSecurity to set
     */
    public void setSocialSecurity(String socialSecurity) {
        this.socialSecurity = socialSecurity;
    }

    /**
     * @return the dateOfBirth
     */
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * @return the strLugarNacimiento
     */
    public String getStrLugarNacimiento() {
        return strLugarNacimiento;
    }

    /**
     * @param strLugarNacimiento the strLugarNacimiento to set
     */
    public void setStrLugarNacimiento(String strLugarNacimiento) {
        this.strLugarNacimiento = strLugarNacimiento;
    }

    /**
     * @return the strNacionalidad
     */
    public String getStrNacionalidad() {
        return strNacionalidad;
    }

    /**
     * @param strNacionalidad the strNacionalidad to set
     */
    public void setStrNacionalidad(String strNacionalidad) {
        this.strNacionalidad = strNacionalidad;
    }

    /**
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return the height
     */
    public Double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(Double height) {
        this.height = height;
    }

    /**
     * @return the weight
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    /**
     * @return the hairColor
     */
    public String getHairColor() {
        return hairColor;
    }

    /**
     * @param hairColor the hairColor to set
     */
    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    /**
     * @return the eyeColor
     */
    public String getEyeColor() {
        return eyeColor;
    }

    /**
     * @param eyeColor the eyeColor to set
     */
    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    /**
     * @return the strPruebaCiudadania
     */
    public String getStrPruebaCiudadania() {
        return strPruebaCiudadania;
    }

    /**
     * @param strPruebaCiudadania the strPruebaCiudadania to set
     */
    public void setStrPruebaCiudadania(String strPruebaCiudadania) {
        this.strPruebaCiudadania = strPruebaCiudadania;
    }

    /**
     * @return the strInformacionCustodia
     */
    public String getStrInformacionCustodia() {
        return strInformacionCustodia;
    }

    /**
     * @param strInformacionCustodia the strInformacionCustodia to set
     */
    public void setStrInformacionCustodia(String strInformacionCustodia) {
        this.strInformacionCustodia = strInformacionCustodia;
    }

    /**
     * @return the strOtrosDocumentos
     */
    public String getStrOtrosDocumentos() {
        return strOtrosDocumentos;
    }

    /**
     * @param strOtrosDocumentos the strOtrosDocumentos to set
     */
    public void setStrOtrosDocumentos(String strOtrosDocumentos) {
        this.strOtrosDocumentos = strOtrosDocumentos;
    }

    /**
     * @return the strSenasParticulares
     */
    public String getStrSenasParticulares() {
        return strSenasParticulares;
    }

    /**
     * @param strSenasParticulares the strSenasParticulares to set
     */
    public void setStrSenasParticulares(String strSenasParticulares) {
        this.strSenasParticulares = strSenasParticulares;
    }

    /**
     * @return the strTarjetaSiVale
     */
    public String getStrTarjetaSiVale() {
        return strTarjetaSiVale;
    }

    /**
     * @param strTarjetaSiVale the strTarjetaSiVale to set
     */
    public void setStrTarjetaSiVale(String strTarjetaSiVale) {
        this.strTarjetaSiVale = strTarjetaSiVale;
    }

    /**
     * @return the strNumeroPlastico
     */
    public String getStrNumeroPlastico() {
        return strNumeroPlastico;
    }

    /**
     * @param strNumeroPlastico the strNumeroPlastico to set
     */
    public void setStrNumeroPlastico(String strNumeroPlastico) {
        this.strNumeroPlastico = strNumeroPlastico;
    }

    /**
     * @return the strTID
     */
    public String getStrTID() {
        return strTID;
    }

    /**
     * @param strTID the strTID to set
     */
    public void setStrTID(String strTID) {
        this.strTID = strTID;
    }

    /**
     * @return the statusEnvio
     */
    public Integer getStatusEnvio() {
        return statusEnvio;
    }

    /**
     * @param statusEnvio the statusEnvio to set
     */
    public void setStatusEnvio(Integer statusEnvio) {
        this.statusEnvio = statusEnvio;
    }

    /**
     * @return the fechaEnvio
     */
    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    /**
     * @param fechaEnvio the fechaEnvio to set
     */
    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    /**
     * @return the imagenes
     */
    public List<GaImage> getImagenes() {
        return imagenes;
    }

    /**
     * @param imagenes the imagenes to set
     */
    public void setImagenes(List<GaImage> imagenes) {
        this.imagenes = imagenes;
    }

    /**
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }


    /**
     * @return the dLatitud
     */
    public Double getdLatitud() {
        return dLatitud;
    }

    /**
     * @param dLatitud the dLatitud to set
     */
    public void setdLatitud(Double dLatitud) {
        this.dLatitud = dLatitud;
    }

    /**
     * @return the dLongitude
     */
    public Double getdLongitude() {
        return dLongitude;
    }

    /**
     * @param dLongitude the dLongitude to set
     */
    public void setdLongitude(Double dLongitude) {
        this.dLongitude = dLongitude;
    }

    /**
     * @return the registro
     */
    public TblRegistros getRegistro() {
        return registro;
    }

    /**
     * @param registro the registro to set
     */
    public void setRegistro(TblRegistros registro) {
        this.registro = registro;
    }
}
