package lambdas

data class Aluno(val nome: String, val nota: Double)

fun main(args: Array<String>) {
    val alunos = arrayListOf(Aluno("Pedro", 7.4),
                             Aluno("Arthur", 8.0),
                             Aluno("Rafael", 9.7),
                             Aluno("Ricardo", 5.7))

    //Duas funções em uma linha só. Filtrar por nota e ordenar por nome
    val aprovadosSortedByNome = alunos.filter { it.nota >= 7.0 }.sortedBy { it.nome }

    val aprovadosSortedByNota = alunos.filter { it.nota >= 7.0 }.sortedBy { -it.nota }

    println(aprovadosSortedByNome)
    println(aprovadosSortedByNota)
}