package poo01

fun main() {
    val pessoaCriadaParaExecucaoDeTestes = Pessoa(1985, "Frank")
    pessoaCriadaParaExecucaoDeTestes.acordar()
    pessoaCriadaParaExecucaoDeTestes.dormir()

    with(pessoaCriadaParaExecucaoDeTestes){
        this.acordar()
        dormir()
        doc
    }


}