fun main(){

    while (true){

        print("Por favor, insira seu nome: ")
        val nome = readln()

        print("Agora, insira o seu endereço: ")
        val endereco = readln()

        print("Por último, insira o seu telefone: ")
        val telefone = readln()

        try {
            val cliente = Cliente(nome, endereco, telefone)

            while (true){

                println("\n# LISTA DE COMPRAS #\n")

                println("1 - Adicionar Produto à Sua Sacola.")
                println("2 - Remover Produtos da Sacola.")
                println("3 - Ver Sacola.")
                println("4 - Encerrar Sessão.\n")

                print("Departamento: ")
                val dep = readln().toInt()

                when(dep){

                    1 -> {
                        println("Insira o nome do produto para adicioná-lo à sua sacola: ")
                        val produto = readln()
                        cliente.adicionarProduto(produto)
                    }

                    2 -> {
                        println("Insira o nome do produto para removê-lo da sua sacola: ")
                        val produto = readln()
                        cliente.adicionarProduto(produto)
                    }

                    3 -> {
                        cliente.listadeCompras()
                    }

                    4 -> break

                    else -> println("Esta opção é inválida.")

                }


            }
            break
        }catch (e: Exception){
            println(e.message)
        }
    }

}