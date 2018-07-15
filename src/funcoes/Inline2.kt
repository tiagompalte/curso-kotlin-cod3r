package funcoes

inline fun <T>  executeWithLog(nameFunction: String, function: () -> T): T {
    println("Entrando no método $nameFunction...")
    try {
        return function()
    } finally {
        println("Método $nameFunction finalizado...")
    }
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun main(args: Array<String>) {
    val result = executeWithLog("sum") {
        sum(3, 4)
        1 + 2
    }
    println(result) // Resultado da execução da última função que foi chamada
}