package com.example.jetpack_compose_navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.jetpack_compose_navigation.screen.DashboardScreen
import com.example.jetpack_compose_navigation.screen.HomeScreen
import com.example.jetpack_compose_navigation.ui.theme.Jetpack_Compose_NavigationTheme
import com.example.jetpack_compose_navigation.utils.BundleKeys
import com.example.jetpack_compose_navigation.utils.NavigationUtils

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Jetpack_Compose_NavigationTheme {
                //   ProvideContext {
                // DashboardScreen()
                App()
                //     }
            }
        }
    }
}

//@Composable
//fun ProvideContext(content: @Composable () -> Unit) {
//    val context = LocalContext.current
//    content()
//}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Jetpack_Compose_NavigationTheme {
        //DashboardScreen()
        App()
    }
}

@Composable
fun App() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = NavigationUtils.DashBoard.route) {
        composable(NavigationUtils.DashBoard.route) {
            DashboardScreen { inputValue ->
                //navController.navigate(NavigationUtils.Home.route.plus("/${inputValue}"))
                navController.navigate(NavigationUtils.Home.withArgs(inputValue))
            }
        }
        composable(
            route = NavigationUtils.Home.route.plus("/{${BundleKeys.INPUT_VALUE_KEY}}"),
            arguments = listOf(
                navArgument(BundleKeys.INPUT_VALUE_KEY) {
                    type = NavType.StringType
                    defaultValue = null
                    nullable = true
                })
        ) { entry ->
            HomeScreen(entry.arguments?.getString(BundleKeys.INPUT_VALUE_KEY))
        }
    }
}