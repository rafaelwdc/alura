package br.com.alura

fun main() {

    val assistiramCursoAndroid: MutableSet<String> = mutableSetOf("Rafael", "Patricky", "Camila", "Néia", "Dori")
    val assistiramCursoKotlin: MutableSet<String> = mutableSetOf("Steelx","Debler", "Dudinha", "Hiro")
//    val assistiramAmbos: Set<String> = assistiramCursoAndroid + assistiramCursoKotlin
    val assistiramAmbos = mutableSetOf<String>()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)
    assistiramAmbos.add("Intruso")
    println(assistiramAmbos)

    println(assistiramCursoAndroid + assistiramCursoKotlin union assistiramAmbos)
    println(assistiramCursoAndroid union assistiramCursoKotlin + assistiramAmbos)

    println(assistiramAmbos + assistiramCursoKotlin subtract assistiramCursoAndroid)
    println(assistiramAmbos subtract assistiramCursoAndroid + assistiramCursoKotlin)

    println(assistiramCursoAndroid intersect assistiramCursoKotlin + assistiramAmbos)

    val assistiramList = assistiramAmbos.toMutableList()
    assistiramList.add("Rafael")
    println(assistiramList)
    println(assistiramList.toSet())

}

