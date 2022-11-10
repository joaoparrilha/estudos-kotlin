package controlefluxo

fun main() {
    //baloes()
    //fizzBuzz()
    //reverter("joaozin 123")
    println(XO("oxxo"))
}

fun baloes(){
    var contador = 0
    while(contador <= 2000){
        contador+= 7
    }
    println("Será possível colocar ${contador / 7} balões")
}

fun fizzBuzz (){
    var contador = 0
    while(contador <= 50){
        if(contador % 3 == 0 && contador % 5 ==0){
            println("$contador FizzBuzz")
        } else if (contador % 3 == 0){
            println("$contador Buzz ")
        } else if(contador % 5 == 0){
            println("$contador Fizz")
        }else {
            println("$contador")
        }
        contador ++
    }
}

fun reverter(texto: String){
    var contadorLength: Int = texto.length
    if (texto != null) {
        while(contadorLength > 0){
            print(texto[contadorLength-1])
            contadorLength--
        }
    }
}

fun XO(str: String): Boolean{
    var strLower = str.lowercase()
    var contadorX = 0
    var contadorO = 0
    var contador = 0
    while(contador < strLower.length){
        if(strLower[contador] == 'x'){
            contadorX++
        } else if (strLower[contador] == 'o'){
            contadorO++
        }
        contador++
    }

    return contadorO == contadorX && contadorO != 0

}
