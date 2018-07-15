package classes

enum class DiaSemana2(val id: Int, val nome: String, val util: Boolean) {
    DOMINGO(1, "Domingo", false),
    SEGUNDA(2, "Segunda-feira", true),
    TERCA(3, "Terça-feira", true),
    QUARTA(4, "Quarta-feira", true),
    QUINTA(5, "Quinta-feira", true),
    SEXTA(6, "Sexta-feira", true),
    SABADO(7, "Sábado", false)
}

fun main(args: Array<String>) {
    for (dia in DiaSemana2.values()) {
        println("${dia.nome} é um dia ${if(dia.util) "útil" else "do fim de semana"}")
    }
}