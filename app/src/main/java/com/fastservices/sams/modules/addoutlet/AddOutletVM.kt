package com.fastservices.sams.modules.addoutlet

import androidx.lifecycle.MutableLiveData
import com.fastservices.sams.SamsApplication
import com.fastservices.sams.data.entities.*
import com.fastservices.sams.modules.base.BaseVM
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class AddOutletVM() : BaseVM() {

    var outlet = OutletLocal()
    var channels = ArrayList<Channel>()
    var subChannels = ArrayList<SubChannel>()

    val submit = MutableLiveData<Boolean>()

    val dataLoaded = MutableLiveData<String>()

    val sections = ArrayList<Section>()
    val localities = ArrayList<Locality>()

    init {
        GlobalScope.launch(Dispatchers.IO) {

            channels.addAll(SamsApplication.getDB().channelDao().getAllChannel())
            subChannels.addAll(SamsApplication.getDB().channelDao().getAllSubChannel())
            dataLoaded.postValue(CHANNELS)

            sections.addAll(SamsApplication.getDB().sectionDao().getAll())
            localities.addAll(SamsApplication.getDB().sectionDao().getAllLocality())
            dataLoaded.postValue(SECTIONS)


        }
    }


    fun submitRequest() {

        GlobalScope.launch {
            outlet.checkValidity()?.let { errorLiveData.postValue(it) } ?: run {
                SamsApplication.getDB().outletLocalDao().insert(outlet)
                submit.postValue(true)
            }
        }


    }

    fun urbanSelected(){
        outlet.AreaTypeId = 1
    }

    fun ruralSelected(){
        outlet.AreaTypeId = 2
    }

    fun imageTaken(fileUri: String?) {
        if (fileUri == null) return

        if (outlet.PhotoPath1.isEmpty()) outlet.PhotoPath1 = fileUri
        else if (outlet.PhotoPath2.isEmpty()) outlet.PhotoPath2 = fileUri
        else if (outlet.PhotoPath3.isEmpty()) outlet.PhotoPath3 = fileUri
        else if (outlet.PhotoPath4.isEmpty()) outlet.PhotoPath4 = fileUri
        else if (outlet.PhotoPath5.isEmpty()) outlet.PhotoPath5 = fileUri
    }

    fun removeFileUri(uri: String) {
        if(outlet.PhotoPath1 == uri) outlet.PhotoPath1 = ""
        if(outlet.PhotoPath2 == uri) outlet.PhotoPath2 = ""
        if(outlet.PhotoPath3 == uri) outlet.PhotoPath3 = ""
        if(outlet.PhotoPath4 == uri) outlet.PhotoPath4 = ""
        if(outlet.PhotoPath5 == uri) outlet.PhotoPath5 = ""
    }

    companion object {
        const val CHANNELS = "channels"
        const val SECTIONS = "sections"
    }

}


