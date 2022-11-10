package colecoesEfuncoes

// Max e Min
// maxOf -> retorna o numero
// maxBy -> retorna o objeto que contem o número


fun main() {
    val data = geraDados()

    println(data.maxOf { it.calorias })
    println(data.minOf { it.calorias })

    println(listOf(1, 4, 9).maxOf { it })
    println(listOf(1, 4, 9).maxOrNull())

    println(listOf(1, 4, 9).minOf { it })
    println(listOf(1, 4, 9).minOrNull())

    println(data.maxBy { it.calorias  })

}