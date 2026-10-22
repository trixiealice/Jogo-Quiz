package com.aulasandroid.jogoquiz.screens

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PrimeiraPerguntaViewModel: ViewModel(){
    data class Pergunta(
        val nome: String,
        val alternativas: List<Alternativa>
    )
    data class Alternativa (
        val texto: String,
        val correta: Boolean
    )

    val perguntas = listOf<Pergunta>(
        Pergunta(
            nome = "Qual a capital da França",
            alternativas = listOf(
                Alternativa("Londres", false),
                Alternativa("Berlim", false),
                Alternativa("Jandira", true),
                Alternativa("Paris", false),
            )
        ),

        Pergunta(
            nome = "Qual personagem de My Little Pony tem o elemento da bondade?",
            alternativas = listOf(
                Alternativa("Apllejack", false),
                Alternativa("Fluttershy", true),
                Alternativa("Rarity", false),
                Alternativa("Rainbow Dash", false),
            )
        )
    )

    private var _indiceAtual = 0

    private val _perguntaAtual = MutableLiveData<Pergunta>()
    val perguntaAtual: LiveData<Pergunta> = _perguntaAtual

    private val _textoHeader = MutableLiveData<String>()
    val textoHeader: LiveData<String> = _textoHeader


    private val _respostaCorreta = MutableLiveData<Boolean?>()
    val respostaCorreta: LiveData<Boolean?> = _respostaCorreta


}