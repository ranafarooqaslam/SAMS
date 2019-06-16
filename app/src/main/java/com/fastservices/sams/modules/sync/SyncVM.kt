package com.fastservices.sams.modules.sync

import android.arch.lifecycle.MutableLiveData
import com.fastservices.sams.SamsApplication
import com.fastservices.sams.data.entities.Replacement
import com.fastservices.sams.data.models.PostBodyOrder
import com.fastservices.sams.data.models.google.*
import com.fastservices.sams.data.repos.*
import com.fastservices.sams.data.repos.promotions.*
import com.fastservices.sams.modules.base.BaseVM
import com.fastservices.sams.network.GoogleWebService
import com.google.gson.Gson
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import okhttp3.MediaType
import okhttp3.RequestBody
import java.io.File


class SyncVM() : BaseVM() {


    var googleService: GoogleWebService? = null

    val syncStatus = MutableLiveData<String>()

    val syncLogger = MutableLiveData<String>()


    fun startSyncData() {

        syncStatus.postValue("start")
        uploadData()

    }


    private fun uploadData() {
        showLoader.postValue(true)

        GlobalScope.launch {
            try {
                syncLogger.postValue("Uploading...")
                delay(1000)
                val gson = Gson()

                val user = SamsApplication.getPreferenceManager().getUser()
                if (user != null) {

                    val outlets = SamsApplication.getDB().outletLocalDao().getAll()
                    var files = arrayListOf<String>()
                    outlets.forEach {
                        if (it.PhotoPath1.isNotEmpty()) it.PhotoPath1 = addTofiles(files, it.PhotoPath1)
                        if (it.PhotoPath2.isNotEmpty()) it.PhotoPath2 = addTofiles(files, it.PhotoPath2)
                        if (it.PhotoPath3.isNotEmpty()) it.PhotoPath3 = addTofiles(files, it.PhotoPath3)
                        if (it.PhotoPath4.isNotEmpty()) it.PhotoPath4 = addTofiles(files, it.PhotoPath4)
                        if (it.PhotoPath5.isNotEmpty()) it.PhotoPath5 = addTofiles(files, it.PhotoPath5)

                    }

                    val auth = updateToken()
                    if (auth == null) {
                        errorLiveData.postValue("Auth error: Unable to upload photos")
                    }

                    try {
                        uploadFilesToDrive(files, auth)
                    } catch (e: Exception) {
                        e.printStackTrace()

                    }

                    if (outlets.isNotEmpty()) {
                        var names = ""
                        outlets.forEach { names = names.plus(it.OutletName).plus(" ") }
                        syncLogger.postValue("Inserting Outlet ${names}...")
                        val response = SamsApplication.getWebService().insertOutlet(user.DistributionID, user.UserId, outlets).await()
                        if (response.Satus.equals("Error")) {
                            errorLiveData.postValue(response.Message)
                            showLoader.postValue(false)
                            return@launch
                        } else {
                            SamsApplication.getDB().outletLocalDao().deleteAll()

                        }
                    }


                    val merchandises = SamsApplication.getDB().merchandiseDao().getAll()
                    files.clear()
                    merchandises.forEach {
                        if (!it.Image1Path1.isNullOrBlank()) it.Image1Path1 = addTofiles(files, it.Image1Path1)
                        if (!it.Image1Path2.isNullOrBlank()) it.Image1Path2 = addTofiles(files, it.Image1Path2)
                        if (!it.Image1Path3.isNullOrBlank()) it.Image1Path3 = addTofiles(files, it.Image1Path3)
                        if (!it.Image1Path4.isNullOrBlank()) it.Image1Path4 = addTofiles(files, it.Image1Path4)
                        if (!it.Image1Path5.isNullOrBlank()) it.Image1Path5 = addTofiles(files, it.Image1Path5)

                        if (!it.Image2Path1.isNullOrBlank()) it.Image2Path1 = addTofiles(files, it.Image2Path1)
                        if (!it.Image2Path2.isNullOrBlank()) it.Image2Path2 = addTofiles(files, it.Image2Path2)
                        if (!it.Image2Path3.isNullOrBlank()) it.Image2Path3 = addTofiles(files, it.Image2Path3)
                        if (!it.Image2Path4.isNullOrBlank()) it.Image2Path4 = addTofiles(files, it.Image2Path4)
                        if (!it.Image2Path5.isNullOrBlank()) it.Image2Path5 = addTofiles(files, it.Image2Path5)


                    }

                    try {

                        uploadFilesToDrive(files, auth)
                    } catch (e: Exception) {
                        e.printStackTrace()
                        errorLiveData.postValue("Auth error: Unable to upload photos")
                    }

                    if (!merchandises.isNullOrEmpty()) {
                        syncLogger.postValue("Inserting merchandizings...")

                        val response = SamsApplication.getWebService().insertMerchandising(user.DistributionID, user.UserId, merchandises).await()
                        if (response.Satus.equals("Error")) {
                            errorLiveData.postValue(response.Message)
                            showLoader.postValue(false)
                            return@launch
                        } else {
                            SamsApplication.getDB().merchandiseDao().deleteAll()
                        }
                    }

                    val outletComplaints = SamsApplication.getDB().outletComplaintsDao().getAllComplaintReasons()
                    if (outletComplaints.isNotEmpty()) {
                        syncLogger.postValue("Inserting complaints...")
                        val response = SamsApplication.getWebService().insertOutletComplaint(user.DistributionID, user.UserId, outletComplaints).await()

                        if (response.Satus.equals("OK")) {
                            // complaints posted
                            SamsApplication.getDB().outletComplaintsDao().deleteAll()
                        } else {
                            syncLogger.postValue("Error inserting complaints")
                        }

                    }


                    // post orders
                    val orderMasters = SamsApplication.getDB().orderMasterDao().getAllNonSync()
                    files.clear()
                    orderMasters.forEach { item ->
                        if (item.PHOTO_PATH1.isNotEmpty()) item.PHOTO_PATH1 = addTofiles(files, item.PHOTO_PATH1)
                        if (item.PHOTO_PATH2.isNotEmpty()) item.PHOTO_PATH2 = addTofiles(files, item.PHOTO_PATH2)
                        if (item.PHOTO_PATH3.isNotEmpty()) item.PHOTO_PATH3 = addTofiles(files, item.PHOTO_PATH3)
                        if (item.PHOTO_PATH4.isNotEmpty()) item.PHOTO_PATH4 = addTofiles(files, item.PHOTO_PATH4)
                        if (item.PHOTO_PATH5.isNotEmpty()) item.PHOTO_PATH5 = addTofiles(files, item.PHOTO_PATH5)
                    }

                    try {
                        if (files.size > 0) syncLogger.postValue("Uploading order photos...")

                        uploadFilesToDrive(files, auth)
                    } catch (e: Exception) {
                        e.printStackTrace()
                        errorLiveData.postValue("Auth error: Unable to upload photos")
                    }


                    orderMasters.forEach {

                        val orderDetails = SamsApplication.getDB().orderDetailDao().getAllOdersByMasterId(it.SALE_ORDER_ID)
                        val orderDetailsFreeSkU = SamsApplication.getDB().orderDetailFreeSkusDao().getAllFreeSKUByMasterId(it.SALE_ORDER_ID)
                        val body = PostBodyOrder(orderDetails, orderDetailsFreeSkU)
                        syncLogger.postValue("Inserting order master...")
                        val responseInsertOrder = SamsApplication.getWebService().insertOrder(body,
                                it.DISTRIBUTOR_ID.toString(),
                                it.OUTLET_ID.toString(),// outlet Id
                                it.TOWN_ID.toString(),
                                it.AREA_ID.toString(),
                                user.UserId,
                                it.TOTAL_AMOUNT.toString(),
                                it.EXTRA_DISCOUNT_AMOUNT.toString(),
                                it.STANDARD_DISCOUNT_AMOUNT.toString(),
                                it.GST_AMOUNT.toString(),
                                it.TOTAL_NET_AMOUNT.toString(),
                                it.DOCUMENT_DATE,
                                it.REMARKS,
                                it.TIME_IN,
                                it.TIME_OUT,
                                it.SCHEME_AMOUNT.toString(),
                                it.TST_AMOUNT.toString(),
                                it.SED_AMOUNT.toString(),
                                it.EXTRA_TAX.toString(),
                                it.STANDARD_DISCOUNT_BY_VALUE.toString(),
                                it.STANDARD_DISCOUNT_PER_VALUE.toString(),
                                it.SED_AMOUNT_BY_VALUE.toString(),//SedDiscountByValue
                                it.SED_AMOUNT_PER_VALUE.toString(),//SedDiscountPerValue
                                it.STANDARD_DISCOUNT_BY_VALUE_TO.toString(),
                                it.STANDARD_DISCOUNT_BY_VALUE_AD.toString(),
                                it.STANDARD_DISCOUNT_PER_VALUE_TO.toString(),
                                it.STANDARD_DISCOUNT_PER_VALUE_AD.toString(),
                                it.SED_AMOUNT_BY_VALUE_TO.toString(),
                                it.SED_AMOUNT_BY_VALUE_AD.toString(),
                                it.SED_AMOUNT_PER_VALUE_TO.toString(),
                                it.SED_AMOUNT_PER_VALUE_AD.toString(),
                                it.LATITUDE,
                                it.LONGITUDE,
                                it.PHOTO_PATH1,
                                it.PHOTO_PATH2,
                                it.PHOTO_PATH3,
                                it.PHOTO_PATH4,
                                it.PHOTO_PATH5,
                                it.ORDER_PAYMENT_TYPE
                        ).await()
//                      {
//                          "Message": "Order Inserted.",
//                          "Satus": "OK"
//                      }

                        if (responseInsertOrder.Satus?.equals("OK") == true) {
                            // order inserted
                            SamsApplication.getDB().orderMasterDao().delete(it)
                            SamsApplication.getDB().orderDetailDao().delete(orderDetails)
                            SamsApplication.getDB().orderDetailFreeSkusDao().delete(orderDetailsFreeSkU)

                        }


                    }

                    val noOrder = RepoNoOrder(user).getAll()
                    files.clear()
                    noOrder.forEach { item ->
                        if (item.photoPath1.isNotEmpty()) item.photoPath1 = addTofiles(files, item.photoPath1)
                        if (item.photoPath2.isNotEmpty()) item.photoPath2 = addTofiles(files, item.photoPath2)
                        if (item.photoPath3.isNotEmpty()) item.photoPath3 = addTofiles(files, item.photoPath3)
                        if (item.photoPath4.isNotEmpty()) item.photoPath4 = addTofiles(files, item.photoPath4)
                        if (item.photoPath5.isNotEmpty()) item.photoPath5 = addTofiles(files, item.photoPath5)
                    }
                    try {
                        if (files.size > 0) syncLogger.postValue("Uploading no order photos...")

                        uploadFilesToDrive(files, auth)
                    } catch (e: Exception) {
                        e.printStackTrace()
                        errorLiveData.postValue("Auth error: Unable to upload photos")
                    }

                    if(noOrder.isNotEmpty()){
                        syncLogger.postValue("Inserting no orders...")
                        noOrder.forEach {it->
                            val response = SamsApplication.getWebService().insertNoOrder(user.DistributionID,user.UserId,it).await()
                            if (response.Satus.equals("OK")) {

                                SamsApplication.getDB().noOrderDao().delete(it)
                            }
                        }

                    }

                    val stockPositionMaster = SamsApplication.getDB().stockPositioningMasterDao().getAllNonSync()
                    stockPositionMaster.forEach {
                        syncLogger.postValue("Inserting stock position...")
                        val stocks = SamsApplication.getDB().stockPostioningDao().getAll(it.OUTLET_ID)
                        val response = SamsApplication.getWebService().insertStockPositioning(user.DistributionID, user.UserId, it.OUTLET_ID.toString(), SamsApplication.getDocumentDate(), stocks).await()
                        if (response.Satus.equals("OK")) {

                            SamsApplication.getDB().stockPositioningMasterDao().delete(it)
                            SamsApplication.getDB().stockPostioningDao().delete(stocks)
                        }
                    }

                    val replacements = SamsApplication.getDB().replacementDao().getAll()
                    files.clear()
                    replacements.forEach { item ->
                        if (item.InvoiceImage1.isNotEmpty()) item.InvoiceImage1 = addTofiles(files, item.InvoiceImage1)
                        if (item.InvoiceImage2.isNotEmpty()) item.InvoiceImage2 = addTofiles(files, item.InvoiceImage2)
                        if (item.InvoiceImage3.isNotEmpty()) item.InvoiceImage3 = addTofiles(files, item.InvoiceImage3)
                        if (item.InvoiceImage4.isNotEmpty()) item.InvoiceImage4 = addTofiles(files, item.InvoiceImage4)
                        if (item.InvoiceImage5.isNotEmpty()) item.InvoiceImage5 = addTofiles(files, item.InvoiceImage5)

                        if (item.StockImage1.isNotEmpty()) item.StockImage1 = addTofiles(files, item.StockImage1)
                        if (item.StockImage2.isNotEmpty()) item.StockImage2 = addTofiles(files, item.StockImage2)
                        if (item.StockImage3.isNotEmpty()) item.StockImage3 = addTofiles(files, item.StockImage3)
                        if (item.StockImage4.isNotEmpty()) item.StockImage4 = addTofiles(files, item.StockImage4)
                        if (item.StockImage5.isNotEmpty()) item.StockImage5 = addTofiles(files, item.StockImage5)
                    }

                    try {
                        if (files.size > 0) syncLogger.postValue("Uploading replacement photos...")

                        uploadFilesToDrive(files, auth)
                    } catch (e: Exception) {
                        e.printStackTrace()
                        errorLiveData.postValue("Auth error: Unable to upload photos")
                    }

                    if (replacements.isNotEmpty()) {
                        replacements.forEach {
                            syncLogger.postValue("Inserting replacement...")
                            val response = SamsApplication.getWebService().insertReplacement(user.DistributionID, user.UserId,
                                    it.outletId, it.ReplacementTypeID, SamsApplication.getDocumentDate(), listOf(it)).await()
                            if (response.Satus.equals("OK")) {
                                SamsApplication.getDB().replacementDao().delete(it)
                            }
                        }

                    }


                }
                syncLogger.postValue("Uploading data completed...\n")
                downloadData()

            } catch (e: Throwable) {
                e.printStackTrace()
                handleError(e)
                showLoader.postValue(false)
                syncStatus.postValue("error")
            }
        }

    }

