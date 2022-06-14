package one.digitalinnovation.digionebank.teste


import one.digitalinnovation.digionebank.Gerente


fun main(){

    val maria = Gerente("Maria da Silva", "222.222.222-22",5000.0)

    ImprimeRelatorioFuncionario.imprime(maria)
}
