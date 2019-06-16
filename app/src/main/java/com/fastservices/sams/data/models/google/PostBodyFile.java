package com.fastservices.sams.data.models.google;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PostBodyFile {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("mimeType")
    @Expose
    private String mimeType;
    @SerializedName("description")
    @Expose
    private String description;

    public PostBodyFile(String title, String mimeType, String description) {
        this.title = title;
        this.mimeType = mimeType;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
