package com.example.jetpack_compose_navigation.utils

sealed class NavigationUtils(val route: String) {
    object DashBoard : NavigationUtils("dashboard")
    object Home : NavigationUtils("home")

    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}
