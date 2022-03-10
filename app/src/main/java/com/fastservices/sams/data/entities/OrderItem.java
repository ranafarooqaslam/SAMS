
package com.fastservices.sams.data.entities;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity
public class OrderItem {

    @PrimaryKey(autoGenerate = true)
    public int _id;
    @SerializedName("SKUID")
    @Expose
    public int sKUID;
    @SerializedName("Quantity")
    @Expose
    public int quantity;
    @SerializedName("Price")
    @Expose
    public double price;
    @SerializedName("GSTRate")
    @Expose
    public double gSTRate;
    @SerializedName("Amount")
    @Expose
    public double amount;
    @SerializedName("StandardDiscount")
    @Expose
    public double standardDiscount;
    @SerializedName("ExtraDiscount")
    @Expose
    public double extraDiscount;
    @SerializedName("GSTAmount")
    @Expose
    public double gSTAmount;
    @SerializedName("NetAmount")
    @Expose
    public double netAmount;
    @SerializedName("TSTAmount")
    @Expose
    public double tSTAmount;
    @SerializedName("SedAmount")
    @Expose
    public double sedAmount;
    @SerializedName("Unit_In_Case")
    @Expose
    public int unitInCase;
    @SerializedName("ExtraTax")
    @Expose
    public double extraTax;
    @SerializedName("GSTPrice")
    @Expose
    public double gSTPrice;
    @SerializedName("StandardDiscountByValue")
    @Expose
    public double standardDiscountByValue;
    @SerializedName("StandardDiscountPerValue")
    @Expose
    public double standardDiscountPerValue;
    @SerializedName("StandardDiscountPer")
    @Expose
    public double standardDiscountPer;
    @SerializedName("SedAmountByValue")
    @Expose
    public double sedAmountByValue;
    @SerializedName("SedAmountPerValue")
    @Expose
    public double sedAmountPerValue;
    @SerializedName("StandardDiscountByValueTo")
    @Expose
    public double standardDiscountByValueTo;
    @SerializedName("StandardDiscountByValueAd")
    @Expose
    public double standardDiscountByValueAd;
    @SerializedName("StandardDiscountPerValueTo")
    @Expose
    public double standardDiscountPerValueTo;
    @SerializedName("StandardDiscountPerValueAd")
    @Expose
    public double standardDiscountPerValueAd;
    @SerializedName("SedAmountByValueTo")
    @Expose
    public double sedAmountByValueTo;
    @SerializedName("SedAmountByValueAD")
    @Expose
    public double sedAmountByValueAD;
    @SerializedName("SedAmountPerValueTo")
    @Expose
    public double sedAmountPerValueTo;
    @SerializedName("SedAmountPerValueAd")
    @Expose
    public double sedAmountPerValueAd;

    public double claimExtraAmount;

    public double CLAIM_PER;

    public int OutletID;

    @Ignore
    public SKU skuItem;


    public OrderItem(SKU sku,int outletID) {
        skuItem = sku;
        this.OutletID = outletID;
        sKUID = sku.getSKU_ID();
        quantity = sku.getNO_OF_UNITS() + sku.getNO_OF_CARTONS() * sku.getUNITS_IN_CASE();

        price = sku.getTRADE_PRICE();
        amount = quantity * price;
        gSTRate = sku.getGST_RATE();
        extraTax = sku.getEXTR_Tax();
        unitInCase = sku.getUNITS_IN_CASE();



    }

    public double getCLAIM_PER() {
        return CLAIM_PER;
    }

    public void setCLAIM_PER(double CLAIM_PER) {
        this.CLAIM_PER = CLAIM_PER;
    }
}
