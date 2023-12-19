package com.fastservices.sams.modules.skuwise

import androidx.lifecycle.MutableLiveData
import androidx.databinding.ObservableField
import android.util.Log
import com.fastservices.sams.SamsApplication
import com.fastservices.sams.data.entities.DecimalFormattedAmount
import com.fastservices.sams.data.entities.RoundUp2Decimal
import com.fastservices.sams.data.models.SKUWiseSummaryModel
import com.fastservices.sams.modules.base.BaseVM
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.flow.toCollection
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.launch

class SKUWiseVM : BaseVM(){

    val dataLoaded = MutableLiveData<Boolean>()

    val totalQty = ObservableField<String>("0")

    val totalAmount = ObservableField<String>("0.0")

     lateinit var summary: List<SKUWiseSummaryModel>

    init {
        GlobalScope.launch {

            val user = SamsApplication.getPreferenceManager().getUser() ?: return@launch

             summary = SamsApplication.getDB().orderDetailDao().getSKUwiseSummary()

            dataLoaded.postValue(true)
            var qty = 0
            var amount = 0.0
            summary.forEach {
                qty = qty + it.QUANTITY_UNIT
                amount = amount + it.NET_AMOUNT
            }

            totalQty.set(qty.toString())
            totalAmount.set(DecimalFormattedAmount(RoundUp2Decimal(amount).toDouble()))
        }
    }
}