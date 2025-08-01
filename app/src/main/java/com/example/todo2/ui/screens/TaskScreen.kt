package com.example.todo2.ui.screens

import android.graphics.fonts.Font
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.todo2.ui.theme.themeColor
import com.example.todo2.ui.theme.themeblue
import com.example.todo2.R
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Locale




@Composable
fun TaskScreen (navController: NavHostController) {

    Column {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 110.dp)
        ) {
            Column(
                modifier = Modifier
//                    .fillMaxWidth()
                    .align(Alignment.Center)

            ) {
                Text(
                    text = "Today",
                    style = TextStyle(
                        Color.Black,
                        fontSize = 26.sp,
                        fontWeight = FontWeight.Bold,
//                        textAlign = TextAlign.Center
                    ), modifier = Modifier
                )

                Spacer(modifier = Modifier.height(7.dp))

                Text(
                    text = "Best platform for creating to-do lists",
                    style = TextStyle(
                        Color.Gray,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
//                        textAlign = TextAlign.Center
                    )
                )
            }
        }
        Spacer(modifier = Modifier .height(45.dp))

        examplebox(themeColor)
    }
}

@Composable
fun examplebox(
    headColor: Color?
) {
    val dateText = remember { getToday() }

    Column(modifier = Modifier
        .fillMaxWidth()
        .height(154.dp)
    ) {
        //box
        Column ( modifier = Modifier
            .width(350.dp)
            .height(135.dp)
            .align(Alignment.CenterHorizontally)
//            .align(Alignment.Center)
            .shadow(8.dp, RoundedCornerShape(18.dp))
            .background(Color.White, shape = RoundedCornerShape(18.dp))
        ){
            Row( modifier = Modifier
                .width(350.dp)
                .height(49.dp)
//                .align(Alignment.TopStart)
                .background(headColor ?: themeblue, shape = RoundedCornerShape(topStart = 18.dp, topEnd = 18.dp))
            ) {
                Spacer(modifier = Modifier .width(10.dp))

                Text(text = "Add your task",
                    style = TextStyle(
                        Color.Gray,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
//                        textAlign = TextAlign.Start
                    ), modifier = Modifier
                        .align(Alignment.CenterVertically)
                )
            }

            Spacer(modifier = Modifier .height(20.dp) )

            Row(modifier = Modifier
                .align(Alignment.CenterHorizontally)
            ) {
                Icon(painter = painterResource(id = R.drawable.plus_icon ),
                    contentDescription = null,
                    modifier = Modifier
                        .size(26.dp)
                )

                Spacer(modifier = Modifier .width(8.dp))

                Text(text = "Tap to create a new task",
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
            }
            Spacer(modifier = Modifier.height(15.dp))

            Box(modifier = Modifier
                .width(340.dp) ) {
//                Spacer(modifier = Modifier .width(60.dp))

                Text( text = dateText,
                    style = TextStyle(
                        Color.Gray,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                    ), modifier = Modifier
                    .align(Alignment.BottomEnd)
                )
            }
        }
    }
}

fun getToday(): String {
    val today = LocalDate.now()
    val nowdate = DateTimeFormatter.ofPattern("EEE dd LLL yyyy", Locale.ENGLISH)
    return "Today · ${today.format(nowdate)}"
}