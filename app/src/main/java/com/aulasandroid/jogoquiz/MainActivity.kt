package com.aulasandroid.jogoquiz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.aulasandroid.jogoquiz.ui.theme.JogoQuizTheme
import com.aulasandroid.jogoquiz.screens.ComecarScreen
import com.aulasandroid.jogoquiz.screens.PrimeiraPerguntaScreen
import com.aulasandroid.jogoquiz.screens.SegundaPerguntaScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JogoQuizTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val navController = rememberNavController()


                    NavHost(
                        navController = navController,
                        startDestination = "inicio",
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        composable("inicio") {
                            ComecarScreen(navController = navController)
                        }

                        composable ( route = "primeira_pergunta" ) {
                            PrimeiraPerguntaScreen(navController = navController)
                        }

                        composable ( route = "segunda_pergunta") {
                            SegundaPerguntaScreen(navController = navController)
                        }

                        composable ( route = "terceira_pergunta") {
                            TerceiraPerguntaScreen(navController = navController)
                        }


                    }
                }
            }
        }
    }
}
