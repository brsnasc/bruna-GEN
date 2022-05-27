class Avião (aviacao: String, assentos: Int, classe: String, modelo: String) {

    var andando = true
    var decolando = true
    var voando = true
    var pousando = true

    fun andar(){
        if(andando){
            println("O avião começou a andar.")
        }else{
            andando = false
            println("O avião ainda está parado na pista.")
        }
    }

    fun decolar(){
        if(decolando){
            println("O avião está decolando.")
        }else{
            decolando = false
            println("O avião ainda não está pronto para decolagem.")
        }
    }

    fun voar(){
        if(voando){
            println("O avião já decolou, isso significa que ele já está no ar.")
        }else{
            voando = false
            println("O vôo foi cancelado.")
        }
    }

    fun pousar(){
        if(pousando){
            println("O avião está pousando, chegamos ao nosso destino em segurança.")
        }else{
            pousando = false
            println("Senhoras e senhores, iremos passar por uma área de turbulência, logo, \n" +
                    "haverá um atraso em nosso pouso.")
        }
    }
}