package fundamentos.operadores

data class Carro(val marca: String, val modelo: String)

fun main(args: Array<String>) {
    val (marca, model) = Carro("Ford", "Fusion")
    println("$marca $model")
}