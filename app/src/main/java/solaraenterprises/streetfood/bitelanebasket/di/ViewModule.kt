package solaraenterprises.streetfood.bitelanebasket.di

import solaraenterprises.streetfood.bitelanebasket.ui.viewmodel.AppViewModel
import solaraenterprises.streetfood.bitelanebasket.ui.viewmodel.CartViewModel
import solaraenterprises.streetfood.bitelanebasket.ui.viewmodel.CheckoutViewModel
import solaraenterprises.streetfood.bitelanebasket.ui.viewmodel.OnboardingViewModel
import solaraenterprises.streetfood.bitelanebasket.ui.viewmodel.OrderViewModel
import solaraenterprises.streetfood.bitelanebasket.ui.viewmodel.ProductDetailsViewModel
import solaraenterprises.streetfood.bitelanebasket.ui.viewmodel.ProductViewModel
import solaraenterprises.streetfood.bitelanebasket.ui.viewmodel.SplashViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val viewModule = module {
    viewModel {
        AppViewModel(
            cartRepository = get()
        )
    }

    viewModel {
        SplashViewModel(
            onboardingRepository = get()
        )
    }

    viewModel {
        OnboardingViewModel(
            onboardingRepository = get()
        )
    }

    viewModel {
        ProductViewModel(
            productRepository = get(),
            cartRepository = get(),
        )
    }

    viewModel {
        ProductDetailsViewModel(
            productRepository = get(),
            cartRepository = get(),
        )
    }

    viewModel {
        CheckoutViewModel(
            cartRepository = get(),
            productRepository = get(),
            orderRepository = get(),
        )
    }

    viewModel {
        CartViewModel(
            cartRepository = get(),
            productRepository = get(),
        )
    }

    viewModel {
        OrderViewModel(
            orderRepository = get(),
        )
    }
}