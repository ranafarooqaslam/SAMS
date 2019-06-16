package com.fastservices.sams.modules.outletnoorder

import android.arch.lifecycle.MutableLiveData
import android.databinding.ObservableField
import android.view.View
import com.fastservices.sams.SamsApplication
import com.fastservices.sams.data.entities.NoOrderItem
import com.fastservices.sams.data.entities.NoOrderReason
import com.fastservices.sams.data.entities.Outlet
import com.fastservices.sams.data.repos.RepoNoOrder
import com.fastservices.sams.data.repos.RepoNoOrderReason
import com.fastservices.sams.modules.base.BaseVM
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*

class OutletNoOrderVM : BaseVM() {

    val sdf = SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS", Locale.getDefault())

    lateinit var outlet: Outlet

    val toggleDetailLayout = ObservableField<Int>(View.VISIBLE)

    lateinit var reasons: List<NoOrderReason>

    val dataLoaded = MutableLiveData<Boolean>()

    val dataInserted = MutableLiveData<Boolean>()

    var selectedReasonId: Int = -1

    var comments = ""

    var timeIn = ""
    var latitude: Double = 0.0
    var longtidue: Double = 0.0

    var files = arrayOf("","","","","")

    init {
        timeIn = sdf.format(Date())
        GlobalScope.launch {
            reasons = RepoNoOrderReason().getAll()
            dataLoaded.postValue(true)
        }
    }

    fun collapseClicked() {

        if (toggleDetailLayout.get() == View.VISIBLE) {
            toggleDetailLayout.set(View.GONE)
        } else {
            toggleDetailLayout.set(View.VISIBLE)
        }
    }

    fun submitNoOrder() {

        if(selectedReasonId == -1){
            errorLiveData.postValue("Select any reason")
            return
        }

        if(longtidue == 0.0 || latitude == 0.0){
            errorLiveData.postValue("Location not selected. Press Take GPS button")
            return
        }
        var pictureTaken = false
        for(i in 0 until files.size){
            if(files[i].isNotEmpty()){
                pictureTaken = true
                break
            }
        }
        if(!pictureTaken){
            errorLiveData.postValue("Please take at least one picture.")
            return
        }


        if (selectedReasonId != -1) {
            GlobalScope.launch {
                val item = NoOrderItem(outlet.outletID, outlet.sectionID.toString(),
                        SamsApplication.getDocumentDate(), selectedReasonId.toString(),
                        timeIn, sdf.format(Date()), comments,latitude,longtidue,
                        files[0],files[1],files[2],files[3],files[4])

                RepoNoOrder(SamsApplication.getPreferenceManager().getUser()).insertItem(item)

                dataInserted.postValue(true)
            }


        }
    }

    fun imageTaken(fileUri: String?) {
        fileUri ?: return
        for(i in 0 until 5){
            if(files[i].isEmpty()){
                files[i] = fileUri
                break
            }
        }
    }


}