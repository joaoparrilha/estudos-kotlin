package excecoesEnull

fun main() {
    var s: String? = null
    println(s?.length)

    var abc = readLine()
    println(abc!!.length)
}