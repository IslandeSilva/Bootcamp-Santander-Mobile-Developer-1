package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Analista

fun main(){

    val joao = Analista("Joao da Silva", "111.111.111-11",2000.0)

    ImprimeRelatorioFuncionario.imprime(joao)
}