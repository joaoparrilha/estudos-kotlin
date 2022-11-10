package colecoesEfuncoes

// List, Set, Map



fun main() {

    val lst1: List<Int> = listOf(1, 2, 3, 4, 5)
    println(lst1)
    val lst2: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)

    println(lst2[0])
    println(lst2.size)

    //lst1.add() -> nao tem como alterara listas que nao sao mutaveis
    lst2.add(8)
    lst2.add(10)
    println(lst2)

    lst2.remove(8)
    lst2.removeAt(0)
    println(lst2)

    println(lst2.contains(1))
    lst2.clear()
    println(lst2)
}

