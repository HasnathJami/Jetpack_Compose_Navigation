package com.example.jetpack_compose_navigation.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(
            text = "Home Screen",
            color = Color.Black,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Monospace,
            textDecoration = TextDecoration.Underline,
            letterSpacing = 1.sp,
            //lineHeight = 10.sp
//            style = TextStyle(
//                color = Color.Red,
//                fontSize = 50.sp,
//                fontWeight = FontWeight.Thin,
//
//            )
            modifier = Modifier
                .alpha(0.5f)
            //.weight(1f)
        )
        Spacer(
            modifier = Modifier
                .height(18.dp)
            //  .weight(1f)
        )
        Text(

            text = "Home Screen",
            color = Color.Black,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Monospace,
            textDecoration = TextDecoration.Underline,
            letterSpacing = 1.sp,
            //lineHeight = 10.sp
//            style = TextStyle(
//                color = Color.Red,
//                fontSize = 50.sp,
//                fontWeight = FontWeight.Thin,
//
//            )
            modifier = Modifier
                .alpha(0.5f)
            //.weight(1f)
        )
    }
}