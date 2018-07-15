package fundamentos

fun main(args: Array<String>) {
    var a: Int? = null // variavel opcional, ela pode ser nula (? => safe call operator)
    println(a?.dec()) // não gera erro
}