package funcoes

fun ordenar(vararg numeros: Int, a: Int): IntArray {
    println("Variável a = $a")
    return numeros.sortedArray()
}

fun main(args: Array<String>) {
    for(n in ordenar(38, 3, 456, 789, 123, 0, a = 1)) {
        print("$n ")
    }
}