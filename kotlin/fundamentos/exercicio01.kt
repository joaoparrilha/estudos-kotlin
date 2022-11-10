package fundamentos

fun main() {
    var nome= "João Parrilha"
    var texto: String
    val tamanhoPe: Byte = 40
    val pibBrasil: Double = 1869000000000.0
    val popBrasil: Float = 211000000f
    val pibCapita = pibBrasil / popBrasil
    println("R$ ${pibBrasil / popBrasil}")
    println("O PIB per capita é R$ $pibCapita")

}