    private suspend fun updateToken(): GoogleAuth? {
        val auth = googleService?.refeshToken("application/x-www-form-urlencoded",
                client_secret, grant_type, refresh_token, client_id)?.await()

        return auth
    }

    private fun deleteFiles(files: ArrayList<String>) {
        files.forEach {
            val f = File(it)
            if (f.exists()) {
                f.delete()
                if (f.exists()) {
                    f.canonicalFile.delete()
                }

            }
        }
    }

    private suspend fun uploadFilesToDrive(files: List<String>, auth: GoogleAuth?) {

        if (auth == null) return

        files.forEachIndexed { index, it ->
            syncLogger.postValue("Uploading Image...")
            val file = File(it)
            val name = file.name.replace("jpg", "jpeg")
            val body = PostBodyFile(name, "image/jpeg", "sams outlet file")
            val fileMetaResponse = googleService?.postFileInfo("${auth.token_type} ${auth.access_token}", "application/json", body)?.await()
                    ?: return

            val requestFile = RequestBody.create(MediaType.parse("image/*"), file)
            val response = googleService?.postFileContent("${auth.token_type} ${auth.access_token}", "image/jpeg", fileMetaResponse.id, "media", requestFile)?.await()

        }
    }

    private fun addTofiles(files: ArrayList<String>, path: String?): String {
        path ?: return ""
        files.add(path)

        return File(path).name
    }


