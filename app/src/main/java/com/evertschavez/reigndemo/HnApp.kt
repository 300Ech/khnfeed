package com.evertschavez.reigndemo

import android.app.Application
import com.evertschavez.reigndemo.model.database.ObjectBox

class HnApp : Application() {

    override fun onCreate() {
        super.onCreate()
        instance = this
        ObjectBox.init(this)
    }

    companion object {
        lateinit var instance: HnApp
    }
}