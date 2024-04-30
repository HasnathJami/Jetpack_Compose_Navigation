package com.example.jetpack_compose_navigation.utils

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource

object UiUtils {

    fun showToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }

    @Composable
    fun addSpace(spaceAmount: Int, isHorizontal: Boolean = false) {
        when (isHorizontal) {
            true -> Spacer(modifier = Modifier.width(dimensionResource(id = spaceAmount)))
            else -> Spacer(modifier = Modifier.height(dimensionResource(id = spaceAmount)))
        }
    }
}