package one.digitalInnovation.collections

fun main() {
    val values = IntArray(5)
    values[0] = 1
    values[1] = 8
    values[2] = 5
    values[3] = 2
    values[4] = 0
    
    for(valor in values){
        println(valor)
    }
    println("--------------------------------")
    values.forEach { valor ->
        println(valor)
    }
    println("--------------------------------")
    for (index in values.indices){
        println(values[index])
    }
    println("--------------------------------")
    values.sort()//Deixa o array em ordem crescente
    for (valor in values){
        println(valor)
    }
}