package excecoesEnull

fun main() {

    try {
        val s: String? = null
        println(s!!.length)

        //val db = Banco.open()
        //db.save()

        val a = 10/0

    }catch (e: NullPointerException){
        println("Variável nula")
    }catch (e: ArithmeticException){
        println("Impossível dividir por zero")
    }catch (e: Exception){
        println("Generica")
    } finally {
        // db.close()
        println("Finally")
    }

    println("Fim.")


}