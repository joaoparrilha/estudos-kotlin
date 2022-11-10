package controlefluxo

fun main() {

    bonificacao("Gerente",1)
    bonificacao("coordenador", 3)
    bonificacao("Engenheiro", 2)
    bonificacao("estagiario", 3)

    println(false && false && true && true)
    println(!false && !false &&(true && true))
    println(false && ((false || true) || true))
    println(false || ((!false && true) || !true))

}

fun bonificacao(cargo: String, ano: Int){
    val cargo = cargo.lowercase()
    if (cargo == "gerente"){
        if(ano < 2){
            println("R$ 2000,00")
        } else {
            println("R$ 3000,00")
        }

    } else if (cargo == "coordenador"){
        if (ano < 1){
            println("R$1500,00")
        } else {
            println("R$ 1800,00")
        }
    } else if (cargo == "engenheiro"){
        println("R$1000,00")
    } else {
        println("R$500,00")
    }
}

