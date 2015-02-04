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
public class GaImageinfo implements Serializable {
    private static final long serialVersionUID = -2201213717118908328L;
    private Integer imageID;
    private String imageName;
    private Integer imageFormatScheme;
    private Integer imageMaxSize;
    private Integer imageFormat;
    private Integer imageFormatBitDepth;
    private Integer imageFormatQuality;
    private Integer imageFormatSubsample;
    private Integer imageAspectX;
    private Integer imageAspectY;
    private Integer imageThumbnailWidth;
    private Integer imageThumbnailHeight;
    private Integer imageStorageScheme;
    private String imageStoragePath;
    private Integer imageStorageAutoSubDirs;

    /**
     * @return the imageID
     */
    public Integer getImageID() {
        return imageID;
    }

    /**
     * @param imageID the imageID to set
     */
    public void setImageID(Integer imageID) {
        this.imageID = imageID;
    }

    /**
     * @return the imageName
     */
    public String getImageName() {
        return imageName;
    }

    /**
     * @param imageName the imageName to set
     */
    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    /**
     * @return the imageFormatScheme
     */
    public Integer getImageFormatScheme() {
        return imageFormatScheme;
    }

    /**
     * @param imageFormatScheme the imageFormatScheme to set
     */
    public void setImageFormatScheme(Integer imageFormatScheme) {
        this.imageFormatScheme = imageFormatScheme;
    }

    /**
     * @return the imageMaxSize
     */
    public Integer getImageMaxSize() {
        return imageMaxSize;
    }

    /**
     * @param imageMaxSize the imageMaxSize to set
     */
    public void setImageMaxSize(Integer imageMaxSize) {
        this.imageMaxSize = imageMaxSize;
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
     * @return the imageFormatBitDepth
     */
    public Integer getImageFormatBitDepth() {
        return imageFormatBitDepth;
    }

    /**
     * @param imageFormatBitDepth the imageFormatBitDepth to set
     */
    public void setImageFormatBitDepth(Integer imageFormatBitDepth) {
        this.imageFormatBitDepth = imageFormatBitDepth;
    }

    /**
     * @return the imageFormatQuality
     */
    public Integer getImageFormatQuality() {
        return imageFormatQuality;
    }

    /**
     * @param imageFormatQuality the imageFormatQuality to set
     */
    public void setImageFormatQuality(Integer imageFormatQuality) {
        this.imageFormatQuality = imageFormatQuality;
    }

    /**
     * @return the imageFormatSubsample
     */
    public Integer getImageFormatSubsample() {
        return imageFormatSubsample;
    }

    /**
     * @param imageFormatSubsample the imageFormatSubsample to set
     */
    public void setImageFormatSubsample(Integer imageFormatSubsample) {
        this.imageFormatSubsample = imageFormatSubsample;
    }

    /**
     * @return the imageAspectX
     */
    public Integer getImageAspectX() {
        return imageAspectX;
    }

    /**
     * @param imageAspectX the imageAspectX to set
     */
    public void setImageAspectX(Integer imageAspectX) {
        this.imageAspectX = imageAspectX;
    }

    /**
     * @return the imageAspectY
     */
    public Integer getImageAspectY() {
        return imageAspectY;
    }

    /**
     * @param imageAspectY the imageAspectY to set
     */
    public void setImageAspectY(Integer imageAspectY) {
        this.imageAspectY = imageAspectY;
    }

    /**
     * @return the imageThumbnailWidth
     */
    public Integer getImageThumbnailWidth() {
        return imageThumbnailWidth;
    }

    /**
     * @param imageThumbnailWidth the imageThumbnailWidth to set
     */
    public void setImageThumbnailWidth(Integer imageThumbnailWidth) {
        this.imageThumbnailWidth = imageThumbnailWidth;
    }

    /**
     * @return the imageThumbnailHeight
     */
    public Integer getImageThumbnailHeight() {
        return imageThumbnailHeight;
    }

    /**
     * @param imageThumbnailHeight the imageThumbnailHeight to set
     */
    public void setImageThumbnailHeight(Integer imageThumbnailHeight) {
        this.imageThumbnailHeight = imageThumbnailHeight;
    }

    /**
     * @return the imageStorageScheme
     */
    public Integer getImageStorageScheme() {
        return imageStorageScheme;
    }

    /**
     * @param imageStorageScheme the imageStorageScheme to set
     */
    public void setImageStorageScheme(Integer imageStorageScheme) {
        this.imageStorageScheme = imageStorageScheme;
    }

    /**
     * @return the imageStoragePath
     */
    public String getImageStoragePath() {
        return imageStoragePath;
    }

    /**
     * @param imageStoragePath the imageStoragePath to set
     */
    public void setImageStoragePath(String imageStoragePath) {
        this.imageStoragePath = imageStoragePath;
    }

    /**
     * @return the imageStorageAutoSubDirs
     */
    public Integer getImageStorageAutoSubDirs() {
        return imageStorageAutoSubDirs;
    }

    /**
     * @param imageStorageAutoSubDirs the imageStorageAutoSubDirs to set
     */
    public void setImageStorageAutoSubDirs(Integer imageStorageAutoSubDirs) {
        this.imageStorageAutoSubDirs = imageStorageAutoSubDirs;
    }
}
