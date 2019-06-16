package com.fastservices.sams.data.entities.promotions;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class dtFreeSKUDetail {
	private int Master_SKU_ID;
	@PrimaryKey private int SKU_ID;
	private String SKU_Code;
	private String SKU_Name;
	private double UNIT_PRICE;
	private int QUANTITY;
	private int Quantity_TO;
	private int Quantity_AD;
	private double AMOUNT;
	private double GST_RATE;
	private double GST_AMOUNT;
	private double TST_AMOUNT;
	private long PROMOTION_ID;
	private long BASKET_ID;	
	private long BASKET_DETAIL_ID;
	private long PROMOTION_OFFER_ID;
	private int Group_Id;
	private double Extra_tax;
	private double GST_Price;
	private double WEIGHT;
	private String UOM_DESC;
	public dtFreeSKUDetail() {
		this.Master_SKU_ID = 0;
		this.SKU_ID = 0;
		this.Quantity_TO = 0;
		this.Quantity_AD = 0;
		this.SKU_Code = "";
		this.SKU_Name = "";
		this.UNIT_PRICE = 0.0;
		this.GST_RATE = 0.0;
		this.QUANTITY = 0;
		this.AMOUNT = 0.0;
		this.GST_AMOUNT = 0.0;
		this.TST_AMOUNT = 0.0;
		this.PROMOTION_ID = 0;
		this.BASKET_ID = 0;
		this.BASKET_DETAIL_ID = 0;
		this.PROMOTION_OFFER_ID = 0;
		this.Group_Id = 0;
		this.Extra_tax = 0;
		this.GST_Price =0;
		this.WEIGHT =0;
		this.UOM_DESC = "";
	}

	// Set
	public dtFreeSKUDetail(int SKU_ID, int Quantity_TO,int Quantity_AD, String SKU_Code,
			String SKU_Name, double UNIT_PRICE, double GST_RATE, String GST_ON,
			double TST_AMOUNT,double WEIGHT,String UOM_DESC) {
		this.SKU_ID = SKU_ID;
		this.Quantity_TO = Quantity_TO;
		this.Quantity_AD = Quantity_AD;
		this.SKU_Code = SKU_Code;
		this.SKU_Name = SKU_Name;
		this.UNIT_PRICE = UNIT_PRICE;
		this.GST_RATE = GST_RATE;
		this.TST_AMOUNT = TST_AMOUNT;
		this.WEIGHT = WEIGHT;
		this.UOM_DESC = UOM_DESC;
	}

	public void setMaster_SKU_ID(int Master_SKU_ID) {
		this.Master_SKU_ID = Master_SKU_ID;
	}

	public void setSKU_ID(int SKU_ID) {
		this.SKU_ID = SKU_ID;
	}

	public void setQuantity_TO(int Quantity_TO) {
		this.Quantity_TO = Quantity_TO;
	}
	public void setQuantity_AD(int Quantity_AD)
	{
		this.Quantity_AD = Quantity_AD;
	}

	public void setSKU_Code(String SKU_Code) {
		this.SKU_Code = SKU_Code;
	}

	public void setSKU_Name(String SKU_Name) {
		this.SKU_Name = SKU_Name;
	}

	public void setUNIT_PRICE(double UNIT_PRICE) {
		this.UNIT_PRICE = UNIT_PRICE;
	}

	public void setQUANTITY(int QUANTITY) {
		this.QUANTITY = QUANTITY;
	}

	public void setAMOUNT(double AMOUNT) {
		this.AMOUNT = AMOUNT;
	}

	public void setGST_RATE(double GST_RATE) {
		this.GST_RATE = GST_RATE;
	}

	public void setGST_AMOUNT(double GST_AMOUNT) {
		this.GST_AMOUNT = GST_AMOUNT;

	}

	public void setTST_AMOUNT(double TST_AMOUNT) {
		this.TST_AMOUNT = TST_AMOUNT;
	}

	public void setPROMOTION_ID(long PROMOTION_ID) {
		this.PROMOTION_ID = PROMOTION_ID;
	}

	public void setBASKET_ID(long BASKET_ID) {
		this.BASKET_ID = BASKET_ID;
	}

	public void setBASKET_DETAIL_ID(long BASKET_DETAIL_ID) {
		this.BASKET_DETAIL_ID = BASKET_DETAIL_ID;
	}

	public void setPROMOTION_OFFER_ID(long PROMOTION_OFFER_ID) {
		this.PROMOTION_OFFER_ID = PROMOTION_OFFER_ID;
	}
	public void setGroup_Id(int Group_Id)
	{
		this.Group_Id = Group_Id;
	}
	public void setExtra_tax(double Extra_tax)
	{
		this.Extra_tax = Extra_tax;
	}
	public void setGST_Price(double GST_Price)
	{
		this.GST_Price = GST_Price;
	}
	public void setWEIGHT(double WEIGHT)
	{
		this.WEIGHT = WEIGHT;
	}
	public void setUOM_DESC(String UOM_DESC)
	{
		this.UOM_DESC = UOM_DESC;
	}
	// Get
	public int getMaster_SKU_ID() {
		return this.Master_SKU_ID;
	}

	public int getSKU_ID() {
		return this.SKU_ID;
	}

	public int getQuantity_TO() {
		return this.Quantity_TO;
	}
	public int getQuantity_AD()
	{
		return this.Quantity_AD;
	}
	public String getSKU_Code() {
		return this.SKU_Code;
	}

	public String getSKU_Name() {
		return this.SKU_Name;
	}

	public double getUNIT_PRICE() {
		return this.UNIT_PRICE;
	}

	public double getGST_RATE() {
		return this.GST_RATE;
	}

	public int getQUANTITY() {
		return this.QUANTITY;
	}

	public double getAMOUNT() {
		return this.AMOUNT;
	}

	public double getGST_AMOUNT() {

		return this.GST_AMOUNT;
	}

	public double getTST_AMOUNT() {
		return this.TST_AMOUNT;
	}

	public long getPROMOTION_ID() {
		return this.PROMOTION_ID;
	}

	public long getBASKET_ID() {
		return this.BASKET_ID;
	}

	public long getBASKET_DETAIL_ID() {
		return this.BASKET_DETAIL_ID;
	}

	public long getPROMOTION_OFFER_ID() {
		return this.PROMOTION_OFFER_ID;
	}
	public int getGroup_Id()
	{
		return this.Group_Id;
	}
	public double getExtra_tax()
	{
		return this.Extra_tax;
	}
	public double getGST_Price()
	{
		return this.GST_Price;
	}
	public double getWEIGHT()
	{
		return this.WEIGHT;
	}
	public String getUOM_DESC()
	{
		return this.UOM_DESC;
	}
}