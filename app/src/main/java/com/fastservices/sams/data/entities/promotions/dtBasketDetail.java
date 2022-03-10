package com.fastservices.sams.data.entities.promotions;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity
public class dtBasketDetail {
    @SerializedName("baskeT_DETAIL_ID")
    @PrimaryKey
    private long BASKET_DETAIL_ID;
    @SerializedName("baskeT_ID")
    private long BASKET_ID;
    @SerializedName("promotioN_ID")
    private long PROMOTION_ID;
    @SerializedName("schemE_ID")
    private int SCHEME_ID;
    @SerializedName("distributoR_ID")
    private int DISTRIBUTOR_ID;
    @SerializedName("miN_VAL")
    private Double MIN_VAL;
    @SerializedName("maX_VAL")
    private Double MAX_VAL;
    @SerializedName("multiplE_OF")
    private int MULTIPLE_OF;
    @SerializedName("skU_ID")
    private int SKU_ID;
    @SerializedName("skU_GROUP_ID")
    private int SKU_GROUP_ID;
    @SerializedName("uoM_ID")
    private int UOM_ID;

    public dtBasketDetail() {
        this.BASKET_DETAIL_ID = -1;
        this.BASKET_ID = -1;
        this.PROMOTION_ID = -1;
        this.SCHEME_ID = -1;
        this.DISTRIBUTOR_ID = -1;
        this.MIN_VAL = 0.0;
        this.MAX_VAL = 0.0;
        this.MULTIPLE_OF = -1;
        this.SKU_ID = -1;
        this.SKU_GROUP_ID = -1;
        this.UOM_ID = -1;
    }

    //Set
    public dtBasketDetail(long BASKET_DETAIL_ID, long BASKET_ID, long PROMOTION_ID, int SCHEME_ID, int DISTRIBUTOR_ID, Double MIN_VAL, Double MAX_VAL, int MULTIPLE_OF, int SKU_ID, int SKU_GROUP_ID, int UOM_ID) {
        this.BASKET_DETAIL_ID = BASKET_DETAIL_ID;
        this.BASKET_ID = BASKET_ID;
        this.PROMOTION_ID = PROMOTION_ID;
        this.SCHEME_ID = SCHEME_ID;
        this.DISTRIBUTOR_ID = DISTRIBUTOR_ID;
        this.MIN_VAL = MIN_VAL;
        this.MAX_VAL = MAX_VAL;
        this.MULTIPLE_OF = MULTIPLE_OF;
        this.SKU_ID = SKU_ID;
        this.SKU_GROUP_ID = SKU_GROUP_ID;
        this.UOM_ID = UOM_ID;
    }

    public void setBASKET_DETAIL_ID(long BASKET_DETAIL_ID) {
        this.BASKET_DETAIL_ID = BASKET_DETAIL_ID;
    }

    public void setBASKET_ID(long BASKET_ID) {
        this.BASKET_ID = BASKET_ID;
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

    public void setMIN_VAL(Double MIN_VAL) {
        this.MIN_VAL = MIN_VAL;
    }

    public void setMAX_VAL(Double MAX_VAL) {
        this.MAX_VAL = MAX_VAL;
    }

    public void setMULTIPLE_OF(int MULTIPLE_OF) {
        this.MULTIPLE_OF = MULTIPLE_OF;
    }

    public void setSKU_ID(int SKU_ID) {
        this.SKU_ID = SKU_ID;
    }

    public void setSKU_GROUP_ID(int SKU_GROUP_ID) {
        this.SKU_GROUP_ID = SKU_GROUP_ID;
    }

    public void setUOM_ID(int UOM_ID) {
        this.UOM_ID = UOM_ID;
    }

    //Get
    public long getBASKET_DETAIL_ID() {
        return this.BASKET_DETAIL_ID;
    }

    public long getBASKET_ID() {
        return this.BASKET_ID;
    }

    public long getPROMOTION_ID() {
        return this.PROMOTION_ID;
    }

    public int getSCHEME_ID() {
        return this.SCHEME_ID;
    }

    public int getDISTRIBUTOR_ID() {
        return this.DISTRIBUTOR_ID;
    }

    public Double getMIN_VAL() {

        return this.MIN_VAL;
    }

    public Double getMAX_VAL() {
        return this.MAX_VAL;
    }

    public int getMULTIPLE_OF() {
        return this.MULTIPLE_OF;
    }

    public int getSKU_ID() {
        return this.SKU_ID;
    }

    public int getSKU_GROUP_ID() {
        return this.SKU_GROUP_ID;
    }

    public int getUOM_ID() {
        return this.UOM_ID;
    }
}