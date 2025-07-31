package com.example.todo2.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import kotlinx.coroutines.delay
import com.example.todo2.ui.theme.splashScreenBackground
import com.example.todo2.R
import com.example.todo2.ui.theme.themeColor

@Composable
fun SplashScreen(navController: NavHostController) {
    LaunchedEffect(Unit) {
        delay(5000)
        if (themeColor == null) {
            navController.navigate("Theme") {
                popUpTo("Splash") { inclusive = true }
            }
        }
        else {
                navController.navigate("Task") {
                    popUpTo("Splash") { inclusive = true }
                }
            }
        }
//    Scaffold(
//        content = { innerPadding ->
            Box(modifier = Modifier
//                .padding(innerPadding)
                .fillMaxSize()
                .background(splashScreenBackground)
            ) {
                Column(modifier = Modifier
                    .width(198.dp)
//                    .height(154.dp)
                    .align(Alignment.Center)
                ) {
                    //로고
                    Box(
                        modifier = Modifier
                            .size(100.dp)
                            .align(Alignment.CenterHorizontally)
                            .background(Color.White, shape = RoundedCornerShape(10.dp))
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.check_icon),
                            contentDescription = null,
                            tint = splashScreenBackground,
                            modifier = Modifier
                                .width(77.dp)
                                .height(70.dp)
                                .align(Alignment.Center)
                        )
                    }
//                    Icon(
//                        painter = painterResource(id = R.drawable.splashicon),
//                        contentDescription = null,
//                        modifier = Modifier
//                            .width(100.dp)
//                            .height(100.dp)
////                        .align(Alignment.Center)
//                    )
                    Spacer(modifier = Modifier.height(6.dp))

                    Text(
                        text = "To do lists",
                        style = TextStyle(Color.White),
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                    )

                    Spacer(modifier = Modifier.height(6.dp))

                    Text(
                        text = "A to-do list is your compass for a more",
                        style = TextStyle(Color.White),
                        fontSize = 10.sp,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                    )
                    Text(
                        text = "productive and satisfying day.",
                        style = TextStyle(Color.White),
                        fontSize = 10.sp,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                    )
                    Spacer(modifier = Modifier.height(100.dp))
                }
            }
        }
//    )
//}