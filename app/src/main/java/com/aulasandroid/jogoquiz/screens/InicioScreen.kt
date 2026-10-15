package com.aulasandroid.jogoquiz.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun ComecarScreen (modifier: Modifier = Modifier, navController: NavController) {
    Row(
        modifier = modifier.fillMaxSize()
            .background(Color(0xFF00C4FF))
            .padding(32.dp)

    ) {
        Text(
            text = "QUIZATRON 3000",
            fontSize = 24.sp,
            color = Color.Black
        )

        Button(onClick = {}) {
            colors = ButtonDefaults.buttonColors(Color.Yellow),
            modifier = Modifier.align(Alignment.Center)
        }
    }
}