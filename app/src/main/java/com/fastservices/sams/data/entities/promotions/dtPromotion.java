package com.fastservices.sams.data.entities.promotions;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity
public class dtPromotion {
    @SerializedName("promotioN_ID")
    @PrimaryKey
    private long PROMOTION_ID;
    @SerializedName("schemE_ID")
    private int SCHEME_ID;
    @SerializedName("distributoR_ID")
    private int DISTRIBUTOR_ID;
    @SerializedName("claimable")
    private int CLAIMABLE;
    @SerializedName("starT_DATE")
    private String START_DATE = "";
    @SerializedName("enD_DATE")
    private String END_DATE = "";
    @SerializedName("promotioN_TYPE")
    private int PROMOTION_TYPE;
    @SerializedName("promotioN_SELECTION")
    private int PROMOTION_SELECTION;
    @SerializedName("iS_SCHEME")
    private Boolean IS_SCHEME;
    @SerializedName("promotioN_FOR")
    private Boolean PROMOTION_FOR;
    @SerializedName("useR_ID")
    private int USER_ID;

    public dtPromotion() {
        this.PROMOTION_ID = 0;
        this.SCHEME_ID = 0;
        this.DISTRIBUTOR_ID = 0;
        this.CLAIMABLE = 0;
        this.START_DATE = "";
        this.END_DATE = "";
        this.PROMOTION_TYPE = 0;
        this.PROMOTION_SELECTION = 0;
        this.IS_SCHEME = false;
        this.PROMOTION_FOR = false;
        this.USER_ID = 0;
    }

    //Set
    public dtPromotion(long PROMOTION_ID, int SCHEME_ID, int DISTRIBUTOR_ID, int CLAIMABLE, String START_DATE, String END_DATE, int PROMOTION_TYPE, int PROMOTION_SELECTION, Boolean IS_SCHEME, Boolean PROMOTION_FOR, int USER_ID) {
        this.PROMOTION_ID = PROMOTION_ID;
        this.SCHEME_ID = SCHEME_ID;
        this.DISTRIBUTOR_ID = DISTRIBUTOR_ID;
        this.CLAIMABLE = CLAIMABLE;
        this.START_DATE = START_DATE;
        this.END_DATE = END_DATE;
        this.PROMOTION_TYPE = PROMOTION_TYPE;
        this.PROMOTION_SELECTION = PROMOTION_SELECTION;
        this.IS_SCHEME = IS_SCHEME;
        this.PROMOTION_FOR = PROMOTION_FOR;
        this.USER_ID = USER_ID;
    }

    public void setPROMOTION_ID(long PROMOTION_ID) {
        this.PROMOTION_ID = PROMOTION_ID;
    }

    public void setSCHEME_ID(int SCHEME_ID) {
        this.SCHEME_ID = SCHEME_ID;
    }

    public void setCLAIMABLE(int CLAIMABLE) {
        this.CLAIMABLE = CLAIMABLE;
    }

    public void setSTART_DATE(String START_DATE) {
        this.START_DATE = START_DATE;
    }

    public void setEND_DATE(String END_DATE) {
        this.END_DATE = END_DATE;
    }

    public void setPROMOTION_SELECTION(int PROMOTION_SELECTION) {
        this.PROMOTION_SELECTION = PROMOTION_SELECTION;
    }

    public void setDISTRIBUTOR_ID(int DISTRIBUTOR_ID) {
        this.DISTRIBUTOR_ID = DISTRIBUTOR_ID;
    }

    public void setPROMOTION_TYPE(int PROMOTION_TYPE) {
        this.PROMOTION_TYPE = PROMOTION_TYPE;
    }

    public void setIS_SCHEME(Boolean IS_SCHEME) {
        this.IS_SCHEME = IS_SCHEME;

    }

    public void setPROMOTION_FOR(Boolean PROMOTION_FOR) {
        this.PROMOTION_FOR = PROMOTION_FOR;
    }

    public void setUSER_ID(int USER_ID) {
        this.USER_ID = USER_ID;
    }

    //Get
    public long getPROMOTION_ID() {
        return this.PROMOTION_ID;
    }

    public int getSCHEME_ID() {
        return this.SCHEME_ID;
    }

    public int getCLAIMABLE() {
        return this.CLAIMABLE;
    }

    public String getSTART_DATE() {
        return this.START_DATE;
    }

    public String getEND_DATE() {
        return this.END_DATE;
    }

    public int getPROMOTION_SELECTION() {
        return this.PROMOTION_SELECTION;
    }

    public int getPROMOTION_TYPE() {
        return this.PROMOTION_TYPE;
    }

    public int getDISTRIBUTOR_ID() {
        return this.DISTRIBUTOR_ID;
    }

    public Boolean getIS_SCHEME() {

        return this.IS_SCHEME;
    }

    public Boolean getPROMOTION_FOR() {
        return this.PROMOTION_FOR;
    }

    public int getUSER_ID() {
        return this.USER_ID;
    }
}