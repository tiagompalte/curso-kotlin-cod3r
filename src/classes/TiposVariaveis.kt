package classes

val diretamenteNoArquivo = "Bom dia" // String

fun topLevel() {
    val local = "Fulano!"
    println("$diretamenteNoArquivo $local")
}

class Coisa {
    var variavelDeInstancia: String = "Boa noite"

    companion object {
        @JvmStatic val constanteDeClasse = "Ciclano"
    }

    fun fazer() {
        val local: Int = 7 // Não há conflito de nomes pois as duas variáveis estão em escopo diferente

        if(local > 3) {
            val variavelDeBloco = "Beltrano"
            println("$variavelDeInstancia, $constanteDeClasse, $local e $variavelDeBloco")
        }
    }
}

fun main(args: Array<String>) {
    topLevel()
    Coisa().fazer()
    println(Coisa.constanteDeClasse)
}

