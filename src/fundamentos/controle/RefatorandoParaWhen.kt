package fundamentos.controle

fun main(args: Array<String>) {
    val nota = 6.5

    when(nota) {
        in 9.0..10.0 -> print("Fantástico")
        in 7.0..8.9 -> print("Parabéns")
        in 4.0..6.9 -> print("Tem como recuperar")
        in 0.0..3.9 -> print("Te vejo no próximo semestre")
        else -> print("Nota inválida")
    }
}