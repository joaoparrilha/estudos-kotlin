package excecoesEnull

fun main() {
    val str: String? = null

    if (str == null){
        println("nulo")
    } else {
        println(str)
    }
    //elvis (não é ternario)
    println(str ?: "nulo")

    //Ternario
    // nao existe tenario em kotlin, ja que o if else faz o papel

    val idade = 18
    // var ternario = idade > 18? "Maior" : "Menor"
    // maneira correta com if e else no kotlin

    val ternario = if (idade >= 18) "Maior" else "Menor"
    println(ternario)

}