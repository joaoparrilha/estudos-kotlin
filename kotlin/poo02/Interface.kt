package poo02

fun main() {

}

interface Selvagem{
    fun atacar()
}

abstract class Mamifero2(nome: String){
    fun acordar (){
        println("acordei")
    }

    fun dormir(){
        println("dormi")
    }

    abstract fun falar ()
}

class Cachorro2(nome: String): Mamifero(nome),Selvagem{
    override fun falar() {

    }

    override fun atacar() {

    }
}