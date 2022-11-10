package colecoesEfuncoes
//Take e TakeLast
//Take -> pega N elementos começando do primeiro
//TakeLast -> pega N elementos começando pelo ultimo
fun main() {
    val data = geraDados()

    println(data.take(2))
    println(data.takeLast(2))

}