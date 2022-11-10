package colecoesEfuncoes

//Sum e SumOf
//sum() -> soma os valores de uma lista de numeros
//sumOf() -> faz a soma de algo que esteja implicitamente como numero

fun main() {
    val data = geraDados()

    println(listOf<Double>(1.5, 6.5).sum())

    println(data.sumOf { it.calorias })

}