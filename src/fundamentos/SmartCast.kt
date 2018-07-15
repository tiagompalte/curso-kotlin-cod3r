package fundamentos

fun souEsperto(x: Any) {
    if (x is String) {
        println(x.toUpperCase())
    } else if (x is Int) {
        println(x.plus(3))
    }

}