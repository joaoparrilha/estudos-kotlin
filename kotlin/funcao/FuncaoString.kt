package funcao

fun main() {

    val str = "Programação Kotlin"

    println(str.length) //tamanho da string
    println(str[0]) // index ou posição
    println(str.startsWith("Pro"))
    println(str.endsWith("abc"))
    println(str.substring(2, 4))
    println(str.replace("Kotlin", "Kotlin é show!"))
    println(str.lowercase())
    println(str.uppercase())
    println(str.trim()) //retira os espaços em branco desnecessarios


}