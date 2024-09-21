package com.example.jetpack_compose_navigation.screen_s_sn.body_screen_for_nnav_with_bbar

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.jetpack_compose_navigation.model.User

@Composable
fun InformationScreen(onClick: (user:User) -> Unit) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center

    ) {
        Text(
            text = "Information",
            color = Color.Blue,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.clickable {
                val user = User("Hasnath", 27)
                onClick(user)
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun InformationScreenPreview() {
    InformationScreen() {}
}