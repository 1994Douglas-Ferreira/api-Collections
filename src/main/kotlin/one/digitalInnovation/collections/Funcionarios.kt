package one.digitalInnovation.collections

data class Funcionarios(
    val nome: String,
    val salario:Double,
    val tipoContratacao: String
){
    override fun toString(): String = """
        Nome -      $nome
        Salario -   $salario
    """.trimIndent()

}