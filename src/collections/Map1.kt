package collections

fun main(args: Array<String>) {
    var map = HashMap<Long, String>()

    map.put(10203040, "João")
    map.put(65479854, "Maria")
    map.put(60708090, "Pedro")

    map.put(60708090, "Pedro Filho")

    for (par in map) {
        println(par)
    }

    for(nome in map.values) {
        println(nome)
    }

    for(numero in map.keys) {
        println(numero)
    }

    for((numero, nome) in map) {
        println("$nome (Número: $numero))")
    }

    map.size.print()
    map.get(60708090)?.print() // ? (save null) => pode ser que a key não corresponda a nenhum elemento
    map[10203040]?.print()
    map.contains(65479854)?.print()
    map.remove(65479854)?.print()
    map.clear()
    map.isEmpty().print()
}