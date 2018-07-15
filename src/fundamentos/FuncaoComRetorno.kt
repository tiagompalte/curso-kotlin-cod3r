package fundamentos

/**
 * Função que possui dois parâmetros de entrada com um deles tendo valor padrão
 * @param a primeiro parâmetro
 * @param b segundo parâmetro, com valor padrão 1
 * @return retorna a soma dos dois parâmetros
 */
fun soma(a: Int, b: Int = 1): Int {
    return a + b
}

fun main(args: Array<String>) {
    println(soma(2, 3))
    println(soma(11))
}