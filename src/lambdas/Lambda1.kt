package lambdas

fun main(args: Array<String>) {
    val soma = {x: Int, y: Int ->
        x + y
        // A última linha é o retorno
    }
    println(soma(4, 6))
}