package com.fastservices.sams.data.repos;

import android.widget.Toast;

import com.fastservices.sams.data.entities.OrderItem;
import com.fastservices.sams.data.entities.SKU;
import com.fastservices.sams.data.entities.promotions.dtBasketDetail;
import com.fastservices.sams.data.entities.promotions.dtBasketMaster;
import com.fastservices.sams.data.entities.promotions.dtFreeSKUDetail;
import com.fastservices.sams.data.entities.promotions.dtPromotion;
import com.fastservices.sams.data.entities.promotions.dtPromotionCustomerType;
import com.fastservices.sams.data.entities.promotions.dtPromotionOffer;
import com.fastservices.sams.data.entities.promotions.dtPromotionValueClass;
import com.fastservices.sams.data.models.UserInfo;

import java.util.ArrayList;
import java.util.List;

public class RepoPromotionsUnused {

/*
    UserInfo login = null;
    int DistributorTypeID = Integer.parseInt(login.getDistributorTypeID())
    int IsDistributorRegister = 0;// populate from UserInfo

    ArrayList<OrderItem> myShoping = SkuCategories.shoping;
    ArrayList<dtFreeSKUDetail> dtFree = new ArrayList<dtFreeSKUDetail>();
    static double ObjStandardDiscount = 0.0;
    double ObjTotalSED_BY_VALUE_AD = 0.0;
    double ObjTotalSED_PER_VALUE_AD = 0.0;
    double ObjTotalSED_BY_VALUE_TO = 0.0;
    double ObjTotalSED_PER_VALUE_TO = 0.0;
    double ObjTotalSED = 0.0;
    double ObjStandardDiscount_By_VALUE = 0.0;
    double ObjStandardDiscount_PER_VALUE = 0.0;
    double ObjTotalSED_BY_VALUE = 0.0;
    double ObjTotalSED_PER_VALUE = 0.0;
    double ObjStandardDiscount_By_VALUE_TO = 0.0;
    double ObjStandardDiscount_By_VALUE_AD = 0;
    double ObjStandardDiscount_PER_VALUE_TO = 0;
    double ObjStandardDiscount_PER_VALUE_AD = 0;
    double mGSTPrice = 0.0;
    double ObjGrossSales = 0.0;
    double ObjTotalGST = 0.0;
    double ObjTotalTST = 0;
    double ObjTotalExtra_Tax = 0;
    double ObjFreeGSTAmount = 0;
    double ObjFreeTST = 0;
    double ObjFreeExtra_Tax = 0;
    static String OrderID = "0";
    static String Remakrs = "";

    private void GetPromotion() {
        try {
            ObjStandardDiscount = 0.0;
            ObjTotalSED_BY_VALUE_AD = 0.0;
            ObjTotalSED_PER_VALUE_AD = 0.0;
            ObjTotalSED_BY_VALUE_TO = 0.0;
            ObjTotalSED_PER_VALUE_TO = 0.0;
            ObjStandardDiscount_By_VALUE = 0.0;
            ObjStandardDiscount_PER_VALUE = 0.0;
            ObjTotalSED_BY_VALUE = 0.0;
            ObjTotalSED_PER_VALUE = 0.0;
            ObjStandardDiscount_By_VALUE_TO = 0;
            ObjStandardDiscount_By_VALUE_AD = 0;
            ObjStandardDiscount_PER_VALUE_TO = 0;
            ObjStandardDiscount_PER_VALUE_AD = 0;
            ObjTotalSED = 0.0;
            mGSTPrice = 0.0;
            ObjGrossSales = 0.0;
            ObjTotalGST = 0.0;
            ObjTotalTST = 0;
            ObjTotalExtra_Tax = 0;
            //Set all promotion related columns of Ordered Items to zero
            for (int i = 0; i < myShoping.size(); i++) {
                OrderItem tempObj = myShoping.get(i);
                tempObj.standardDiscount = 0;
                tempObj.sedAmountByValueAD = 0;
                tempObj.sedAmountPerValueAd = 0;
                tempObj.sedAmountByValueTo = 0;
                tempObj.sedAmountPerValueTo = 0;
                tempObj.standardDiscountPerValue = 0;
                tempObj.setCLAIM_PER(0);
                tempObj.sedAmountPerValue = 0;
                tempObj.standardDiscountByValueAd = 0;
            }

            int Quantity = 0;
            int FreeSKUID = 0;
            double Offer_Value = 0.0;
            double Discount = 0.0;

            ArrayList<dtPromotionOffer> myPromotions = new ArrayList<dtPromotionOffer>();

            dtPromotionOffer tempPromotion = null;
            dtFreeSKUDetail tempSKU = null;

            dbhelper = new DBHelper(OrderSummery.this);
            //There are 6 tables which store promotion information
            //Load information from 1st table "Promotion" of promotions
            List<dtPromotion> dtProm = dbhelper.getPromotion();

            for (int PromotionIdx = 0; PromotionIdx < dtProm.size(); PromotionIdx++) {
                dtPromotion rowProm = dtProm.get(PromotionIdx);
                Boolean IsValidCustomerVolCla = false;
                Boolean IsValidCustomerTypeId = false;
                List<Integer> mygroup = new ArrayList<Integer>();

                // Promotion Volume Class
                dbhelper = new DBHelper(OrderSummery.this);
                //Load information from 2nd table "CustomerVolumeClass" of promotions
                List<dtPromotionValueClass> pVolume = dbhelper
                        .getPromotionCustomerVolume(rowProm.getPROMOTION_ID());
                if (pVolume.size() > 0) {
                    for (int i = 0; i < pVolume.size(); i++) {
                        dtPromotionValueClass rowVolume = pVolume.get(i);
                        if (Customer.CustomerVolumeClass == rowVolume
                                .getCUSTOMER_VOLUMECLASS_ID()) {
                            IsValidCustomerVolCla = true;
                            break;
                        }
                    }
                }

                // Customer Type
                dbhelper = new DBHelper(OrderSummery.this);
                //Load information from 3rd table "PrmotionCustomerType" of promotions
                List<dtPromotionCustomerType> pType = dbhelper
                        .getPromotionCustomerType(rowProm.getPROMOTION_ID());
                if (pType.size() > 0) {
                    for (int i = 0; i < pType.size(); i++) {
                        dtPromotionCustomerType rowType = pType.get(i);
                        if (Customer.ChannelTypeID == rowType
                                .getCUSTOMER_TYPE_ID()) {
                            IsValidCustomerTypeId = true;
                            break;
                        }
                    }
                }

                if (IsValidCustomerTypeId && IsValidCustomerVolCla) {
                    for (int i = 0; i < myShoping.size(); i++) {
                        OrderItem tempObj = myShoping.get(i);
                        // Basket Master
                        dbhelper = new DBHelper(OrderSummery.this);
                        //Load information from 4th table "BasketMaster" of promotions
                        List<dtBasketMaster> dtBMaster = dbhelper
                                .getBaskMaser(rowProm.getPROMOTION_ID());
                        for (int BMastterIndex = 0; BMastterIndex < dtBMaster
                                .size(); BMastterIndex++) {
                            Boolean Applygroup = false;
                            double dValueToCompare = 0.0;
                            int dMultipalGroupItem = 0;
                            dtBasketMaster rowBMaster = dtBMaster
                                    .get(BMastterIndex);

                            // Basket Detail
                            dbhelper = new DBHelper(OrderSummery.this);
                            //Load information from 5th table "BasketDetail" of promotions
                            List<dtBasketDetail> dtBDetail = dbhelper
                                    .getBaskDetail(rowBMaster.getBASKET_ID());
                            for (int BDetailIndex = 0; BDetailIndex < dtBDetail
                                    .size(); BDetailIndex++) {
                                dtBasketDetail rowBDetail = dtBDetail
                                        .get(BDetailIndex);
                                if (rowBDetail.getSKU_ID() > 0)// Single SKU
                                {
                                    if (rowBDetail.getSKU_ID() == tempObj
                                            .sKUID) {//If promotion is applies on Single SKU
                                        if (rowBMaster.getBASKET_ON() == 83)// If Promotion applies on Amount
                                        {
                                            dValueToCompare = tempObj
                                                    .amount;
                                        } else if (rowBMaster.getBASKET_ON() == 82)//If Promotion applies on Quantity
                                        {
                                            dValueToCompare = (double) tempObj
                                                    .quantity;
                                        }

                                        // Check if Slab is applicable
                                        //If Quanitty of Amount of Order lies in the range of Min and Max value of promotion
                                        if (dValueToCompare >= rowBDetail
                                                .getMIN_VAL()
                                                && (dValueToCompare <= rowBDetail
                                                .getMAX_VAL() || rowBDetail
                                                .getMAX_VAL() == 0)) {
                                            // Promotion Offer
                                            dbhelper = new DBHelper(
                                                    OrderSummery.this);
                                            //Load information from 6th table "PromotionOffer" of promotions
                                            List<dtPromotionOffer> dtPOffer = dbhelper
                                                    .getPromotionOffer(rowBDetail
                                                            .getBASKET_DETAIL_ID());
                                            if (dtPOffer.size() > 0) {
                                                dtPromotionOffer rowPOffer = dtPOffer
                                                        .get(0);
                                                tempPromotion = rowPOffer;
                                                if (dValueToCompare > rowBDetail
                                                        .getMULTIPLE_OF()
                                                        && rowBDetail
                                                        .getMULTIPLE_OF() > 0) {
                                                    int iMultiply = (int) (dValueToCompare / rowBDetail
                                                            .getMULTIPLE_OF());
                                                    tempPromotion
                                                            .setQUANTITY(rowPOffer
                                                                    .getQUANTITY()
                                                                    * iMultiply);
                                                    tempPromotion
                                                            .setOFFER_VALUE(rowPOffer
                                                                    .getOFFER_VALUE()
                                                                    * iMultiply);
                                                } else {
                                                    tempPromotion
                                                            .setQUANTITY(rowPOffer
                                                                    .getQUANTITY());
                                                    tempPromotion
                                                            .setOFFER_VALUE(rowPOffer
                                                                    .getOFFER_VALUE());
                                                }
                                                tempPromotion
                                                        .setDISCOUNT(rowPOffer
                                                                .getDISCOUNT());
                                                tempPromotion
                                                        .setFreeSKUID(rowPOffer
                                                                .getSKU_ID());
                                                tempPromotion
                                                        .setCLAIMABLE(rowProm
                                                                .getCLAIMABLE());
                                                tempPromotion
                                                        .setIS_AND(rowBMaster
                                                                .getIS_AND());
                                                tempPromotion.setSKU_ID(tempObj
                                                        .sKUID);
                                                tempPromotion
                                                        .setOFFER_VALUE_TYPE(rowPOffer
                                                                .getOFFER_VALUE_TYPE());
                                                tempPromotion
                                                        .setDISCOUNT_TYPE(rowPOffer
                                                                .getDISCOUNT_TYPE());
                                                tempPromotion.setGroup_ID(-1);
                                                //Add Applicable Promotion Detail to myPromotions List
                                                myPromotions.add(tempPromotion);
                                            }
                                        }
                                    }
                                } else// Group
                                {
                                    //If Group Applies
                                    for (Integer value : mygroup) {
                                        if (rowBDetail.getSKU_GROUP_ID() == value) {
                                            Applygroup = true;
                                            break;
                                        }
                                    }
                                    if (!Applygroup) {
                                        dValueToCompare = 0.0;
                                        dMultipalGroupItem = 0;
                                        //If Promotion applies on Amount then calculate those skus amount of current group
                                        if (rowBMaster.getBASKET_ON() == 83) {
                                            for (int k = 0; k < myShoping
                                                    .size(); k++) {
                                                OrderItem tempObj2 = myShoping
                                                        .get(k);
                                                dbhelper = new DBHelper(
                                                        OrderSummery.this);
                                                List<dtSKUGroupDetail> groupdetail = dbhelper
                                                        .getSKUGroupDetail(
                                                                tempObj2.sKUID,
                                                                rowBDetail
                                                                        .getSKU_GROUP_ID());
                                                if (groupdetail.size() > 0) {
                                                    dValueToCompare += tempObj2
                                                            .amount;
                                                    dMultipalGroupItem += 1;
                                                }
                                            }
                                        } else {////If Promotion applies on Quantity  then calculate those skus quantity of current group
                                            for (int k = 0; k < myShoping
                                                    .size(); k++) {
                                                OrderItem tempObj2 = myShoping
                                                        .get(k);
                                                dbhelper = new DBHelper(
                                                        OrderSummery.this);
                                                List<dtSKUGroupDetail> groupdetail = dbhelper
                                                        .getSKUGroupDetail(
                                                                tempObj2.sKUID,
                                                                rowBDetail
                                                                        .getSKU_GROUP_ID());
                                                if (groupdetail.size() > 0) {
                                                    dValueToCompare += tempObj2
                                                            .quantity;
                                                    dMultipalGroupItem += 1;
                                                }
                                            }
                                        }
                                        // Check if Slab is applicable
                                        //If Quanitty of Amount of Order lies in the range of Min and Max value of promotion
                                        if (dValueToCompare >= rowBDetail
                                                .getMIN_VAL()
                                                && (dValueToCompare <= rowBDetail
                                                .getMAX_VAL() || rowBDetail
                                                .getMAX_VAL() == 0)) {
                                            dbhelper = new DBHelper(
                                                    OrderSummery.this);
                                            //Load information from 6th table "PromotionOffer" of promotions
                                            List<dtPromotionOffer> dtPOffer = dbhelper
                                                    .getPromotionOffer(rowBDetail
                                                            .getBASKET_DETAIL_ID());
                                            if (dtPOffer.size() > 0) {
                                                dtPromotionOffer rowPOffer = dtPOffer
                                                        .get(0);
                                                tempPromotion = rowPOffer;
                                                if (dValueToCompare > rowBDetail
                                                        .getMULTIPLE_OF()
                                                        && rowBDetail
                                                        .getMULTIPLE_OF() > 0) {
                                                    int iMultiply = (int) (dValueToCompare / rowBDetail
                                                            .getMULTIPLE_OF());
                                                    tempPromotion
                                                            .setQUANTITY(rowPOffer
                                                                    .getQUANTITY()
                                                                    * iMultiply);
                                                    double TotalvalueOngroup = rowPOffer
                                                            .getOFFER_VALUE()
                                                            * iMultiply;
                                                    tempPromotion
                                                            .setOFFER_VALUE(TotalvalueOngroup
                                                                    / dValueToCompare);
                                                } else {
                                                    tempPromotion
                                                            .setQUANTITY(rowPOffer
                                                                    .getQUANTITY());
                                                    tempPromotion
                                                            .setOFFER_VALUE(rowPOffer
                                                                    .getOFFER_VALUE());
                                                }
                                                tempPromotion
                                                        .setDISCOUNT(rowPOffer
                                                                .getDISCOUNT());
                                                tempPromotion
                                                        .setFreeSKUID(rowPOffer
                                                                .getSKU_ID());
                                                tempPromotion
                                                        .setCLAIMABLE(rowProm
                                                                .getCLAIMABLE());
                                                tempPromotion
                                                        .setIS_AND(rowBMaster
                                                                .getIS_AND());
                                                tempPromotion
                                                        .setSKU_ID(rowBDetail
                                                                .getSKU_ID());
                                                tempPromotion
                                                        .setOFFER_VALUE_TYPE(rowPOffer
                                                                .getOFFER_VALUE_TYPE());
                                                tempPromotion
                                                        .setDISCOUNT_TYPE(rowPOffer
                                                                .getDISCOUNT_TYPE());
                                                tempPromotion
                                                        .setGroup_ID(rowBDetail
                                                                .getSKU_GROUP_ID());
                                                mygroup.add(rowBDetail
                                                        .getSKU_GROUP_ID());
                                                //Add Applicable Promotion Detail to myPromotions List
                                                myPromotions.add(tempPromotion);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            // Implementing Promotion to each Item of Order
            //myPormotions List contain detail of all applicable promotions
            //Iterating through myPromotions list which contain detail of all applicable promotions
            for (int p = 0; p < myPromotions.size(); p++) {
                dtPromotionOffer myPromotions2 = myPromotions.get(p);
                if (myPromotions2.getCLAIMABLE() == 1)// if Promotion is Claimable Type
                {
                    // If promotion is On Single SKU
                    if (myPromotions2.getSKU_ID() > 0) {
                        for (int i = 0; i < myShoping.size(); i++) {
                            //Iterating through Order Items
                            OrderItem tempObj = myShoping.get(i);
                            if (tempObj.sKUID == myPromotions2
                                    .getSKU_ID()) {
                                if (myPromotions2.getIS_AND() == 1) {
                                    if (myPromotions2.getOFFER_VALUE() > 0) {
                                        tempObj.extraDiscount = tempObj
                                                .extraDiscount
                                                + myPromotions2
                                                .getOFFER_VALUE();
                                        tempObj.claimExtraAmount = tempObj
                                                .claimExtraAmount
                                                + myPromotions2
                                                .getOFFER_VALUE();
                                    }
                                    if (myPromotions2.getDISCOUNT() > 0) {
                                        tempObj.extraDiscount = tempObj
                                                .extraDiscount
                                                + (myPromotions2.getDISCOUNT() / 100)
                                                * tempObj.amount;
                                        tempObj.claimExtraAmount = tempObj
                                                .claimExtraAmount
                                                + (myPromotions2.getDISCOUNT() / 100)
                                                * tempObj.amount;
                                    }
                                } else {
                                    if (myPromotions2.getOFFER_VALUE() > 0) {
                                        tempObj.standardDiscount = tempObj
                                                .standardDiscount
                                                + myPromotions2
                                                .getOFFER_VALUE();
                                        tempObj.claimExtraAmount = tempObj
                                                .claimExtraAmount
                                                + myPromotions2
                                                .getOFFER_VALUE();
                                        tempObj.sedAmountByValue = tempObj
                                                .standardDiscount;
                                        // Discount Segregation
                                        try {
                                            if (myPromotions2
                                                    .getOFFER_VALUE_TYPE() > 0)// Trade
                                            // Offer
                                            // Type
                                            {
                                                tempObj.sedAmountByValueTo = tempObj
                                                        .sedAmountByValueTo
                                                        + myPromotions2
                                                        .getOFFER_VALUE();
                                                tempObj.standardDiscountByValueTo = tempObj
                                                        .standardDiscountByValueTo
                                                        + myPromotions2
                                                        .getOFFER_VALUE();
                                            } else// Additional Discount Type
                                            {
                                                tempObj.sedAmountByValueAD = tempObj
                                                        .sedAmountByValueAD
                                                        + myPromotions2
                                                        .getOFFER_VALUE();
                                                tempObj.standardDiscountByValueAd = tempObj
                                                        .standardDiscountByValueAd
                                                        + myPromotions2
                                                        .getOFFER_VALUE();
                                            }
                                        } catch (Exception e) {
                                            tempObj.sedAmountByValueTo = tempObj
                                                    .sedAmountByValueTo
                                                    + myPromotions2
                                                    .getOFFER_VALUE();
                                            tempObj.standardDiscountByValueTo = tempObj
                                                    .standardDiscountByValueTo
                                                    + myPromotions2
                                                    .getOFFER_VALUE();
                                        }
                                    }
                                    if (myPromotions2.getDISCOUNT() > 0) {
                                        tempObj.standardDiscountPerValue = tempObj
                                                .standardDiscountPerValue
                                                + (myPromotions2.getDISCOUNT() / 100));
                                        tempObj.setCLAIM_PER(tempObj
                                                .getCLAIM_PER()
                                                + (myPromotions2.getDISCOUNT() / 100));
                                        tempObj.sedAmountPerValue = tempObj
                                                .sedAmountPerValue
                                                + (myPromotions2.getDISCOUNT() / 100);
                                        // Discount Segregation
                                        try {
                                            if (myPromotions2
                                                    .getDISCOUNT_TYPE() == 0)// Trade
                                            // Offer
                                            // Type
                                            {
                                                tempObj.sedAmountPerValueTo = (tempObj
                                                        .sedAmountPerValueTo
                                                        + (myPromotions2
                                                        .getDISCOUNT() / 100));
                                                tempObj.standardDiscountPerValueTo = (tempObj
                                                        .standardDiscountPerValueTo
                                                        + (myPromotions2
                                                        .getDISCOUNT() / 100));
                                            } else// Additional Discount Type
                                            {
                                                tempObj.sedAmountPerValueAd = (tempObj
                                                        .sedAmountPerValueAd
                                                        + (myPromotions2
                                                        .getDISCOUNT() / 100));
                                                tempObj.standardDiscountPerValueAd = (tempObj
                                                        .standardDiscountPerValueAd
                                                        + (myPromotions2
                                                        .getDISCOUNT() / 100));
                                            }
                                        } catch (Exception e) {
                                            tempObj.sedAmountPerValueTo = (tempObj
                                                    .sedAmountPerValueTo
                                                    + (myPromotions2
                                                    .getDISCOUNT() / 100));
                                            tempObj.standardDiscountPerValueTo = (tempObj
                                                    .standardDiscountPerValueTo
                                                    + (myPromotions2
                                                    .getDISCOUNT() / 100));
                                        }
                                    }
                                }
                                if (myPromotions2.getFreeSKUID() > 0) { // if Promotion Offer is of Free SKU
                                    List<SKU> dtsku = dbhelper
                                            .getSKU(myPromotions2
                                                    .getFreeSKUID());
                                    if (dtsku.size() > 0) {
                                        SKU rowSku = dtsku.get(0);
                                        mGSTPrice = rowSku.getTRADE_PRICE();
                                        tempSKU = new dtFreeSKUDetail();
                                        int Row_Id = FreeSKUExist(dtFree,
                                                myPromotions2.getFreeSKUID());
                                        if (Row_Id < 0)//If this SKU not exist already in Free SKU list
                                        {
                                            tempSKU.setSKU_ID(rowSku
                                                    .getSKU_ID());
                                            tempSKU.setMaster_SKU_ID(rowSku
                                                    .getSKU_ID());
                                            tempSKU.setSKU_Code(rowSku
                                                    .getSKU_CODE());
                                            tempSKU.setSKU_Name(rowSku
                                                    .getSKU_NAME());
                                            tempSKU.setUNIT_PRICE(rowSku
                                                    .getTRADE_PRICE());
                                            tempSKU.setQUANTITY(myPromotions2
                                                    .getQUANTITY());
                                            tempSKU.setGST_RATE(rowSku
                                                    .getGST_RATE());
                                            tempSKU.setAMOUNT(rowSku
                                                    .getTRADE_PRICE()
                                                    * tempSKU.getQUANTITY());
                                            tempSKU.setGST_AMOUNT(0);
                                            tempSKU.setTST_AMOUNT(0);
                                            tempSKU.setWEIGHT(rowSku.getWEIGHT());
                                            tempSKU.setUOM_DESC(rowSku.getUOM_DESC());
                                            if (myPromotions2
                                                    .getSKUOfferTypeID() == 0)// Trade
                                            // offer
                                            {
                                                tempSKU.setQuantity_TO(myPromotions2
                                                        .getQUANTITY());
                                            } else // Additional
                                            {
                                                tempSKU.setQuantity_AD(myPromotions2
                                                        .getQUANTITY());
                                            }
                                            if (rowSku.getGST_ON().contains("T")) {
                                                tempSKU.setGST_AMOUNT((rowSku
                                                        .getGST_RATE() / 100)
                                                        * rowSku.getTRADE_PRICE()
                                                        * myPromotions2
                                                        .getQUANTITY());
                                            } else if (rowSku.getGST_ON().contains("R")) {
                                                tempSKU.setTST_AMOUNT(rowSku
                                                        .getGST_RATE()
                                                        * tempSKU.getQUANTITY());
                                            }
                                            if (DistributorTypeID == 6
                                                    || DistributorTypeID == 9)// If
                                            // Location
                                            // Type
                                            // is
                                            // 6=Distributor
                                            // or
                                            // 9=Regional
                                            // Distributor
                                            {
                                                if (IsDistributorRegister == 1)// If
                                                // Location
                                                // is
                                                // Register
                                                {
                                                    if (rowSku.getGST_ON().contains("T")) {
                                                        tempSKU.setExtra_tax(tempSKU
                                                                .getAMOUNT()
                                                                * rowSku.getEXTR_Tax()
                                                                / 100);
                                                    }
                                                }
                                            }
                                            tempSKU.setPROMOTION_ID(myPromotions2
                                                    .getPROMOTION_ID());
                                            tempSKU.setBASKET_ID(myPromotions2
                                                    .getBASKET_ID());
                                            tempSKU.setBASKET_DETAIL_ID(myPromotions2
                                                    .getBASKET_DETAIL_ID());
                                            tempSKU.setPROMOTION_OFFER_ID(myPromotions2
                                                    .getPROMOTION_OFFER_ID());
                                            ObjFreeGSTAmount += tempSKU
                                                    .getGST_AMOUNT();
                                            ObjFreeTST += tempSKU
                                                    .getTST_AMOUNT();
                                            ObjFreeExtra_Tax += tempSKU
                                                    .getExtra_tax();

                                            dtFree.add(tempSKU);
                                        } else//If SKU already exist in Free SKU list then update Free SKU List
                                        {
                                            dtFreeSKUDetail rowUpdateSku = dtFree
                                                    .get(Row_Id);
                                            ObjFreeGSTAmount = ObjFreeGSTAmount
                                                    - rowUpdateSku
                                                    .getGST_AMOUNT();
                                            ObjFreeTST = ObjFreeTST
                                                    - rowUpdateSku
                                                    .getTST_AMOUNT();
                                            ObjFreeExtra_Tax = ObjFreeExtra_Tax
                                                    - rowUpdateSku
                                                    .getExtra_tax();

                                            rowUpdateSku
                                                    .setQUANTITY(rowUpdateSku
                                                            .getQUANTITY()
                                                            + myPromotions2
                                                            .getQUANTITY());
                                            rowUpdateSku.setAMOUNT(rowSku
                                                    .getTRADE_PRICE()
                                                    * rowUpdateSku
                                                    .getQUANTITY());
                                            rowUpdateSku.setGST_AMOUNT(0);
                                            rowUpdateSku.setTST_AMOUNT(0);
                                            if (myPromotions2
                                                    .getSKUOfferTypeID() == 0)// Trade
                                            // offer
                                            {
                                                rowUpdateSku
                                                        .setQuantity_TO(rowUpdateSku
                                                                .getQuantity_TO()
                                                                + myPromotions2
                                                                .getQUANTITY());
                                            } else // Additional
                                            {
                                                rowUpdateSku
                                                        .setQuantity_AD(rowUpdateSku
                                                                .getQuantity_AD()
                                                                + myPromotions2
                                                                .getQUANTITY());
                                            }

                                            if (rowSku.getGST_ON().contains("T")) {
                                                rowUpdateSku
                                                        .setGST_AMOUNT((rowSku
                                                                .getGST_RATE() / 100)
                                                                * rowSku.getTRADE_PRICE()
                                                                * myPromotions2
                                                                .getQUANTITY());
                                            } else if (rowSku.getGST_ON().contains("R")) {
                                                rowUpdateSku
                                                        .setTST_AMOUNT(rowSku
                                                                .getGST_RATE()
                                                                * rowUpdateSku
                                                                .getQUANTITY());
                                            }

                                            if (DistributorTypeID == 6
                                                    || DistributorTypeID == 9)// If
                                            // Location
                                            // Type
                                            // is
                                            // 6=Distributor
                                            // or
                                            // 9=Regional
                                            // Distributor
                                            {
                                                if (IsDistributorRegister == 1)// If
                                                // Location
                                                // is
                                                // Register
                                                {
                                                    if (rowSku.getGST_ON().contains("T")) {
                                                        rowUpdateSku
                                                                .setExtra_tax(rowUpdateSku
                                                                        .getAMOUNT()
                                                                        * rowSku.getEXTR_Tax()
                                                                        / 100);
                                                    }
                                                }
                                            }
                                            rowUpdateSku
                                                    .setPROMOTION_ID(myPromotions2
                                                            .getPROMOTION_ID());
                                            rowUpdateSku
                                                    .setBASKET_ID(myPromotions2
                                                            .getBASKET_ID());
                                            rowUpdateSku
                                                    .setBASKET_DETAIL_ID(myPromotions2
                                                            .getBASKET_DETAIL_ID());
                                            rowUpdateSku
                                                    .setPROMOTION_OFFER_ID(myPromotions2
                                                            .getPROMOTION_OFFER_ID());
                                            ObjFreeGSTAmount += rowUpdateSku
                                                    .getGST_AMOUNT();
                                            ObjFreeTST += rowUpdateSku
                                                    .getTST_AMOUNT();
                                            ObjFreeExtra_Tax += rowUpdateSku
                                                    .getExtra_tax();
                                        }
                                        LoadFreeSKU(dtFree);
                                    }
                                }
                            }
                        }

                    } else {
                        // If promotion is On SKU Group
                        if (myPromotions2.getFreeSKUID() > 0) { //If Promotion Offer is on Free SKU
                            List<SKU> dtsku = dbhelper.getSKU(myPromotions2
                                    .getFreeSKUID());
                            if (dtsku.size() > 0) {
                                SKU rowSku = dtsku.get(0);
                                mGSTPrice = rowSku.getTRADE_PRICE();
                                tempSKU = new dtFreeSKUDetail();
                                int Row_Id = FreeSKUExist(dtFree,
                                        myPromotions2.getFreeSKUID());
                                if (Row_Id < 0)// Add New SKU to Free SKU List
                                {
                                    tempSKU.setSKU_ID(rowSku.getSKU_ID());
                                    tempSKU.setMaster_SKU_ID(rowSku.getSKU_ID());
                                    tempSKU.setSKU_Code(rowSku.getSKU_CODE());
                                    tempSKU.setSKU_Name(rowSku.getSKU_NAME());
                                    tempSKU.setUNIT_PRICE(rowSku
                                            .getTRADE_PRICE());
                                    tempSKU.setQUANTITY(myPromotions2
                                            .getQUANTITY());
                                    tempSKU.setGST_RATE(rowSku.getGST_RATE());
                                    tempSKU.setAMOUNT(rowSku.getTRADE_PRICE()
                                            * tempSKU.getQUANTITY());
                                    tempSKU.setGST_AMOUNT(0);
                                    tempSKU.setTST_AMOUNT(0);
                                    tempSKU.setWEIGHT(rowSku.getWEIGHT());
                                    tempSKU.setUOM_DESC(rowSku.getUOM_DESC());
                                    if (myPromotions2.getSKUOfferTypeID() == 0)// Trade
                                    // offer
                                    {
                                        tempSKU.setQuantity_TO(myPromotions2
                                                .getQUANTITY());
                                    } else // Additional
                                    {
                                        tempSKU.setQuantity_AD(myPromotions2
                                                .getQUANTITY());
                                    }
                                    if (rowSku.getGST_ON().contains("T")) {
                                        tempSKU.setGST_AMOUNT((rowSku
                                                .getGST_RATE() / 100)
                                                * rowSku.getTRADE_PRICE()
                                                * myPromotions2.getQUANTITY());
                                    } else if (rowSku.getGST_ON().contains("R")) {
                                        tempSKU.setTST_AMOUNT(rowSku
                                                .getGST_RATE()
                                                * tempSKU.getQUANTITY());
                                    }
                                    if (DistributorTypeID == 6
                                            || DistributorTypeID == 9)// If
                                    // Location
                                    // Type
                                    // is
                                    // 6=Distributor
                                    // or
                                    // 9=Regional
                                    // Distributor
                                    {
                                        if (IsDistributorRegister == 1)// If
                                        // Location
                                        // is
                                        // Register
                                        {
                                            if (rowSku.getGST_ON().contains("T")) {
                                                tempSKU.setExtra_tax(tempSKU
                                                        .getAMOUNT()
                                                        * rowSku.getEXTR_Tax()
                                                        / 100);
                                            }
                                        }
                                    }
                                    tempSKU.setPROMOTION_ID(myPromotions2
                                            .getPROMOTION_ID());
                                    tempSKU.setBASKET_ID(myPromotions2
                                            .getBASKET_ID());
                                    tempSKU.setBASKET_DETAIL_ID(myPromotions2
                                            .getBASKET_DETAIL_ID());
                                    tempSKU.setPROMOTION_OFFER_ID(myPromotions2
                                            .getPROMOTION_OFFER_ID());
                                    ObjFreeGSTAmount += tempSKU.getGST_AMOUNT();
                                    ObjFreeTST += tempSKU.getTST_AMOUNT();
                                    ObjFreeExtra_Tax += tempSKU.getExtra_tax();

                                    dtFree.add(tempSKU);
                                } else// Update existing SKU in Free SKU list
                                {
                                    dtFreeSKUDetail rowUpdateSku = dtFree
                                            .get(Row_Id);
                                    ObjFreeGSTAmount = ObjFreeGSTAmount
                                            - rowUpdateSku.getGST_AMOUNT();
                                    ObjFreeTST = ObjFreeTST
                                            - rowUpdateSku.getTST_AMOUNT();
                                    ObjFreeExtra_Tax = ObjFreeExtra_Tax
                                            - rowUpdateSku.getExtra_tax();

                                    rowUpdateSku.setQUANTITY(rowUpdateSku
                                            .getQUANTITY()
                                            + myPromotions2.getQUANTITY());
                                    rowUpdateSku.setAMOUNT(rowSku
                                            .getTRADE_PRICE()
                                            * rowUpdateSku.getQUANTITY());
                                    rowUpdateSku.setGST_AMOUNT(0);
                                    rowUpdateSku.setTST_AMOUNT(0);
                                    if (myPromotions2.getSKUOfferTypeID() == 0)// Trade
                                    // offer
                                    {
                                        rowUpdateSku
                                                .setQuantity_TO(rowUpdateSku
                                                        .getQuantity_TO()
                                                        + myPromotions2
                                                        .getQUANTITY());
                                    } else // Additional
                                    {
                                        rowUpdateSku
                                                .setQuantity_AD(rowUpdateSku
                                                        .getQuantity_AD()
                                                        + myPromotions2
                                                        .getQUANTITY());
                                    }

                                    if (rowSku.getGST_ON().contains("T")) {
                                        rowUpdateSku.setGST_AMOUNT((rowSku
                                                .getGST_RATE() / 100)
                                                * rowSku.getTRADE_PRICE()
                                                * myPromotions2.getQUANTITY());
                                    } else if (rowSku.getGST_ON().contains("R")) {
                                        rowUpdateSku.setTST_AMOUNT(rowSku
                                                .getGST_RATE()
                                                * rowUpdateSku.getQUANTITY());
                                    }

                                    if (DistributorTypeID == 6
                                            || DistributorTypeID == 9)// If
                                    // Location
                                    // Type
                                    // is
                                    // 6=Distributor
                                    // or
                                    // 9=Regional
                                    // Distributor
                                    {
                                        if (IsDistributorRegister == 1)// If
                                        // Location
                                        // is
                                        // Register
                                        {
                                            if (rowSku.getGST_ON().contains("T")) {
                                                rowUpdateSku
                                                        .setExtra_tax(rowUpdateSku
                                                                .getAMOUNT()
                                                                * rowSku.getEXTR_Tax()
                                                                / 100);
                                            }
                                        }
                                    }
                                    rowUpdateSku.setPROMOTION_ID(myPromotions2
                                            .getPROMOTION_ID());
                                    rowUpdateSku.setBASKET_ID(myPromotions2
                                            .getBASKET_ID());
                                    rowUpdateSku
                                            .setBASKET_DETAIL_ID(myPromotions2
                                                    .getBASKET_DETAIL_ID());
                                    rowUpdateSku
                                            .setPROMOTION_OFFER_ID(myPromotions2
                                                    .getPROMOTION_OFFER_ID());
                                    ObjFreeGSTAmount += rowUpdateSku
                                            .getGST_AMOUNT();
                                    ObjFreeTST += rowUpdateSku.getTST_AMOUNT();
                                    ObjFreeExtra_Tax += rowUpdateSku
                                            .getExtra_tax();
                                }
                                LoadFreeSKU(dtFree);
                            }
                        }
                        for (int i = 0; i < myShoping.size(); i++) {
                            OrderItem tempObj = myShoping.get(i);
                            dbhelper = new DBHelper(OrderSummery.this);
                            List<dtSKUGroupDetail> groupdetail = dbhelper
                                    .getSKUGroupDetail(tempObj.sKUID,
                                            myPromotions2.getGroup_ID());
                            if (groupdetail.size() > 0) {
                                if (myPromotions2.getIS_AND() == 1) {
                                    if (myPromotions2.getOFFER_VALUE() > 0) {
                                        double value = tempObj
                                                .quantity
                                                * myPromotions2
                                                .getOFFER_VALUE();
                                        tempObj.extraDiscount = (tempObj
                                                .extraDiscount + value);
                                        tempObj.claimExtraAmount = (tempObj
                                                .claimExtraAmount
                                                + value);
                                    }
                                    if (myPromotions2.getDISCOUNT() > 0) {
                                        tempObj.extraDiscount = (tempObj
                                                .extraDiscount
                                                + (myPromotions2.getDISCOUNT() / 100)
                                                * tempObj.amount);
                                        tempObj.claimExtraAmount = (tempObj
                                                .claimExtraAmount
                                                + (myPromotions2.getDISCOUNT() / 100)
                                                * tempObj.amount);
                                    }
                                } else {
                                    if (myPromotions2.getOFFER_VALUE() > 0) {
                                        double value = tempObj
                                                .quantity
                                                * myPromotions2
                                                .getOFFER_VALUE();
                                        tempObj.standardDiscount = (tempObj
                                                .standardDiscount + value);
                                        tempObj.claimExtraAmount = (tempObj
                                                .claimExtraAmount
                                                + value);
                                        tempObj.sedAmountByValue = (tempObj
                                                .standardDiscount);

                                        // Discount Segregation
                                        try {
                                            if (myPromotions2
                                                    .getOFFER_VALUE_TYPE() == 1) {
                                                tempObj.sedAmountByValueTo = tempObj
                                                        .sedAmountByValueTo
                                                        + value;
                                                tempObj.standardDiscountByValueTo = tempObj
                                                        .standardDiscountByValueTo
                                                        + value;
                                            } else {
                                                tempObj.sedAmountByValueAD = (tempObj
                                                        .sedAmountByValueAD
                                                        + value);
                                                tempObj.standardDiscountByValueAd = tempObj
                                                        .standardDiscountByValueAd
                                                        + value;
                                            }
                                        } catch (Exception e) {
                                            tempObj.sedAmountByValueTo = tempObj
                                                    .sedAmountByValueTo
                                                    + value;
                                            tempObj.standardDiscountByValueTo = tempObj
                                                    .standardDiscountByValueTo
                                                    + value;
                                        }
                                    }
                                    if (myPromotions2.getDISCOUNT() > 0) {
                                        tempObj.standardDiscountPerValue = tempObj
                                                .standardDiscountPerValue
                                                + (myPromotions2.getDISCOUNT() / 100);
                                        tempObj.setCLAIM_PER(tempObj
                                                .getCLAIM_PER()
                                                + (myPromotions2.getDISCOUNT() / 100));
                                        tempObj.sedAmountPerValue = tempObj
                                                .sedAmountPerValue
                                                + (myPromotions2.getDISCOUNT() / 100);
                                        // Discount Segregation
                                        try {
                                            if (myPromotions2
                                                    .getDISCOUNT_TYPE() == 0) {
                                                tempObj.sedAmountPerValueTo = (tempObj
                                                        .sedAmountPerValueTo
                                                        + (myPromotions2
                                                        .getDISCOUNT() / 100));
                                                tempObj.standardDiscountPerValueTo = (tempObj
                                                        .standardDiscountPerValueTo
                                                        + (myPromotions2
                                                        .getDISCOUNT() / 100));
                                            } else {
                                                tempObj.sedAmountPerValueAd = (tempObj
                                                        .sedAmountPerValueAd
                                                        + (myPromotions2
                                                        .getDISCOUNT() / 100));
                                                tempObj.standardDiscountPerValueAd = (tempObj
                                                        .standardDiscountPerValueAd
                                                        + (myPromotions2
                                                        .getDISCOUNT() / 100));
                                            }
                                        } catch (Exception e) {
                                            tempObj.sedAmountPerValueTo = (tempObj
                                                    .sedAmountPerValueTo
                                                    + (myPromotions2
                                                    .getDISCOUNT() / 100));
                                            tempObj.standardDiscountPerValueTo = (tempObj
                                                    .standardDiscountPerValueTo
                                                    + (myPromotions2
                                                    .getDISCOUNT() / 100));
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else// If promotion type is UnClaimable
                {
                    if (myPromotions2.getSKU_ID() > 0) {
                        // Slab On Single SKU
                        for (int i = 0; i < myShoping.size(); i++) {
                            OrderItem tempObj = myShoping.get(i);
                            if (tempObj.sKUID == myPromotions2
                                    .getSKU_ID()) {
                                if (myPromotions2.getIS_AND() == 1) {
                                    if (myPromotions2.getOFFER_VALUE() > 0) {
                                        tempObj.extraDiscount = (tempObj
                                                .extraDiscount
                                                + myPromotions2
                                                .getOFFER_VALUE());
                                    }
                                    if (myPromotions2.getDISCOUNT() > 0) {
                                        tempObj.extraDiscount = (tempObj
                                                .extraDiscount
                                                + (myPromotions2.getDISCOUNT() / 100)
                                                * tempObj.amount);
                                    }
                                } else {
                                    if (myPromotions2.getOFFER_VALUE() > 0) {
                                        tempObj.standardDiscount = (tempObj
                                                .standardDiscount
                                                + myPromotions2
                                                .getOFFER_VALUE());
                                        // Discount Segregation
                                        try {
                                            if (myPromotions2
                                                    .getOFFER_VALUE_TYPE() == 0) {
                                                tempObj.standardDiscountByValueTo = tempObj
                                                        .standardDiscountByValueTo
                                                        + myPromotions2
                                                        .getOFFER_VALUE();
                                            } else {
                                                tempObj.standardDiscountByValueAd = tempObj
                                                        .standardDiscountByValueAd
                                                        + myPromotions2
                                                        .getOFFER_VALUE();
                                            }
                                        } catch (Exception e) {
                                            tempObj.standardDiscountByValueTo = tempObj
                                                    .standardDiscountByValueTo
                                                    + myPromotions2
                                                    .getOFFER_VALUE();
                                        }
                                    }
                                    if (myPromotions2.getDISCOUNT() > 0) {
                                        tempObj.standardDiscountPerValue = tempObj
                                                .standardDiscountPerValue
                                                + myPromotions2.getDISCOUNT()
                                                / 100;
                                        // Discount Segregation
                                        try {
                                            if (myPromotions2
                                                    .getDISCOUNT_TYPE() == 0) {
                                                tempObj.standardDiscountPerValueTo = (tempObj
                                                        .standardDiscountPerValueTo
                                                        + myPromotions2
                                                        .getDISCOUNT()
                                                        / 100);
                                            } else {
                                                tempObj.standardDiscountPerValueAd = (tempObj
                                                        .standardDiscountPerValueAd
                                                        + myPromotions2
                                                        .getDISCOUNT()
                                                        / 100);
                                            }
                                        } catch (Exception e) {
                                            tempObj.standardDiscountPerValueTo = (tempObj
                                                    .standardDiscountPerValueTo
                                                    + myPromotions2
                                                    .getDISCOUNT()
                                                    / 100);
                                        }
                                    }
                                }
                                if (myPromotions2.getFreeSKUID() > 0) { // Free
                                    // SKU
                                    List<SKU> dtsku = dbhelper
                                            .getSKU(myPromotions2
                                                    .getFreeSKUID());
                                    if (dtsku.size() > 0) {
                                        SKU rowSku = dtsku.get(0);
                                        mGSTPrice = rowSku.getTRADE_PRICE();
                                        tempSKU = new dtFreeSKUDetail();
                                        int Row_Id = FreeSKUExist(dtFree,
                                                myPromotions2.getFreeSKUID());
                                        if (Row_Id < 0)// Add
                                        {
                                            tempSKU.setSKU_ID(rowSku
                                                    .getSKU_ID());
                                            tempSKU.setMaster_SKU_ID(rowSku
                                                    .getSKU_ID());
                                            tempSKU.setSKU_Code(rowSku
                                                    .getSKU_CODE());
                                            tempSKU.setSKU_Name(rowSku
                                                    .getSKU_NAME());
                                            tempSKU.setUNIT_PRICE(rowSku
                                                    .getTRADE_PRICE());
                                            tempSKU.setQUANTITY(myPromotions2
                                                    .getQUANTITY());
                                            tempSKU.setGST_RATE(rowSku
                                                    .getGST_RATE());
                                            tempSKU.setAMOUNT(rowSku
                                                    .getTRADE_PRICE()
                                                    * tempSKU.getQUANTITY());
                                            tempSKU.setGST_AMOUNT(0);
                                            tempSKU.setTST_AMOUNT(0);
                                            tempSKU.setWEIGHT(rowSku.getWEIGHT());
                                            tempSKU.setUOM_DESC(rowSku.getUOM_DESC());
                                            if (myPromotions2
                                                    .getSKUOfferTypeID() == 0)// Trade
                                            // offer
                                            {
                                                tempSKU.setQuantity_TO(myPromotions2
                                                        .getQUANTITY());
                                            } else // Additional
                                            {
                                                tempSKU.setQuantity_AD(myPromotions2
                                                        .getQUANTITY());
                                            }
                                            if (rowSku.getGST_ON().contains("T")) {
                                                tempSKU.setGST_AMOUNT((rowSku
                                                        .getGST_RATE() / 100)
                                                        * rowSku.getTRADE_PRICE()
                                                        * myPromotions2
                                                        .getQUANTITY());
                                            } else if (rowSku.getGST_ON().contains("R")) {
                                                tempSKU.setTST_AMOUNT(rowSku
                                                        .getGST_RATE()
                                                        * tempSKU.getQUANTITY());
                                            }
                                            if (DistributorTypeID == 6
                                                    || DistributorTypeID == 9)// If
                                            // Location
                                            // Type
                                            // is
                                            // 6=Distributor
                                            // or
                                            // 9=Regional
                                            // Distributor
                                            {
                                                if (IsDistributorRegister == 1)// If
                                                // Location
                                                // is
                                                // Register
                                                {
                                                    if (rowSku.getGST_ON().contains("T")) {
                                                        tempSKU.setExtra_tax(tempSKU
                                                                .getAMOUNT()
                                                                * rowSku.getEXTR_Tax()
                                                                / 100);
                                                    }
                                                }
                                            }
                                            tempSKU.setPROMOTION_ID(myPromotions2
                                                    .getPROMOTION_ID());
                                            tempSKU.setBASKET_ID(myPromotions2
                                                    .getBASKET_ID());
                                            tempSKU.setBASKET_DETAIL_ID(myPromotions2
                                                    .getBASKET_DETAIL_ID());
                                            tempSKU.setPROMOTION_OFFER_ID(myPromotions2
                                                    .getPROMOTION_OFFER_ID());
                                            ObjFreeGSTAmount += tempSKU
                                                    .getGST_AMOUNT();
                                            ObjFreeTST += tempSKU
                                                    .getTST_AMOUNT();
                                            ObjFreeExtra_Tax += tempSKU
                                                    .getExtra_tax();

                                            dtFree.add(tempSKU);
                                        } else// Update
                                        {
                                            dtFreeSKUDetail rowUpdateSku = dtFree
                                                    .get(Row_Id);
                                            ObjFreeGSTAmount = ObjFreeGSTAmount
                                                    - rowUpdateSku
                                                    .getGST_AMOUNT();
                                            ObjFreeTST = ObjFreeTST
                                                    - rowUpdateSku
                                                    .getTST_AMOUNT();
                                            ObjFreeExtra_Tax = ObjFreeExtra_Tax
                                                    - rowUpdateSku
                                                    .getExtra_tax();

                                            rowUpdateSku
                                                    .setQUANTITY(rowUpdateSku
                                                            .getQUANTITY()
                                                            + myPromotions2
                                                            .getQUANTITY());
                                            rowUpdateSku.setAMOUNT(rowSku
                                                    .getTRADE_PRICE()
                                                    * rowUpdateSku
                                                    .getQUANTITY());
                                            rowUpdateSku.setGST_AMOUNT(0);
                                            rowUpdateSku.setTST_AMOUNT(0);
                                            if (myPromotions2
                                                    .getSKUOfferTypeID() == 0)// Trade
                                            // offer
                                            {
                                                rowUpdateSku
                                                        .setQuantity_TO(rowUpdateSku
                                                                .getQuantity_TO()
                                                                + myPromotions2
                                                                .getQUANTITY());
                                            } else // Additional
                                            {
                                                rowUpdateSku
                                                        .setQuantity_AD(rowUpdateSku
                                                                .getQuantity_AD()
                                                                + myPromotions2
                                                                .getQUANTITY());
                                            }

                                            if (rowSku.getGST_ON().contains("T")) {
                                                rowUpdateSku
                                                        .setGST_AMOUNT((rowSku
                                                                .getGST_RATE() / 100)
                                                                * rowSku.getTRADE_PRICE()
                                                                * myPromotions2
                                                                .getQUANTITY());
                                            } else if (rowSku.getGST_ON().contains("R")) {
                                                rowUpdateSku
                                                        .setTST_AMOUNT(rowSku
                                                                .getGST_RATE()
                                                                * rowUpdateSku
                                                                .getQUANTITY());
                                            }

                                            if (DistributorTypeID == 6
                                                    || DistributorTypeID == 9)// If
                                            // Location
                                            // Type
                                            // is
                                            // 6=Distributor
                                            // or
                                            // 9=Regional
                                            // Distributor
                                            {
                                                if (IsDistributorRegister == 1)// If
                                                // Location
                                                // is
                                                // Register
                                                {
                                                    if (rowSku.getGST_ON().contains("T")) {
                                                        rowUpdateSku
                                                                .setExtra_tax(rowUpdateSku
                                                                        .getAMOUNT()
                                                                        * rowSku.getEXTR_Tax()
                                                                        / 100);
                                                    }
                                                }
                                            }
                                            rowUpdateSku
                                                    .setPROMOTION_ID(myPromotions2
                                                            .getPROMOTION_ID());
                                            rowUpdateSku
                                                    .setBASKET_ID(myPromotions2
                                                            .getBASKET_ID());
                                            rowUpdateSku
                                                    .setBASKET_DETAIL_ID(myPromotions2
                                                            .getBASKET_DETAIL_ID());
                                            rowUpdateSku
                                                    .setPROMOTION_OFFER_ID(myPromotions2
                                                            .getPROMOTION_OFFER_ID());
                                            ObjFreeGSTAmount += rowUpdateSku
                                                    .getGST_AMOUNT();
                                            ObjFreeTST += rowUpdateSku
                                                    .getTST_AMOUNT();
                                            ObjFreeExtra_Tax += rowUpdateSku
                                                    .getExtra_tax();
                                        }
                                        LoadFreeSKU(dtFree);
                                    }
                                }
                            }
                        }
                    } else {
                        // Slab on Group
                        if (myPromotions2.getFreeSKUID() > 0) { // Free SKU
                            List<SKU> dtsku = dbhelper.getSKU(myPromotions2
                                    .getFreeSKUID());
                            if (dtsku.size() > 0) {
                                SKU rowSku = dtsku.get(0);
                                mGSTPrice = rowSku.getTRADE_PRICE();
                                tempSKU = new dtFreeSKUDetail();
                                int Row_Id = FreeSKUExist(dtFree,
                                        myPromotions2.getFreeSKUID());
                                if (Row_Id < 0)// Add
                                {
                                    tempSKU.setSKU_ID(rowSku.getSKU_ID());
                                    tempSKU.setMaster_SKU_ID(rowSku.getSKU_ID());
                                    tempSKU.setSKU_Code(rowSku.getSKU_CODE());
                                    tempSKU.setSKU_Name(rowSku.getSKU_NAME());
                                    tempSKU.setUNIT_PRICE(rowSku
                                            .getTRADE_PRICE());
                                    tempSKU.setQUANTITY(myPromotions2
                                            .getQUANTITY());
                                    tempSKU.setGST_RATE(rowSku.getGST_RATE());
                                    tempSKU.setAMOUNT(rowSku.getTRADE_PRICE()
                                            * tempSKU.getQUANTITY());
                                    tempSKU.setGST_AMOUNT(0);
                                    tempSKU.setTST_AMOUNT(0);
                                    tempSKU.setWEIGHT(rowSku.getWEIGHT());
                                    tempSKU.setUOM_DESC(rowSku.getUOM_DESC());
                                    if (myPromotions2.getSKUOfferTypeID() == 0)// Trade
                                    // offer
                                    {
                                        tempSKU.setQuantity_TO(myPromotions2
                                                .getQUANTITY());
                                    } else // Additional
                                    {
                                        tempSKU.setQuantity_AD(myPromotions2
                                                .getQUANTITY());
                                    }
                                    if (rowSku.getGST_ON().contains("T")) {
                                        tempSKU.setGST_AMOUNT((rowSku
                                                .getGST_RATE() / 100)
                                                * rowSku.getTRADE_PRICE()
                                                * myPromotions2.getQUANTITY());
                                    } else if (rowSku.getGST_ON().contains("R")) {
                                        tempSKU.setTST_AMOUNT(rowSku
                                                .getGST_RATE()
                                                * tempSKU.getQUANTITY());
                                    }
                                    if (DistributorTypeID == 6
                                            || DistributorTypeID == 9)// If
                                    // Location
                                    // Type
                                    // is
                                    // 6=Distributor
                                    // or
                                    // 9=Regional
                                    // Distributor
                                    {
                                        if (IsDistributorRegister == 1)// If
                                        // Location
                                        // is
                                        // Register
                                        {
                                            if (rowSku.getGST_ON().contains("T")) {
                                                tempSKU.setExtra_tax(tempSKU
                                                        .getAMOUNT()
                                                        * rowSku.getEXTR_Tax()
                                                        / 100);
                                            }
                                        }
                                    }
                                    tempSKU.setPROMOTION_ID(myPromotions2
                                            .getPROMOTION_ID());
                                    tempSKU.setBASKET_ID(myPromotions2
                                            .getBASKET_ID());
                                    tempSKU.setBASKET_DETAIL_ID(myPromotions2
                                            .getBASKET_DETAIL_ID());
                                    tempSKU.setPROMOTION_OFFER_ID(myPromotions2
                                            .getPROMOTION_OFFER_ID());
                                    ObjFreeGSTAmount += tempSKU.getGST_AMOUNT();
                                    ObjFreeTST += tempSKU.getTST_AMOUNT();
                                    ObjFreeExtra_Tax += tempSKU.getExtra_tax();

                                    dtFree.add(tempSKU);
                                } else// Update
                                {
                                    dtFreeSKUDetail rowUpdateSku = dtFree
                                            .get(Row_Id);
                                    ObjFreeGSTAmount = ObjFreeGSTAmount
                                            - rowUpdateSku.getGST_AMOUNT();
                                    ObjFreeTST = ObjFreeTST
                                            - rowUpdateSku.getTST_AMOUNT();
                                    ObjFreeExtra_Tax = ObjFreeExtra_Tax
                                            - rowUpdateSku.getExtra_tax();

                                    rowUpdateSku.setQUANTITY(rowUpdateSku
                                            .getQUANTITY()
                                            + myPromotions2.getQUANTITY());
                                    rowUpdateSku.setAMOUNT(rowSku
                                            .getTRADE_PRICE()
                                            * rowUpdateSku.getQUANTITY());
                                    rowUpdateSku.setGST_AMOUNT(0);
                                    rowUpdateSku.setTST_AMOUNT(0);
                                    if (myPromotions2.getSKUOfferTypeID() == 0)// Trade
                                    // offer
                                    {
                                        rowUpdateSku
                                                .setQuantity_TO(rowUpdateSku
                                                        .getQuantity_TO()
                                                        + myPromotions2
                                                        .getQUANTITY());
                                    } else // Additional
                                    {
                                        rowUpdateSku
                                                .setQuantity_AD(rowUpdateSku
                                                        .getQuantity_AD()
                                                        + myPromotions2
                                                        .getQUANTITY());
                                    }

                                    if (rowSku.getGST_ON().contains("T")) {
                                        rowUpdateSku.setGST_AMOUNT((rowSku
                                                .getGST_RATE() / 100)
                                                * rowSku.getUNIT_PRICE()
                                                * myPromotions2.getQUANTITY());
                                    } else if (rowSku.getGST_ON().contains("R")) {
                                        rowUpdateSku.setTST_AMOUNT(rowSku
                                                .getGST_RATE()
                                                * rowUpdateSku.getQUANTITY());
                                    }

                                    if (DistributorTypeID == 6
                                            || DistributorTypeID == 9)// If
                                    // Location
                                    // Type
                                    // is
                                    // 6=Distributor
                                    // or
                                    // 9=Regional
                                    // Distributor
                                    {
                                        if (IsDistributorRegister == 1)// If
                                        // Location
                                        // is
                                        // Register
                                        {
                                            if (rowSku.getGST_ON().contains("T")) {
                                                rowUpdateSku
                                                        .setExtra_tax(rowUpdateSku
                                                                .getAMOUNT()
                                                                * rowSku.getEXTR_Tax()
                                                                / 100);
                                            }
                                        }
                                    }
                                    rowUpdateSku.setPROMOTION_ID(myPromotions2
                                            .getPROMOTION_ID());
                                    rowUpdateSku.setBASKET_ID(myPromotions2
                                            .getBASKET_ID());
                                    rowUpdateSku
                                            .setBASKET_DETAIL_ID(myPromotions2
                                                    .getBASKET_DETAIL_ID());
                                    rowUpdateSku
                                            .setPROMOTION_OFFER_ID(myPromotions2
                                                    .getPROMOTION_OFFER_ID());
                                    ObjFreeGSTAmount += rowUpdateSku
                                            .getGST_AMOUNT();
                                    ObjFreeTST += rowUpdateSku.getTST_AMOUNT();
                                    ObjFreeExtra_Tax += rowUpdateSku
                                            .getExtra_tax();
                                }
                                LoadFreeSKU(dtFree);
                            }
                        }
                        for (int i = 0; i < myShoping.size(); i++) {
                            OrderItem tempObj = myShoping.get(i);
                            dbhelper = new DBHelper(OrderSummery.this);
                            List<dtSKUGroupDetail> groupdetail = dbhelper
                                    .getSKUGroupDetail(tempObj.getSKU_ID(),
                                            myPromotions2.getGroup_ID());
                            if (groupdetail.size() > 0) {
                                if (myPromotions2.getIS_AND() == 1) {
                                    if (myPromotions2.getOFFER_VALUE() > 0) {
                                        double Value = tempObj
                                                .quantity
                                                + myPromotions2
                                                .getOFFER_VALUE();
                                        tempObj.extraDiscount = (tempObj
                                                .extraDiscount + Value);
                                    }
                                    if (myPromotions2.getDISCOUNT() > 0) {
                                        tempObj.extraDiscount = (tempObj
                                                .extraDiscount
                                                + (myPromotions2.getDISCOUNT() / 100)
                                                * (tempObj.amount - tempObj
                                                .extraDiscount));
                                    }
                                } else {
                                    if (myPromotions2.getOFFER_VALUE() > 0) {
                                        double Value = tempObj
                                                .quantity
                                                + myPromotions2
                                                .getOFFER_VALUE();
                                        tempObj.standardDiscount = (tempObj
                                                .standardDiscount + Value);
                                        // Discount Segregation
                                        try {
                                            if (myPromotions2
                                                    .getOFFER_VALUE_TYPE() == 0) {
                                                tempObj.standardDiscountByValueTo = tempObj
                                                        .standardDiscountByValueTo
                                                        + Value;
                                            } else {
                                                tempObj.standardDiscountByValueAd = tempObj
                                                        .standardDiscountByValueAd
                                                        + Value;
                                            }
                                        } catch (Exception e) {
                                            tempObj.standardDiscountByValueTo = tempObj
                                                    .standardDiscountByValueTo
                                                    + Value;
                                        }
                                    }
                                    if (myPromotions2.getDISCOUNT() > 0) {
                                        tempObj.standardDiscountPerValue = tempObj
                                                .standardDiscountPerValue
                                                + myPromotions2.getDISCOUNT()
                                                / 100;
                                        // Discount Segregation
                                        try {
                                            if (myPromotions2
                                                    .getDISCOUNT_TYPE() == 0) {
                                                tempObj.standardDiscountPerValueTo = (tempObj
                                                        .standardDiscountPerValueTo
                                                        + myPromotions2
                                                        .getDISCOUNT()
                                                        / 100);
                                            } else {
                                                tempObj.standardDiscountPerValueAd = (tempObj
                                                        .standardDiscountPerValueAd
                                                        + myPromotions2
                                                        .getDISCOUNT()
                                                        / 100);
                                            }
                                        } catch (Exception e) {
                                            tempObj.standardDiscountPerValueTo = (tempObj
                                                    .standardDiscountPerValueTo
                                                    + myPromotions2
                                                    .getDISCOUNT()
                                                    / 100);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            for (int i = 0; i < myShoping.size(); i++) {
                OrderItem tempObj = myShoping.get(i);
                if (tempObj.OutletID == Customer.CustomerID) {
                    ObjGrossSales += tempObj.amount;
                    tempObj.sedAmountPerValueAd = (tempObj
                            .sedAmountPerValueAd * tempObj.amount);
                    ObjTotalSED_BY_VALUE_AD = ObjTotalSED_BY_VALUE_AD
                            + tempObj.sedAmountByValueAD;
                    ObjTotalSED_PER_VALUE_AD = ObjTotalSED_PER_VALUE_AD
                            + tempObj.sedAmountPerValueAd;
                    tempObj.gSTAmount = (tempObj.amount
                            * tempObj.gSTRate / 100);
                    if (DistributorTypeID == 6
                            || DistributorTypeID == 9)// If Location Type is
                    // 6=Distributor or
                    // 9=Regional
                    // Distributor
                    {
                        if (IsDistributorRegister == 1)// If Location is
                        // Register
                        {
                            tempObj.gSTAmount = ((tempObj.amount - (tempObj
                                    .standardDiscount - (ObjTotalSED_BY_VALUE_AD + ObjTotalSED_PER_VALUE_AD)))
                                    * tempObj.gSTRate / 100);
                        }
                    }
                    tempObj.extraTax = (0);
                    // Extra Tax
                    if (DistributorTypeID == 6
                            || DistributorTypeID == 9)// If Location Type is
                    // 6=Distributor or
                    // 9=Regional
                    // Distributor
                    {
                        if (IsDistributorRegister == 1)// If Location is
                        // Register
                        {
                            if (tempObj.skuItem.getGST_ON().contains("T")) {
                                List<SKU> dtsku = dbhelper.getSKU(tempObj
                                        .sKUID);
                                if (dtsku.size() > 0) {
                                    SKU rowSku = dtsku.get(0);
                                    tempObj.extraTax = ((tempObj.amount - (tempObj
                                            .standardDiscount - tempObj
                                            .sedAmount)
                                            * rowSku.getEXTR_Tax() / 100));
                                    ObjTotalExtra_Tax = ObjTotalExtra_Tax
                                            + ((tempObj.amount - (tempObj
                                            .standardDiscount - (ObjTotalSED_BY_VALUE_AD + ObjTotalSED_PER_VALUE_AD)))
                                            * rowSku.getEXTR_Tax() / 100);
                                }
                            }
                        }
                    }

                    tempObj.standardDiscountByValueAd = tempObj
                            .standardDiscount;
                    ObjStandardDiscount_By_VALUE = ObjStandardDiscount_By_VALUE
                            + tempObj.standardDiscount;
                    tempObj.standardDiscountPerValue = (tempObj
                            .standardDiscountPerValue * tempObj.amount);
                    tempObj.standardDiscount = (tempObj.standardDiscount
                            + (tempObj.standardDiscountPerValue * tempObj
                            .amount));
                    tempObj.sedAmountPerValueTo = (tempObj
                            .sedAmountPerValueTo * tempObj.amount);
                    tempObj.standardDiscountPerValueAd = (tempObj
                            .standardDiscountPerValueAd
                            * tempObj.amount);
                    tempObj.standardDiscountPerValueTo = (tempObj
                            .standardDiscountPerValueTo
                            * tempObj.amount);
                    tempObj.sedAmountPerValue = tempObj
                            .sedAmountPerValue * tempObj.amount;
                    tempObj.sedAmount = ((tempObj.getCLAIM_PER() * tempObj
                            .amount) + tempObj.claimExtraAmount);
                    tempObj.amount = (tempObj.amount
                            * tempObj.gSTRate / 100);
                    ObjStandardDiscount = ObjStandardDiscount
                            + tempObj.standardDiscount;
                    ObjTotalSED = ObjTotalSED
                            + (tempObj.getCLAIM_PER() * tempObj.amount)
                            + tempObj.claimExtraAmount;
                    ObjTotalSED_BY_VALUE_TO = ObjTotalSED_BY_VALUE_TO
                            + tempObj.sedAmountByValueTo;
                    ObjTotalSED_PER_VALUE_TO = ObjTotalSED_PER_VALUE_TO
                            + tempObj.sedAmountPerValueTo;
                    ObjStandardDiscount_PER_VALUE = ObjStandardDiscount_PER_VALUE
                            + tempObj.standardDiscountPerValue;
                    ObjTotalSED_BY_VALUE = ObjTotalSED_BY_VALUE
                            + tempObj.sedAmountByValue;
                    ObjTotalSED_PER_VALUE = ObjTotalSED_PER_VALUE
                            + tempObj.sedAmountPerValue;
                    ObjStandardDiscount_By_VALUE_TO = ObjStandardDiscount_By_VALUE_TO
                            + tempObj.standardDiscountByValueTo;
                    ObjStandardDiscount_By_VALUE_AD = ObjStandardDiscount_By_VALUE_AD
                            + tempObj.standardDiscountByValueAd;
                    ObjStandardDiscount_PER_VALUE_TO = ObjStandardDiscount_PER_VALUE_TO
                            + tempObj.standardDiscountPerValueTo;
                    ObjStandardDiscount_PER_VALUE_AD = ObjStandardDiscount_PER_VALUE_AD
                            + tempObj.standardDiscountPerValueAd;
                    ObjTotalGST = ObjTotalGST + tempObj.gSTAmount;
                    ObjTotalTST = ObjTotalTST + tempObj.tSTAmount;
                    tempObj.netAmount = (tempObj.amount
                            - tempObj.standardDiscount
                            + tempObj.gSTAmount);
                    tempObj.gSTPrice = (tempObj.price);

                }
            }
            // Insert value to TextBoxes
            etDistributorDiscount.setText(""
                    + String.format("%.2f", ObjStandardDiscount - ObjTotalSED));
            etCompanyDiscount.setText(""
                    + String.format("%.2f", ObjTotalSED_BY_VALUE_AD
                    + ObjTotalSED_PER_VALUE_AD));
            tvTradeOffer.setText(""
                    + String.format("%.2f", ObjTotalSED_BY_VALUE_TO
                    + ObjTotalSED_PER_VALUE_TO));
            grossAmount.setText("" + String.format("%.2f", ObjGrossSales));
            gst.setText(""
                    + String.format("%.2f", ObjTotalGST + ObjTotalExtra_Tax
                    + ObjTotalTST + ObjFreeTST + ObjFreeGSTAmount));
            netAmount.setText(""
                    + String.format("%.2f", ObjGrossSales - ObjStandardDiscount
                    + ObjTotalGST + ObjTotalExtra_Tax + ObjTotalTST + ObjFreeTST + ObjFreeGSTAmount));
        } catch (Exception e) {
            Toast.makeText(OrderSummery.this, e.toString(), Toast.LENGTH_LONG)
                    .show();
        }
    }

    private void LoadFreeSKU(ArrayList<dtFreeSKUDetail> dtFree) {
        // load free SKUs in list
    }

    private int FreeSKUExist(ArrayList<dtFreeSKUDetail> dt, int Sku_id) {
        for (int i = 0; i < dt.size(); i++) {
            dtFreeSKUDetail rowFree = dt.get(i);
            if (rowFree.getMaster_SKU_ID() == Sku_id) {
                return i;
            }
        }
        return -1;
    }
    */
}
