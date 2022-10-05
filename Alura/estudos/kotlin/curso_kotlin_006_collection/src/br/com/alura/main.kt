package br.com.alura

fun main() {

    val assistiramCursoAndroid = listOf("Rafael", "Patricky", "Camila", "Néia", "Dori")
    val assistiramCursoKotlin = listOf("Steelx","Debler", "Dudinha", "Hiro")
    val assistiramAmbos = assistiramCursoAndroid + assistiramCursoKotlin
    println(assistiramAmbos.distinct())


}

