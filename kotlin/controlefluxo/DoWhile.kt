package controlefluxo

fun main() {

    var i = 0
    do{
        print("$i \n")
        i++
    } while(i == 100)

    while( i == 100){
        print("while")
    }

    do {
        print("Qual seu nome: ")
        val value = readLine()
    }while(value == "")
}