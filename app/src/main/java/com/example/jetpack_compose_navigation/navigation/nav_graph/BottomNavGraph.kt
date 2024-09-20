package com.example.jetpack_compose_navigation.navigation.nav_graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.jetpack_compose_navigation.screen_s_sn.bottom_nav_screen.HomeScreen
import com.example.jetpack_compose_navigation.screen_s_sn.bottom_nav_screen.ProfileScreen
import com.example.jetpack_compose_navigation.screen_s_sn.bottom_nav_screen.SettingsScreen
import com.example.jetpack_compose_navigation.utils.utils_s_sn.BottomBarScreen

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route,
        route = Graph.HOME
    ) {
        composable(route = BottomBarScreen.Home.route) {
            HomeScreen(navController = navController)
        }
        composable(route = BottomBarScreen.Profile.route) {
            ProfileScreen()
        }
        composable(route = BottomBarScreen.Settings.route) {
            SettingsScreen()
        }
        detailsNavGraph(navController = navController)
    }
}