package one.digitalInnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0,500.0,1500.0,2050.6,3500.0,9586.96)

    for (salario in salarios){
        println(salario)
    }

    println("-------------")
            //Maior valor do Array
    println("Maior salario: ${salarios.max()}")//Depreciado
    println("Maior salario: ${salarios.maxOrNull()}")//Recomendado
    println("-------------")
            //Menor valor do Array
    println("Menor salario: ${salarios.min()}") //Depreciado
    println("Menor salario: ${salarios.minOrNull()}" )//Recomendado
    println("-------------")
            //Media de valores do Array
    println("Media dos salarios: ${salarios.average()}" )
            // Filtra os valores do Array
    val salarioFilterMaiorQue2500 = salarios.filter { it > 2500.0 }
    println("-------------")
    salarioFilterMaiorQue2500.forEach { println(it) }

    println("-------------")
    //Procura dentro do array em um raio de 2000 e 5000 quantos valores existem
    println(salarios.count {it in 2000.0 .. 5000.0 })

    println("-------------")
    //Procura um elemento se não for encontrado retorna null
    println(salarios.find {it == 1500.0})

    println("-------------")
    //Procura o valor e retorna true se encontrar e false se não
    println(salarios.any {it == 1100.0})

}