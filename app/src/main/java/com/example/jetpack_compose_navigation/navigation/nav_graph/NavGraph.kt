package com.example.jetpack_compose_navigation.navigation.nav_graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.jetpack_compose_navigation.utils.utils_s_sn.HOME_ROUTE
import com.example.jetpack_compose_navigation.utils.utils_s_sn.ROOT_ROUTE

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = HOME_ROUTE,
        route = ROOT_ROUTE
    ) {
        homeNavGraph(navController = navController)

        authNavGraph(navController = navController)


    }
}