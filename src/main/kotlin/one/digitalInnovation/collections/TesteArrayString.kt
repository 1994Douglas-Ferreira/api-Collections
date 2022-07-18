package one.digitalInnovation.collections

fun main() {
    val nomes = Array<String>(4) {""}

    nomes[0]="Douglas"
    nomes[1]="Alice"
    nomes[2]="Cassio"
    nomes[3]="Jorge"

    for (nome in nomes){
        println(nome)
    }

    println("---------------------------------")

    nomes.sort()

    nomes.forEach {
        println(it)
    }

    val nomes2 = arrayOf( "Belinha", "Luna","Katrinna", "Floki")

    println("---------------------------------")

    nomes2.sort()

    nomes2.forEach {
        println(it)
    }

}