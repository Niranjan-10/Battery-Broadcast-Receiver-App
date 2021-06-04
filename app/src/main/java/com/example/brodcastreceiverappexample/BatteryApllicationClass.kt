package com.example.brodcastreceiverappexample

import android.app.Application
import android.content.Intent
import android.content.IntentFilter
import android.util.Log
import android.widget.TextView

class BatteryApplicationClass : Application() {
    var batteryReceiver: BatteryReceiver? = null
    var text = "hello"

    lateinit var textView: TextView
    override fun onCreate() {
        super.onCreate()
        batteryReceiver = BatteryReceiver()
        Log.d("value", "Working here inside Main activity")
        registerReceiver(batteryReceiver, IntentFilter(Intent.ACTION_BATTERY_CHANGED))
    }




    override fun onTerminate() {
        super.onTerminate()
        unregisterReceiver(batteryReceiver)
    }


}