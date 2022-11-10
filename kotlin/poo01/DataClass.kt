package poo01

fun main() {
    val f1 = FormaData(10, 8)
    val f2 = FormaData(10, 8)
    println(f1.equals(f2))
    println(f1.toString())
    println(f1.hashCode())
    println("-------------")
    println(f2.toString())
    println(f2.hashCode())

    var f3 = f1.copy(50)
    println(f3.toString())

}

class Forma (val a: Int, val b: Int){
    override fun equals(other: Any?): Boolean {
        return if (other is Forma){
            (other.a == this.a && other.b == this.b)
        } else {
            false
        }
    }
}


data class FormaData(val a: Int, val b: Int)

data class Endereco(val rua: String, val cep: String, val city: String)
fun endereco(e: Endereco){}