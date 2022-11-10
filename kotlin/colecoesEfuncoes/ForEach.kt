package colecoesEfuncoes

fun main() {
    val data = geraDados()

    data.forEach {println(it.nome)}

    data.filter{it.calorias > 500}.forEach{ println(it.nome) }
}