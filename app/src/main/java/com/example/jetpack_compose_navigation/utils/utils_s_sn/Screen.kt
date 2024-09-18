package com.example.jetpack_compose_navigation.utils.utils_s_sn

sealed class Screen(val route: String) {
    object Home : Screen(route = "home_screen")
    object Detail : Screen(route = "details_screen")
}