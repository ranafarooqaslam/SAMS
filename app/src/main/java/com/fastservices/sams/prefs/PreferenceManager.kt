package com.fastservices.sams.prefs

import android.content.Context
import android.content.SharedPreferences
import com.fastservices.sams.data.models.ClientInfo
import com.fastservices.sams.data.models.UserInfo
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.text.SimpleDateFormat
import java.util.*

class PreferenceManager private constructor(context: Context) {
    private var preferences: SharedPreferences = context.getSharedPreferences("sams", Context.MODE_PRIVATE)

    private val KEY_USER = "user"
    private val KEY_TOKEN = "access_token"
    private val KEY_AUTH_CODE = "client_code"
    private val KEY_LAST_SYNC = "last_sync_millis"
    private val KEY_LOGIN_COMPLETE = "login_completed"
    private  val KEY_DOCUMENT_DATE = "doc_date"
    private  val COMPANY_CODE = "company_code"


    fun saveUser(user: UserInfo): Boolean {
        val gson = Gson()
        val type = object : TypeToken<UserInfo>() {
        }.type
        val userJson = gson.toJson(user, type)
        val editor = preferences.edit()
        editor.putString(KEY_USER, userJson)
        return editor.commit()
    }

    fun getUser(): UserInfo? {
        val userJson = preferences.getString(KEY_USER, "")
        if (userJson != null) {
            if (!userJson.isEmpty()) {
                val gson = Gson()
                val type = object : TypeToken<UserInfo>() {
                }.type
                return gson.fromJson(userJson, type)
            }
        }
        return null
    }


    fun saveClientCode(code: String?): Boolean {
        return preferences.edit().putString(KEY_AUTH_CODE, code).commit()
    }

    fun getClientCode(): String? {
        return preferences.getString(KEY_AUTH_CODE, null)
    }

    fun saveCompanyCode(code: String?): Boolean {
        return preferences.edit().putString(COMPANY_CODE, code).commit()
    }

    fun getCompanyCode(): String? {
        return preferences.getString(COMPANY_CODE, null)
    }

    fun logout(): Boolean {
        hasUserLoggedIn(false)
        val editor = preferences.edit()
        editor.clear()
        return editor.commit()
    }

    fun saveClientInfo(clientInfo: ClientInfo?): Boolean {
        val gson = Gson()
        val type = object : TypeToken<ClientInfo>() {
        }.type
        val userJson = gson.toJson(clientInfo, type)
        val editor = preferences.edit()
        editor.putString(KEY_USER, userJson)
        return editor.commit()

    }

    fun saveToken(token: String): Boolean {
        val editor = preferences.edit()
        editor.putString(KEY_TOKEN, token)
        return editor.commit()
    }

    fun getToken(): String? {
        return preferences.getString(KEY_TOKEN, null)
    }

    fun saveMenu(user: UserInfo): Boolean {
        val gson = Gson()
        val type = object : TypeToken<UserInfo>() {
        }.type
        val userJson = gson.toJson(user, type)
        val editor = preferences.edit()
        editor.putString(KEY_USER, userJson)
        return editor.commit()
    }

    fun updateLastSync() {
        preferences.edit().putLong(KEY_LAST_SYNC, System.currentTimeMillis()).apply()
    }

    fun getLastSync(): String {
        val millis = preferences.getLong(KEY_LAST_SYNC, 0L)
        if (millis == 0L)
            return "Never"
        val sdf = SimpleDateFormat("dd.MM.yyyy / hh:mm a", Locale.US)
        return sdf.format(Date(millis))
    }

    fun hasUserLoggedIn(signedIn: Boolean) {
        preferences.edit().putBoolean(KEY_LOGIN_COMPLETE, signedIn).apply()
    }

    fun hasUserLoggedIn(): Boolean {
        return preferences.getBoolean(KEY_LOGIN_COMPLETE, false)
    }

    fun saveDocumentDate(startDayDateTime: String) {
        preferences.edit().putString(KEY_DOCUMENT_DATE,startDayDateTime).apply()
    }

    fun getDocumentDate():String{
        return preferences.getString(KEY_DOCUMENT_DATE,"") ?: ""
    }

    companion object {
        private var instance: PreferenceManager? = null

        fun getInstance(context: Context): PreferenceManager =
                instance ?: synchronized(this) {
                    instance ?: PreferenceManager(context).also { instance = it }
                }
    }


}