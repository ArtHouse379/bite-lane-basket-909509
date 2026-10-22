package solaraenterprises.streetfood.bitelanebasket.di

import solaraenterprises.streetfood.bitelanebasket.data.datastore.OnboardingDataStoreManager
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val dataStoreModule = module {
    single { OnboardingDataStoreManager(androidContext()) }
}