package com.fastservices.sams.modules.merchandise

import android.arch.lifecycle.MutableLiveData
import com.fastservices.sams.SamsApplication
import com.fastservices.sams.data.entities.Merchandise
import com.fastservices.sams.data.entities.Outlet
import com.fastservices.sams.modules.base.BaseVM
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MerchandisingVM : BaseVM() {

    var selectedOutlet: Outlet? = null

    var merchandise: Merchandise = Merchandise()

    val merchandiseAdded = MutableLiveData<String>()

    val photosBeforeMerchandise = arrayOf("", "", "", "", "")
    val photosAfterMerchandise = arrayOf("", "", "", "", "")


    init {

    }


    fun submitMerchandising() {
        if (selectedOutlet == null) {
            errorLiveData.postValue("Select an outlet")
            return
        }

        var afterPictureTaken = false
        var beforePictureTaken = false
        for (i in 0 until 5) {
            if (photosAfterMerchandise[i].isNotEmpty()) afterPictureTaken = true
            if (photosBeforeMerchandise[i].isNotEmpty()) beforePictureTaken = true
        }
        if (!afterPictureTaken || !beforePictureTaken) {
            errorLiveData.postValue("Take at least one photo for before and after merchandising")
            return
        }

        GlobalScope.launch {
            try {
                merchandise.OutletID = selectedOutlet!!.outletID
                merchandise.DocumentDate = SamsApplication.getDocumentDate()
                merchandise.Image1Path1 = photosBeforeMerchandise[0]
                merchandise.Image1Path2 = photosBeforeMerchandise[1]
                merchandise.Image1Path3 = photosBeforeMerchandise[2]
                merchandise.Image1Path4 = photosBeforeMerchandise[3]
                merchandise.Image1Path5 = photosBeforeMerchandise[4]

                merchandise.Image2Path1 = photosAfterMerchandise[0]
                merchandise.Image2Path2 = photosAfterMerchandise[1]
                merchandise.Image2Path3 = photosAfterMerchandise[2]
                merchandise.Image2Path4 = photosAfterMerchandise[3]
                merchandise.Image2Path5 = photosAfterMerchandise[4]

                SamsApplication.getDB().merchandiseDao().insert(merchandise)
                merchandiseAdded.postValue("success")
            } catch (e: Exception) {
                errorLiveData.postValue(e.message)
                merchandiseAdded.postValue("error")
            }

        }
    }

    fun imageTakenBeforeMerchandising(fileUri: String?) {
        if (fileUri == null) return
        val emptyIndex = photosBeforeMerchandise.indexOf("")
        if (emptyIndex != -1) photosBeforeMerchandise[emptyIndex] = fileUri
//        if (merchandise.Image1Path1 == null) merchandise.Image1Path1 = fileUri
//        else if (merchandise.Image1Path2 == null) merchandise.Image1Path2 = fileUri
//        else if (merchandise.Image1Path3 == null) merchandise.Image1Path3 = fileUri
//        else if (merchandise.Image1Path4 == null) merchandise.Image1Path4 = fileUri
//        else if (merchandise.Image1Path5 == null) merchandise.Image1Path5 = fileUri
    }

    fun imageTakenAfterMerchandising(fileUri: String?) {
        if (fileUri == null) return

        val emptyIndex = photosAfterMerchandise.indexOf("")
        if (emptyIndex != -1) photosAfterMerchandise[emptyIndex] = fileUri

//        if (merchandise.Image2Path1 == null) merchandise.Image2Path1 = fileUri
//        else if (merchandise.Image2Path2 == null) merchandise.Image2Path2 = fileUri
//        else if (merchandise.Image2Path3 == null) merchandise.Image2Path3 = fileUri
//        else if (merchandise.Image2Path4 == null) merchandise.Image2Path4 = fileUri
//        else if (merchandise.Image2Path5 == null) merchandise.Image2Path5 = fileUri
    }

    fun removeFileUri(uri: String) {
        var index = photosBeforeMerchandise.indexOf(uri)
        if (index != -1) photosBeforeMerchandise[index] = ""
        index = photosAfterMerchandise.indexOf(uri)
        if (index != -1) photosAfterMerchandise[index] = ""

    }
}