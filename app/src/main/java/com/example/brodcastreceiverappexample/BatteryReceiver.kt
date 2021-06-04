package com.example.brodcastreceiverappexample

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.TextView

class BatteryReceiver() : BroadcastReceiver() {


    override fun onReceive(context: Context?, intent: Intent?) {
        val percentage = intent?.getIntExtra("level",0)
        Log.d("value","Working here $percentage")
        if(percentage != 0){
            Log.d("value",percentage.toString())
        }
    }
}