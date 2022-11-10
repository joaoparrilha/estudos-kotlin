package poo01

fun main() {

    var a = Animal("cachorro")
    a.fala()
    Animal("gato").fala()
}

class Animal (var especie: String){
    var fala = ""
    init {
        fala = if (especie == "cachorro"){
            "auau"
        } else if ( especie == "gato"){
            "miau"
        } else {
            ""
        }
    }
    fun fala(){
        println(fala)
    }
}