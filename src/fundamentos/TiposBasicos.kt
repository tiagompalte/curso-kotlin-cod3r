package fundamentos

fun main(args: Array<String>) {

    // Tipos numéricos inteiros
    val num1: Byte = 127 // 128 já dá problema
    val num2: Short = 32767 // 32767 é o valor máximo
    val num3: Int = 2_147_483_647 // _ para delimitar o valor
    val num4: Long = Long.MAX_VALUE

    // Tipos numéricos reais
    val num5: Float = 3.14F // F => força para o tipo float
    val num6: Double = 3.14

    // Tipo Caractere
    val char: Char = '?'

    // Tipo String
    var str: String = "A boa e velha String"

    // Tipo booleano
    val boolean: Boolean = true // ou false

    // Todos os tipos de variáveis são objetos

    println(listOf(num1, num2, num3, num4, num5, num6, char, str, boolean))

    println(2 is Int)   // true
    println(1.0 is Double)  // true

    //Tudo é objeto
    println(10.dec())

}