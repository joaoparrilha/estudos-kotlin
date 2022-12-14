package poo02

interface Event {
    fun onSuccess()
}

class Programa {

    fun salvar(e: Event) {
        println("Abrindo conexões")
        println("Salvando valores")
        println("Sucesso. Conexõs fechadas.")
        e.onSuccess()
    }
}

fun main() {
    val p = Programa()
    p.salvar(object: Event {
        override fun onSuccess() {
            println("onSuccess")
        }
    })
}