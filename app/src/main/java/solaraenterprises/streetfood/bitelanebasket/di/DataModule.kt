package solaraenterprises.streetfood.bitelanebasket.di

import solaraenterprises.streetfood.bitelanebasket.data.repository.CartRepository
import solaraenterprises.streetfood.bitelanebasket.data.repository.OnboardingRepository
import solaraenterprises.streetfood.bitelanebasket.data.repository.OrderRepository
import solaraenterprises.streetfood.bitelanebasket.data.repository.ProductRepository

import org.koin.core.qualifier.named
import org.koin.dsl.module

val dataModule = module {
    includes(databaseModule, dataStoreModule)

    single {
        OnboardingRepository(
            onboardingDataStoreManager = get(),
            coroutineDispatcher = get(named("IO"))
        )
    }

    single { ProductRepository() }

    single {
        CartRepository(
            cartItemDao = get(),
            coroutineDispatcher = get(named("IO"))
        )
    }

    single {
        OrderRepository(
            orderDao = get(),
            coroutineDispatcher = get(named("IO"))
        )
    }
}