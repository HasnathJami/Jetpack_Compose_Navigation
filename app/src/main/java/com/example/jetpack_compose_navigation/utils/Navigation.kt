package com.example.jetpack_compose_navigation.utils

sealed class Navigation(val route:String) {
    object DashBoard : Navigation("dashboard")
    object Home: Navigation("home")
}
