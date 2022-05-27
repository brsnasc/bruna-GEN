class Paciente (nome: String, idade: Int, stm: String, diagnostico: String) {

    var tossindo = true
    var espirrando = true
    var tremendo = true

    fun tossir(){
        if(tossindo){
            println("O paciente está com tosse seca.")
        }else{
            tossindo = false
            println("O paciente parou de tossir.")
        }
    }

    fun espirrar(){
        if(espirrando){
            println("O paciente está tendo crise de espirros.")
        }else{
            espirrando = false
            println("Aparentemente, o paciente está melhorando.")
        }
    }

    fun tremer(){
        if(tremendo){
            println("O paciente está tremendo, ele pode estar com febre.")
        }else{
            tremendo = true
            println("O paciente parou de tremer, mas ficará em observação.")
        }
    }
}