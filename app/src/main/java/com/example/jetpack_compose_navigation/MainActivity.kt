package com.example.jetpack_compose_navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpack_compose_navigation.screen.HomeScreen
import com.example.jetpack_compose_navigation.ui.theme.Jetpack_Compose_NavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Jetpack_Compose_NavigationTheme {
                //   ProvideContext {
                // DashboardScreen()
                HomeScreen()
                //     }
            }
        }
    }
}

//@Composable
//fun ProvideContext(content: @Composable () -> Unit) {
//    val context = LocalContext.current
//    content()
//}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Jetpack_Compose_NavigationTheme {
        //DashboardScreen()
        HomeScreen()
    }
}