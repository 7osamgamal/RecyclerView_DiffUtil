package com.example.recyclerwithdiffutill

import android.app.Application
import timber.log.Timber

class DiffUtillApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}