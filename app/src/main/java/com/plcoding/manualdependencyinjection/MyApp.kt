package com.plcoding.manualdependencyinjection

import android.app.Application
import com.plcoding.manualdependencyinjection.di.AppModule
import com.plcoding.manualdependencyinjection.di.AppModuleImpl
import dagger.hilt.android.HiltAndroidApp

class MyApp: Application() {

    companion object {
        lateinit var appModule: AppModule
    }

    override fun onCreate() {
        super.onCreate()
        appModule = AppModuleImpl(this)
    }
}