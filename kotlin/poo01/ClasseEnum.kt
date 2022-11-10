package poo01

enum class Prioridade (val valor: Int){
    Baixa(1){
        override fun toString(): String {
            return "Prioridade Baixa $valor"
        }
            },
    Media(5),
    Alta(15)
}

enum class AnimalEnum{
    Cachorro, Gato, Cavalo, Vaca
}

fun x (p: Prioridade){}

fun main() {
    x(Prioridade.Baixa)
    for (p in Prioridade.values()){

        println(p)
    }
}