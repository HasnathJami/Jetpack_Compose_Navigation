package com.example.jetpack_compose_navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.example.jetpack_compose_navigation.screen_s_sn.bottom_nav_screen.MainScreen
import com.example.jetpack_compose_navigation.ui.theme.Jetpack_Compose_NavigationTheme

class MainActivitySSn : ComponentActivity() {
    lateinit var navController: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContent {
            Jetpack_Compose_NavigationTheme {
//                navController = rememberNavController()
//                SetupNavGraph(navController = navController)
                MainScreen()
            }
        }
    }
}

@Preview
@Composable
fun previewScreen() {

}