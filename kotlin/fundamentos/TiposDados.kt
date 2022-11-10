/*
Type        Bit
Double      64
Float       32
Long        64
Int         32
Short       16
Byte        8
Boolean     ?
String      ?
Char        ?
Unsigned            do 0 ao 255
* */

fun main() {

    var c: Char = 'a'
    var s: String = "foisajionasofnsao"
    var b: Boolean = false

    var double: Double = 10.0
    var float: Float = 10f
    var long: Long = 10L
    var int: Int = 10
    var short: Short = 10
    var byte: Byte = 10

    var idade: Byte = 40
    var km: Float = 800f

    //declarando variável sem valor
    var numero: Int

    println("Double MIN ${Double.MIN_VALUE} - MAX ${Double.MAX_VALUE}")
    println("Float MIN ${Float.MIN_VALUE} - MAX ${Float.MAX_VALUE}")
    println("Long MIN ${Long.MIN_VALUE} - MAX ${Long.MAX_VALUE}")
    println("Int MIN ${Int.MIN_VALUE} - MAX ${Int.MAX_VALUE}")
    println("Short MIN ${Short.MIN_VALUE} - MAX ${Short.MAX_VALUE}")
    println("Byte MIN ${Byte.MIN_VALUE} - MAX ${Byte.MAX_VALUE}")


    // Unsigned
    println("UNSIGNED - Sem sinal - apenas positivos U antes do tipo de dado")
    println("ULong MIN ${ULong.MIN_VALUE} - MAX ${ULong.MAX_VALUE}")
    println("UInt MIN ${UInt.MIN_VALUE} - MAX ${UInt.MAX_VALUE}")
    println("UShort MIN ${UShort.MIN_VALUE} - MAX ${UShort.MAX_VALUE}")
    println("UByte MIN ${UByte.MIN_VALUE} - MAX ${UByte.MAX_VALUE}")

    val inteiro: UInt = 0u
    val short2: UShort = 0u
    val byte2: UByte = 0u
    val long2: ULong = 0u

}