    private fun downloadData() {
        showLoader.postValue(true)
        GlobalScope.launch {

            try {
                syncLogger.postValue("Downloading...")
                delay(1000)
                val user = SamsApplication.getPreferenceManager().getUser()
//                user?.UserId = "478"
//                user?.DistributionID = "1"
                if (user != null) {

                    syncLogger.postValue("Downloading menu...")
                    RepoMenu(user).loadAndSaveMenu()


                    syncLogger.postValue("Downloading outlets...")
                    RepoOutlet(user).syncDownOutlets()

                    syncLogger.postValue("Downloading sections...")
                    RepoSection(user).syncDownSections()

                    syncLogger.postValue("Downloading channels...")
                    RepoChannel(user).syncDownChannels()

                    syncLogger.postValue("Downloading complaint reasons...")
                    RepoComplaints(user).syncDownComplaints()

                    syncLogger.postValue("Downloading replacement reasons...")
                    RepoReplacementReason(user).syncDown()

                    syncLogger.postValue("Downloading categories...")
                    RepoSKUCategory(user).syncDownCategoies()

                    syncLogger.postValue("Downloading no-order reasons...")
                    RepoNoOrderReason().syncDownData()

                    syncLogger.postValue("Downloading promotions data...")
                    syncLogger.postValue("Downloading baskets...")
                    RepoBasketDetail(user).syncDown()
                    syncLogger.postValue("Downloading basket master...")
                    RepoBasketMaster(user).syncDown()
                    syncLogger.postValue("Downloading promotions customer type...")
                    RepoPromotionCustomerType(user).syncDown()
                    syncLogger.postValue("Downloading promotions promotion offers...")
                    RepoPromotionOffer(user).syncDown()
                    syncLogger.postValue("Downloading promotions SKU Groups...")
                    RepoSKUGroup(user).syncDown()
                    syncLogger.postValue("Downloading promotions list..")
                    RepoPromotions(user).syncDown()
                    syncLogger.postValue("Downloading promotions value class...")
                    RepoPromotionValueClass(user).syncDown()




                    SamsApplication.getPreferenceManager().updateLastSync()
                    syncLogger.postValue("Downloading completed successfully...")
                    syncStatus.postValue("complete")
                }

            } catch (e: Throwable) {
                e.printStackTrace()
                handleError(e)
            } finally {
                showLoader.postValue(false)
            }
        }

    }
}


