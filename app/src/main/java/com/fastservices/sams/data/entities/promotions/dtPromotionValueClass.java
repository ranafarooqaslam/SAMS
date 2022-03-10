package com.fastservices.sams.data.entities.promotions;


import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity
public class dtPromotionValueClass {


    @SerializedName("promotioN_VOLUMECLASS_ID")
    @PrimaryKey public int PROMOTION_VOLUMECLASS_ID;
    @SerializedName("schemE_ID")
    private int SCHEME_ID;
    @SerializedName("promotioN_ID")
    private long PROMOTION_ID;
    @SerializedName("distributoR_ID")
    private int DISTRIBUTOR_ID;
    @SerializedName("customeR_VOLUMECLASS_ID")
    private int CUSTOMER_VOLUMECLASS_ID;

    public dtPromotionValueClass() {
        this.SCHEME_ID = -1;
        this.PROMOTION_ID = -1;
        this.DISTRIBUTOR_ID = -1;
        this.CUSTOMER_VOLUMECLASS_ID = -1;
    }

    //Set
    public dtPromotionValueClass(int SCHEME_ID, long PROMOTION_ID, int DISTRIBUTOR_ID, int CUSTOMER_VOLUMECLASS_ID) {
        this.PROMOTION_ID = PROMOTION_ID;
        this.SCHEME_ID = SCHEME_ID;
        this.DISTRIBUTOR_ID = DISTRIBUTOR_ID;
        this.CUSTOMER_VOLUMECLASS_ID = CUSTOMER_VOLUMECLASS_ID;
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

    public void setCUSTOMER_VOLUMECLASS_ID(int CUSTOMER_VOLUMECLASS_ID) {
        this.CUSTOMER_VOLUMECLASS_ID = CUSTOMER_VOLUMECLASS_ID;
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

    public int getCUSTOMER_VOLUMECLASS_ID() {

        return this.CUSTOMER_VOLUMECLASS_ID;
    }
}