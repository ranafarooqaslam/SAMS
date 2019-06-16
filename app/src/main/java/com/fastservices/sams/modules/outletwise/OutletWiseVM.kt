package com.fastservices.sams.modules.outletwise

import android.arch.lifecycle.MutableLiveData
import android.databinding.ObservableField
import android.util.Log
import com.fastservices.sams.SamsApplication
import com.fastservices.sams.data.entities.DecimalFormattedAmount
import com.fastservices.sams.data.entities.RoundUp2Decimal
import com.fastservices.sams.data.models.OutletWiseSummaryModel
import com.fastservices.sams.data.models.SKUWiseSummaryModel
import com.fastservices.sams.modules.base.BaseVM
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class OutletWiseVM : BaseVM(){

    val dataLoaded = MutableLiveData<Boolean>()

    val totalAmount = ObservableField<String>("0.0")

     lateinit var summary: List<OutletWiseSummaryModel>

    init {
        GlobalScope.launch {

            val user = SamsApplication.getPreferenceManager().getUser() ?: return@launch

             summary = SamsApplication.getDB().orderMasterDao().getOutletwiseSummary()

            dataLoaded.postValue(true)
            var amount = 0.0
            summary.forEach {
                amount = amount + it.NET_AMOUNT
            }

            totalAmount.set(DecimalFormattedAmount(RoundUp2Decimal(amount).toDouble()))
        }
    }
}