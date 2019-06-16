
package com.fastservices.sams.data.models.google;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Capabilities {

    @SerializedName("canCopy")
    @Expose
    private boolean canCopy;
    @SerializedName("canEdit")
    @Expose
    private boolean canEdit;

    public boolean isCanCopy() {
        return canCopy;
    }

    public void setCanCopy(boolean canCopy) {
        this.canCopy = canCopy;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

}
