
package com.fastservices.sams.data.models.google;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Owner {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("displayName")
    @Expose
    private String displayName;
    @SerializedName("picture")
    @Expose
    private Picture picture;
    @SerializedName("isAuthenticatedUser")
    @Expose
    private boolean isAuthenticatedUser;
    @SerializedName("permissionId")
    @Expose
    private String permissionId;
    @SerializedName("emailAddress")
    @Expose
    private String emailAddress;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Picture getPicture() {
        return picture;
    }

    public void setPicture(Picture picture) {
        this.picture = picture;
    }

    public boolean isIsAuthenticatedUser() {
        return isAuthenticatedUser;
    }

    public void setIsAuthenticatedUser(boolean isAuthenticatedUser) {
        this.isAuthenticatedUser = isAuthenticatedUser;
    }

    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

}
