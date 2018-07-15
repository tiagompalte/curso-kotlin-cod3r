package collections

fun Any.print() = println(this)

fun main(args: Array<String>) {
    val conjunto = hashSetOf(3, 'a', "texto", true, 3.14)

    conjunto.add(3).print() // false -> já existe o elemento na lista
    conjunto.add(10).print()

    conjunto.size.print()

    conjunto.remove("a").print() // false -> "a" != 'a' (String != Char)
    conjunto.remove('a').print()

    conjunto.contains('a').print()

    val nums = setOf(1, 2, 3) // somente leitura

    (conjunto + nums).print() // união
    (conjunto - nums).print()

    conjunto.intersect(nums).print() // não muda o conjunto
    conjunto.retainAll(nums) // altera o conjunto
    conjunto.print()
}