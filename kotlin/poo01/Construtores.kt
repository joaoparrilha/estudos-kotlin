package poo01

// impossivel instanciar
class ConstrutorPrivado private constructor(){}

class Pessoa (val anoNascimento: Int, var nome: String){
    var doc: String? = null

    constructor(anoNascimento: Int, nome: String, doc: String): this(anoNascimento, nome){
        this.doc = doc
    }



    fun dormir(){}
    fun acordar(){}

}


fun main() {

    var pessoa = Pessoa(2000, "Fulano", "223443")

    println(pessoa.doc)
}
