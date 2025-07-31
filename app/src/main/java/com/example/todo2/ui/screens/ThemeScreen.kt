package com.example.todo2.ui.screens

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.todo2.ui.theme.themered
import com.example.todo2.ui.theme.themeyellow
import com.example.todo2.ui.theme.themegreen
import com.example.todo2.ui.theme.themeblue
import com.example.todo2.ui.theme.themeColor
import com.example.todo2.ui.theme.splashScreenBackground


//var selectedColor = themeblue

@Composable
fun ThemeScreen(navController: NavHostController) {
    var selectedColor by remember { mutableStateOf(themeblue) }

    Column {
        Spacer(modifier = Modifier.height(109.dp))

        Text(text = "Creat to do list",
            style = TextStyle(
                Color.Black,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            ), modifier = Modifier
                .fillMaxWidth()
        )
        Text(text = "Choose your to do list color theme",
            style = TextStyle(
                Color.Gray,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            ), modifier = Modifier
                .fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(35.dp))

        ColorBox(themeblue, {selectedColor = it})
        ColorBox(themegreen, {selectedColor = it})
        ColorBox(themered, {selectedColor = it})
        ColorBox(themeyellow,{selectedColor = it})


//        ColorBox(themeblue)
//        ColorBox(themegreen)
//        ColorBox(themered)
//        ColorBox(themeyellow)

        Spacer(modifier = Modifier.height(34.dp))

        choosetheme(selectedColor, navController)

    }
}

//var thisColor = themeblue

//fun onClick(headColor: Color) {
//     thisColor = headColor
//}


@Composable
fun ColorBox (
    headColor: Color,
//    isSelected : Boolean,
    onClick: (Color) -> Unit
) {
    Column (modifier = Modifier
        .fillMaxWidth()
        .height(154.dp)
    ) {
        //box
        Box ( modifier = Modifier
            .width(350.dp)
            .height(135.dp)
            .align(Alignment.CenterHorizontally)
            .shadow(8.dp, RoundedCornerShape(18.dp))
            .background(Color.White, shape = RoundedCornerShape(18.dp))
            .clickable{ onClick(headColor) }
//            .clickable{ selectedColor = headColor }
        ){
            Box( modifier = Modifier
                .width(350.dp)
                .height(49.dp)
                .align(Alignment.TopStart)
                .background(headColor, shape = RoundedCornerShape(topStart = 18.dp, topEnd = 18.dp))
            )
        }
    }
}

@Composable
fun choosetheme (
    thisColor: Color,
    navController: NavHostController
) {
    Column ( modifier = Modifier
        .fillMaxWidth()
        .height(60.dp)
    ) {
        Box(modifier = Modifier
            .width(295.dp)
            .height(41.dp)
            .align(Alignment.CenterHorizontally)
            .shadow(5.dp, shape = RoundedCornerShape(10.dp))
            .background(thisColor, shape = RoundedCornerShape(10.dp))
            .clickable{ themeColor = thisColor; splashScreenBackground = thisColor; navController.navigate("Task") }
        ) {
            Text(text = "Open To do lists",
                style = TextStyle(
                    Color.Black,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
//                    textAlign = TextAlign.Center
                ), modifier = Modifier
                    .align(Alignment.Center)
            )
        }
    }
}