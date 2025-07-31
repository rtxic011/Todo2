package com.example.todo2.ui.screens

import android.graphics.fonts.Font
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun TaskScreen (navController: NavHostController) {

    Box ( modifier = Modifier
        .fillMaxWidth()
        .padding(top = 110.dp)
    ){
        Column( modifier = Modifier
//            .fillMaxWidth()
            .align(Alignment.Center)
        ) { Text(text = "Today",
            style = TextStyle(
                Color.Black,
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold,
//                textAlign = TextAlign.Center
            ), modifier = Modifier
        )

            Spacer(modifier = Modifier.height(7.dp))

            Text(text = "Best platform for creating to-do lists",
                style = TextStyle(
                    Color.Gray,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
//                    textAlign = TextAlign.Center
                )
            )
        }
    }
}