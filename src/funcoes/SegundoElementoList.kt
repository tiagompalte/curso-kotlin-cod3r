package funcoes

fun <E> List<E>.secondOrNull(): E? = if(this.size >= 2) get(1) else null

fun main(args: Array<String>) {
    val list = listOf("João", "Maria", "Pedro")
    println(list.secondOrNull())
    val list1 = listOf("João")
    print(list1.secondOrNull())
}