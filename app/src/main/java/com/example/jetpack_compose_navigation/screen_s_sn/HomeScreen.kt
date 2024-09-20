package com.example.jetpack_compose_navigation.screen_s_sn

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.jetpack_compose_navigation.utils.utils_s_sn.AUTHENTICATION_ROUTE
import com.example.jetpack_compose_navigation.utils.utils_s_sn.Screen

@Composable
fun HomeScreen(navController: NavHostController) {
    Box(
        modifier = Modifier.fillMaxSize(),
//        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "home",
                color = MaterialTheme.colors.primary,
                fontSize = MaterialTheme.typography.h3.fontSize,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.clickable {
                    //                navController.navigate(route = Screen.Detail.passNameAndId(id = 100, name = "Jami"))
                    navController.navigate(route = Screen.Detail.passNameAndId())
                    //                navController.navigate(route = "detail_screen?id={id}")
                }
            )

            Spacer(modifier = Modifier.height(30.dp))
            Text(
                text = "Login/SignUp",
                color = MaterialTheme.colors.primaryVariant,
                fontSize = MaterialTheme.typography.h5.fontSize,
                fontWeight = FontWeight.Light,
                modifier = Modifier
                    .clickable {
                        navController.navigate(AUTHENTICATION_ROUTE)
                    }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(navController = rememberNavController())
}