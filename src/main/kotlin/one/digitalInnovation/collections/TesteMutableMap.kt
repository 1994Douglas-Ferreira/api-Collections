package one.digitalInnovation.collections

fun main() {
    val joao = Funcionarios("Joao", 2500.0,"CLT")
    val cesar = Funcionarios("Cesar", 1500.0,"PJ")
    val james = Funcionarios("James", 4000.0,"CLT")

    val repositorio = Repositorio<Funcionarios>()

    repositorio.create(joao.nome,joao)
    repositorio.create(cesar.nome,cesar)
    repositorio.create(james.nome,james)

    println(repositorio.findById(joao.nome))

    println("----------------------------")

    repositorio.findAll().forEach{ println(it)}

    println("----------------------------")

    repositorio.remove(joao.nome)
    repositorio.findAll().forEach{ println(it)}


}