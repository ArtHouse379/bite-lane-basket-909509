package solaraenterprises.streetfood.bitelanebasket

import android.app.Application
import solaraenterprises.streetfood.bitelanebasket.di.dataModule
import solaraenterprises.streetfood.bitelanebasket.di.dispatcherModule
import solaraenterprises.streetfood.bitelanebasket.di.viewModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

class XOENApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        val appModules = dataModule + viewModule + dispatcherModule

        startKoin {
            androidLogger()
            androidContext(this@XOENApplication)
            modules(appModules)
        }
    }
}
