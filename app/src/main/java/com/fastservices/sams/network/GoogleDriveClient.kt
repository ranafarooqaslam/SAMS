package com.fastservices.sams.network

import android.content.Context
import com.fastservices.sams.Constants
import com.fastservices.sams.SamsApplication
import com.google.gson.GsonBuilder
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class GoogleDriveClient(context: Context) {

    private var apiService: GoogleWebService


    init {
        val gson = GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ss")
                .create()

        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

        val clientBuilder = OkHttpClient().newBuilder()

        if (Constants.DEBUG) {
            clientBuilder.addInterceptor(httpLoggingInterceptor)
        }
//        clientBuilder.addInterceptor(TokenInterceptor(context))
        clientBuilder.readTimeout(30, TimeUnit.SECONDS)
        val okHttpClient = clientBuilder.build()


        val restAdapter = Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl(Constants.GOOGLE_APIS_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(CoroutineCallAdapterFactory())
                .build()
        apiService = restAdapter.create(GoogleWebService::class.java)


    }

    fun getService(): GoogleWebService {
        return apiService
    }

    private class TokenInterceptor(private val context: Context) : Interceptor {
        override fun intercept(chain: Interceptor.Chain?): Response? {
            val ongoing = chain?.request()?.newBuilder()
            ongoing?.addHeader("Authorization", "Bearer ${Constants.GOOGLE_TOKEN}")
            return chain?.proceed(ongoing!!.build())
        }


    }


}