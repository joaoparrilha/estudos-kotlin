class Pessoa (val anoNascimento: Int, var nome: String ){

    var olhos: String = ""

    fun dormir(){
        println("Dormir")
    }
    fun acordar (){
        println("Acordar")
    }
}

fun main() {
    var pessoa: Pessoa = Pessoa(2000, "Fulano")

    println(pessoa.nome)
    pessoa.dormir()
    pessoa.acordar()
    pessoa.olhos = "Preto"
    println(pessoa.olhos)


}
