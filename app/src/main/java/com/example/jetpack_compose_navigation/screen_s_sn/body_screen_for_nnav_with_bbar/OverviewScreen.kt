package com.example.jetpack_compose_navigation.screen_s_sn.body_screen_for_nnav_with_bbar

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun OverviewScreen(navController: NavController) {
    val lifecycleOwner = LocalLifecycleOwner.current
    DisposableEffect(lifecycleOwner) {
        val observer = LifecycleEventObserver { _, event ->
            when (event) {
                Lifecycle.Event.ON_START -> {
                    Log.d("checkLifeCycle", "ON_START")
                    println("ON_START")
                }
                Lifecycle.Event.ON_STOP -> {
                    println("ON_STOP")
                    Log.d("checkLifeCycle", "ON_STOP")
                }
                Lifecycle.Event.ON_DESTROY -> {
                    println("ON_DESTROY")
                    Log.d("checkLifeCycle", "ON_DESTROY")
                }
                Lifecycle.Event.ON_PAUSE -> {
                    println("ON_PAUSE")
                    Log.d("checkLifeCycle", "ON_PAUSE")
                }
                else -> {}
            }
        }

        lifecycleOwner.lifecycle.addObserver(observer)

        onDispose {
            lifecycleOwner.lifecycle.removeObserver(observer)
        }
    }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center

    ) {
        Text(
            text = "Overview",
            color = Color.Blue,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.clickable {
               // navController.popBackStack()
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun OverviewScreenPreview() {
    OverviewScreen(navController = rememberNavController())
}