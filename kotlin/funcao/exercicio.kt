package funcao

fun main() {
    transformAnos(2)
    println(quantCarac("Oi"))
    cubo(2)
    println(conversorMilhas(100f))
    troca("ola galerA")
}

fun transformAnos(a: Int){
    var ano = a
    println("$ano anos equivalem a:")
    var meses = ano * 12
    println("$meses meses")
    var dias = meses * 30
    println("$dias dias")
    var horas = dias * 24
    println("$horas horas")
    var minutos = horas * 60
    println("$minutos minutos")
    var segundos = minutos * 60
    println("$segundos segundos")
}

fun quantCarac(a: String) = "Quantidade de caracteres: ${a.length}"

fun cubo (a: Int) = println("O cubo de $a é ${a*a*a}")

fun conversorMilhas(milhas: Float): Float = milhas * 1.6f


fun troca (a: String) = println(a.replace("a", "x", true).lowercase())