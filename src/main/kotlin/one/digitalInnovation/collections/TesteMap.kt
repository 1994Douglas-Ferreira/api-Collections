package one.digitalInnovation.collections

fun main() {
    val paIr: Pair<String, Double> = Pair("Douglas", 2000.0)
    val map1= mapOf(paIr)

    map1.forEach { (x, y) -> println("Chave: $x   valor: $y")  }

    val map2 = mapOf(
        "Aline" to 2000.1,
        "Cesar" to 3000
    )
    map2.forEach { (x, y) -> println("Chave: $x   valor: $y")  }
}