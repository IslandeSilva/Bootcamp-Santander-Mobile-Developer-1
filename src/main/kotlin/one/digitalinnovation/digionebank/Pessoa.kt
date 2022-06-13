package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Islande Silva"

    var cpf: String = "000.000.000-00"
    private set // Mantem privado somente o SET, atribuir valor

   /* inner class endereco {
        var rua: String = "Rua Teste"
    }*/ // Inner Class - Classe dentro da Classe

    constructor()
    fun pessoainfo() = "$nome e $cpf"
}

fun main(){
    val islande = Pessoa()

    println(islande.pessoainfo())

   // println(islande.nome)
   // println(islande.cpf)
   // println(islande.endereco().rua) //Inner Class - Chamar Classe Interna
}
