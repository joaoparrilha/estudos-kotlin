package controlefluxo

fun main() {
    println(bonusWhen("Coordenador"))
    val n = 10
    when (n){
        in 1..10 -> println("1..10")
        in 10..100 -> println("10..100")
    }
    val b = true
    when (b) {
        true -> println("True")
        false -> println("False")
    }
}

fun bonusWhen(cargo: String): Float{
    return when(cargo){
        "Gerente" -> {
             2000f
        }
        "Coordenador" -> 1500f
        "Engenheiro" -> 1000f
        "Estagiário" -> 500f
        else -> 0f
    }
}