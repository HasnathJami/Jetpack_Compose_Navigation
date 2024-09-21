package com.example.jetpack_compose_navigation.navigation.nav_graph

import android.util.Log
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.jetpack_compose_navigation.model.User
import com.example.jetpack_compose_navigation.screen_s_sn.body_screen_for_nnav_with_bbar.InformationScreen
import com.example.jetpack_compose_navigation.screen_s_sn.body_screen_for_nnav_with_bbar.OverviewScreen

fun NavGraphBuilder.detailsNavGraph(navController: NavHostController) {
    navigation(route = Graph.DETAILS, startDestination = "INFORMATION") {
        composable(route = "INFORMATION") {
            InformationScreen() { user ->
//                navController.navigate("OVERVIEW/$user")
                // Pass the User object via savedStateHandle
                navController.currentBackStackEntry?.savedStateHandle?.set("user", user)
                navController.navigate("OVERVIEW")
            }
        }

        composable(
            route = "OVERVIEW"
//            route = "OVERVIEW/{user}",
//            arguments = listOf(
//                navArgument("user")
//                {
//                    type = NavType.ParcelableType(User::class.java)
//                }
//            )
        ) { backStackEntry ->
//            val user = backStackEntry.arguments?.getParcelable<User>("user")
            // Retrieve the User object from the savedStateHandle
            val user = navController.previousBackStackEntry?.savedStateHandle?.get<User>("user")
            Log.d("checkUser", user.toString())
            OverviewScreen(navController = navController)
        }
    }
}