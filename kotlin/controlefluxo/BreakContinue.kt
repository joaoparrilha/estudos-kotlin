package controlefluxo

fun main() {

    val str = "jdsnsaldmalsa"

    for(char in str){
        if (char == 'a'){
            println("Team a")
            break
        } else {
            println("Nao em a")
        }
    }

    var i = 0
    while (i < 10000000){
        if (i == 50){
            break
        }
        println("$i")
        i++
    }

    var j =0

    while (j < 80){
        if (j < 50){
            j++
            continue
        }
        println("$j")
        j++
    }

}