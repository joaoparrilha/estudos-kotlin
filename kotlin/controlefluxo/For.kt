package controlefluxo

fun main() {
    for (i in 1..10){
        println("$i")
    }

    for (j in 1..10 step 2){
        println("$j")
    }

    for (k in 20 downTo 0 step 5){
        println("$k")
    }

    val s = "Kotlin é show!"
    for(char in s){
        println("$char")
    }
}