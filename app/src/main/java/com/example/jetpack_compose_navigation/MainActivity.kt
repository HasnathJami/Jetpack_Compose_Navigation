package com.example.jetpack_compose_navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
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
                //testScreen()
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
        App()
        //testScreen()
    }
}

@Composable
fun testScreen() {

    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (upperText, submitButton) = createRefs()
        
        Text(
            text = "Jami Chowdhury",
            //modifier = Modifier.fillMaxWidth()
            modifier = Modifier.constrainAs(upperText) {
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }
        )
        Button(
            onClick = {},
            modifier = Modifier.constrainAs(submitButton) {
                top.linkTo(upperText.bottom)
                start.linkTo(upperText.start)
                end.linkTo(upperText.end)
            }
        ) {
            Text(text = "Submit")
        }
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