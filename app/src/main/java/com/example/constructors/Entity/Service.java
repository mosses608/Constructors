package com.example.constructors.Entity;

import java.util.Date;
import java.util.List;

public class Service {
    List<String> images;
    String projectName, constName, constPhone, constLocation, uploadID;
    Date postedTime;

    public Service() {
    }

    public Service(List<String> images, String projectName, String constName, String constPhone, String constLocation, String uploadID, Date postedTime) {
        this.images = images;
        this.projectName = projectName;
        this.constName = constName;
        this.constPhone = constPhone;
        this.constLocation = constLocation;
        this.uploadID = uploadID;
        this.postedTime = postedTime;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getConstName() {
        return constName;
    }

    public void setConstName(String constName) {
        this.constName = constName;
    }

    public String getConstPhone() {
        return constPhone;
    }

    public void setConstPhone(String constPhone) {
        this.constPhone = constPhone;
    }

    public String getConstLocation() {
        return constLocation;
    }

    public void setConstLocation(String constLocation) {
        this.constLocation = constLocation;
    }

    public String getUploadID() {
        return uploadID;
    }

    public void setUploadID(String uploadID) {
        this.uploadID = uploadID;
    }

    public Date getPostedTime() {
        return postedTime;
    }

    public void setPostedTime(Date postedTime) {
        this.postedTime = postedTime;
    }
}
