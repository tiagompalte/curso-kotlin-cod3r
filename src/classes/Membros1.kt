package classes

class Data(var dia: Int, var mes: Int, var ano: Int) {
    fun formatar() : String {
        return "$dia/$mes/$ano"
    }
}

fun main(args: Array<String>) {
    var nascimento: Data = Data(19,7,1988)
    println("${nascimento.formatar()}")
    with(nascimento) {
        println("$dia/$mes/$ano")
    }
}