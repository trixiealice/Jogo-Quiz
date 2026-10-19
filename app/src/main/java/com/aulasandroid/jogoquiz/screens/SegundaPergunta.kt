package com.aulasandroid.jogoquiz.screens

import android.R.attr.bottom
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.aulasandroid.jogoquiz.R

@Composable
fun SegundaPerguntaScreen(modifier: Modifier = Modifier, navController: NavHostController) {

    var alternativasSelecionada by remember { mutableStateOf("") }

    val listaAlternativas = listOf("Vênus", "Marte", "Júpiter", "Saturno")
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFEF98D0))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(modifier = Modifier.height(20.dp))

        Image(
            painter = painterResource(R.drawable.quizimg),
            contentDescription = "Quiz IMG",
            modifier = Modifier.size(50.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Surface(
            color = Color(0xFF86CE95),
            shape = RoundedCornerShape(16.dp),
            border = BorderStroke(1.dp, Color.Black),
            modifier = Modifier.width(240.dp).height(62.dp)

        ) {
            Box(contentAlignment = Alignment.Center) {
                Text(
                    text = "Pergunta 2 de 3",
                    fontSize = 20.sp,
                    color = Color.Black
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Card(
            colors = CardDefaults.cardColors(containerColor = Color.White),
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(horizontal = 8.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Text(
                    text = "Qual planeta é conhecido como planeta vermelho?",
                    fontSize = 20.sp,
                    color = Color.Black
                )

                listaAlternativas.forEach { alternativa ->
                    Button(
                        onClick = {
                            navController.navigate("terceiraPergunta")
                        },
                        colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                        shape = RoundedCornerShape(12.dp),
                        border = BorderStroke(1.dp, Color(0xFFD9D9D9)),
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(55.dp)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.CenterStart
                        ) {
                            Text(
                                text = alternativa,
                                color = Color.Black,
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Normal
                            )
                        }
                    }
                }
            }
        }

    }
}