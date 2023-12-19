package com.fastservices.sams.modules.complaints

import androidx.lifecycle.MutableLiveData
import androidx.databinding.ObservableArrayList
import com.fastservices.sams.SamsApplication
import com.fastservices.sams.data.entities.ComplaintReason
import com.fastservices.sams.data.entities.Outlet
import com.fastservices.sams.data.entities.OutletComplaint
import com.fastservices.sams.modules.base.BaseVM
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class ComplaintsVM : BaseVM() {


    val reasons = ArrayList<ComplaintReason>()

    val reasonsLoaded = MutableLiveData<Boolean>()

    val complaintStatus = MutableLiveData<Boolean>()

    var selectedOutlet:Outlet? = null


    init {
        GlobalScope.launch {
            reasons.addAll(SamsApplication.getDB().complaintReasonDao().getAllComplaintReasons())
            reasonsLoaded.postValue(true)
        }

    }

    fun submitComplaint() {

        if(selectedOutlet == null){
            errorLiveData.postValue("Please select an outlet.")
            return
        }

        GlobalScope.launch {
            val list = reasons.filter { it.check }
            val outletComplaints = arrayListOf<OutletComplaint>()

            list.forEach {

                outletComplaints.add(OutletComplaint(0,selectedOutlet?.outletID?.toString() ?: "",it.complaintReasonID, SamsApplication.getDocumentDate(),it.remarks))
            }

            SamsApplication.getDB().outletComplaintsDao().insert(outletComplaints)

            complaintStatus.postValue(true)

        }


    }

}