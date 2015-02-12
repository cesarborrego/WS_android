/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neology.pet.dominio;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author SergioToshiba
 */
public class GaImage implements Serializable {

    private static final long serialVersionUID = -1100314787128938321L;
    private GaImagePK gaImagePK;
    private Integer imageFormat;
    private Integer totalSize;
    private byte[] blobSegment;
    private String fileName;
    private Integer fileVolumeNum;
    private String fileVolumeName;
    private Date lastModified;
    private EpiPerson epiPerson;
    private GaImageinfo gaImageinfo;

    /**
     * @return the gaImagePK
     */
    public GaImagePK getGaImagePK() {
        return gaImagePK;
    }

    /**
     * @param gaImagePK the gaImagePK to set
     */
    public void setGaImagePK(GaImagePK gaImagePK) {
        this.gaImagePK = gaImagePK;
    }

    /**
     * @return the imageFormat
     */
    public Integer getImageFormat() {
        return imageFormat;
    }

    /**
     * @param imageFormat the imageFormat to set
     */
    public void setImageFormat(Integer imageFormat) {
        this.imageFormat = imageFormat;
    }

    /**
     * @return the totalSize
     */
    public Integer getTotalSize() {
        return totalSize;
    }

    /**
     * @param totalSize the totalSize to set
     */
    public void setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
    }

    /**
     * @return the blobSegment
     */
    public byte[] getBlobSegment() {
        return blobSegment;
    }

    /**
     * @param blobSegment the blobSegment to set
     */
    public void setBlobSegment(byte[] blobSegment) {
        this.blobSegment = blobSegment;
    }

    /**
     * @return the fileName
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * @param fileName the fileName to set
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * @return the fileVolumeNum
     */
    public Integer getFileVolumeNum() {
        return fileVolumeNum;
    }

    /**
     * @param fileVolumeNum the fileVolumeNum to set
     */
    public void setFileVolumeNum(Integer fileVolumeNum) {
        this.fileVolumeNum = fileVolumeNum;
    }

    /**
     * @return the fileVolumeName
     */
    public String getFileVolumeName() {
        return fileVolumeName;
    }

    /**
     * @param fileVolumeName the fileVolumeName to set
     */
    public void setFileVolumeName(String fileVolumeName) {
        this.fileVolumeName = fileVolumeName;
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
     * @return the epiPerson
     */
    public EpiPerson getEpiPerson() {
        return epiPerson;
    }

    /**
     * @param epiPerson the epiPerson to set
     */
    public void setEpiPerson(EpiPerson epiPerson) {
        this.epiPerson = epiPerson;
    }

    /**
     * @return the gaImageinfo
     */
    public GaImageinfo getGaImageinfo() {
        return gaImageinfo;
    }

    /**
     * @param gaImageinfo the gaImageinfo to set
     */
    public void setGaImageinfo(GaImageinfo gaImageinfo) {
        this.gaImageinfo = gaImageinfo;
    }
}
