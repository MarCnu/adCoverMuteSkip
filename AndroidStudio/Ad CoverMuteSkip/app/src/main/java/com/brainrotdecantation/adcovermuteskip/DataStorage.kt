package com.brainrotdecantation.adcovermuteskip

import android.content.Context
import android.content.SharedPreferences // Import this

class DataStorage {
    companion object {
        private const val PREFS_NAME = "MyAppPrefs"

        fun getSharedPreferences(context: Context): SharedPreferences {
            return context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        }

        const val KEY_OPACITY = "opacity"
        fun saveOpacity(context: Context, newOpacity: Int) {
            val sharedPreferences: SharedPreferences = getSharedPreferences(context)
            val editor = sharedPreferences.edit()
            editor.putInt(KEY_OPACITY, newOpacity)
            editor.apply()
        }
        fun loadOpacity(context: Context): Int {
            val sharedPreferences: SharedPreferences = getSharedPreferences(context)
            return sharedPreferences.getInt(KEY_OPACITY, 250)
        }

        const val KEY_MONITOR_VOLUME_CLICK = "monitor_volume_click"
        fun saveMonitorVolumeClick(context: Context, newMonitorVolumeClick: Boolean) {
            val sharedPreferences: SharedPreferences = getSharedPreferences(context)
            val editor = sharedPreferences.edit()
            editor.putBoolean(KEY_MONITOR_VOLUME_CLICK, newMonitorVolumeClick)
            editor.apply()
        }
        fun loadMonitorVolumeClick(context: Context): Boolean {
            val sharedPreferences: SharedPreferences = getSharedPreferences(context)
            return sharedPreferences.getBoolean(KEY_MONITOR_VOLUME_CLICK, false)
        }

        const val KEY_DISABLE_AUTO_CLICK = "disable_auto_click"
        fun saveDisableAutoClick(context: Context, isDisabled: Boolean) {
            val sharedPreferences: SharedPreferences = getSharedPreferences(context)
            val editor = sharedPreferences.edit()
            editor.putBoolean(KEY_DISABLE_AUTO_CLICK, isDisabled)
            editor.apply()
        }
        fun loadDisableAutoClick(context: Context): Boolean {
            val sharedPreferences: SharedPreferences = getSharedPreferences(context)
            return sharedPreferences.getBoolean(KEY_DISABLE_AUTO_CLICK, false)
        }
    }
}