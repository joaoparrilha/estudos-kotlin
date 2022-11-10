package funcao

fun main() {
    println(somaUmaLinha(2, 3))
    helloWorldUmaLinha()
    println(divisao(10f, 5f))
}

fun somaUmaLinha(a: Int, b: Int) = a + b

fun helloWorldUmaLinha() = println("Hello World")

fun divisao(a: Float, b: Float): Float = a / b