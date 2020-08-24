package com.cacheserver.producer.jsonproducer.entities;

import java.util.ArrayList;

public class Product {
    String isDeleted;
    String publishState;
    String targetSDK;
    String minSDK;
    String deleted;
    long fileSize;
    long osId;
    long averageRateIndex;
    String bulk;
    String number_installs;
    String downLoadLink;
    String iconThumbNail;
    long osTypeId;
    String osTypeName;
    String appCategoryName;
    String appCategoryID;
    ArrayList<String> permissionDetails;
    String title;
    String developer;
    String versionName;
    String versionCode;
    String osName;
    String packageName;
    String shortDescription;
    ArrayList<String> keyword;
    String icon;
    long id;

    public Product() {
    }

    public Product(String isDeleted, String publishState, String targetSDK, String minSDK, String deleted, long fileSize, long osId, long averageRateIndex, String bulk, String number_installs, String downLoadLink, String iconThumbNail, long osTypeId, String osTypeName, String appCategoryName, String appCategoryID, ArrayList<String> permissionDetails, String title, String developer, String versionName, String versionCode, String osName, String packageName, String shortDescription, ArrayList<String> keyword, String icon, long id) {
        this.isDeleted = isDeleted;
        this.publishState = publishState;
        this.targetSDK = targetSDK;
        this.minSDK = minSDK;
        this.deleted = deleted;
        this.fileSize = fileSize;
        this.osId = osId;
        this.averageRateIndex = averageRateIndex;
        this.bulk = bulk;
        this.number_installs = number_installs;
        this.downLoadLink = downLoadLink;
        this.iconThumbNail = iconThumbNail;
        this.osTypeId = osTypeId;
        this.osTypeName = osTypeName;
        this.appCategoryName = appCategoryName;
        this.appCategoryID = appCategoryID;
        this.permissionDetails = permissionDetails;
        this.title = title;
        this.developer = developer;
        this.versionName = versionName;
        this.versionCode = versionCode;
        this.osName = osName;
        this.packageName = packageName;
        this.shortDescription = shortDescription;
        this.keyword = keyword;
        this.icon = icon;
        this.id = id;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getPublishState() {
        return publishState;
    }

    public void setPublishState(String publishState) {
        this.publishState = publishState;
    }

    public String getTargetSDK() {
        return targetSDK;
    }

    public void setTargetSDK(String targetSDK) {
        this.targetSDK = targetSDK;
    }

    public String getMinSDK() {
        return minSDK;
    }

    public void setMinSDK(String minSDK) {
        this.minSDK = minSDK;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public long getOsId() {
        return osId;
    }

    public void setOsId(long osId) {
        this.osId = osId;
    }

    public long getAverageRateIndex() {
        return averageRateIndex;
    }

    public void setAverageRateIndex(long averageRateIndex) {
        this.averageRateIndex = averageRateIndex;
    }

    public String getBulk() {
        return bulk;
    }

    public void setBulk(String bulk) {
        this.bulk = bulk;
    }

    public String getNumber_installs() {
        return number_installs;
    }

    public void setNumber_installs(String number_installs) {
        this.number_installs = number_installs;
    }

    public String getDownLoadLink() {
        return downLoadLink;
    }

    public void setDownLoadLink(String downLoadLink) {
        this.downLoadLink = downLoadLink;
    }

    public String getIconThumbNail() {
        return iconThumbNail;
    }

    public void setIconThumbNail(String iconThumbNail) {
        this.iconThumbNail = iconThumbNail;
    }

    public long getOsTypeId() {
        return osTypeId;
    }

    public void setOsTypeId(long osTypeId) {
        this.osTypeId = osTypeId;
    }

    public String getOsTypeName() {
        return osTypeName;
    }

    public void setOsTypeName(String osTypeName) {
        this.osTypeName = osTypeName;
    }

    public String getAppCategoryName() {
        return appCategoryName;
    }

    public void setAppCategoryName(String appCategoryName) {
        this.appCategoryName = appCategoryName;
    }

    public String getAppCategoryID() {
        return appCategoryID;
    }

    public void setAppCategoryID(String appCategoryID) {
        this.appCategoryID = appCategoryID;
    }

    public ArrayList<String> getPermissionDetails() {
        return permissionDetails;
    }

    public void setPermissionDetails(ArrayList<String> permissionDetails) {
        this.permissionDetails = permissionDetails;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public String getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(String versionCode) {
        this.versionCode = versionCode;
    }

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public ArrayList<String> getKeyword() {
        return keyword;
    }

    public void setKeyword(ArrayList<String> keyword) {
        this.keyword = keyword;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "isDeleted='" + isDeleted + '\'' +
                ", publishState='" + publishState + '\'' +
                ", targetSDK='" + targetSDK + '\'' +
                ", minSDK='" + minSDK + '\'' +
                ", deleted='" + deleted + '\'' +
                ", fileSize=" + fileSize +
                ", osId=" + osId +
                ", averageRateIndex=" + averageRateIndex +
                ", bulk='" + bulk + '\'' +
                ", number_installs='" + number_installs + '\'' +
                ", downLoadLink='" + downLoadLink + '\'' +
                ", iconThumbNail='" + iconThumbNail + '\'' +
                ", osTypeId=" + osTypeId +
                ", osTypeName='" + osTypeName + '\'' +
                ", appCategoryName='" + appCategoryName + '\'' +
                ", appCategoryID='" + appCategoryID + '\'' +
                ", permissionDetails=" + permissionDetails +
                ", title='" + title + '\'' +
                ", developer='" + developer + '\'' +
                ", versionName='" + versionName + '\'' +
                ", versionCode='" + versionCode + '\'' +
                ", osName='" + osName + '\'' +
                ", packageName='" + packageName + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                ", keyword=" + keyword +
                ", icon='" + icon + '\'' +
                ", id=" + id +
                '}';
    }

}
