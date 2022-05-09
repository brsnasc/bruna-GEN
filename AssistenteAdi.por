programa
{
	
	funcao inicio()
	{
		cadeia nome
		cadeia MulherHomemUnissexJuvenilKids
		cadeia realizarUmaCompra
		cadeia camisetaAdidasEssentialstenisAdidasRun
		cadeia documento
		cadeia enderecoNumeroCEP
		cadeia formaDePagamentoCartaoDeCredito
		cadeia confirmar
		inteiro parcelamento = 4
		real total = 289.80
		inteiro tamanhoTenis = 37
		real precoCamiseta = 59.90
		real precoTenis = 229.90
		caracter M = 'M'

		escreva("\nBoa tarde, tudo bem? Aqui é a assistente virtual da Adidas.")
		escreva("\nPara prosseguirmos, você irá precisar me informar seu nome.\n")
		leia(nome)
		escreva("Tudo certo! Em que posso te ajudar?\n")
		leia(realizarUmaCompra)
		escreva("Ok. Irei te enviar nossas opções de seções e você poderá me dizer em qual você deseja navegar.")
		escreva("\nMulher\nHomem\nUnissex\nJuvenil\nKids\n")
		leia(MulherHomemUnissexJuvenilKids)
		escreva("Agora, por favor me informe o nome de um ou mais modelos de produtos que esteja interessado.\n")
		leia(camisetaAdidasEssentialstenisAdidasRun)
		escreva("Ótima(s) escolha(s), ",nome,"!")
		escreva("Agora me informe o(s) tamanho(s) do(s) produto(s).\n")
		leia(M)
		leia(tamanhoTenis)
		escreva("Tudo certo por aqui, ",nome,"! Agora vamos prosseguir com sua compra.\nMe informe seu nome completo.\n")
		leia(nome)
		escreva("Ok. Agora, por favor digite seu CPF. Antes preciso informar que todas as suas informações estarão protegidas, não temos acesso a nenhum dado seu.\n")
		leia(documento)
		escreva("Certo, ",nome,". Agora, por favor informe seu endereço, número e CEP consecutivamente.\n")
		leia(enderecoNumeroCEP)
		escreva("Estamos quase lá! Qual sua forma de pagamento?\n")
		leia(formaDePagamentoCartaoDeCredito)
		escreva("Ok, ",nome,". Deseja parcelar?\n")
		leia(confirmar)
		escreva("Ok, os valores respectivos são: ",precoCamiseta," e ",precoTenis,". O valor total da sua compra é de ",total,".\nVocê confirma a sua compra?\n")
		leia(confirmar)
		escreva("***Compra Realizada***\n")
		escreva("Tudo certo, ",nome,"! Em breve você receberá a confirmação do seu pedido.\nA Adidas agradece a sua compra.")
		
		
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */