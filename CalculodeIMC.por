programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		escreva("Cálculo de IMC")
		escreva("\nRealize seu cálculo através da calculadora do Índice de Massa Corporal")
		
		real peso
		real altura
		real IMC
		

		escreva("\nQual é o seu peso? ")
		leia(peso)
		
		escreva("\nQual é a sua altura? ")
		leia(altura)

		IMC = peso/(altura*altura)

		se (IMC<=18.5){
			escreva("\nVocê se encontra abaixo do peso.")
			
		}senao se (IMC<=24.9){
			escreva("\nVocê se encontra no peso ideal.") 
			
		}senao se (IMC<=29.9){
			escreva("\nVocê se encontra acima do peso.")
			
		}senao se (IMC<=34.9){
			escreva("\nObesidade Grau I")
			
		}senao se (IMC<=39.9){
			escreva("\nObesdidade Grau II")
			
		}senao se (IMC>=40.0){
			escreva("\nObesdidade Grau III")
		}
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 12; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */