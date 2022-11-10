package controlefluxo

fun main() {

    println("oi")
    val salario = 10000f
    var mes = 0
    var patAna = 0f
    var patPaula = 0f

    do{
        patAna += ( salario * 0.05f) + (salario * 0.05f) + (patAna * 0.002f)
        patPaula += (salario * 0.05f) + (salario * 0.008f)
        mes++

        println("Pat Ana - $patAna --------- Pat Paula $patPaula")
    }while(patAna > patPaula)

    println("Ana- ${(patAna* 0.002f)}")
    println("Paula- ${(patPaula * 0.008)}")
    println("Paula vai passar o patrimonio de Ana no mês $mes")


}