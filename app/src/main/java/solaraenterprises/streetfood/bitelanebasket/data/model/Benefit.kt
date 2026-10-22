package solaraenterprises.streetfood.bitelanebasket.data.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector

data class Benefit(
    val icon: ImageVector,
    val text: String,
)

val productBenefits = listOf<Benefit>(
    Benefit(
        icon = Icons.Filled.CheckCircle,
        text = "Quality ingredients",
    ),
    Benefit(
        icon = Icons.Filled.Lock,
        text = "Freshness guaranteed",
    ),
    Benefit(
        icon = Icons.Filled.ShoppingCart,
        text = "Street food essentials",
    ),
)
