package one.digitalInnovation.collections

fun main() {
    val joao = Funcionarios("Joao", 2500.0,"CLT")
    val cesar = Funcionarios("Cesar", 1500.0,"PJ")
    val james = Funcionarios("James", 4000.0,"CLT")
    val func3 = Funcionarios("Tom", 7000.0,"PJ")

    val funcionarios = listOf(joao,cesar,james,func3)
    funcionarios.forEach { println(it) }

    //println(funcionarios.find { it.nome == "Joao" })//Procurar por nome

    println(" ---------------------")
    funcionarios
        .groupBy {it.tipoContratacao}
        .forEach {println(it)}

}
