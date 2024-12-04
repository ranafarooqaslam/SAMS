package com.fastservices.sams.modules.takeorder

import androidx.lifecycle.MutableLiveData
import androidx.databinding.ObservableField
import android.location.Location
import android.util.Log
import android.view.View
import com.fastservices.sams.SamsApplication
import com.fastservices.sams.data.entities.*
import com.fastservices.sams.data.entities.promotions.dtFreeSKUDetail
import com.fastservices.sams.data.models.SummaryUIModel
import com.fastservices.sams.data.repos.*
import com.fastservices.sams.modules.base.BaseVM
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class OrderVM() : BaseVM() {

    val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault())

    val timeIn: String = sdf.format(Date())

    val summaryModelLiveData = MutableLiveData<SummaryUIModel>()

    var comments = ""

    var categoryId: Int? = null

    val dataListUpdated = MutableLiveData<Boolean>()

    var outlet: Outlet? = null

    val toggleDetailLayout = ObservableField<Int>(View.GONE)

    var categories = ArrayList<Category>()

    var selectedReasonId: Int = -1

    val dataLoaded = MutableLiveData<Boolean>()

    private lateinit var allCategories: List<Category>

    val categoriesLoaded = MutableLiveData<Boolean>()

    val appSettingData = MutableLiveData<Boolean>(false)

    val showEmptyView = MutableLiveData<Boolean>()

    val optionSelected = MutableLiveData<Int>(1) // 1 for order, 2 for no order

    private lateinit var SKUs: List<SKU>

    val orderList = ArrayList<OrderItem>()

    val summaryClicked = MutableLiveData<Boolean>()

    val grossAmountObservable = MutableLiveData<String>()

    val totalUnitsObservable = MutableLiveData<Int>()

    val totalCartonssObservable = MutableLiveData<Int>()

    var searchQuery = ""

    var ascending = ObservableField<Boolean>(false)

    val images = ArrayList<String>()

    var files = arrayOf("","","","","")

    var latitude: Double = 0.0

    var longtidue: Double = 0.0

    var paymentType: Int = 0

    val dataInserted = MutableLiveData<Boolean>()

    lateinit var reasons: List<NoOrderReason>

    init {
        GlobalScope.launch {
            val user = SamsApplication.getPreferenceManager().getUser()
            SKUs = RepoSKU(user!!).getAllSKUs()
            allCategories = RepoSKUCategory(user).getCategoriesLocal()
            categories.addAll(allCategories)
            val appSettings = RepoAppSetting(user).getSetting()
            if(appSettings.isNotEmpty()) {
                withContext(Dispatchers.Main) {
                    appSettingData.postValue(appSettings[0].isManualDiscount == 1)
                }
            }
            categoriesLoaded.postValue(true)
            showEmptyView.postValue(allCategories.isEmpty())
            reasons = RepoNoOrderReason().getAll()
            dataLoaded.postValue(true)
        }
    }

    fun containsAnyOrder() = orderList.isNotEmpty()

    fun getOrders() = orderList

    fun submitNoOrder() {

        if(selectedReasonId == -1) {
            errorLiveData.postValue("Select any reason")
            return
        }

        if(longtidue == 0.0 || latitude == 0.0) {
            errorLiveData.postValue("Location not selected. Press Take GPS button")
            return
        }
        var pictureTaken = false
        for(i in 0 until files.size) {
            if(files[i].isNotEmpty()) {
                pictureTaken = true
                break
            }
        }
        if(!pictureTaken) {
            errorLiveData.postValue("Please take at least one picture.")
            return
        }

        if (selectedReasonId != -1) {
            GlobalScope.launch {
                val item = NoOrderItem(outlet?.outletID!!, outlet?.sectionID.toString(),
                    SamsApplication.getDocumentDate(), selectedReasonId.toString(),
                    timeIn, sdf.format(Date()), comments,latitude,longtidue,
                    files[0], files[1], files[2], files[3], files[4])

                RepoNoOrder(SamsApplication.getPreferenceManager().getUser()).insertItem(item)
                dataInserted.postValue(true)
            }
        }
    }

    fun orderSummaryClicked() {
        if(optionSelected.value == 2) {
            submitNoOrder()
        }
        else {
           // errorLiveData.postValue("outlet Radius= "+ (outlet?.radius ?:0 ))
            Log.d("orderSummary", ("orderSummaryClicked: Radius: " + outlet?.radius) ?: 99.toString())
            Log.d("orderSummary",
                ("orderSummaryClicked: Radius: " + outlet?.validateRadius) ?: 99.toString()
            )
            if (latitude == 0.0 || longtidue == 0.0) {
                errorLiveData.postValue("Location not set. Please tap on Take GPS")
                return
            }

            if(outlet!!.validateRadius==1) {
                var currentLocation = Location("")
                currentLocation.latitude = latitude
                currentLocation.longitude = longtidue

                var outletLocation = Location("")
                outletLocation.latitude = outlet!!.latitude
                outletLocation.longitude = outlet!!.longtidue

                var distance = currentLocation.distanceTo(outletLocation);
                if (distance < outlet!!.radius) {
                    Log.d("LocationCheck", "orderSummaryClicked: Within Radius")
                }
                else {
                    errorLiveData.postValue("You are not within allowed radius of your outlet. To take order please make sure you are in your outlet.")
                    return
                }
            }

            if (images.isEmpty()) {
                errorLiveData.postValue("Take at least one image to proceed")
                return
            }

            if (orderList.isNotEmpty())
                summaryClicked.postValue(true)
            else
                errorLiveData.postValue("No Items selected")
        }
    }

    private var promotionHelper: PromotionCalculatorUpdated? = null

    private var freeSkus: java.util.ArrayList<dtFreeSKUDetail>? = null

    fun collapseClicked() {
        if (toggleDetailLayout.get() == View.VISIBLE) {
            toggleDetailLayout.set(View.GONE)
        }
        else {
            toggleDetailLayout.set(View.VISIBLE)
        }
    }

    fun applyFilter(q: String) {
        categories.clear()
        categories.addAll(
            allCategories.filter {
                it.SKU_HIE_NAME.contains(q, true)
            }
        )
        categoriesLoaded.postValue(true)
    }

    fun sorting() {
        if (ascending.get() == true) {
            ascending.set(false)
            categories.sortBy {
                it.SKU_HIE_NAME
            }
        }
        else {
            ascending.set(true)
            categories.sortByDescending {
                it.SKU_HIE_NAME
            }
        }
        categoriesLoaded.postValue(true)
    }

    fun imageTaken(fileUri: String?) {
        fileUri?.let { images.add(it) }
    }

    fun addOrderItem(sku: SKU, unit: Int, carton: Int, discount: Int) {
        sku.SPECIAL_DISCOUNT = discount
        val orderItem = OrderItem(sku, outlet?.outletID ?: 0)
        val find = orderList.find { it.sKUID == sku.SKU_ID }
        find?.let {
            orderList.remove(it)
        }
        if (unit > 0 || carton > 0)
            orderList.add(orderItem)
        calculateGrossAmount()
    }

    fun removeOrderItem(item: OrderItem): Int {
        val index = orderList.indexOf(item)
        val deleted = orderList.removeAt(index)
        deleted.skuItem.NO_OF_UNITS = 0
        deleted.skuItem.NO_OF_CARTONS = 0
        calculateGrossAmount()
        return index
    }

    private fun calculateGrossAmount() {
        var result = 0.0
        var units = 0
        var cartons = 0
        orderList.forEach {
            result += it.amount
            units += it.skuItem.NO_OF_UNITS
            cartons += it.skuItem.NO_OF_CARTONS
        }
        grossAmountObservable.postValue(DecimalFormattedAmount(RoundUp2Decimal(result).toDouble()))
        totalUnitsObservable.postValue(units)
        totalCartonssObservable.postValue(cartons)
    }

    fun getSkuList(category_id: Int): List<SKU> {
        // filter skus by Category Id
        return SKUs.filter { it.CATEGORY_ID == category_id }
    }

    fun updateSKU(sku: SKU, units: Int, cartons: Int, discount: Int) {
        SKUs.find { it.SKU_ID == sku.SKU_ID }?.apply {
            NO_OF_UNITS = units
            NO_OF_CARTONS = cartons
            SPECIAL_DISCOUNT = discount?:0
        }
        dataListUpdated.postValue(true)
    }

    fun paymentTypeCredit() {
        paymentType = 1
    }

    fun paymentTypeCash() {
        paymentType = 0
    }

    var freeSKusLoaded = MutableLiveData<List<dtFreeSKUDetail>>()

    fun performCalculations() {
        GlobalScope.launch(Dispatchers.IO) {
            val user = SamsApplication.getPreferenceManager().getUser() ?: return@launch
            val gson = Gson()
            val json = gson.toJson(getOrders())
            val type = object: TypeToken<ArrayList<OrderItem>>() {}.type
            val list = gson.fromJson(json, type) as ArrayList<OrderItem>
            promotionHelper = PromotionCalculatorUpdated(user, summaryModelLiveData, ArrayList<OrderItem>(list), outlet!!)
            freeSkus = promotionHelper?.GetPromotion()
            freeSKusLoaded.postValue(freeSkus)
        }
    }

    var remarks = ""
    var orderSavedLiveData = MutableLiveData<Boolean>()

    fun saveOrderNow() {
        val timeOut = sdf.format(Date())

        GlobalScope.launch {
            val user = SamsApplication.getPreferenceManager().getUser() ?: return@launch

            showLoader.postValue(true)
            val orderMasterRowId = promotionHelper?.saveOrderMaster(remarks, timeIn, timeOut, latitude, longtidue, images, paymentType)
            if (orderMasterRowId == null || orderMasterRowId == -1L) {
                errorLiveData.postValue("Error while saving Order Master")
            }
            else {
                promotionHelper?.saveOrderDetail(orderMasterRowId, user.DistributionID, freeSkus)
                orderSavedLiveData.postValue(true)
            }
            showLoader.postValue(false)
        }
    }

    fun removeFileUri(uri: String) {
        images.remove(uri)
    }

    var skuAdapterDataList :ArrayList<SKU> = ArrayList<SKU>()

    fun loadSKUs() {
        searchQuerySKU.set("")
        applySKUFilter("")
    }

    val searchQuerySKU: ObservableField<String> = ObservableField<String>()

    fun applySKUFilter(input: String) {
        skuAdapterDataList.clear()

        skuAdapterDataList.addAll(
            SKUs.filter {
                (it.CATEGORY_ID == categoryId && it.SKU_NAME.contains(input, true))
            }
        )
        dataListUpdated.postValue(true)
    }

    fun imageTakenNoOrder(fileUri: String?) {
        fileUri ?: return
        for(i in 0 until 5) {
            if(files[i].isEmpty()) {
                files[i] = fileUri
                break
            }
        }
    }
}