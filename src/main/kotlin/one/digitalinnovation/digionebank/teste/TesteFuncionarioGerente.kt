package one.digitalinnovation.digionebank.teste


import one.digitalinnovation.digionebank.Gerente
import kotlin.math.log


fun main(){

    val maria = Gerente("Maria da Silva", "222.222.222-22",5000.0, "senha123")

    ImprimeRelatorioFuncionario.imprime(maria)

    TesteAutenticacao().autentica(maria)
}
