package poo02

// Object(precisa de nome) & companion object(nao precisa de nome)

fun main() {
    Matematica.PI
    Matematica.teste()
    Matematica.obj1
}

class Matematica {
    // companion object faz o atributo ou metodo pertencer a classe
    companion object {
        val PI = 3.1415
        fun teste (){}
    }

    object obj1 {

    }

    object  obj2 {

    }



}