package com.example.jetpack_compose_navigation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier.
        fillMaxSize(),
        verticalArrangement = Arrangement.Center

    ) {
        Text(
            text = "Home Screen",
            color = Color.Red
        )
    }
}