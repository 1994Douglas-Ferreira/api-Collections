package one.digitalInnovation.collections

fun main() {
    val joao = Funcionarios("Joao", 2500.0,"CLT")
    val cesar = Funcionarios("Cesar", 1500.0,"PJ")
    val james = Funcionarios("James", 4000.0,"CLT")
    //val tom = Funcionarios("Tom", 7000.0,"PJ")

    val funcionarios1 = setOf(joao)
    val funcionarios2 = setOf(james, cesar)
    val funcionarios3 = setOf(joao, cesar,james)


    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }

    println("-------------------")

    val resultSubstract = funcionarios3.subtract(funcionarios2)
    resultSubstract.forEach { println(it) }

    println("-------------------")

    val resultIntersect = funcionarios3.intersect(funcionarios1)
    resultIntersect.forEach { println(it) }
}