package com.example.jetpack_compose_navigation.navigation.nav_graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.jetpack_compose_navigation.screen_s_sn.body_screen_for_nnav_with_bbar.InformationScreen
import com.example.jetpack_compose_navigation.screen_s_sn.body_screen_for_nnav_with_bbar.OverviewScreen

fun NavGraphBuilder.detailsNavGraph(navController: NavHostController) {
    navigation(route = Graph.DETAILS, startDestination = "INFORMATION") {
        composable(route = "INFORMATION") {
            InformationScreen() {
                navController.navigate("OVERVIEW")
            }
        }

        composable(route = "OVERVIEW") {
            OverviewScreen(navController = navController)
        }
    }
}