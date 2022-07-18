package one.digitalInnovation.collections

fun main() {
    val salario = arrayOf(
        "2000".toBigDecimal(),
        "4000".toBigDecimal(),
        "3500".toBigDecimal()
    )

    println("------------------")
    println(salario.somatoria())

    println("------------------")
    println(salario.media())
}