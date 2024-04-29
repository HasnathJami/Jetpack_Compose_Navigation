package com.example.jetpack_compose_navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpack_compose_navigation.screen.DashboardScreen
import com.example.jetpack_compose_navigation.screen.showToast
import com.example.jetpack_compose_navigation.ui.theme.Jetpack_Compose_NavigationTheme
import com.example.jetpack_compose_navigation.ui.theme.Teal200

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Jetpack_Compose_NavigationTheme {
             //   ProvideContext {
                    DashboardScreen()
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
        DashboardScreen()
    }
}