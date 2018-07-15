package funcoes

fun <E> filter(list: List<E>, filter: (E) -> Boolean): List<E> {
    val listFiltered = ArrayList<E>()
    for (e in list) {
        if(filter(e)) {
            listFiltered.add(e)
        }
    }
    return listFiltered
}

fun withThreeWords(name: String): Boolean {
    return name.length == 3
}

fun main(args: Array<String>) {
    val names = listOf("Ana", "Pedro", "Bia", "Gui", "Rebeca")
    println(filter(names, ::withThreeWords))
}