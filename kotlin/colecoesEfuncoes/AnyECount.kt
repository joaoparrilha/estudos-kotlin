package colecoesEfuncoes

// Any e Count
// .any() -> se tiver algum dado presente
// .count() -> quantos dados presentes

fun main() {
    val data = geraDados()
    println("Tenho dados? ${if (data.any()) "Sim" else "Não"}")
    println(listOf<Int>().any())

    println("Tenho ${data.count()} elementos.")
}

fun geraDados(): List<Receita>{
    return listOf(Receita("Lasanha", 1200,
        listOf(
            Ingrediente("Presunto", 5),
            Ingrediente("Queijo", 5),
            Ingrediente("Molho de tomate", 1),
            Ingrediente("Manjericao", 10)
        )
        ),
        Receita("Panqueca", 500),
        Receita("Omelete", 200),
        Receita("Parmegiana", 700),
        Receita("Sopa de feijão", 300),
        Receita("Hamburguer", 2000,
            listOf(
                Ingrediente("Pão", 1),
                Ingrediente("Hamburguer", 3),
                Ingrediente("Queijo", 1),
                Ingrediente("Catupiry", 1),
                Ingrediente("Bacon", 3),
                Ingrediente("Alface", 1),
                Ingrediente("Tomate", 1)
            )
        )
    )
}

data class Receita(val nome: String, val calorias: Int, val ingredientes: List<Ingrediente> = listOf())

data class Ingrediente(val nome: String, val quantidade: Int)


