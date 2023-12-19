package com.fastservices.sams.modules.replacement

import androidx.lifecycle.MutableLiveData
import androidx.databinding.ObservableField
import com.fastservices.sams.SamsApplication
import com.fastservices.sams.data.entities.*
import com.fastservices.sams.modules.base.BaseVM
import com.fastservices.sams.modules.stockpositioning.SKUNameID
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.*
import kotlin.collections.ArrayList

class ReplacementVM() : BaseVM() {

    var selectedOutlet: Outlet? = null

    val skusLoaded = MutableLiveData<Boolean>()

    val dataSubmitted = MutableLiveData<Boolean>()

    private var ReplacementTypeID: Int = -1

    var selectedSkuID: Int = -1

    var selectedSkuPrice = 0.0

    var description: String = ""

    var totalPrice = ObservableField<String>()

    var quantity = ObservableField<String>()

    var invoiceNumber = ""

    var batchNumber = ""

    var purchaseDate = ""

    var selectedDate: Date? = null

    val sku = arrayListOf<SKU>()

    var selectedReasonId: Int = -1
    val replacementReasons = ArrayList<ReplacementReason>()

    init {


    }

    fun outletSelected() {

        GlobalScope.launch {
            sku.clear()
            replacementReasons.clear()
            replacementReasons.addAll(SamsApplication.getDB().replacementReasonDao().getAllReasons())
            sku.addAll(SamsApplication.getDB().SKUDao().getAll())
            skusLoaded.postValue(true)
        }


    }

    fun onQuantityTextChanged() {

        val q = quantity.get() ?: ""

        if (q.isNotEmpty() && selectedSkuID != -1) {
            totalPrice.set(DecimalFormattedAmount(q.toInt() * selectedSkuPrice))

        } else {
            totalPrice.set("0.0")
        }
    }

    fun replacementRadioSelected() {
        ReplacementTypeID = 1

    }


    fun damageRadioSelected() {
        ReplacementTypeID = 0

    }

    fun onClickSubmit() {
        if (selectedOutlet == null) {
            errorLiveData.postValue("Select outlet")
            return
        }

        if (selectedSkuID == -1) {
            errorLiveData.postValue("Select SKU to replace")
            return
        }

        if (ReplacementTypeID == -1) {
            errorLiveData.postValue("Please select reason for replacement")
            return
        }

        if (selectedReasonId == -1) {
            errorLiveData.postValue("Select replacement reason")
            return
        }


        if (stockImages.isEmpty()) {
            errorLiveData.postValue("Take at least one stock Image")
            return
        }


        // all data valid, ready to insert replacement

        GlobalScope.launch {
            showLoader.postValue(true)
            for (i in stockImages.size until 5) {
                stockImages.add("")
            }

            for (i in invoiceImages.size until 5) {
                invoiceImages.add("")
            }

            val replacement = Replacement(0, selectedOutlet?.outletID.toString(), ReplacementTypeID.toString(), selectedSkuID.toString(), totalPrice.get()
                    ?: "", invoiceNumber, purchaseDate, description,
                    stockImages[0], stockImages[1], stockImages[2], stockImages[3], stockImages[4],
                    invoiceImages[0], invoiceImages[1], invoiceImages[2], invoiceImages[3], invoiceImages[4])

            SamsApplication.getDB().replacementDao().insert(replacement)

            showLoader.postValue(false)
            dataSubmitted.postValue(true)
        }


    }

    private val stockImages = arrayListOf<String>()
    private val invoiceImages = arrayListOf<String>()
    fun stockImageTaken(fileUri: String?) {
        fileUri?.let {
            stockImages.add(it)
        }
    }

    fun invoiceImageTaken(fileUri: String?) {
        fileUri?.let {
            invoiceImages.add(it)
        }
    }

    fun removeFileUri(uri: String) {
        invoiceImages.remove(uri)
        stockImages.remove(uri)
    }
}