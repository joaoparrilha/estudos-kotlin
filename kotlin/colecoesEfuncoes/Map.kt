package colecoesEfuncoes
// Chave e valor
// nao repete chaves, caso se repita, sobreescreve o valor

fun main() {

    val map1: Map<String, String> = mapOf<String, String>(Pair("França", "Paris"), Pair("Alemanha", "Berlim"), Pair("Alemanha", "Berlim"))
    val map2: MutableMap<String, String> = mutableMapOf<String, String>(Pair("França", "Paris"), Pair("Alemanha", "Berlim"))

    println(map1)
    println(map1.entries)
    println(map1.keys)
    println(map1.values)

    map2["Brasil"] = "Brasilia"
    println(map2)

    map2.remove("Brasil")
    println(map2.contains("Brasil"))

    map2.clear()

}