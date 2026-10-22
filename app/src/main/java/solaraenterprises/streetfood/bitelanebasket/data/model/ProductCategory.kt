package solaraenterprises.streetfood.bitelanebasket.data.model

import androidx.annotation.StringRes
import solaraenterprises.streetfood.bitelanebasket.R

enum class ProductCategory(@field:StringRes val titleRes: Int) {
    BURGERS(R.string.product_category_burgers_title),
    TACOS(R.string.product_category_tacos_title),
    WRAPS(R.string.product_category_wraps_title),
    SNACKS(R.string.product_category_snacks_title),
    DRINKS(R.string.product_category_drinks_title),
}
