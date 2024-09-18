package com.example.jetpack_compose_navigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.jetpack_compose_navigation.screen_s_sn.DetailsScreen
import com.example.jetpack_compose_navigation.screen_s_sn.HomeScreen
import com.example.jetpack_compose_navigation.utils.utils_s_sn.Screen

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(
            route = Screen.Home.route
        ) {
            HomeScreen(navController = navController)
        }
        composable(
            route = Screen.Detail.route
        ) {
            DetailsScreen(navController = navController)
        }
    }
}