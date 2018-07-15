package collections

data class Fruta(var nome: String, var preco: Double)

fun main(args: Array<String>) {
    var frutas = arrayListOf(Fruta("Banana", 1.50),
                             Fruta("Morango", 3.20),
                             Fruta("Maça", 3.20))

    for(fruta in frutas) {
        println("${fruta.nome} - R$ ${fruta.preco}")
    }

    println(frutas.contains(Fruta("Banana", 1.50))) // data class => true

    println(frutas.distinctBy { it.preco })
}