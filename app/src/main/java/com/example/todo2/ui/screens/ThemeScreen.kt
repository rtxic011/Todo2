package com.example.todo2.ui.screens

import android.R
import androidx.compose.foundation.background
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


@Composable
fun ThemeScreen(navController: NavHostController) {
    var selectedColor by remember { mutableStateOf<Color?>(null) }

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

        Spacer(modifier = Modifier.height(24.dp))

        ColorBox(themeblue, false, {selectedColor = themeblue})
        ColorBox(themegreen, false, {selectedColor = themegreen})
        ColorBox(themered, false, {selectedColor = themered})
        ColorBox(themeyellow, false, {selectedColor = themeyellow})
    }
}


@Composable
fun ColorBox (
    headColor: Color,
    isSelected : Boolean,
    onClick: () -> Unit
) {
    Column (modifier = Modifier
//        .height(143.dp)
    ) {
        Spacer(modifier = Modifier .height(11.dp))

        //box
        Box ( modifier = Modifier
            .width(350.dp)
            .height(135.dp)
            .shadow(8.dp, RoundedCornerShape(18.dp))
            .background(Color.White, shape = RoundedCornerShape(18.dp))
        ){

        }

        Spacer(modifier = Modifier.height(34.dp))
    }
}