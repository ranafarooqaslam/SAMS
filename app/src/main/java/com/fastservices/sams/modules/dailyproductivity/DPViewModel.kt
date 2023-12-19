package com.fastservices.sams.modules.dailyproductivity

import androidx.databinding.ObservableField
import com.fastservices.sams.SamsApplication
import com.fastservices.sams.data.entities.DecimalFormattedAmount
import com.fastservices.sams.data.entities.RoundUp2Decimal
import com.fastservices.sams.data.repos.RepoNoOrder
import com.fastservices.sams.data.repos.RepoOutlet
import com.fastservices.sams.modules.base.BaseVM
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class DPViewModel : BaseVM() {
    val TAG = "DPViewModel"

    // f = field
    val fOutletCount = ObservableField<String>()
    val fVisited = ObservableField<String>()
    val fProductive = ObservableField<String>()
    val fNonVisited = ObservableField<String>()
    val fTotalSKU = ObservableField<String>()
    val fTotalAmount = ObservableField<String>()
    val fAvgSKU = ObservableField<String>()
    val fAvgAmount = ObservableField<String>()

    init {

        GlobalScope.launch {
            val user = SamsApplication.getPreferenceManager().getUser() ?: return@launch

            val outletsCount = RepoOutlet(user).countAll()

            val productive = SamsApplication.getDB().orderMasterDao().outletsHaveOrder()

            val noOrder = RepoNoOrder(user).countAll()

            val visited = productive + noOrder

            val nonVisited = outletsCount - visited

            val bookedSKUs = SamsApplication.getDB().orderDetailDao().totalQuantity()

            val totalNetAmount = SamsApplication.getDB().orderMasterDao().totalNetAmount()

            val avgSKUperOrder = bookedSKUs.toDouble() / Math.max(productive,1)

            val avgAmountPerOrder = totalNetAmount / Math.max(productive,1)

            fOutletCount.set(outletsCount.toString())
            fVisited.set(visited.toString())
            fProductive.set(productive.toString())
            fNonVisited.set(nonVisited.toString())
            fTotalSKU.set(bookedSKUs.toString())
            fTotalAmount.set(DecimalFormattedAmount(RoundUp2Decimal(totalNetAmount).toDouble()))
            fAvgSKU.set(RoundUp2Decimal(avgSKUperOrder))
            fAvgAmount.set(DecimalFormattedAmount(RoundUp2Decimal(avgAmountPerOrder).toDouble()))

        }
    }

}