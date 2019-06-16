package com.fastservices.sams

import android.app.Application
import android.content.Context
import com.bumptech.glide.Glide
import com.fastservices.sams.data.database.AppDatabase
import com.fastservices.sams.network.mock.MockRestClient
import com.fastservices.sams.network.mock.MockWebService
import com.fastservices.sams.network.RestClient
import com.fastservices.sams.network.WebService
import com.fastservices.sams.prefs.PreferenceManager
import java.text.SimpleDateFormat
import java.util.*

class SamsApplication : Application() {

    val TAG = SamsApplication::class.java.getSimpleName()


    override fun onCreate() {
        super.onCreate()
        appContext = applicationContext
        if (restClient == null) {
            restClient = RestClient(applicationContext)
        }
        if (preferenceManager == null)
            preferenceManager = PreferenceManager.getInstance(applicationContext)

        if (appDatabase == null)
            appDatabase = AppDatabase.getInstance(applicationContext)


    }


    companion object {
        private var restClient: RestClient? = null
        private var appContext: Context? = null
        private var glide: Glide? = null

        private var preferenceManager: PreferenceManager? = null
        fun getWebService(): WebService {
            if (restClient == null) {
                restClient = RestClient(getAppContext())
            }
            return restClient!!.getService()
        }


        fun getPreferenceManager(): PreferenceManager {
            return preferenceManager!!
        }

        fun getAppContext(): Context {
            return appContext!!
        }

        private var appDatabase: AppDatabase? = null

        fun getDB(): AppDatabase {

            return appDatabase!!
        }

        fun getDocumentDate(): String {
            return getPreferenceManager().getDocumentDate()
        }

        private var mockRestClient: MockRestClient? = null
        val sdf  = SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US)

        fun getMockWebService(): MockWebService {
            if (mockRestClient == null) {
                mockRestClient = MockRestClient(getAppContext())
            }
            return mockRestClient!!.getService()
        }

//        fun getTimeIn(): String {
//            return "2019-03-04 15:04:02"
//        }
//
//        fun getTimeOut(): String {
//            return "2019-03-02"
//        }

    }
}