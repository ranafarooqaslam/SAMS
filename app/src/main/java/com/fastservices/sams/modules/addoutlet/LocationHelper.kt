package com.fastservices.sams.modules.addoutlet

import android.content.Context
import android.provider.Settings.Secure
import android.provider.Settings.Secure.LOCATION_MODE
import android.provider.Settings.Secure.LOCATION_MODE_OFF
import android.provider.Settings.SettingNotFoundException

fun isLocationEnabled(context: Context): Boolean {
    var locationMode = 0
    val locationProviders: String

    try {
        locationMode = Secure.getInt(context.contentResolver, LOCATION_MODE)

    } catch (e: SettingNotFoundException) {
        e.printStackTrace()
        return false
    }

    return locationMode != LOCATION_MODE_OFF

}