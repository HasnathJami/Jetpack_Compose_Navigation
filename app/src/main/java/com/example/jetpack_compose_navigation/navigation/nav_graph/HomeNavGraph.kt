package com.example.jetpack_compose_navigation.navigation.nav_graph

import android.util.Log
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.example.jetpack_compose_navigation.screen_s_sn.DetailsScreen
import com.example.jetpack_compose_navigation.screen_s_sn.HomeScreen
import com.example.jetpack_compose_navigation.utils.utils_s_sn.DETAIL_ARGUMENT_KEY
import com.example.jetpack_compose_navigation.utils.utils_s_sn.DETAIL_ARGUMENT_KEY2
import com.example.jetpack_compose_navigation.utils.utils_s_sn.HOME_ROUTE
import com.example.jetpack_compose_navigation.utils.utils_s_sn.Screen

fun NavGraphBuilder.homeNavGraph(navController: NavHostController) {

    navigation(
        startDestination = Screen.Home.route,
        route = HOME_ROUTE,
    ) {
        composable(
            route = Screen.Home.route
        ) {
            HomeScreen(navController = navController)
        }
        composable(
            route = Screen.Detail.route,
            arguments = listOf(
//                navArgument(DETAIL_ARGUMENT_KEY) {
//                    type = NavType.IntType
//                },
//                navArgument(DETAIL_ARGUMENT_KEY2) {
//                    type = NavType.StringType
//                }

                //for optional argument
                navArgument(DETAIL_ARGUMENT_KEY) {
                    type = NavType.IntType
                    defaultValue = 0
//                    nullable = true //don't need this if we use default value
                },
                navArgument(DETAIL_ARGUMENT_KEY2) {
                    type = NavType.StringType
                    defaultValue = "Hello"
//                    nullable = true //don't need this if we use default value
                }
            )
        ) {
            Log.d("ArgsCheck", it.arguments?.getInt(DETAIL_ARGUMENT_KEY).toString())
            Log.d("ArgsCheck", it.arguments?.getString(DETAIL_ARGUMENT_KEY2).toString())

            DetailsScreen(navController = navController)
        }
    }
}