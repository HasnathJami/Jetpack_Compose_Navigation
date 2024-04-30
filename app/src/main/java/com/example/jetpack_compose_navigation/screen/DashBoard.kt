package com.example.jetpack_compose_navigation.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack_compose_navigation.R
import com.example.jetpack_compose_navigation.utils.UiUtils


@Composable
fun DashboardScreen(onClick : (value:String) -> Unit) {
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray),
        //   horizontalAlignment = Alignment.CenterHorizontally
        // verticalArrangement = Arrangement.spacedBy(10.dp)
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = stringResource(id = R.string.dashboard_title, "Jami"),
            //color = colorResource(id = R.color.black)
            color = Color.Gray,
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth()
        )
        UiUtils.addSpace(spaceAmount = R.dimen.scale_16dp)
        var text by remember {
            mutableStateOf("")
        }
        TextField(
            value = text.take(15),
            onValueChange = { newValue ->
                if (newValue.length <= 15) {
                    text = newValue
                }
            },
            modifier =
            Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally)
                .padding(horizontal = dimensionResource(id = R.dimen.scale_30dp))
                .border(1.dp, Color.Red, RoundedCornerShape(18.dp)),

            keyboardOptions = KeyboardOptions(
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(
                onDone = { UiUtils.showToast(context, "click done") }
            ),
            singleLine = true,
            label = { Text(text = "Enter value", color = Color.Gray) },
//            placeholder = {
//                Text(
//                    text = "Enter value", color = Color.Gray
//                )
//            },
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color.LightGray,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            shape = RoundedCornerShape(18.dp)
        )
        UiUtils.addSpace(spaceAmount = R.dimen.scale_10dp)
        Row(
            modifier = Modifier
                .fillMaxWidth(),
        ) {
            //Spacer(modifier = Modifier.weight(1f))
            UiUtils.addSpace(spaceAmount = R.dimen.scale_30dp, isHorizontal = true)
            Text(
                modifier = Modifier
                    .weight(2f)
                    .align(Alignment.CenterVertically),
                text = "Value: $text",
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            // UiUtils.addSpace(spaceAmount = R.dimen.scale_50dp, isHorizontal = true)
            // Spacer(modifier = Modifier.weight(1f))
            Button(
                modifier = Modifier
                    .weight(1f),
                onClick = {
                    onClick(text)
                    UiUtils.showToast(context, "submitted")
                },
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color.White,
                    backgroundColor = Color.Black
                ),
                shape = RoundedCornerShape(10.dp),
                border = BorderStroke(1.dp, Color.White)
                // modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                Text(
                    text = "Submit"
                )
            }
            UiUtils.addSpace(spaceAmount = R.dimen.scale_30dp, isHorizontal = true)
            // Spacer(modifier = Modifier.weight(1f))
        }


    }

}
