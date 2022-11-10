package poo01

class Animal02 (var especie: String){
    var fala: String = ""
        get() {
            println("Acesso get")
            return field
        }
        set(value) {
            println("Acesso set")
            field = value
        }
}

fun main() {
    var a = Animal02("cachorro")
    a.fala = "auuuuu"
    println(a.fala)
}