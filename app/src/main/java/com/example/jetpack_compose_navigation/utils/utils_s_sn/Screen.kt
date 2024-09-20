package com.example.jetpack_compose_navigation.utils.utils_s_sn

const val DETAIL_ARGUMENT_KEY = "id"
const val DETAIL_ARGUMENT_KEY2 = "name"

const val ROOT_ROUTE = "root"
const val HOME_ROUTE = "home"
const val AUTHENTICATION_ROUTE = "authentication"

sealed class Screen(val route: String) {

    object Login : Screen(route = "login_screen")
    object SignUp : Screen("sign_up")
    object Home : Screen(route = "home_screen")

// with Required Arguments
//object Detail : Screen(route = "detail_screen/{$DETAIL_ARGUMENT_KEY}/{$DETAIL_ARGUMENT_KEY2}") {
//    fun passId(id: Int): String {
////            return "detail_screen/$id"
//        return this.route.replace(oldValue = "{$DETAIL_ARGUMENT_KEY}", newValue = id.toString())
//    }
//
//    fun passNameAndId(id: Int, name: String): String {
//        return "detail_screen/$id/$name"
//    }

    // with Optional Arguments
//    object  Detail: Screen(route = "detail_screen?id={id}"){
    object Detail :
        Screen(route = "detail_screen?id={$DETAIL_ARGUMENT_KEY}&name={$DETAIL_ARGUMENT_KEY2}") {
//        fun passId(id:Int = 10):String {
//            return "detail_screen?id=$id"
//        }

        fun passNameAndId(id: Int = 0, name: String = "Jami"): String {
            return "detail_screen?id=$id&name=$name"
        }
    }


}