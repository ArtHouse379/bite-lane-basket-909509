package solaraenterprises.streetfood.bitelanebasket

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import solaraenterprises.streetfood.bitelanebasket.ui.composable.approot.AppRoot
import solaraenterprises.streetfood.bitelanebasket.ui.theme.XOENAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            XOENAppTheme {
                AppRoot()
            }
        }
    }
}
