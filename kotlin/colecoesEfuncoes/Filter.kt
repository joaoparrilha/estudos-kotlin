package colecoesEfuncoes

fun main() {
    val data = geraDados()

    println(data.filter { it.nome == "Lasanha"})
    println(data.filter {it.calorias > 500}.any())

    println(data.count{it.calorias > 500})

}