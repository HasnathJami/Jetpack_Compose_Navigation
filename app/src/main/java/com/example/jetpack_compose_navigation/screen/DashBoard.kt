package com.example.jetpack_compose_navigation.screen

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import com.example.jetpack_compose_navigation.R
import com.example.jetpack_compose_navigation.ui.theme.Teal200

@Composable
fun DashboardScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(

            text = stringResource(id = R.string.dashboard_title, "Jami"),
            //color = colorResource(id = R.color.black)
            color = Teal200,

            )
        Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.scale_10dp)))
        Button(onClick = {

        }) {
            Text(
                text = "Submit"
            )
        }

    }
}