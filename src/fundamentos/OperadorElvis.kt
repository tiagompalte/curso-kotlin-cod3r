package fundamentos

fun main(args: Array<String>) {
    val opcional: String? = null
    val obrigatorio: String = opcional ?: "Valor Padrão" // ?: => operador Elvis

    println(obrigatorio)
}