class produtoEletronico (produto: String, cor: String, gigas:Int, RAM: Int) {

    var ligando = true
    var atualizando = true
    var transmitindo = true
    var desligando = true

    fun ligar(){
        if(ligando){
            println("Iniciando...")
        }else{
            ligando = false
            println("***TELA PRETA***")
        }
    }

    fun atualizar(){
        if(atualizando){
            println("Atualizando 37% de 100%.")
        }else{
            atualizando = false
            println("Houve um erro durante a atualização.")
        }
    }

    fun transmitir(){
        if(transmitindo){
            println("O notebook está transmitindo a tela para o aparelho SMART TV.")
        }else{
            transmitindo = false
            println("Houve um erro ao iniciar a transmissão.")
        }
    }

    fun desligar(){
        if(desligando){
            println("Encerrando...")
        }else{
            desligando = false
            println("O arquivo 'n' está impedindo o desligamento do aparelho, deseja forçar?")
        }
    }

}