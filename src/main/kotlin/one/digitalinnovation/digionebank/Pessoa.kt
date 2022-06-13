package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Islande Silva"

    var cpf: String = "000.000.000-00"
    private set // Mantem privado somente o SET, atribuir valor

   /* inner class endereco {
        var rua: String = "Rua Teste"
    }*/ // Inner Class
}

fun main(){
    val islande = Pessoa()

    println(islande.nome)
    println(islande.cpf)

   // println(islande.endereco().rua) Inner Class
}
