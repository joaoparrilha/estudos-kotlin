package colecoesEfuncoes
//Average -> faz a media dos numeros
//nao possui averageBy, precisa trabalho explicitamente com numeros
fun main() {

    val data = geraDados()

    println(listOf(1, 2, 3).average())
    println(data.map { it.calorias }.average())

}