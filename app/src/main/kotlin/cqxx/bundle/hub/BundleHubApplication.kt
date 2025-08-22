package cqxx.bundle.hub

import android.app.Application
import cqxx.bundle.hub.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class BundleHubApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        
        startKoin {
            androidLogger()
            androidContext(this@BundleHubApplication)
            modules(appModule)
        }
    }
}