package colecoesEfuncoes

fun main() {
    val data = geraDados()

    println(data.filter {it.calorias > 500})
    println(data.map{it.nome})
    println(data.map{Receita(it.nome, it.calorias)})
    println(data.map{ReceitaNIngredientes(it.nome, it.ingredientes.count())})

}

data class ReceitaNIngredientes(val nome: String, val nIngrediente: Int)