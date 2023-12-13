package br.com.tcc.tcccardiot21

import android.app.Application
import br.com.tcc.tcccardiot21.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class CardioApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@CardioApplication)
            modules(appModule)
        }
    }
}