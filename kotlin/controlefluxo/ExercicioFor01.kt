package controlefluxo

fun main() {
    crescente()
    descrescente()
    semMultCinco()
    somaIntervalo()
    escada(4)
}

fun crescente(){
    for (i in  1..50){
        print("$i ")
    }
}

fun descrescente (){
    for (j in 50 downTo  1) {
        print("$j ")
    }
}

fun semMultCinco(){
    for (i in 1 ..50){
        if (i % 5 == 0){
            continue
        }
        print("$i ")
    }
}

fun somaIntervalo(){
    var contador = 0
    for (i in 1..500){
        contador += i
    }
    println("$contador")
}

fun escada(num: Int){
    for (i in 1..num){
        for(j in 1..i){
            print("#")
        }
        println()
    }
}