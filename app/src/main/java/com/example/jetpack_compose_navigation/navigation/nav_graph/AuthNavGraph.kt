package com.example.jetpack_compose_navigation.navigation.nav_graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.jetpack_compose_navigation.screen_s_sn.body_screen.LoginScreen
import com.example.jetpack_compose_navigation.screen_s_sn.body_screen.SignUpScreen
import com.example.jetpack_compose_navigation.utils.utils_s_sn.AUTHENTICATION_ROUTE
import com.example.jetpack_compose_navigation.utils.utils_s_sn.Screen


fun NavGraphBuilder.authNavGraph(navController: NavHostController) {
    navigation(startDestination = Screen.Login.route, route = AUTHENTICATION_ROUTE) {
        composable(route = Screen.Login.route) {
            LoginScreen(navController = navController)
        }

        composable(route = Screen.SignUp.route) {
            SignUpScreen(navController = navController)
        }

    }
}