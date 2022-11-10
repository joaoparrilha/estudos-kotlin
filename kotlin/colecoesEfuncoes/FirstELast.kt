package colecoesEfuncoes

fun main() {

    val data = geraDados()

    println("Primeira receita: ${data.first().nome}")
    println("Ultima receita: ${data.last().nome}")

    //listOf<Int>().first() -> erro pois a lista esta vazia

    println(listOf<Int>().firstOrNull())
    println(listOf<Int>().lastOrNull())

}

