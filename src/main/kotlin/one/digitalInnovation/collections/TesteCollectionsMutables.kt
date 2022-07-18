package one.digitalInnovation.collections

fun main() {
    val joao = Funcionarios("Joao", 2500.0,"CLT")
    val cesar = Funcionarios("Cesar", 1500.0,"PJ")
    val james = Funcionarios("James", 4000.0,"CLT")

    val funcionarios = mutableListOf(joao,cesar)
    funcionarios.forEach{ println(it)}

    println("-------------LIST--------------")

    funcionarios.add(james)
    funcionarios.forEach { println(it) }

    println("-------------LIST--------------")

    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("-------------SET--------------")

    val funcionariosSet = mutableSetOf(joao)
    funcionariosSet.forEach { println(it) }

    println("-------------SET--------------")

    funcionariosSet.add(james)
    funcionariosSet.add(cesar)
    funcionariosSet.forEach { println(it) }

    println("-------------SET--------------")

    funcionariosSet.remove(joao)
    funcionariosSet.forEach { println(it) }
}