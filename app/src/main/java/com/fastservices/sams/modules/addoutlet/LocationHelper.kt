package com.fastservices.sams.modules.addoutlet

import android.content.Context
import android.text.TextUtils
import android.provider.Settings.Secure
import android.provider.Settings.Secure.LOCATION_MODE_OFF
import android.provider.Settings.SettingNotFoundException
import android.provider.Settings.Secure.LOCATION_MODE
import android.os.Build
import android.provider.Settings


fun isLocationEnabled(context: Context): Boolean {
    var locationMode = 0
    val locationProviders: String

    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
        try {
            locationMode = Settings.Secure.getInt(context.getContentResolver(), Settings.Secure.LOCATION_MODE)

        } catch (e: SettingNotFoundException) {
            e.printStackTrace()
            return false
        }

        return locationMode != Settings.Secure.LOCATION_MODE_OFF

    } else {
        locationProviders = Settings.Secure.getString(context.getContentResolver(), Settings.Secure.LOCATION_PROVIDERS_ALLOWED)
        return !TextUtils.isEmpty(locationProviders)
    }


}