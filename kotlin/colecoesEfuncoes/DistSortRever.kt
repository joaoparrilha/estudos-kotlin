package colecoesEfuncoes
// Distinct, Sorted, Reverse
// Distinct -> retorna uma lista com valores unicos
// Sorted -> ordena a lista
// Reversed -> reverte a lista de tras para frente
fun main() {

    val data = geraDados()

    val lst = listOf(1, 4, 5, 6, 3, 2, 8, 1, 1, 1, 1, 3)

    println(lst.distinct())
    println(data.distinctBy { it.nome }) // checa apenas o nome
    println(data.distinctBy { it }) // checa o objeto inteiro

    println(lst.sorted()) //ordena a lista crescentemente
    println(lst.sortedDescending()) //ordena a lista descrescente

    println(lst.reversed())

}