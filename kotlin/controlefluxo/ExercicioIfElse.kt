package controlefluxo

fun main() {

    //quadrado()
    //equilatero()
    portaria()

}

fun quadrado (){
    print("Informe o lado 1: ")
    val lado1 = readLine()
    print("Informe o lado 2: ")
    val lado2 = readLine()

    if (lado1 != null && lado1 != "" && lado2 != null && lado2 != "") {
        val x = lado1.toInt()
        val y = lado2.toInt()
        if (x == y) {
            println("é um quadrado")
        } else {
            println("não é um quadrado")
        }
    } else {
        println("Números inválidos")
    }
}

fun equilatero(){
    print("Digite o primeiro lado: ")
    val lado1 = readLine()
    print("Digite o segundo lado:")
    val lado2 = readLine()
    print("Digite o terceiro lado: ")
    val lado3 = readLine()

    if (lado1 != null && lado1 != "" && lado2 != null && lado2 != "" && lado3 != null && lado3 != ""){
        val x = lado1.toInt()
        val y = lado2.toInt()
        val z = lado3.toInt()
        if (x == y && x == z && y == z){
            println("é equilatero")
        }else{
            println("não é equilatero")
        }
    } else {
        println("números inválidos")
    }
}

fun portaria (){

    print("Digite a idade: ")
    val idade = readLine()
    print("Digite o tipo do convite: ")
    val convite = readLine()
    print("Digite o código do convite: ")
    val codigo = readLine()

    if (idade != null && idade != "" && convite != null && convite != "" && codigo != null && codigo != "") {
        if (idade.toInt() >= 18){
            if (convite == "comum" || convite == "premium" || convite == "luxo"){
                   if(codigo.startsWith("XL") || codigo.startsWith("XT")) {
                       println("Welcome :)")
                   }else {
                       println("Negado. Convite inválido 1 ")
                   }
                }
            }else {
                println("Negado. Convite inválido 2")
            }
    }else {
        println("Negado. Menores de idade não permitidos")
    }
}






