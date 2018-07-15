package lambdas

fun main(args: Array<String>) {
    val alunos = arrayListOf("Pedro", "Tiago", "Jonas")
    alunos.map { it.toUpperCase() }.apply { println(this) } // it => item da lista
}