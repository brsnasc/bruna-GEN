class Patinete(cor: String, valor: Double, marca: String) {

    var andando = true
    var freando = true
    var parando = true

    fun andar(){
        if(andando){
            println("A menina está andando no patinete.")
        }else{
            andando = false
            println("O patinete não está andando, a roda emperrou.")
        }
    }

    fun frear(){
        if(freando){
            println("A menina está freando o patinete.")
        }else{
            freando = false
            println("O patinete está com o freio frouxo.")
        }
    }

    fun parar(){
        if(parando){
            println("O patinete está parado.")
        }else{
            parando = false
            println("O patinete caiu no chão.")
        }
    }
}