package poo02

// private, public, protected

open class Eletronico(var marca: String){

    private val s: String = ""
    private fun ligarCorrente(){}
    fun ligar(){
        ligarCorrente()
    }
    fun desligar(){}
}

class Computador(marca: String): Eletronico(marca){
    fun instalarSoftware(){}
    fun processar(){}
}

fun main() {
    var c: Computador = Computador("Dell")
    c.ligar()
    c.desligar()
    c.marca
}