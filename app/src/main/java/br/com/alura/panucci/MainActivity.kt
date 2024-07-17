package br.com.alura.panucci

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PointOfSale
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import br.com.alura.panucci.sampledata.sampleProducts
import br.com.alura.panucci.ui.components.BottomAppBarItem
import br.com.alura.panucci.ui.components.PanucciBottomAppBar
import br.com.alura.panucci.ui.routes.AppDestination
import br.com.alura.panucci.ui.routes.bottomAppBarItems
import br.com.alura.panucci.ui.screens.CheckoutScreen
import br.com.alura.panucci.ui.screens.DrinksListScreen
import br.com.alura.panucci.ui.screens.HighlightsListScreen
import br.com.alura.panucci.ui.screens.MenuListScreen
import br.com.alura.panucci.ui.screens.ProductDetailsScreen
import br.com.alura.panucci.ui.theme.PanucciTheme
import java.math.BigDecimal

@Suppress("NAME_SHADOWING")
class MainActivity : ComponentActivity() {

    @SuppressLint("RememberReturnType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()

            LaunchedEffect(Unit) {
                navController.addOnDestinationChangedListener { _, _, _ ->
                    val routes = navController.backQueue.map { it.destination.route }
                }
            }

            /**Sempre que houver uma mudança do estado, como exemplo o clique nos botões
             * da bottomAppBar o composable precisa ser reconstruído com o novo estado quando clicado
             * no botão "menu" ele navega para essa tela, porém ao clicar em voltar, caso estivesse em outra tela
             * o estado do botão não mudaria o que indicaria a tela errada como "atual".
             *
             * Navegar entre as abas de um bottom app bar e integrar com o navigation:
             * A navegação entre as abas de um componente exige uma maior integração com Navigation, pois não é
             * apenas fazer a navegação, é preciso identificar o destino atual e modificar o estado do componente,
             * como por exemplo, a aba selecionada.
             *
             * Criar um Log que representa a back stack do Navigation, ou seja,
             * cada vez que ocorre uma mudança de destino, temos um log indicando toda a back
             * stack com cada destino dentro dela.
             *
             * Além de apenas fazer a navegação, aprendi a modificar o comportamento
             * para determinados casos, como por exemplo, ao navegar entre abas, não faz sentido
             * existir várias cópias do mesmo destino, ou então, navegar no mesmo caso seja
             * feita múltiplas seleções do mesmo item do bottom app bar.**/

            val backStackEntryAsState by navController.currentBackStackEntryAsState()
            val currentyDestination = backStackEntryAsState?.destination

            PanucciTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    /**Será utilizado para salvar o "estado dos botões", quando clicar
                     * em um item e voltar será necessário acompanhar
                     *  esse estado e indicar ao usuário em qual tela está.
                     *  É necessário usar o elvis pois haverá casos em que o
                     *  valor inicial poderá ser nulo, caso seja ele pegará o primeiro item.***/
                    val selectedItem by remember(currentyDestination) {
                        val item = currentyDestination?.let { destination ->
                            bottomAppBarItems.find { it.route == destination.route }
                        } ?: bottomAppBarItems.first()

                        mutableStateOf(item)
                    }
                    val isShowItems = currentyDestination?.let { destination ->
                        bottomAppBarItems.find {
                            it.route == destination.route
                        }
                    } != null
                    val isShowFab = when (currentyDestination?.route) {
                        AppDestination.Route.MENU, AppDestination.Label.BEBIDAS -> true
                        else -> false
                    }
                    PanucciApp(
                        bottomAppBarItemSelected = selectedItem,
                        onBottomAppBarItemSelectedChange = {
                            val route = it.route
                            navController.navigate(route) {
                                launchSingleTop = true
                                popUpTo(route)
                            }
                        },
                        onFabClick = {
                            navController.navigate(AppDestination.Route.CHECKOUT)
                        },
                        isShowTopBar = isShowItems,
                        isShowBottomBar = isShowItems,
                        isShowFab = isShowFab,
                    ) {
                        NavHost(
                            navController = navController,
                            startDestination = AppDestination.Route.HIGHLIGHTS
                        ) {
                            composable(AppDestination.Route.HIGHLIGHTS) {
                                val promoCode = "leal"
                                HighlightsListScreen(
                                    products = sampleProducts,
                                    onNavigateToDetails = { product ->
                                        navController.navigate(
                                            "${AppDestination.Route.PRODUCT_DETAILS}/${product.id}?promoCode=${promoCode}"
                                        )
                                    },
                                    onNavigateToCheckout = {
                                        navController.navigate(AppDestination.Route.CHECKOUT)
                                    }
                                )
                            }
                            composable(AppDestination.Route.MENU) {
                                MenuListScreen(
                                    products = sampleProducts,
                                    onNavigateToDetails = { product ->
                                        navController.navigate(
                                            "${AppDestination.Route.PRODUCT_DETAILS}/${product.id}"
                                        )
                                    }
                                )
                            }
                            composable(AppDestination.Route.DRINKS) {
                                DrinksListScreen(
                                    products = sampleProducts,
                                    onNavigateToDetails = { product ->
                                        navController.navigate(
                                            "${AppDestination.Route.PRODUCT_DETAILS}/${product.id}"
                                        )
                                    }
                                )
                            }
                            composable(
                                "${AppDestination.Route.PRODUCT_DETAILS}/{productId}?promoCode={promoCode}",
                                arguments = listOf(navArgument("promoCode") {
                                    nullable = true
                                })
                            ) { backStackEntry ->
                                val product = backStackEntry.arguments?.getString("productId")
                                val promoCode = backStackEntry.arguments?.getString("promoCode")

                                sampleProducts.find { it.id == product.toString() }
                                    ?.let { product ->

                                        val discount = when (promoCode) {
                                            "leal" -> BigDecimal("0.1")
                                            else -> BigDecimal.ZERO
                                        }
                                        val currentPrice = product.price

                                        ProductDetailsScreen(
                                            product = product.copy(
                                                price = currentPrice - (currentPrice * discount)
                                            ),
                                            onNavigateToCheckout = {
                                                navController.navigate(AppDestination.Route.CHECKOUT)
                                            }
                                        )
                                    } ?: LaunchedEffect(Unit) {
                                    navController.navigateUp()
                                    Toast.makeText(
                                        applicationContext,
                                        getString(R.string.messageProductUnknown),
                                        Toast.LENGTH_SHORT
                                    ).show()
                                }
                            }
                            composable(AppDestination.Route.CHECKOUT) {
                                CheckoutScreen(products = sampleProducts, onPopBackStack = {
                                    navController.popBackStack()
                                })
                            }
                        }
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PanucciApp(
    bottomAppBarItemSelected: BottomAppBarItem = bottomAppBarItems.first(),
    onBottomAppBarItemSelectedChange: (BottomAppBarItem) -> Unit = {},
    onFabClick: () -> Unit = {},
    isShowTopBar: Boolean = false,
    isShowBottomBar: Boolean = false,
    isShowFab: Boolean = false,
    content: @Composable () -> Unit
) {
    Scaffold(
        topBar = {
            if (isShowTopBar) {
                CenterAlignedTopAppBar(
                    title = {
                        Text(text = stringResource(R.string.restaurante_leal))
                    },
                )
            }
        },
        bottomBar = {
            if (isShowBottomBar) {
                PanucciBottomAppBar(
                    item = bottomAppBarItemSelected,
                    items = bottomAppBarItems,
                    onItemChange = onBottomAppBarItemSelectedChange,
                )
            }
        },
        floatingActionButton = {
            if (isShowFab) {
                FloatingActionButton(
                    onClick = onFabClick
                ) {
                    Icon(
                        Icons.Filled.PointOfSale,
                        contentDescription = null
                    )
                }
            }
        }
    ) {
        Box(modifier = Modifier.padding(it)) { content() }
    }
}