package avancado

fun fatorial(num: Int) : Int = num * if (num > 1) fatorial(num-1) else 1

fun main(args: Array<String>) {
    println(fatorial(6))
}