package one.digitalInnovation.collections

fun main() {
    val salarios = DoubleArray(3)

    salarios [0] = 2050.0
    salarios [1] = 2700.0
    salarios [2] = 3200.0

    salarios.forEach {
        println(it)
    }

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }
    println("-------------------------------")
    salarios.forEach {
        println(it)
    }

    val bonus = doubleArrayOf(3000.0,1500.0,2469.1,3598.0)

    bonus.sort()
    println("-------------------------------")
    bonus.forEach {
        println(it)
    }
}