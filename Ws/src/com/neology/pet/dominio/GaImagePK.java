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
public class GaImagePK implements Serializable {
    private static final long serialVersionUID = -5551183235121936670L;
    private String imageKey;
    private Integer imageType;
    private Integer imageVersion;
    private Integer segmentNum;

    /**
     * @return the imageKey
     */
    public String getImageKey() {
        return imageKey;
    }

    /**
     * @param imageKey the imageKey to set
     */
    public void setImageKey(String imageKey) {
        this.imageKey = imageKey;
    }

    /**
     * @return the imageType
     */
    public Integer getImageType() {
        return imageType;
    }

    /**
     * @param imageType the imageType to set
     */
    public void setImageType(Integer imageType) {
        this.imageType = imageType;
    }

    /**
     * @return the imageVersion
     */
    public Integer getImageVersion() {
        return imageVersion;
    }

    /**
     * @param imageVersion the imageVersion to set
     */
    public void setImageVersion(Integer imageVersion) {
        this.imageVersion = imageVersion;
    }

    /**
     * @return the segmentNum
     */
    public Integer getSegmentNum() {
        return segmentNum;
    }

    /**
     * @param segmentNum the segmentNum to set
     */
    public void setSegmentNum(Integer segmentNum) {
        this.segmentNum = segmentNum;
    }
}
