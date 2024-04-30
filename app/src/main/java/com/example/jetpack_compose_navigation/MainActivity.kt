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

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Jetpack_Compose_NavigationTheme {
                //   ProvideContext {
                // DashboardScreen()
                HomeScreen()
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
        HomeScreen()
    }
}

@Composable
fun App() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "dashboard") {
        composable("dashboard") {
            DashboardScreen() { value ->
                navController.navigate("home/${value}")
            }
        }
        composable(
            "home/{value}",
            arguments = listOf(
                navArgument("value") {
                    type = NavType.StringType
                })
        ) {
            HomeScreen()
        }
    }
}