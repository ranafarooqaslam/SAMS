package com.fastservices.sams.data.entities.promotions;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity
public class dtPromotionCustomerType {

    // promotioN_CUSTOMER_TYPE_ID is missing in data class, but it is included in API response
    @SerializedName("promotioN_CUSTOMER_TYPE_ID")
    @PrimaryKey public int PROMOTION_CUSTOMER_TYPE_ID;
    @SerializedName("schemE_ID")
    private int SCHEME_ID;
    @SerializedName("promotioN_ID")
    private long PROMOTION_ID;
    @SerializedName("distributoR_ID")
    private int DISTRIBUTOR_ID;
    @SerializedName("customeR_TYPE_ID")
    private int CUSTOMER_TYPE_ID;

    public dtPromotionCustomerType() {
        this.SCHEME_ID = -1;
        this.PROMOTION_ID = -1;
        this.DISTRIBUTOR_ID = -1;
        this.CUSTOMER_TYPE_ID = -1;
    }

    //Set
    public dtPromotionCustomerType(int SCHEME_ID, long PROMOTION_ID, int DISTRIBUTOR_ID, int CUSTOMER_TYPE_ID) {
        this.PROMOTION_ID = PROMOTION_ID;
        this.SCHEME_ID = SCHEME_ID;
        this.DISTRIBUTOR_ID = DISTRIBUTOR_ID;
        this.CUSTOMER_TYPE_ID = CUSTOMER_TYPE_ID;
    }

    public void setPROMOTION_ID(long PROMOTION_ID) {
        this.PROMOTION_ID = PROMOTION_ID;
    }

    public void setSCHEME_ID(int SCHEME_ID) {
        this.SCHEME_ID = SCHEME_ID;
    }

    public void setDISTRIBUTOR_ID(int DISTRIBUTOR_ID) {
        this.DISTRIBUTOR_ID = DISTRIBUTOR_ID;
    }

    public void setCUSTOMER_TYPE_ID(int CUSTOMER_TYPE_ID) {
        this.CUSTOMER_TYPE_ID = CUSTOMER_TYPE_ID;
    }

    //Get
    public long getPROMOTION_ID() {
        return this.PROMOTION_ID;
    }

    public int getSCHEME_ID() {
        return this.SCHEME_ID;
    }

    public int getDISTRIBUTOR_ID() {
        return this.DISTRIBUTOR_ID;
    }

    public int getCUSTOMER_TYPE_ID() {

        return this.CUSTOMER_TYPE_ID;
    }
}