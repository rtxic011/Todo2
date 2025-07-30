package com.example.todo2.ui.screens

import android.R
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import com.example.todo2.ui.theme.themered
import com.example.todo2.ui.theme.themeyellow
import com.example.todo2.ui.theme.themegreen
import com.example.todo2.ui.theme.themeblue
import com.example.todo2.ui.theme.themeColor


@Composable
fun ThemeScreen(navController: NavHostController) {
    var selectedColor by remember { mutableStateOf<Color?>(null) }


    ColorBox(themeblue, false, {selectedColor = themeblue})
    ColorBox(themegreen, false, {selectedColor = themegreen})
    ColorBox(themered, false, {selectedColor = themered})
    ColorBox(themeyellow, false, {selectedColor = themeyellow})
}


@Composable
fun ColorBox (
    headColor: Color,
    isSelected : Boolean,
    onClick: () -> Unit
) {
    
}