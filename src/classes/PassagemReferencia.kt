package classes

/*
fun porReferencia(velocidade: Int) {
    velocidade++    // Erro: velocidade é constante
}
*/

data class Carro(var marca: String, var modelo: String, var velocidade: Int = 0)

fun porReferencia(carro: Carro) {
    carro.velocidade++
}

fun main(args: Array<String>) {
    var carro1 = Carro("Ford", "Fusion")

    var carro2 = carro1 // É realizado uma cópia, uma nova instância de Carro com os valores de carro1
    carro2.modelo = "Edge"
    println(carro1)

    carro1 = Carro("Audi", "A4")

    porReferencia(carro1)
    porReferencia(carro2)

    println(carro1)
    println(carro2)
}