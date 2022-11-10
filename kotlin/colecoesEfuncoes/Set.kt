package colecoesEfuncoes
// Set nao aceita valores duplicados
// Nao é ordenado (NAO POSSUI INDEX)
fun main() {

    val set1: Set<String> = setOf<String>("Paris", "Berlim", "Madrid", "Madrid")
    val set2: MutableSet<String> = mutableSetOf<String>()

    println(set1)
    set2.add("São Paulo")
    set2.add("Rio de Janeiro")
    println(set2.contains("São Paulo"))

    //set2[0]
    //set2.removeAt() -> nao possui index
    println(set2.size)
    set2.clear()

}