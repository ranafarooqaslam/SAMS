
package com.fastservices.sams.data.models.google;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Picture_ {

    @SerializedName("url")
    @Expose
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
