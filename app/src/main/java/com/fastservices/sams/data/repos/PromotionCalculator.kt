package com.fastservices.sams.data.repos

import android.arch.lifecycle.MutableLiveData
import com.fastservices.sams.SamsApplication
import com.fastservices.sams.data.entities.*
import com.fastservices.sams.data.entities.promotions.dtFreeSKUDetail
import com.fastservices.sams.data.entities.promotions.dtPromotionOffer
import com.fastservices.sams.data.models.SummaryUIModel
import com.fastservices.sams.data.models.UserInfo

class PromotionCalculator(val login: UserInfo,
                          var liveDate: MutableLiveData<SummaryUIModel>,
                          var myShoping: List<OrderItem>,
                          var Customer: Outlet
) {

    lateinit var summaryUIModel: SummaryUIModel
    private var DistributorTypeID = Integer.parseInt(login.DistributorTypeID)
    private var IsDistributorRegister = login.DistributorRegister// populate from UserInfo


    var ObjStandardDiscount = 0.0
    var ObjTotalSED_BY_VALUE_AD = 0.0
    var ObjTotalSED_PER_VALUE_AD = 0.0
    var ObjTotalSED_BY_VALUE_TO = 0.0
    var ObjTotalSED_PER_VALUE_TO = 0.0
    var ObjTotalSED = 0.0
    var ObjStandardDiscount_By_VALUE = 0.0
    var ObjStandardDiscount_PER_VALUE = 0.0
    var ObjTotalSED_BY_VALUE = 0.0
    var ObjTotalSED_PER_VALUE = 0.0
    var ObjStandardDiscount_By_VALUE_TO = 0.0
    var ObjStandardDiscount_By_VALUE_AD = 0.0
    var ObjStandardDiscount_PER_VALUE_TO = 0.0
    var ObjStandardDiscount_PER_VALUE_AD = 0.0
    var mGSTPrice = 0.0
    var ObjGrossSales = 0.0
    var ObjTotalGST = 0.0
    var ObjTotalTST = 0.0
    var ObjTotalExtra_Tax = 0.0
    var ObjFreeGSTAmount = 0.0
    var ObjFreeTST = 0.0
    var ObjFreeExtra_Tax = 0.0
    var OrderID = "0"
    var Remakrs = ""

    suspend fun GetPromotion(): ArrayList<dtFreeSKUDetail>? {
        val dtFree = ArrayList<dtFreeSKUDetail>()
        try {
            ObjStandardDiscount = 0.0
            ObjTotalSED_BY_VALUE_AD = 0.0
            ObjTotalSED_PER_VALUE_AD = 0.0
            ObjTotalSED_BY_VALUE_TO = 0.0
            ObjTotalSED_PER_VALUE_TO = 0.0
            ObjStandardDiscount_By_VALUE = 0.0
            ObjStandardDiscount_PER_VALUE = 0.0
            ObjTotalSED_BY_VALUE = 0.0
            ObjTotalSED_PER_VALUE = 0.0
            ObjStandardDiscount_By_VALUE_TO = 0.0
            ObjStandardDiscount_By_VALUE_AD = 0.0
            ObjStandardDiscount_PER_VALUE_TO = 0.0
            ObjStandardDiscount_PER_VALUE_AD = 0.0
            ObjTotalSED = 0.0
            mGSTPrice = 0.0
            ObjGrossSales = 0.0
            ObjTotalGST = 0.0
            ObjTotalTST = 0.0
            ObjTotalExtra_Tax = 0.0
            //Set all promotion related columns of Ordered Items to zero
            for (i in myShoping.indices) {
                val tempObj = myShoping.get(i)
                tempObj.standardDiscount = 0.0
                tempObj.sedAmountByValueAD = 0.0
                tempObj.sedAmountPerValueAd = 0.0
                tempObj.sedAmountByValueTo = 0.0
                tempObj.sedAmountPerValueTo = 0.0
                tempObj.standardDiscountPerValue = 0.0
                tempObj.setCLAIM_PER(0.0)
                tempObj.sedAmountPerValue = 0.0
                tempObj.standardDiscountByValueAd = 0.0
            }

            val Quantity = 0
            val FreeSKUID = 0
            val Offer_Value = 0.0
            val Discount = 0.0

            val myPromotions = ArrayList<dtPromotionOffer>()

            var tempPromotion: dtPromotionOffer? = null
            var tempSKU: dtFreeSKUDetail? = null


            //There are 6 tables which store promotion information
            //Load information from 1st table "Promotion" of promotions
            val dtProm = SamsApplication.getDB().promotionDao().getAll()

            for (PromotionIdx in dtProm.indices) {
                val rowProm = dtProm.get(PromotionIdx)
                var IsValidCustomerVolCla = false
                var IsValidCustomerTypeId = false
                val mygroup = ArrayList<Int>()

                // Promotion Volume Class
                //Load information from 2nd table "CustomerVolumeClass" of promotions
                val pVolume = SamsApplication.getDB().promotionValueDao().getAll(rowProm.promotioN_ID)
                //  SamsApplication.getDB().promotionValueDao().getAll()
                if (pVolume.isNotEmpty()) {
                    for (i in pVolume.indices) {
                        val rowVolume = pVolume.get(i)
                        if (Customer.promotionClass == rowVolume
                                        .customeR_VOLUMECLASS_ID) {
                            IsValidCustomerVolCla = true
                            break
                        }
                    }
                }

                // Customer Type
                //Load information from 3rd table "PrmotionCustomerType" of promotions
                val pType = SamsApplication.getDB().promotionCustomerDao().getAll(rowProm.promotioN_ID)
//                        dbhelper.getPromotionCustomerType(rowProm.getPROMOTION_ID())
                if (pType.isNotEmpty()) {
                    for (i in pType.indices) {
                        val rowType = pType.get(i)
                        // ASSUMED: ChannelTypeID is areaTypeId
                        if (Customer.subChannelID == rowType.customeR_TYPE_ID) {
                            IsValidCustomerTypeId = true
                            break
                        }
                    }
                }

                if (IsValidCustomerTypeId && IsValidCustomerVolCla) {
                    for (i in myShoping.indices) {
                        val tempObj = myShoping.get(i)
                        // Basket Master
//                        dbhelper = DBHelper(this@OrderSummery)
                        //Load information from 4th table "BasketMaster" of promotions
                        val dtBMaster = SamsApplication.getDB().basketMasterDao().getAll(rowProm.promotioN_ID)
//                                dbhelper.getBaskMaser(rowProm.getPROMOTION_ID())
                        for (BMastterIndex in dtBMaster.indices) {
                            var Applygroup = false
                            var dValueToCompare = 0.0
                            var dMultipalGroupItem = 0
                            val rowBMaster = dtBMaster
                                    .get(BMastterIndex)

                            // Basket Detail
                            //Load information from 5th table "BasketDetail" of promotions

                            val dtBDetail = SamsApplication.getDB().basketDetailDao().getAll(rowBMaster.baskeT_ID)
//                                    dbhelper.getBaskDetail(rowBMaster.getBASKET_ID())
                            for (BDetailIndex in dtBDetail.indices) {
                                val rowBDetail = dtBDetail
                                        .get(BDetailIndex)
                                if (rowBDetail.skU_ID > 0)
                                // Single SKU
                                {
                                    if (rowBDetail.skU_ID == tempObj
                                                    .sKUID) {//If promotion is applies on Single SKU
                                        if (rowBMaster.baskeT_ON == 83)
                                        // If Promotion applies on Amount
                                        {
                                            dValueToCompare = tempObj
                                                    .amount
                                        } else if (rowBMaster.baskeT_ON == 82)
                                        //If Promotion applies on Quantity
                                        {
                                            dValueToCompare = tempObj
                                                    .quantity.toDouble()
                                        }

                                        // Check if Slab is applicable
                                        //If Quanitty of Amount of Order lies in the range of Min and Max value of promotion
                                        if (dValueToCompare >= rowBDetail
                                                        .miN_VAL && (dValueToCompare <= rowBDetail
                                                        .maX_VAL || rowBDetail
                                                        .maX_VAL == 0.0)) {
                                            // Promotion Offer
                                            //Load information from 6th table "PromotionOffer" of promotions
                                            val dtPOffer = SamsApplication.getDB().promotionOfferDao().getAll(rowBDetail.baskeT_DETAIL_ID)
//                                                    dbhelper.getPromotionOffer(rowBDetail.baskeT_DETAIL_ID)
                                            if (dtPOffer.isNotEmpty()) {
                                                val rowPOffer = dtPOffer
                                                        .get(0)
                                                tempPromotion = rowPOffer
                                                if (dValueToCompare > rowBDetail
                                                                .multiplE_OF && rowBDetail
                                                                .multiplE_OF > 0) {
                                                    val iMultiply = (dValueToCompare / rowBDetail
                                                            .multiplE_OF).toInt()
                                                    tempPromotion!!.quantity = rowPOffer
                                                            .getQUANTITY() * iMultiply
                                                    tempPromotion.offeR_VALUE = rowPOffer
                                                            .getOFFER_VALUE()!! * iMultiply
                                                } else {
                                                    tempPromotion!!.quantity = rowPOffer
                                                            .getQUANTITY()
                                                    tempPromotion.offeR_VALUE = rowPOffer
                                                            .getOFFER_VALUE()
                                                }
                                                tempPromotion.discount = rowPOffer
                                                        .getDISCOUNT()
                                                tempPromotion.FreeSKUID = rowPOffer
                                                        .getSKU_ID()
                                                tempPromotion.claimable = rowProm
                                                        .claimable
                                                tempPromotion.iS_AND = rowBMaster
                                                        .iS_AND
                                                tempPromotion.skU_ID = tempObj
                                                        .sKUID
                                                tempPromotion.offeR_VALUE_TYPE = rowPOffer
                                                        .getOFFER_VALUE_TYPE()
                                                tempPromotion.discounT_TYPE = rowPOffer
                                                        .getDISCOUNT_TYPE()
                                                tempPromotion.group_ID = -1
                                                //Add Applicable Promotion Detail to myPromotions List
                                                myPromotions.add(tempPromotion)
                                            }
                                        }
                                    }
                                } else
                                // Group
                                {
                                    //If Group Applies
                                    for (value in mygroup) {
                                        if (rowBDetail.skU_GROUP_ID == value) {
                                            Applygroup = true
                                            break
                                        }
                                    }
                                    if (!Applygroup) {
                                        dValueToCompare = 0.0
                                        dMultipalGroupItem = 0
                                        //If Promotion applies on Amount then calculate those skus amount of current group
                                        if (rowBMaster.baskeT_ON == 83) {
                                            for (k in myShoping.indices) {
                                                val tempObj2 = myShoping.get(k)
                                                val groupdetail = SamsApplication.getDB().skuGroupDao().getAll(tempObj2.sKUID, rowBDetail.skU_GROUP_ID)
//                                                        dbhelper.getSKUGroupDetail(tempObj2.sKUID, rowBDetail.skU_GROUP_ID)
                                                if (groupdetail.size > 0) {
                                                    dValueToCompare += tempObj2.amount
                                                    dMultipalGroupItem += 1
                                                }
                                            }
                                        } else {////If Promotion applies on Quantity  then calculate those skus quantity of current group
                                            for (k in myShoping.indices) {
                                                val tempObj2 = myShoping
                                                        .get(k)
//                                                dbhelper = DBHelper(this@OrderSummery)
                                                val groupdetail = SamsApplication.getDB().skuGroupDao().getAll(tempObj2.sKUID, rowBDetail.skU_GROUP_ID)
//                                                val groupdetail = dbhelper.getSKUGroupDetail(tempObj2.sKUID, rowBDetail.skU_GROUP_ID)
                                                if (groupdetail.size > 0) {
                                                    dValueToCompare += tempObj2
                                                            .quantity.toDouble()
                                                    dMultipalGroupItem += 1
                                                }
                                            }
                                        }
                                        // Check if Slab is applicable
                                        //If Quanitty of Amount of Order lies in the range of Min and Max value of promotion
                                        if (dValueToCompare >= rowBDetail
                                                        .miN_VAL && (dValueToCompare <= rowBDetail
                                                        .maX_VAL || rowBDetail
                                                        .maX_VAL == 0.0)) {
                                            //Load information from 6th table "PromotionOffer" of promotions
                                            val dtPOffer = SamsApplication.getDB().promotionOfferDao().getAll(rowBDetail.baskeT_DETAIL_ID)
//                                                    dbhelper.getPromotionOffer(rowBDetail.baskeT_DETAIL_ID)
                                            if (dtPOffer.isNotEmpty()) {
                                                val rowPOffer = dtPOffer
                                                        .get(0)
                                                tempPromotion = rowPOffer
                                                if (dValueToCompare > rowBDetail
                                                                .multiplE_OF && rowBDetail
                                                                .multiplE_OF > 0) {
                                                    val iMultiply = (dValueToCompare / rowBDetail
                                                            .multiplE_OF).toInt()
                                                    tempPromotion!!.quantity = rowPOffer
                                                            .getQUANTITY() * iMultiply
                                                    val TotalvalueOngroup = rowPOffer
                                                            .getOFFER_VALUE()!! * iMultiply
                                                    tempPromotion.offeR_VALUE = TotalvalueOngroup / dValueToCompare
                                                } else {
                                                    tempPromotion!!.quantity = rowPOffer
                                                            .getQUANTITY()
                                                    tempPromotion.offeR_VALUE = rowPOffer
                                                            .getOFFER_VALUE()
                                                }
                                                tempPromotion.discount = rowPOffer
                                                        .getDISCOUNT()
                                                tempPromotion.FreeSKUID = rowPOffer
                                                        .getSKU_ID()
                                                tempPromotion.claimable = rowProm
                                                        .claimable
                                                tempPromotion.iS_AND = rowBMaster
                                                        .iS_AND
                                                tempPromotion.skU_ID = rowBDetail
                                                        .skU_ID
                                                tempPromotion.offeR_VALUE_TYPE = rowPOffer
                                                        .getOFFER_VALUE_TYPE()
                                                tempPromotion.discounT_TYPE = rowPOffer
                                                        .getDISCOUNT_TYPE()
                                                tempPromotion.group_ID = rowBDetail
                                                        .skU_GROUP_ID
                                                mygroup.add(rowBDetail
                                                        .skU_GROUP_ID)
                                                //Add Applicable Promotion Detail to myPromotions List
                                                myPromotions.add(tempPromotion)
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
            for (p in myPromotions.indices) {
                val myPromotions2 = myPromotions[p]
                if (myPromotions2.claimable == 1)
                // if Promotion is Claimable Type
                {
                    // If promotion is On Single SKU
                    if (myPromotions2.skU_ID > 0) {
                        for (i in myShoping.indices) {
                            //Iterating through Order Items
                            val tempObj = myShoping.get(i)
                            if (tempObj.sKUID == myPromotions2
                                            .skU_ID) {
                                if (myPromotions2.iS_AND == 1) {
                                    if (myPromotions2.offeR_VALUE > 0) {
                                        tempObj.extraDiscount = tempObj
                                                .extraDiscount + myPromotions2
                                                .offeR_VALUE!!
                                        tempObj.claimExtraAmount = tempObj
                                                .claimExtraAmount + myPromotions2
                                                .offeR_VALUE!!
                                    }
                                    if (myPromotions2.discount > 0) {
                                        tempObj.extraDiscount = tempObj
                                                .extraDiscount + myPromotions2.discount / 100 * tempObj.amount
                                        tempObj.claimExtraAmount = tempObj
                                                .claimExtraAmount + myPromotions2.discount / 100 * tempObj.amount
                                    }
                                } else {
                                    if (myPromotions2.offeR_VALUE > 0) {
                                        tempObj.standardDiscount = tempObj
                                                .standardDiscount + myPromotions2
                                                .offeR_VALUE!!
                                        tempObj.claimExtraAmount = tempObj
                                                .claimExtraAmount + myPromotions2
                                                .offeR_VALUE!!
                                        tempObj.sedAmountByValue = tempObj
                                                .standardDiscount
                                        // Discount Segregation
                                        try {
                                            if (myPromotions2
                                                            .offeR_VALUE_TYPE > 0)
                                            // Trade
                                            // Offer
                                            // Type
                                            {
                                                tempObj.sedAmountByValueTo = tempObj
                                                        .sedAmountByValueTo + myPromotions2
                                                        .offeR_VALUE!!
                                                tempObj.standardDiscountByValueTo = tempObj
                                                        .standardDiscountByValueTo + myPromotions2
                                                        .offeR_VALUE!!
                                            } else
                                            // Additional Discount Type
                                            {
                                                tempObj.sedAmountByValueAD = tempObj
                                                        .sedAmountByValueAD + myPromotions2
                                                        .offeR_VALUE!!
                                                tempObj.standardDiscountByValueAd = tempObj
                                                        .standardDiscountByValueAd + myPromotions2
                                                        .offeR_VALUE!!
                                            }
                                        } catch (e: Exception) {
                                            tempObj.sedAmountByValueTo = tempObj
                                                    .sedAmountByValueTo + myPromotions2
                                                    .offeR_VALUE!!
                                            tempObj.standardDiscountByValueTo = tempObj
                                                    .standardDiscountByValueTo + myPromotions2
                                                    .offeR_VALUE!!
                                        }

                                    }
                                    if (myPromotions2.discount > 0) {
                                        tempObj.standardDiscountPer = tempObj
                                                .standardDiscountPer + myPromotions2.discount / 100
                                        tempObj.setCLAIM_PER(tempObj
                                                .getCLAIM_PER() + myPromotions2.discount / 100)
                                        tempObj.sedAmountPerValue = tempObj
                                                .sedAmountPerValue + myPromotions2.discount / 100
                                        // Discount Segregation
                                        try {
                                            if (myPromotions2
                                                            .discounT_TYPE == 0)
                                            // Trade
                                            // Offer
                                            // Type
                                            {
                                                tempObj.sedAmountPerValueTo = tempObj
                                                        .sedAmountPerValueTo + myPromotions2
                                                        .discount / 100
                                                tempObj.standardDiscountPerValueTo = tempObj
                                                        .standardDiscountPerValueTo + myPromotions2
                                                        .discount / 100
                                            } else
                                            // Additional Discount Type
                                            {
                                                tempObj.sedAmountPerValueAd = tempObj
                                                        .sedAmountPerValueAd + myPromotions2
                                                        .discount / 100
                                                tempObj.standardDiscountPerValueAd = tempObj
                                                        .standardDiscountPerValueAd + myPromotions2
                                                        .discount / 100
                                            }
                                        } catch (e: Exception) {
                                            tempObj.sedAmountPerValueTo = tempObj
                                                    .sedAmountPerValueTo + myPromotions2
                                                    .discount / 100
                                            tempObj.standardDiscountPerValueTo = tempObj
                                                    .standardDiscountPerValueTo + myPromotions2
                                                    .discount / 100
                                        }

                                    }
                                }
                                if (myPromotions2.FreeSKUID > 0) { // if Promotion Offer is of Free SKU
                                    val dtsku = SamsApplication.getDB().SKUDao().getAll(myPromotions2.FreeSKUID)
//                                            dbhelper.getSKU(myPromotions2.freeSKUID)
                                    if (dtsku.size > 0) {
                                        val rowSku = dtsku.get(0)
                                        mGSTPrice = rowSku.TRADE_PRICE
                                        tempSKU = dtFreeSKUDetail()
                                        val Row_Id = FreeSKUExist(dtFree,
                                                myPromotions2.FreeSKUID)
                                        if (Row_Id < 0)
                                        //If this SKU not exist already in Free SKU list
                                        {
                                            tempSKU.skU_ID = rowSku
                                                    .SKU_ID
                                            tempSKU.master_SKU_ID = rowSku
                                                    .SKU_ID
                                            tempSKU.skU_Code = rowSku
                                                    .SKU_CODE
                                            tempSKU.skU_Name = rowSku
                                                    .SKU_NAME
                                            tempSKU.uniT_PRICE = rowSku
                                                    .TRADE_PRICE
                                            tempSKU.quantity = myPromotions2
                                                    .quantity
                                            tempSKU.gsT_RATE = rowSku
                                                    .GST_RATE
                                            tempSKU.amount = rowSku
                                                    .TRADE_PRICE * tempSKU.quantity
                                            tempSKU.gsT_AMOUNT = 0.0
                                            tempSKU.tsT_AMOUNT = 0.0
                                            tempSKU.weight = rowSku.WEIGHT.toDouble()
                                            tempSKU.uoM_DESC = rowSku.UOM_DESC
                                            if (myPromotions2
                                                            .skuOfferTypeID == 0)
                                            // Trade
                                            // offer
                                            {
                                                tempSKU.quantity_TO = myPromotions2
                                                        .quantity
                                            } else
                                            // Additional
                                            {
                                                tempSKU.quantity_AD = myPromotions2
                                                        .quantity
                                            }
                                            if (rowSku.GST_ON.contains("T")) {
                                                tempSKU.gsT_AMOUNT = (rowSku
                                                        .GST_RATE / 100
                                                        * rowSku.TRADE_PRICE
                                                        * myPromotions2
                                                        .quantity.toDouble())
                                            } else if (rowSku.GST_ON.contains("R")) {
                                                tempSKU.tsT_AMOUNT = rowSku
                                                        .GST_RATE * tempSKU.quantity
                                            }
                                            if (DistributorTypeID == 6 || DistributorTypeID == 9)
                                            // If
                                            // Location
                                            // Type
                                            // is
                                            // 6=Distributor
                                            // or
                                            // 9=Regional
                                            // Distributor
                                            {
                                                if (IsDistributorRegister == 1)
                                                // If
                                                // Location
                                                // is
                                                // Register
                                                {
                                                    if (rowSku.GST_ON.contains("T")) {
                                                        tempSKU.extra_tax = tempSKU
                                                                .amount * rowSku.EXTR_Tax / 100
                                                    }
                                                }
                                            }
                                            tempSKU.promotioN_ID = myPromotions2
                                                    .promotioN_ID
                                            tempSKU.baskeT_ID = myPromotions2
                                                    .baskeT_ID
                                            tempSKU.baskeT_DETAIL_ID = myPromotions2
                                                    .baskeT_DETAIL_ID
                                            tempSKU.promotioN_OFFER_ID = myPromotions2
                                                    .promotioN_OFFER_ID
                                            ObjFreeGSTAmount += tempSKU
                                                    .gsT_AMOUNT
                                            ObjFreeTST += tempSKU
                                                    .tsT_AMOUNT
                                            ObjFreeExtra_Tax += tempSKU
                                                    .extra_tax

                                            dtFree.add(tempSKU)
                                        } else
                                        //If SKU already exist in Free SKU list then update Free SKU List
                                        {
                                            val rowUpdateSku = dtFree[Row_Id]
                                            ObjFreeGSTAmount = ObjFreeGSTAmount - rowUpdateSku
                                                    .gsT_AMOUNT
                                            ObjFreeTST = ObjFreeTST - rowUpdateSku
                                                    .tsT_AMOUNT
                                            ObjFreeExtra_Tax = ObjFreeExtra_Tax - rowUpdateSku
                                                    .extra_tax

                                            rowUpdateSku.quantity = rowUpdateSku
                                                    .quantity + myPromotions2
                                                    .quantity
                                            rowUpdateSku.amount = rowSku
                                                    .TRADE_PRICE * rowUpdateSku
                                                    .quantity
                                            rowUpdateSku.gsT_AMOUNT = 0.0
                                            rowUpdateSku.tsT_AMOUNT = 0.0
                                            if (myPromotions2
                                                            .skuOfferTypeID == 0)
                                            // Trade
                                            // offer
                                            {
                                                rowUpdateSku.quantity_TO = rowUpdateSku
                                                        .quantity_TO + myPromotions2
                                                        .quantity
                                            } else
                                            // Additional
                                            {
                                                rowUpdateSku.quantity_AD = rowUpdateSku
                                                        .quantity_AD + myPromotions2
                                                        .quantity
                                            }

                                            if (rowSku.GST_ON.contains("T")) {
                                                rowUpdateSku.gsT_AMOUNT = (rowSku
                                                        .GST_RATE / 100
                                                        * rowSku.TRADE_PRICE
                                                        * myPromotions2
                                                        .quantity.toDouble())
                                            } else if (rowSku.GST_ON.contains("R")) {
                                                rowUpdateSku.tsT_AMOUNT = rowSku
                                                        .GST_RATE * rowUpdateSku
                                                        .quantity
                                            }

                                            if (DistributorTypeID == 6 || DistributorTypeID == 9)
                                            // If
                                            // Location
                                            // Type
                                            // is
                                            // 6=Distributor
                                            // or
                                            // 9=Regional
                                            // Distributor
                                            {
                                                if (IsDistributorRegister == 1)
                                                // If
                                                // Location
                                                // is
                                                // Register
                                                {
                                                    if (rowSku.GST_ON.contains("T")) {
                                                        rowUpdateSku.extra_tax = rowUpdateSku
                                                                .amount * rowSku.EXTR_Tax / 100
                                                    }
                                                }
                                            }
                                            rowUpdateSku.promotioN_ID = myPromotions2
                                                    .promotioN_ID
                                            rowUpdateSku.baskeT_ID = myPromotions2
                                                    .baskeT_ID
                                            rowUpdateSku.baskeT_DETAIL_ID = myPromotions2
                                                    .baskeT_DETAIL_ID
                                            rowUpdateSku.promotioN_OFFER_ID = myPromotions2
                                                    .promotioN_OFFER_ID
                                            ObjFreeGSTAmount += rowUpdateSku
                                                    .gsT_AMOUNT
                                            ObjFreeTST += rowUpdateSku
                                                    .tsT_AMOUNT
                                            ObjFreeExtra_Tax += rowUpdateSku
                                                    .extra_tax
                                        }
                                        LoadFreeSKU(dtFree)
                                    }
                                }
                            }
                        }

                    } else {
                        // If promotion is On SKU Group
                        if (myPromotions2.FreeSKUID > 0) { //If Promotion Offer is on Free SKU
                            val dtsku = SamsApplication.getDB().SKUDao().getAll(myPromotions2.FreeSKUID)
//                                    dbhelper.getSKU(myPromotions2.freeSKUID)
                            if (dtsku.isNotEmpty()) {
                                val rowSku = dtsku.get(0)
                                mGSTPrice = rowSku.TRADE_PRICE
                                tempSKU = dtFreeSKUDetail()
                                val Row_Id = FreeSKUExist(dtFree,
                                        myPromotions2.FreeSKUID)
                                if (Row_Id < 0)
                                // Add New SKU to Free SKU List
                                {
                                    tempSKU.skU_ID = rowSku.SKU_ID
                                    tempSKU.master_SKU_ID = rowSku.SKU_ID
                                    tempSKU.skU_Code = rowSku.SKU_CODE
                                    tempSKU.skU_Name = rowSku.SKU_NAME
                                    tempSKU.uniT_PRICE = rowSku
                                            .TRADE_PRICE
                                    tempSKU.quantity = myPromotions2
                                            .quantity
                                    tempSKU.gsT_RATE = rowSku.GST_RATE
                                    tempSKU.amount = rowSku.TRADE_PRICE * tempSKU.quantity
                                    tempSKU.gsT_AMOUNT = 0.0
                                    tempSKU.tsT_AMOUNT = 0.0
                                    tempSKU.weight = rowSku.WEIGHT.toDouble()
                                    tempSKU.uoM_DESC = rowSku.UOM_DESC
                                    if (myPromotions2.skuOfferTypeID == 0)
                                    // Trade
                                    // offer
                                    {
                                        tempSKU.quantity_TO = myPromotions2
                                                .quantity
                                    } else
                                    // Additional
                                    {
                                        tempSKU.quantity_AD = myPromotions2
                                                .quantity
                                    }
                                    if (rowSku.GST_ON.contains("T")) {
                                        tempSKU.gsT_AMOUNT = (rowSku
                                                .GST_RATE / 100
                                                * rowSku.TRADE_PRICE
                                                * myPromotions2.quantity.toDouble())
                                    } else if (rowSku.GST_ON.contains("R")) {
                                        tempSKU.tsT_AMOUNT = rowSku
                                                .GST_RATE * tempSKU.quantity
                                    }
                                    if (DistributorTypeID == 6 || DistributorTypeID == 9)
                                    // If
                                    // Location
                                    // Type
                                    // is
                                    // 6=Distributor
                                    // or
                                    // 9=Regional
                                    // Distributor
                                    {
                                        if (IsDistributorRegister == 1)
                                        // If
                                        // Location
                                        // is
                                        // Register
                                        {
                                            if (rowSku.GST_ON.contains("T")) {
                                                tempSKU.extra_tax = tempSKU
                                                        .amount * rowSku.EXTR_Tax / 100
                                            }
                                        }
                                    }
                                    tempSKU.promotioN_ID = myPromotions2
                                            .promotioN_ID
                                    tempSKU.baskeT_ID = myPromotions2
                                            .baskeT_ID
                                    tempSKU.baskeT_DETAIL_ID = myPromotions2
                                            .baskeT_DETAIL_ID
                                    tempSKU.promotioN_OFFER_ID = myPromotions2
                                            .promotioN_OFFER_ID
                                    ObjFreeGSTAmount += tempSKU.gsT_AMOUNT
                                    ObjFreeTST += tempSKU.tsT_AMOUNT
                                    ObjFreeExtra_Tax += tempSKU.extra_tax

                                    dtFree.add(tempSKU)
                                } else
                                // Update existing SKU in Free SKU list
                                {
                                    val rowUpdateSku = dtFree[Row_Id]
                                    ObjFreeGSTAmount = ObjFreeGSTAmount - rowUpdateSku.gsT_AMOUNT
                                    ObjFreeTST = ObjFreeTST - rowUpdateSku.tsT_AMOUNT
                                    ObjFreeExtra_Tax = ObjFreeExtra_Tax - rowUpdateSku.extra_tax

                                    rowUpdateSku.quantity = rowUpdateSku
                                            .quantity + myPromotions2.quantity
                                    rowUpdateSku.amount = rowSku
                                            .TRADE_PRICE * rowUpdateSku.quantity
                                    rowUpdateSku.gsT_AMOUNT = 0.0
                                    rowUpdateSku.tsT_AMOUNT = 0.0
                                    if (myPromotions2.skuOfferTypeID == 0)
                                    // Trade
                                    // offer
                                    {
                                        rowUpdateSku.quantity_TO = rowUpdateSku
                                                .quantity_TO + myPromotions2
                                                .quantity
                                    } else
                                    // Additional
                                    {
                                        rowUpdateSku.quantity_AD = rowUpdateSku
                                                .quantity_AD + myPromotions2
                                                .quantity
                                    }

                                    if (rowSku.GST_ON.contains("T")) {
                                        rowUpdateSku.gsT_AMOUNT = (rowSku
                                                .GST_RATE / 100
                                                * rowSku.TRADE_PRICE
                                                * myPromotions2.quantity.toDouble())
                                    } else if (rowSku.GST_ON.contains("R")) {
                                        rowUpdateSku.tsT_AMOUNT = rowSku
                                                .GST_RATE * rowUpdateSku.quantity
                                    }

                                    if (DistributorTypeID == 6 || DistributorTypeID == 9)
                                    // If
                                    // Location
                                    // Type
                                    // is
                                    // 6=Distributor
                                    // or
                                    // 9=Regional
                                    // Distributor
                                    {
                                        if (IsDistributorRegister == 1)
                                        // If
                                        // Location
                                        // is
                                        // Register
                                        {
                                            if (rowSku.GST_ON.contains("T")) {
                                                rowUpdateSku.extra_tax = rowUpdateSku
                                                        .amount * rowSku.EXTR_Tax / 100
                                            }
                                        }
                                    }
                                    rowUpdateSku.promotioN_ID = myPromotions2
                                            .promotioN_ID
                                    rowUpdateSku.baskeT_ID = myPromotions2
                                            .baskeT_ID
                                    rowUpdateSku.baskeT_DETAIL_ID = myPromotions2
                                            .baskeT_DETAIL_ID
                                    rowUpdateSku.promotioN_OFFER_ID = myPromotions2
                                            .promotioN_OFFER_ID
                                    ObjFreeGSTAmount += rowUpdateSku
                                            .gsT_AMOUNT
                                    ObjFreeTST += rowUpdateSku.tsT_AMOUNT
                                    ObjFreeExtra_Tax += rowUpdateSku
                                            .extra_tax
                                }
                                LoadFreeSKU(dtFree)
                            }
                        }
                        for (i in myShoping.indices) {
                            val tempObj = myShoping.get(i)
                            val groupdetail = SamsApplication.getDB().skuGroupDao().getAll(tempObj.sKUID, myPromotions2.group_ID)
//                            val groupdetail = dbhelper.getSKUGroupDetail(tempObj.sKUID, myPromotions2.group_ID)
                            if (groupdetail.size > 0) {
                                if (myPromotions2.iS_AND == 1) {
                                    if (myPromotions2.offeR_VALUE > 0) {
                                        val value = tempObj
                                                .quantity * myPromotions2
                                                .offeR_VALUE!!
                                        tempObj.extraDiscount = tempObj
                                                .extraDiscount + value
                                        tempObj.claimExtraAmount = tempObj
                                                .claimExtraAmount + value
                                    }
                                    if (myPromotions2.discount > 0) {
                                        tempObj.extraDiscount = tempObj
                                                .extraDiscount + myPromotions2.discount / 100 * tempObj.amount
                                        tempObj.claimExtraAmount = tempObj
                                                .claimExtraAmount + myPromotions2.discount / 100 * tempObj.amount
                                    }
                                } else {
                                    if (myPromotions2.offeR_VALUE > 0) {
                                        val value = tempObj
                                                .quantity * myPromotions2
                                                .offeR_VALUE!!
                                        tempObj.standardDiscount = tempObj
                                                .standardDiscount + value
                                        tempObj.claimExtraAmount = tempObj
                                                .claimExtraAmount + value
                                        tempObj.sedAmountByValue = tempObj
                                                .standardDiscount

                                        // Discount Segregation
                                        try {
                                            if (myPromotions2
                                                            .offeR_VALUE_TYPE == 1) {
                                                tempObj.sedAmountByValueTo = tempObj
                                                        .sedAmountByValueTo + value
                                                tempObj.standardDiscountByValueTo = tempObj
                                                        .standardDiscountByValueTo + value
                                            } else {
                                                tempObj.sedAmountByValueAD = tempObj
                                                        .sedAmountByValueAD + value
                                                tempObj.standardDiscountByValueAd = tempObj
                                                        .standardDiscountByValueAd + value
                                            }
                                        } catch (e: Exception) {
                                            tempObj.sedAmountByValueTo = tempObj
                                                    .sedAmountByValueTo + value
                                            tempObj.standardDiscountByValueTo = tempObj
                                                    .standardDiscountByValueTo + value
                                        }

                                    }
                                    if (myPromotions2.discount > 0) {
                                        tempObj.standardDiscountPer = tempObj
                                                .standardDiscountPer + myPromotions2.discount / 100
                                        tempObj.setCLAIM_PER(tempObj
                                                .getCLAIM_PER() + myPromotions2.discount / 100)
                                        tempObj.sedAmountPerValue = tempObj
                                                .sedAmountPerValue + myPromotions2.discount / 100
                                        // Discount Segregation
                                        try {
                                            if (myPromotions2
                                                            .discounT_TYPE == 0) {
                                                tempObj.sedAmountPerValueTo = tempObj
                                                        .sedAmountPerValueTo + myPromotions2
                                                        .discount / 100
                                                tempObj.standardDiscountPerValueTo = tempObj
                                                        .standardDiscountPerValueTo + myPromotions2
                                                        .discount / 100
                                            } else {
                                                tempObj.sedAmountPerValueAd = tempObj
                                                        .sedAmountPerValueAd + myPromotions2
                                                        .discount / 100
                                                tempObj.standardDiscountPerValueAd = tempObj
                                                        .standardDiscountPerValueAd + myPromotions2
                                                        .discount / 100
                                            }
                                        } catch (e: Exception) {
                                            tempObj.sedAmountPerValueTo = tempObj
                                                    .sedAmountPerValueTo + myPromotions2
                                                    .discount / 100
                                            tempObj.standardDiscountPerValueTo = tempObj
                                                    .standardDiscountPerValueTo + myPromotions2
                                                    .discount / 100
                                        }

                                    }
                                }
                            }
                        }
                    }
                } else
                // If promotion type is UnClaimable
                {
                    if (myPromotions2.skU_ID > 0) {
                        // Slab On Single SKU
                        for (i in myShoping.indices) {
                            val tempObj = myShoping.get(i)
                            if (tempObj.sKUID == myPromotions2
                                            .skU_ID) {
                                if (myPromotions2.iS_AND == 1) {
                                    if (myPromotions2.offeR_VALUE > 0) {
                                        tempObj.extraDiscount = tempObj
                                                .extraDiscount + myPromotions2
                                                .offeR_VALUE!!
                                    }
                                    if (myPromotions2.discount > 0) {
                                        tempObj.extraDiscount = tempObj
                                                .extraDiscount + myPromotions2.discount / 100 * tempObj.amount
                                    }
                                } else {
                                    if (myPromotions2.offeR_VALUE > 0) {
                                        tempObj.standardDiscount = tempObj
                                                .standardDiscount + myPromotions2
                                                .offeR_VALUE!!
                                        // Discount Segregation
                                        try {
                                            if (myPromotions2
                                                            .offeR_VALUE_TYPE == 0) {
                                                tempObj.standardDiscountByValueTo = tempObj
                                                        .standardDiscountByValueTo + myPromotions2
                                                        .offeR_VALUE!!
                                            } else {
                                                tempObj.standardDiscountByValueAd = tempObj
                                                        .standardDiscountByValueAd + myPromotions2
                                                        .offeR_VALUE!!
                                            }
                                        } catch (e: Exception) {
                                            tempObj.standardDiscountByValueTo = tempObj
                                                    .standardDiscountByValueTo + myPromotions2
                                                    .offeR_VALUE!!
                                        }

                                    }
                                    if (myPromotions2.discount > 0) {
                                        tempObj.standardDiscountPer = tempObj
                                                .standardDiscountPer + myPromotions2.discount / 100
                                        // Discount Segregation
                                        try {
                                            if (myPromotions2
                                                            .discounT_TYPE == 0) {
                                                tempObj.standardDiscountPerValueTo = tempObj
                                                        .standardDiscountPerValueTo + myPromotions2
                                                        .discount / 100
                                            } else {
                                                tempObj.standardDiscountPerValueAd = tempObj
                                                        .standardDiscountPerValueAd + myPromotions2
                                                        .discount / 100
                                            }
                                        } catch (e: Exception) {
                                            tempObj.standardDiscountPerValueTo = tempObj
                                                    .standardDiscountPerValueTo + myPromotions2
                                                    .discount / 100
                                        }

                                    }
                                }
                                if (myPromotions2.FreeSKUID > 0) { // Free
                                    // SKU
                                    val dtsku = SamsApplication.getDB().SKUDao().getAll(myPromotions2.FreeSKUID)
//                                            dbhelper.getSKU(myPromotions2.freeSKUID)
                                    if (dtsku.size > 0) {
                                        val rowSku = dtsku.get(0)
                                        mGSTPrice = rowSku.TRADE_PRICE
                                        tempSKU = dtFreeSKUDetail()
                                        val Row_Id = FreeSKUExist(dtFree,
                                                myPromotions2.FreeSKUID)
                                        if (Row_Id < 0)
                                        // Add
                                        {
                                            tempSKU.skU_ID = rowSku
                                                    .SKU_ID
                                            tempSKU.master_SKU_ID = rowSku
                                                    .SKU_ID
                                            tempSKU.skU_Code = rowSku
                                                    .SKU_CODE
                                            tempSKU.skU_Name = rowSku
                                                    .SKU_NAME
                                            tempSKU.uniT_PRICE = rowSku
                                                    .TRADE_PRICE
                                            tempSKU.quantity = myPromotions2
                                                    .quantity
                                            tempSKU.gsT_RATE = rowSku
                                                    .GST_RATE
                                            tempSKU.amount = rowSku
                                                    .TRADE_PRICE * tempSKU.quantity
                                            tempSKU.gsT_AMOUNT = 0.0
                                            tempSKU.tsT_AMOUNT = 0.0
                                            tempSKU.weight = rowSku.WEIGHT.toDouble()
                                            tempSKU.uoM_DESC = rowSku.UOM_DESC
                                            if (myPromotions2
                                                            .skuOfferTypeID == 0)
                                            // Trade
                                            // offer
                                            {
                                                tempSKU.quantity_TO = myPromotions2
                                                        .quantity
                                            } else
                                            // Additional
                                            {
                                                tempSKU.quantity_AD = myPromotions2
                                                        .quantity
                                            }
                                            if (rowSku.GST_ON.contains("T")) {
                                                tempSKU.gsT_AMOUNT = (rowSku
                                                        .GST_RATE / 100
                                                        * rowSku.TRADE_PRICE
                                                        * myPromotions2
                                                        .quantity.toDouble())
                                            } else if (rowSku.GST_ON.contains("R")) {
                                                tempSKU.tsT_AMOUNT = rowSku
                                                        .GST_RATE * tempSKU.quantity
                                            }
                                            if (DistributorTypeID == 6 || DistributorTypeID == 9)
                                            // If
                                            // Location
                                            // Type
                                            // is
                                            // 6=Distributor
                                            // or
                                            // 9=Regional
                                            // Distributor
                                            {
                                                if (IsDistributorRegister == 1)
                                                // If
                                                // Location
                                                // is
                                                // Register
                                                {
                                                    if (rowSku.GST_ON.contains("T")) {
                                                        tempSKU.extra_tax = tempSKU
                                                                .amount * rowSku.EXTR_Tax / 100
                                                    }
                                                }
                                            }
                                            tempSKU.promotioN_ID = myPromotions2
                                                    .promotioN_ID
                                            tempSKU.baskeT_ID = myPromotions2
                                                    .baskeT_ID
                                            tempSKU.baskeT_DETAIL_ID = myPromotions2
                                                    .baskeT_DETAIL_ID
                                            tempSKU.promotioN_OFFER_ID = myPromotions2
                                                    .promotioN_OFFER_ID
                                            ObjFreeGSTAmount += tempSKU
                                                    .gsT_AMOUNT
                                            ObjFreeTST += tempSKU
                                                    .tsT_AMOUNT
                                            ObjFreeExtra_Tax += tempSKU
                                                    .extra_tax

                                            dtFree.add(tempSKU)
                                        } else
                                        // Update
                                        {
                                            val rowUpdateSku = dtFree[Row_Id]
                                            ObjFreeGSTAmount = ObjFreeGSTAmount - rowUpdateSku
                                                    .gsT_AMOUNT
                                            ObjFreeTST = ObjFreeTST - rowUpdateSku
                                                    .tsT_AMOUNT
                                            ObjFreeExtra_Tax = ObjFreeExtra_Tax - rowUpdateSku
                                                    .extra_tax

                                            rowUpdateSku.quantity = rowUpdateSku
                                                    .quantity + myPromotions2
                                                    .quantity
                                            rowUpdateSku.amount = rowSku
                                                    .TRADE_PRICE * rowUpdateSku
                                                    .quantity
                                            rowUpdateSku.gsT_AMOUNT = 0.0
                                            rowUpdateSku.tsT_AMOUNT = 0.0
                                            if (myPromotions2
                                                            .skuOfferTypeID == 0)
                                            // Trade
                                            // offer
                                            {
                                                rowUpdateSku.quantity_TO = rowUpdateSku
                                                        .quantity_TO + myPromotions2
                                                        .quantity
                                            } else
                                            // Additional
                                            {
                                                rowUpdateSku.quantity_AD = rowUpdateSku
                                                        .quantity_AD + myPromotions2
                                                        .quantity
                                            }

                                            if (rowSku.GST_ON.contains("T")) {
                                                rowUpdateSku.gsT_AMOUNT = (rowSku
                                                        .GST_RATE / 100
                                                        * rowSku.TRADE_PRICE
                                                        * myPromotions2
                                                        .quantity.toDouble())
                                            } else if (rowSku.GST_ON.contains("R")) {
                                                rowUpdateSku.tsT_AMOUNT = rowSku
                                                        .GST_RATE * rowUpdateSku
                                                        .quantity
                                            }

                                            if (DistributorTypeID == 6 || DistributorTypeID == 9)
                                            // If
                                            // Location
                                            // Type
                                            // is
                                            // 6=Distributor
                                            // or
                                            // 9=Regional
                                            // Distributor
                                            {
                                                if (IsDistributorRegister == 1)
                                                // If
                                                // Location
                                                // is
                                                // Register
                                                {
                                                    if (rowSku.GST_ON.contains("T")) {
                                                        rowUpdateSku.extra_tax = rowUpdateSku
                                                                .amount * rowSku.EXTR_Tax / 100
                                                    }
                                                }
                                            }
                                            rowUpdateSku.promotioN_ID = myPromotions2
                                                    .promotioN_ID
                                            rowUpdateSku.baskeT_ID = myPromotions2
                                                    .baskeT_ID
                                            rowUpdateSku.baskeT_DETAIL_ID = myPromotions2
                                                    .baskeT_DETAIL_ID
                                            rowUpdateSku.promotioN_OFFER_ID = myPromotions2
                                                    .promotioN_OFFER_ID
                                            ObjFreeGSTAmount += rowUpdateSku
                                                    .gsT_AMOUNT
                                            ObjFreeTST += rowUpdateSku
                                                    .tsT_AMOUNT
                                            ObjFreeExtra_Tax += rowUpdateSku
                                                    .extra_tax
                                        }
                                        LoadFreeSKU(dtFree)
                                    }
                                }
                            }
                        }
                    } else {
                        // Slab on Group
                        if (myPromotions2.FreeSKUID > 0) { // Free SKU
                            val dtsku = SamsApplication.getDB().SKUDao().getAll(myPromotions2.FreeSKUID)
//                                    dbhelper.getSKU(myPromotions2.freeSKUID)
                            if (dtsku.isNotEmpty()) {
                                val rowSku = dtsku.get(0)
                                mGSTPrice = rowSku.TRADE_PRICE
                                tempSKU = dtFreeSKUDetail()
                                val Row_Id = FreeSKUExist(dtFree,
                                        myPromotions2.FreeSKUID)
                                if (Row_Id < 0)
                                // Add
                                {
                                    tempSKU.skU_ID = rowSku.SKU_ID
                                    tempSKU.master_SKU_ID = rowSku.SKU_ID
                                    tempSKU.skU_Code = rowSku.SKU_CODE
                                    tempSKU.skU_Name = rowSku.SKU_NAME
                                    tempSKU.uniT_PRICE = rowSku
                                            .TRADE_PRICE
                                    tempSKU.quantity = myPromotions2
                                            .quantity
                                    tempSKU.gsT_RATE = rowSku.GST_RATE
                                    tempSKU.amount = rowSku.TRADE_PRICE * tempSKU.quantity
                                    tempSKU.gsT_AMOUNT = 0.0
                                    tempSKU.tsT_AMOUNT = 0.0
                                    tempSKU.weight = rowSku.WEIGHT.toDouble()
                                    tempSKU.uoM_DESC = rowSku.UOM_DESC
                                    if (myPromotions2.skuOfferTypeID == 0)
                                    // Trade
                                    // offer
                                    {
                                        tempSKU.quantity_TO = myPromotions2
                                                .quantity
                                    } else
                                    // Additional
                                    {
                                        tempSKU.quantity_AD = myPromotions2
                                                .quantity
                                    }
                                    if (rowSku.GST_ON.contains("T")) {
                                        tempSKU.gsT_AMOUNT = (rowSku
                                                .GST_RATE / 100
                                                * rowSku.TRADE_PRICE
                                                * myPromotions2.quantity.toDouble())
                                    } else if (rowSku.GST_ON.contains("R")) {
                                        tempSKU.tsT_AMOUNT = rowSku
                                                .GST_RATE * tempSKU.quantity
                                    }
                                    if (DistributorTypeID == 6 || DistributorTypeID == 9)
                                    // If
                                    // Location
                                    // Type
                                    // is
                                    // 6=Distributor
                                    // or
                                    // 9=Regional
                                    // Distributor
                                    {
                                        if (IsDistributorRegister == 1)
                                        // If
                                        // Location
                                        // is
                                        // Register
                                        {
                                            if (rowSku.GST_ON.contains("T")) {
                                                tempSKU.extra_tax = tempSKU
                                                        .amount * rowSku.EXTR_Tax / 100
                                            }
                                        }
                                    }
                                    tempSKU.promotioN_ID = myPromotions2
                                            .promotioN_ID
                                    tempSKU.baskeT_ID = myPromotions2
                                            .baskeT_ID
                                    tempSKU.baskeT_DETAIL_ID = myPromotions2
                                            .baskeT_DETAIL_ID
                                    tempSKU.promotioN_OFFER_ID = myPromotions2
                                            .promotioN_OFFER_ID
                                    ObjFreeGSTAmount += tempSKU.gsT_AMOUNT
                                    ObjFreeTST += tempSKU.tsT_AMOUNT
                                    ObjFreeExtra_Tax += tempSKU.extra_tax

                                    dtFree.add(tempSKU)
                                } else
                                // Update
                                {
                                    val rowUpdateSku = dtFree[Row_Id]
                                    ObjFreeGSTAmount = ObjFreeGSTAmount - rowUpdateSku.gsT_AMOUNT
                                    ObjFreeTST = ObjFreeTST - rowUpdateSku.tsT_AMOUNT
                                    ObjFreeExtra_Tax = ObjFreeExtra_Tax - rowUpdateSku.extra_tax

                                    rowUpdateSku.quantity = rowUpdateSku
                                            .quantity + myPromotions2.quantity
                                    rowUpdateSku.amount = rowSku
                                            .TRADE_PRICE * rowUpdateSku.quantity
                                    rowUpdateSku.gsT_AMOUNT = 0.0
                                    rowUpdateSku.tsT_AMOUNT = 0.0
                                    if (myPromotions2.skuOfferTypeID == 0)
                                    // Trade
                                    // offer
                                    {
                                        rowUpdateSku.quantity_TO = rowUpdateSku
                                                .quantity_TO + myPromotions2
                                                .quantity
                                    } else
                                    // Additional
                                    {
                                        rowUpdateSku.quantity_AD = rowUpdateSku
                                                .quantity_AD + myPromotions2
                                                .quantity
                                    }

                                    if (rowSku.GST_ON.contains("T")) {
                                        rowUpdateSku.gsT_AMOUNT = (rowSku
                                                .GST_RATE / 100
                                                * rowSku.TRADE_PRICE
                                                * myPromotions2.quantity)
                                    } else if (rowSku.GST_ON.contains("R")) {
                                        rowUpdateSku.tsT_AMOUNT = rowSku
                                                .GST_RATE * rowUpdateSku.quantity
                                    }

                                    if (DistributorTypeID == 6 || DistributorTypeID == 9)
                                    // If
                                    // Location
                                    // Type
                                    // is
                                    // 6=Distributor
                                    // or
                                    // 9=Regional
                                    // Distributor
                                    {
                                        if (IsDistributorRegister == 1)
                                        // If
                                        // Location
                                        // is
                                        // Register
                                        {
                                            if (rowSku.GST_ON.contains("T")) {
                                                rowUpdateSku.extra_tax = rowUpdateSku
                                                        .amount * rowSku.EXTR_Tax / 100
                                            }
                                        }
                                    }
                                    rowUpdateSku.promotioN_ID = myPromotions2
                                            .promotioN_ID
                                    rowUpdateSku.baskeT_ID = myPromotions2
                                            .baskeT_ID
                                    rowUpdateSku.baskeT_DETAIL_ID = myPromotions2
                                            .baskeT_DETAIL_ID
                                    rowUpdateSku.promotioN_OFFER_ID = myPromotions2
                                            .promotioN_OFFER_ID
                                    ObjFreeGSTAmount += rowUpdateSku
                                            .gsT_AMOUNT
                                    ObjFreeTST += rowUpdateSku.tsT_AMOUNT
                                    ObjFreeExtra_Tax += rowUpdateSku
                                            .extra_tax
                                }
                                LoadFreeSKU(dtFree)
                            }
                        }
                        for (i in myShoping.indices) {
                            val tempObj = myShoping.get(i)
//                            dbhelper = DBHelper(this@OrderSummery)
                            val groupdetail = SamsApplication.getDB().skuGroupDao().getAll(tempObj.sKUID, myPromotions2.group_ID)
//                            val groupdetail = dbhelper.getSKUGroupDetail(tempObj.getSKU_ID(), myPromotions2.group_ID)
                            if (groupdetail.size > 0) {
                                if (myPromotions2.iS_AND == 1) {
                                    if (myPromotions2.offeR_VALUE > 0) {
                                        val Value = tempObj
                                                .quantity + myPromotions2
                                                .offeR_VALUE!!
                                        tempObj.extraDiscount = tempObj
                                                .extraDiscount + Value
                                    }
                                    if (myPromotions2.discount > 0) {
                                        tempObj.extraDiscount = tempObj
                                                .extraDiscount + myPromotions2.discount / 100 * (tempObj.amount - tempObj
                                                .extraDiscount)
                                    }
                                } else {
                                    if (myPromotions2.offeR_VALUE > 0) {
                                        val Value = tempObj
                                                .quantity + myPromotions2
                                                .offeR_VALUE!!
                                        tempObj.standardDiscount = tempObj
                                                .standardDiscount + Value
                                        // Discount Segregation
                                        try {
                                            if (myPromotions2
                                                            .offeR_VALUE_TYPE == 0) {
                                                tempObj.standardDiscountByValueTo = tempObj
                                                        .standardDiscountByValueTo + Value
                                            } else {
                                                tempObj.standardDiscountByValueAd = tempObj
                                                        .standardDiscountByValueAd + Value
                                            }
                                        } catch (e: Exception) {
                                            tempObj.standardDiscountByValueTo = tempObj
                                                    .standardDiscountByValueTo + Value
                                        }

                                    }
                                    if (myPromotions2.discount > 0) {
                                        tempObj.standardDiscountPer = tempObj
                                                .standardDiscountPer + myPromotions2.discount / 100
                                        // Discount Segregation
                                        try {
                                            if (myPromotions2
                                                            .discounT_TYPE == 0) {
                                                tempObj.standardDiscountPerValueTo = tempObj
                                                        .standardDiscountPerValueTo + myPromotions2
                                                        .discount / 100
                                            } else {
                                                tempObj.standardDiscountPerValueAd = tempObj
                                                        .standardDiscountPerValueAd + myPromotions2
                                                        .discount / 100
                                            }
                                        } catch (e: Exception) {
                                            tempObj.standardDiscountPerValueTo = tempObj
                                                    .standardDiscountPerValueTo + myPromotions2
                                                    .discount / 100
                                        }

                                    }
                                }
                            }
                        }
                    }
                }
            }
            for (i in myShoping.indices) {
                val tempObj = myShoping.get(i)
                if (tempObj.OutletID == Customer.outletID) {
                    ObjGrossSales += tempObj.amount
                    tempObj.sedAmountPerValueAd = tempObj
                            .sedAmountPerValueAd * tempObj.amount
                    ObjTotalSED_BY_VALUE_AD = ObjTotalSED_BY_VALUE_AD + tempObj.sedAmountByValueAD
                    ObjTotalSED_PER_VALUE_AD = ObjTotalSED_PER_VALUE_AD + tempObj.sedAmountPerValueAd
                    if (tempObj.skuItem.GST_ON.contains("T")) {
                        tempObj.gSTAmount = tempObj.amount * tempObj.gSTRate / 100
                    } else if (tempObj.skuItem.GST_ON.contains("R")) {
                        tempObj.tSTAmount = tempObj.gSTRate * tempObj.quantity
                    }
                    if (DistributorTypeID == 6 || DistributorTypeID == 9)
                    // If Location Type is
                    // 6=Distributor or
                    // 9=Regional
                    // Distributor
                    {
                        if (IsDistributorRegister == 1)
                        // If Location is
                        // Register
                        {
                            tempObj.gSTAmount = (tempObj.amount - (tempObj
                                    .standardDiscount - (ObjTotalSED_BY_VALUE_AD + ObjTotalSED_PER_VALUE_AD))) * tempObj.gSTRate / 100
                        }
                    }
                    tempObj.extraTax = 0.0
                    // Extra Tax
                    if (DistributorTypeID == 6 || DistributorTypeID == 9)
                    // If Location Type is
                    // 6=Distributor or
                    // 9=Regional
                    // Distributor
                    {
                        if (IsDistributorRegister == 1)
                        // If Location is
                        // Register
                        {
                            if (tempObj.skuItem.GST_ON.contains("T")) {
                                val dtsku = SamsApplication.getDB().SKUDao().getAll(tempObj.sKUID)
//                                        dbhelper.getSKU(tempObj.sKUID)
                                if (dtsku.isNotEmpty()) {
                                    val rowSku = dtsku.get(0)
                                    tempObj.extraTax = tempObj.amount - (tempObj
                                            .standardDiscount - tempObj
                                            .sedAmount) * rowSku.EXTR_Tax / 100
                                    ObjTotalExtra_Tax = ObjTotalExtra_Tax + (tempObj.amount - (tempObj
                                            .standardDiscount - (ObjTotalSED_BY_VALUE_AD + ObjTotalSED_PER_VALUE_AD))) * rowSku.EXTR_Tax / 100
                                }
                            }
                        }
                    }

                    tempObj.standardDiscountByValueAd = tempObj
                            .standardDiscount
                    ObjStandardDiscount_By_VALUE = ObjStandardDiscount_By_VALUE + tempObj.standardDiscount
                    tempObj.standardDiscountPerValue = tempObj
                            .standardDiscountPer * tempObj.amount
                    tempObj.standardDiscount = tempObj.standardDiscount + tempObj.standardDiscountPer * tempObj
                            .amount
                    tempObj.sedAmountPerValueTo = tempObj
                            .sedAmountPerValueTo * tempObj.amount
                    tempObj.standardDiscountPerValueAd = tempObj
                            .standardDiscountPerValueAd * tempObj.amount
                    tempObj.standardDiscountPerValueTo = tempObj
                            .standardDiscountPerValueTo * tempObj.amount
                    tempObj.sedAmountPerValue = tempObj
                            .sedAmountPerValue * tempObj.amount
                    tempObj.sedAmount = tempObj.getCLAIM_PER() * tempObj
                            .amount + tempObj.claimExtraAmount
                    val sed = tempObj.amount * tempObj.gSTRate / 100
                    ObjStandardDiscount = ObjStandardDiscount + tempObj.standardDiscount
                    ObjTotalSED = (ObjTotalSED
                            + tempObj.getCLAIM_PER() * sed
                            + tempObj.claimExtraAmount)
                    ObjTotalSED_BY_VALUE_TO = ObjTotalSED_BY_VALUE_TO + tempObj.sedAmountByValueTo
                    ObjTotalSED_PER_VALUE_TO = ObjTotalSED_PER_VALUE_TO + tempObj.sedAmountPerValueTo
                    ObjStandardDiscount_PER_VALUE = ObjStandardDiscount_PER_VALUE + tempObj.standardDiscountPerValue
                    ObjTotalSED_BY_VALUE = ObjTotalSED_BY_VALUE + tempObj.sedAmountByValue
                    ObjTotalSED_PER_VALUE = ObjTotalSED_PER_VALUE + tempObj.sedAmountPerValue
                    ObjStandardDiscount_By_VALUE_TO = ObjStandardDiscount_By_VALUE_TO + tempObj.standardDiscountByValueTo
                    ObjStandardDiscount_By_VALUE_AD = ObjStandardDiscount_By_VALUE_AD + tempObj.standardDiscountByValueAd
                    ObjStandardDiscount_PER_VALUE_TO = ObjStandardDiscount_PER_VALUE_TO + tempObj.standardDiscountPerValueTo
                    ObjStandardDiscount_PER_VALUE_AD = ObjStandardDiscount_PER_VALUE_AD + tempObj.standardDiscountPerValueAd
                    ObjTotalGST = ObjTotalGST + tempObj.gSTAmount
                    ObjTotalTST = ObjTotalTST + tempObj.tSTAmount
//                    ajeeb c bakwas logic hy
                    tempObj.netAmount = tempObj.amount - tempObj.standardDiscount + tempObj.gSTAmount + tempObj.tSTAmount
                    tempObj.gSTPrice = tempObj.price

                }
            }
            // Insert value to TextBoxes
            summaryUIModel = SummaryUIModel(
                    ObjStandardDiscount - ObjTotalSED,
                    ObjTotalSED_BY_VALUE_AD + ObjTotalSED_PER_VALUE_AD,
                    ObjTotalSED_BY_VALUE_TO + ObjTotalSED_PER_VALUE_TO,
                    ObjGrossSales,
                    ObjTotalGST + ObjTotalExtra_Tax + ObjTotalTST + ObjFreeTST + ObjFreeGSTAmount,
                    ObjGrossSales - ObjStandardDiscount + ObjTotalGST + ObjTotalExtra_Tax + ObjTotalTST + ObjFreeTST + ObjFreeGSTAmount

            )
            liveDate.postValue(summaryUIModel)
            return dtFree
//            etDistributorDiscount.setText("" + String.format("%.2f", ObjStandardDiscount - ObjTotalSED))
//            etCompanyDiscount.setText("" + String.format("%.2f", ObjTotalSED_BY_VALUE_AD + ObjTotalSED_PER_VALUE_AD))
//            tvTradeOffer.setText("" + String.format("%.2f", ObjTotalSED_BY_VALUE_TO + ObjTotalSED_PER_VALUE_TO))
//            grossAmount.setText("" + String.format("%.2f", ObjGrossSales))
//            gst.setText("" + String.format("%.2f", ObjTotalGST + ObjTotalExtra_Tax
//                    + ObjTotalTST + ObjFreeTST + ObjFreeGSTAmount))
//            netAmount.setText("" + String.format("%.2f", ObjGrossSales - ObjStandardDiscount
//                    + ObjTotalGST + ObjTotalExtra_Tax + ObjTotalTST + ObjFreeTST + ObjFreeGSTAmount))
        } catch (e: Exception) {
            e.printStackTrace()
//            Toast.makeText(this@OrderSummery, e.toString(), Toast.LENGTH_LONG)
//                    .show()
            return null
        }

    }

    private fun LoadFreeSKU(dtFree: ArrayList<dtFreeSKUDetail>) {
        // load free SKUs in list
    }

    private fun FreeSKUExist(dt: ArrayList<dtFreeSKUDetail>, Sku_id: Int): Int {
        for (i in dt.indices) {
            val rowFree = dt[i]
            if (rowFree.master_SKU_ID == Sku_id) {
                return i
            }
        }
        return -1
    }

    public fun saveOrderMaster(remarks: String, timeIn: String, timeOut: String,
                               latitude: Double, longitude: Double, images: java.util.ArrayList<String>, paymentType: Int): Long {

        val photoPath1 = if (images.size > 0) images[0] else ""
        val photoPath2 = if (images.size > 1) images[1] else ""
        val photoPath3 = if (images.size > 2) images[2] else ""
        val photoPath4 = if (images.size > 3) images[3] else ""
        val photoPath5 = if (images.size > 4) images[4] else ""

        val master = OrderMaster(
                0,
                login.DistributionID.toInt(),
                0,// principle_id , NO IDEA Why?
                Customer.outletID,
                Customer.townID,
                Customer.sectionID,
                SamsApplication.getDocumentDate(),
                summaryUIModel.grossAmout,
                0.0,// Extra discount
                ObjStandardDiscount,
                summaryUIModel.gst,
                summaryUIModel.netAmount,
                0.0,// SchemeAmount
                0.0,// TstAmount
                ObjTotalSED,// SedAmount
                remarks,
                ObjTotalExtra_Tax,// ExtraTax
                ObjStandardDiscount_By_VALUE,// Standard_Discount_By_Value
                ObjStandardDiscount_PER_VALUE,// Standard_Discount_Per_Value
                ObjTotalSED_BY_VALUE,// Sed_Discount_By_Value
                ObjTotalSED_PER_VALUE,// Sed_Discount_Per_Value
                ObjStandardDiscount_By_VALUE_TO,// Standard_Discount_By_Value_To
                ObjStandardDiscount_By_VALUE_AD,// Standard_Discount_By_Value_Ad
                ObjStandardDiscount_PER_VALUE_TO,// Standard_Discount_Per_Value_To
                ObjStandardDiscount_PER_VALUE_AD,// Standard_Discount_Per_Value_Ad
                ObjTotalSED_BY_VALUE_TO,// Sed_Amount_By_Value_To
                ObjTotalSED_BY_VALUE_AD,// Sed_Amount_By_Value_Ad
                ObjTotalSED_PER_VALUE_TO,// Sed_Amount_Per_Value_To
                ObjTotalSED_PER_VALUE_AD,// Sed_Amount_Per_Value_Ad
                timeIn,
                timeOut,
                Customer.outletID,
                latitude,
                longitude,
                photoPath1,
                photoPath2,
                photoPath3,
                photoPath4,
                photoPath5,
                paymentType,
                0

        )

        val rowId = SamsApplication.getDB().orderMasterDao().insert(master)
        return rowId
    }

    fun saveOrderDetail(orderMasterRowId: Long, distributionID: String, freeSkus: ArrayList<dtFreeSKUDetail>?) {
        val orderList = myShoping
        orderList.forEach {

            val orderDetail = OrderDetail(
                    0,
                    distributionID.toInt(),
                    orderMasterRowId.toInt(),
                    it.sKUID,
                    it.quantity,
                    it.price,
                    it.gSTRate,
                    it.amount,
                    it.standardDiscount,
                    it.extraDiscount,
                    it.gSTAmount,
                    it.netAmount,
                    0.0,
                    it.sedAmount,
                    it.unitInCase,
                    it.extraTax,
                    it.gSTPrice,
                    0.0,
                    it.standardDiscountPerValue,
                    it.sedAmountByValue,
                    it.sedAmountPerValue,
                    it.standardDiscountByValueTo,
                    0.0,
                    it.standardDiscountPerValueTo,
                    it.standardDiscountPerValueAd,
                    it.sedAmountByValueTo,
                    it.sedAmountByValueAD,
                    it.sedAmountPerValueTo,
                    it.sedAmountPerValueAd
            )

            SamsApplication.getDB().orderDetailDao().insert(orderDetail)
        }

        freeSkus?.forEach {
            val orderDetailFreeSKU = OrderDetailFreeSKU(
                    0,
                    distributionID.toInt(),
                    orderMasterRowId.toInt(),
                    0,// scheme_id
                    it.promotioN_ID,
                    it.baskeT_ID,
                    it.baskeT_DETAIL_ID,
                    it.promotioN_OFFER_ID,
                    it.skU_ID,
                    it.quantity,
                    it.uniT_PRICE,
                    it.amount,
                    it.gsT_RATE,
                    it.gsT_AMOUNT,
                    it.tsT_AMOUNT,
                    0.0,
                    it.master_SKU_ID,
                    it.extra_tax,
                    it.quantity_TO,
                    it.quantity_AD

            )
            SamsApplication.getDB().orderDetailFreeSkusDao().insert(orderDetailFreeSKU)
        }
    }

}