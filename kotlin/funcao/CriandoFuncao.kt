package funcao


fun main() {
    println(hello("João"))
    println("A soma é ${soma(2,3)}")
    helloWorld()
}

fun hello(nome: String): String{
    return "Olá, $nome"
}

fun helloWorld(){
    print("Hello World")
}

fun soma(a: Int, b: Int): Int {
    return a + b
}
