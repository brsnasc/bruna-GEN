fun main(){

    val paciente = Paciente("Bernardo", 24, "Amarelo", "Broncoespasmo")

    paciente.tossir()

    paciente.espirrar()

    paciente.tremer()
}

/*STM ou Sistema de Triagem Manchester, é uma metodologia cietífica utilizada para organizar a demanda de pacientes
que procuram atendimento. Esse sistema é utilizado na emergência para identificar as prioridades médicas antes da
avaliação médica. A escala de prioridades são definidas por cores cores, que no caso, são elas: vermelho como emergência,
laranja como muito urgente, amarelo como urgente, verde como pouco-urgente e azul como não-urgente.

Fonte: https://www.accamargo.org.br/pacientes/como-funciona-o-sistema-de-triagem-de-manchester-na-emergencia */