package br.com.alura.panucci.ui.routes

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AutoAwesome
import androidx.compose.material.icons.filled.RestaurantMenu
import androidx.compose.material.icons.outlined.LocalBar
import androidx.compose.ui.text.capitalize
import br.com.alura.panucci.ui.components.BottomAppBarItem
import java.util.Locale

sealed class AppDestination private constructor() {
    object Route {
        const val HIGHLIGHTS = "highlights"
        const val PRODUCT_DETAILS = "productDetails"
        const val CHECKOUT = "checkout"
        const val MENU = "menu"
        const val DRINKS = "drinks"
    }
    object Label {
        const val DESTAQUES = "Destaques"
        const val BEBIDAS = "Bebidas"
    }
}

val bottomAppBarItems = listOf(
    BottomAppBarItem(
        label = AppDestination.Label.DESTAQUES,
        icon = Icons.Filled.AutoAwesome,
        route = AppDestination.Route.HIGHLIGHTS
    ),
    BottomAppBarItem(
        label = AppDestination.Route.MENU.replaceFirstChar {
            if (it.isLowerCase()) it.titlecase(
                Locale.getDefault()
            ) else it.toString()
        },
        icon = Icons.Filled.RestaurantMenu,
        route = AppDestination.Route.MENU
    ),
    BottomAppBarItem(
        label = AppDestination.Label.BEBIDAS,
        icon = Icons.Outlined.LocalBar,
        route = AppDestination.Route.DRINKS
    ),
)