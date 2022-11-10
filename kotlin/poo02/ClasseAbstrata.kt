package poo02

abstract class Mamifero (nome: String){

    fun acordar (){
        println("Acordei")
    }

    fun dormir (){
        println("Dormi")
    }

    abstract fun falar()

}

class Cachorro (nome:String): Mamifero(nome){
    override fun falar(){

    }
}

fun main() {
    val m = Cachorro("opa")

}