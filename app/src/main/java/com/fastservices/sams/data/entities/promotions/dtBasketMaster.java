package com.fastservices.sams.data.entities.promotions;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity
public class dtBasketMaster {
    @SerializedName("baskeT_ID")
    @PrimaryKey
    private long BASKET_ID;
    @SerializedName("promotioN_ID")
    private long PROMOTION_ID;
    @SerializedName("schemE_ID")
    private int SCHEME_ID;
    @SerializedName("distributoR_ID")
    private int DISTRIBUTOR_ID;
    @SerializedName("iS_BASKET")
    private Boolean IS_BASKET;
    @SerializedName("iS_AND")
    private int IS_AND;
    @SerializedName("iS_MULTIPLE")
    private Boolean IS_MULTIPLE;
    @SerializedName("baskeT_ON")
    private int BASKET_ON;
    @SerializedName("baskeT_SELECTION")
    private int BASKET_SELECTION;

    public dtBasketMaster() {
        this.BASKET_ID = 0;
        this.PROMOTION_ID = 0;
        this.SCHEME_ID = 0;
        this.DISTRIBUTOR_ID = 0;
        this.IS_BASKET = false;
        this.IS_AND = 0;
        this.IS_MULTIPLE = false;
        this.BASKET_ON = 0;
        this.BASKET_SELECTION = 0;
    }

    //Set
    public dtBasketMaster(long BASKET_ID, long PROMOTION_ID, int SCHEME_ID, int DISTRIBUTOR_ID, Boolean IS_BASKET, int IS_AND, Boolean IS_MULTIPLE, int BASKET_ON, int BASKET_SELECTION) {
        this.BASKET_ID = BASKET_ID;
        this.PROMOTION_ID = PROMOTION_ID;
        this.SCHEME_ID = SCHEME_ID;
        this.DISTRIBUTOR_ID = DISTRIBUTOR_ID;
        this.IS_BASKET = IS_BASKET;
        this.IS_AND = IS_AND;
        this.IS_MULTIPLE = IS_MULTIPLE;
        this.BASKET_ON = BASKET_ON;
        this.BASKET_SELECTION = BASKET_SELECTION;
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

    public void setIS_BASKET(Boolean IS_BASKET) {
        this.IS_BASKET = IS_BASKET;
    }

    public void setIS_AND(int IS_AND) {
        this.IS_AND = IS_AND;
    }

    public void setIS_MULTIPLE(Boolean IS_MULTIPLE) {
        this.IS_MULTIPLE = IS_MULTIPLE;
    }

    public void setBASKET_ON(int BASKET_ON) {
        this.BASKET_ON = BASKET_ON;
    }

    public void setBASKET_SELECTION(int BASKET_SELECTION) {
        this.BASKET_SELECTION = BASKET_SELECTION;
    }

    //Get
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

    public Boolean getIS_BASKET() {

        return this.IS_BASKET;
    }

    public int getIS_AND() {
        return this.IS_AND;
    }

    public Boolean getIS_MULTIPLE() {
        return this.IS_MULTIPLE;
    }

    public int getBASKET_ON() {
        return this.BASKET_ON;
    }

    public int getBASKET_SELECTION() {
        return this.BASKET_SELECTION;
    }
}