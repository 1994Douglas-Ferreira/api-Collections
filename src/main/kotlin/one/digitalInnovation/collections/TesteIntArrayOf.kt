package one.digitalInnovation.collections

fun main() {
    val values = intArrayOf(2,10,15,36,5,0,32)

    values.forEach {
        println(it)
    }

    println("-------------------------")

    values.sort()
    values.forEach {
        println(it)
    }

}