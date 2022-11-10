package poo02

fun main() {
    val c: Computador2 = Computador2("DELL")
    c.ligar()
    c.desligar()
}

open class Eletronico2(var marca: String){
    private fun corrente(ativo: Boolean){}
    fun ligar(){
        corrente(true)
    }
    open fun desligar(){
        corrente(false)
    }
}
class Computador2(marca: String): Eletronico2(marca){
    fun save(){}
    fun save(a: Int){}
    fun save(a: Float){}

    override fun desligar(){
        save()
        super.desligar() // super para referenciar a classe mae
    }
}