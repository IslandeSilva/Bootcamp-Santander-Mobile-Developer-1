package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main(){
    val islande = Pessoa(nome = "Islande Silva", cpf = "000.000.000-00")

    println(islande.nome)
    println(islande.cpf)

    val joao = Funcionario(nome = "Joao", cpf = "111.111.111-11", BigDecimal.valueOf(2000.0))

    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
}