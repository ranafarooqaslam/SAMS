package com.fastservices.sams.data.entities.promotions;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity
public class dtPromotionOffer{
	@SerializedName("promotioN_OFFER_ID")
	@PrimaryKey private long PROMOTION_OFFER_ID;
	@SerializedName("baskeT_ID") private long BASKET_ID;
	@SerializedName("promotioN_ID") private long PROMOTION_ID;
	@SerializedName("schemE_ID") private int SCHEME_ID;
	@SerializedName("distributoR_ID") private int DISTRIBUTOR_ID;
	@SerializedName("baskeT_DETAIL_ID") private long BASKET_DETAIL_ID;
	@SerializedName("quantity") private int QUANTITY;
	@SerializedName("offeR_VALUE") private Double OFFER_VALUE;
	@SerializedName("discount") private float DISCOUNT;
	@SerializedName("iS_AND") private int IS_AND;
	@SerializedName("skU_ID") private int SKU_ID;
	@SerializedName("uoM_ID") private int UOM_ID;
	@SerializedName("offeR_VALUE_TYPE") private int OFFER_VALUE_TYPE;
	@SerializedName("discounT_TYPE") private int DISCOUNT_TYPE;
	@SerializedName("skuOfferTypeID") private int SKUOfferTypeID;

	// not included in API
	private int CLAIMABLE;
	public int FreeSKUID;
	private int Group_ID;

	public dtPromotionOffer()
	{
		this.PROMOTION_OFFER_ID = -1;
		this.BASKET_ID = -1;
		this.PROMOTION_ID = -1;
		this.SCHEME_ID = -1;
		this.DISTRIBUTOR_ID = -1;
		this.BASKET_DETAIL_ID = -1;
		this.QUANTITY = -1;
		this.OFFER_VALUE = 0.0;
		this.DISCOUNT = (float) 0.0;
		this.IS_AND = 0;
		this.SKU_ID = -1;
		this.UOM_ID = -1;
		this.OFFER_VALUE_TYPE = -1;
		this.DISCOUNT_TYPE = -1;
		this.SKUOfferTypeID = -1;
		this.CLAIMABLE = 0;
		this.FreeSKUID = -1;
		this.Group_ID = -1;
	}
	
	//Set
	public dtPromotionOffer(long PROMOTION_OFFER_ID,long BASKET_ID,long PROMOTION_ID,int SCHEME_ID,int DISTRIBUTOR_ID,long BASKET_DETAIL_ID,int QUANTITY,Double OFFER_VALUE,float DISCOUNT, int IS_AND,int SKU_ID,int UOM_ID,int OFFER_VALUE_TYPE,int DISCOUNT_TYPE,int SKUOfferTypeID)
	{	
		this.PROMOTION_OFFER_ID = PROMOTION_OFFER_ID;
		this.BASKET_ID = BASKET_ID;
		this.PROMOTION_ID = PROMOTION_ID;
		this.SCHEME_ID = SCHEME_ID;
		this.DISTRIBUTOR_ID = DISTRIBUTOR_ID;
		this.BASKET_DETAIL_ID = BASKET_DETAIL_ID;
		this.QUANTITY = QUANTITY;
		this.OFFER_VALUE = OFFER_VALUE;
		this.DISCOUNT = DISCOUNT;
		this.IS_AND = IS_AND;
		this.SKU_ID = SKU_ID;
		this.UOM_ID = UOM_ID;
		this.OFFER_VALUE_TYPE = OFFER_VALUE_TYPE;
		this.DISCOUNT_TYPE = DISCOUNT_TYPE;
		this.SKUOfferTypeID = SKUOfferTypeID;
	}
	
	public void setPROMOTION_OFFER_ID(long PROMOTION_OFFER_ID)
	{
		this.PROMOTION_OFFER_ID = PROMOTION_OFFER_ID;
	}
	public void setBASKET_ID(long BASKET_ID)
	{
		this.BASKET_ID = BASKET_ID;
	}
	public void setPROMOTION_ID(long PROMOTION_ID)
	{
		this.PROMOTION_ID = PROMOTION_ID;
	}
	public void setSCHEME_ID(int SCHEME_ID){
		this.SCHEME_ID = SCHEME_ID;
	}
	public void setDISTRIBUTOR_ID(int DISTRIBUTOR_ID)
	{
		this.DISTRIBUTOR_ID = DISTRIBUTOR_ID;
	}
	public void setBASKET_DETAIL_ID(long BASKET_DETAIL_ID)
	{
		this.BASKET_DETAIL_ID = BASKET_DETAIL_ID;
	}
	public void setQUANTITY(int QUANTITY){
		this.QUANTITY = QUANTITY;
	}
	public void setOFFER_VALUE(Double OFFER_VALUE)
	{
		this.OFFER_VALUE = OFFER_VALUE;
	}
	public void setDISCOUNT(float DISCOUNT)
	{
		this.DISCOUNT = DISCOUNT;
	}
	public void setIS_AND(int IS_AND)
	{
		this.IS_AND = IS_AND;
	}	
	public void setSKU_ID(int SKU_ID)
	{
		this.SKU_ID = SKU_ID;
	}
	public void setUOM_ID(int UOM_ID)
	{
		this.UOM_ID = UOM_ID;
	}
	public void setOFFER_VALUE_TYPE(int OFFER_VALUE_TYPE)
	{
		this.OFFER_VALUE_TYPE = OFFER_VALUE_TYPE;
	}
	public void setDISCOUNT_TYPE(int DISCOUNT_TYPE)
	{
		this.DISCOUNT_TYPE = DISCOUNT_TYPE;
	}
	public void setSKUOfferTypeID(int SKUOfferTypeID)
	{
		this.SKUOfferTypeID = SKUOfferTypeID;
	}
	public void setCLAIMABLE(int CLAIMABLE)
	{
		this.CLAIMABLE = CLAIMABLE;
	}

	public void setGroup_ID(int Group_ID)
	{
		this.Group_ID = Group_ID;
	}
	//Get
	public long getPROMOTION_OFFER_ID()
	{
		return this.PROMOTION_OFFER_ID;
	}
	public long getBASKET_ID()
	{
		return this.BASKET_ID;
	}
	public long getPROMOTION_ID()
	{
		return this.PROMOTION_ID;
	}
	public int getSCHEME_ID()
	{
		return this.SCHEME_ID;
	}	
	public int getDISTRIBUTOR_ID(){
		return this.DISTRIBUTOR_ID;
	}
	public long getBASKET_DETAIL_ID()
	{
		return this.BASKET_DETAIL_ID;
	}
	public int getQUANTITY(){
		
		return this.QUANTITY;
	}
	public Double getOFFER_VALUE()
	{
		return this.OFFER_VALUE;
	}
	public float getDISCOUNT()
	{
		return this.DISCOUNT;
	}
	public int getIS_AND()
	{
		return this.IS_AND;
	}
	public int getSKU_ID()
	{
		return this.SKU_ID;
	}
	public int getUOM_ID()
	{
		return this.UOM_ID;
	}
	public int getOFFER_VALUE_TYPE()
	{
		return this.OFFER_VALUE_TYPE;
	}
	public int getDISCOUNT_TYPE()
	{
		return this.DISCOUNT_TYPE;
	}
	public int getSKUOfferTypeID()
	{
		return this.SKUOfferTypeID;
	}
	public int getCLAIMABLE()
	{
		return this.CLAIMABLE;
	}
	public int getGroup_ID()
	{
		return this.Group_ID;
	}
}