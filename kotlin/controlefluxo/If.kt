package controlefluxo

fun main() {

    maiorDeIdade(18)
    maiorDeIdade(15)
    maiorDeIdade(9)
    maiorDeIdade(61)
    print(saudacao(true))

}

fun maiorDeIdade(idade: Int) {
    if (idade in 10..50) {
        println("Maior de idade")
        if(idade >= 60){
            println("Terceira idade")
        }
    } else if (idade < 10) {
        println("Criança")
    } else{
        println("Menor de idade")
    }
}

fun saudacao(dia: Boolean) = if (dia){
        "Bom dia"
    } else {
        "Boa noite"
    }
