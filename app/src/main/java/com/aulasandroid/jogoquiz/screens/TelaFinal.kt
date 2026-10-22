package com.aulasandroid.jogoquiz.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.aulasandroid.jogoquiz.R

@Composable
fun TelaFinalScreen (modifier: Modifier = Modifier, navController: NavController) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF00C4FF))
            .padding(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly


    ) {

        Image(
            painter = painterResource(R.drawable.quizimg),
            contentDescription = "Quiz IMG",
            modifier = Modifier.size(180.dp)

        )
        Text(
            text = "QUIZATRON 3000",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )

        Button(onClick = {
            navController.navigate("primeira_pergunta")
        },
            colors = ButtonDefaults.buttonColors(Color.Yellow),
            shape = RoundedCornerShape(24.dp),
            border = BorderStroke(1.dp, color = Color.Black),
            modifier = Modifier
                .fillMaxWidth(0.7f)
                .height(50.dp)
        ) {
            Text(
                text = "JOGAR NOVAMENTE!",
                color = Color.Black,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}