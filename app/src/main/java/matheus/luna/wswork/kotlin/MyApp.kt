package matheus.luna.wswork.kotlin

import android.app.Application
import matheus.luna.wswork.kotlin.di.daoModule
import matheus.luna.wswork.kotlin.di.mainModule
import matheus.luna.wswork.kotlin.di.retrofitModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            if (BuildConfig.DEBUG) {
                androidLogger()
            }
            androidContext(this@MyApp)
            modules(mainModule, retrofitModule, daoModule)
        }
    }
}