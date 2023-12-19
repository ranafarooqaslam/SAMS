package com.fastservices.sams.modules.outlet

import androidx.lifecycle.MutableLiveData
import androidx.databinding.ObservableArrayList
import androidx.databinding.ObservableField
import android.util.Log
import com.fastservices.sams.SamsApplication
import com.fastservices.sams.data.entities.DecimalFormattedAmount
import com.fastservices.sams.data.entities.Outlet
import com.fastservices.sams.data.entities.RoundUp2Decimal
import com.fastservices.sams.data.entities.Section
import com.fastservices.sams.modules.base.BaseVM
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class OutletsVM() : BaseVM() {

    val TAG = "OutletsVM"
    val outletList: ObservableArrayList<Outlet> = ObservableArrayList()

    val allOutlets = arrayListOf<Outlet>()

    var ordersList: List<Int>? = null

    var noOrdersList: ArrayList<Int>? = null

    val searchQuery: ObservableField<String> = ObservableField<String>()

    val notifyAdapter = MutableLiveData<Boolean>()

    var sections: List<Section>? = null

    var sectionAreaId = -1

    init {
        loadOutlets()
        loadSections()
    }

    private fun loadOutlets() {
        GlobalScope.launch(Dispatchers.IO) {
            allOutlets.addAll(SamsApplication.getDB().outletDao().getAll())
            addCartonsInformation()
//            outletList.addAll(allOutlets)
            Log.e(TAG, "load all")
            notifyAdapter.postValue(true)
        }

    }

    fun applyFilter(input: String) {

        outletList.clear()

        outletList.addAll(
            allOutlets.filter {
                (it.outletName.contains(input, true) ||
                        it.storeAddress.contains(input, true) ||
                        it.ownerName.contains(input, true)) && (sectionAreaId == -1 || it.sectionID == sectionAreaId)
            }
        )
        notifyAdapter.postValue(true)
    }

    fun applyAreaFilter(areaId: Int) {
        outletList.clear()
        sectionAreaId = areaId
        searchQuery.set("")
        if (areaId == -1) {
            outletList.addAll(allOutlets)
        }
        else
            outletList.addAll(
                allOutlets.filter {
                    it.sectionID == sectionAreaId
                }
            )
        notifyAdapter.postValue(true)
    }

    fun loadSections() {
        GlobalScope.launch(Dispatchers.IO) {
            sections = SamsApplication.getDB().sectionDao().getAll()
        }
    }

    fun loadOrdersList() {
        GlobalScope.launch {
            ordersList = ArrayList<Int>()
            if (noOrdersList == null) {
                noOrdersList = ArrayList<Int>()
            }
            noOrdersList?.clear()
            noOrdersList?.addAll(SamsApplication.getDB().noOrderDao().getAllOutletIDs())

            addCartonsInformation()

            notifyAdapter.postValue(true)
        }
    }

    private fun addCartonsInformation() {
        val orders = SamsApplication.getDB().orderMasterDao().getAll()
        allOutlets.forEach { item->
            orders.find { it.OUTLET_ID == item.outletID }?.let { o->

                item.label = DecimalFormattedAmount(RoundUp2Decimal(o.TOTAL_NET_AMOUNT).toDouble())
            }
        }
    }
}