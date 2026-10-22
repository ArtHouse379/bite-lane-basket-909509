package solaraenterprises.streetfood.bitelanebasket.ui.composable.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import solaraenterprises.streetfood.bitelanebasket.ui.composable.screen.cart.XOENCartScreen
import solaraenterprises.streetfood.bitelanebasket.ui.composable.screen.checkout.XOENCheckoutScreen
import solaraenterprises.streetfood.bitelanebasket.ui.composable.screen.home.XOENHomeScreen
import solaraenterprises.streetfood.bitelanebasket.ui.composable.screen.onboarding.XOENOnboardingScreen
import solaraenterprises.streetfood.bitelanebasket.ui.composable.screen.order.XOENOrdersScreen
import solaraenterprises.streetfood.bitelanebasket.ui.composable.screen.productdetails.XOENProductDetailsScreen
import solaraenterprises.streetfood.bitelanebasket.ui.composable.screen.settings.XOENSettingsScreen
import solaraenterprises.streetfood.bitelanebasket.ui.composable.screen.splash.XOENSplashScreen

@Composable
fun AppNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    NavHost(
        navController = navController,
        startDestination = NavRoute.Splash,
        modifier = modifier,
    ) {
        composable<NavRoute.Splash> {
            XOENSplashScreen(
                onNavigateToHomeScreen = {
                    navController.navigate(route = NavRoute.Home) {
                        popUpTo(navController.graph.startDestinationId) {
                            inclusive = true
                        }
                        launchSingleTop = true
                    }
                },
                onNavigateToOnboarding = {
                    navController.navigate(route = NavRoute.Onboarding) {
                        popUpTo(navController.graph.startDestinationId) {
                            inclusive = true
                        }
                        launchSingleTop = true
                    }
                }
            )
        }

        composable<NavRoute.Onboarding> {
            XOENOnboardingScreen(
                onNavigateToHomeScreen = {
                    navController.navigate(NavRoute.Home) {
                        popUpTo(NavRoute.Onboarding) {
                            inclusive = true
                        }
                        launchSingleTop = true
                    }
                }
            )
        }

        composable<NavRoute.Home> {
            XOENHomeScreen(
                onNavigateToProductDetails = { id: Int ->
                    navController.navigate(
                        route = NavRoute.ProductDetails(id = id)
                    )
                }
            )
        }

        composable<NavRoute.ProductDetails> { backStackEntry ->
            val productDetails: NavRoute.ProductDetails = backStackEntry.toRoute()
            XOENProductDetailsScreen(
                productId = productDetails.id,
            )
        }

        composable<NavRoute.Cart> {
            XOENCartScreen(
                onNavigateToCheckoutScreen = {
                    navController.navigate(NavRoute.Checkout)
                }
            )
        }

        composable<NavRoute.Checkout> {
            XOENCheckoutScreen(
                onNavigateToOrdersScreen = {
                    navController.navigate(NavRoute.Orders) {
                        popUpTo(NavRoute.Home) { inclusive = false }
                    }
                }
            )
        }

        composable<NavRoute.Orders> {
            XOENOrdersScreen()
        }

        composable<NavRoute.Settings> {
            XOENSettingsScreen()
        }
    }
}