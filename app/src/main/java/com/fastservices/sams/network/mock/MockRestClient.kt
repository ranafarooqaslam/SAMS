package com.fastservices.sams.network.mock

import android.content.Context
import com.fastservices.sams.Constants
import com.google.gson.GsonBuilder
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class MockRestClient(context: Context) {

    private var apiService: MockWebService
    val BASE_URL = "https://my-json-server.typicode.com/fdmirza/test-repo/"

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
                .baseUrl(BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(CoroutineCallAdapterFactory())
                .build()
        apiService = restAdapter.create(MockWebService::class.java)


    }

    fun getService(): MockWebService {
        return apiService
    }




}