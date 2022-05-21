fun main() {
    println("\n*** SUPERMERCADOS SHIAWASE ***\n")
    val produtos = mutableListOf<String>()
    while (true) {

        println(
            "Olá, seja bem-vinde ao nosso sistema de controle de estoque.\n" +
                    "Insira um número de 1 a 5 para selecionarmos uma opção: \n"
        )
        println("1 - Adicionar produtos ao estoque.")
        println("2 - Remover produtos do estoque.")
        println("3 - Atualizar os produtos do estoque.")
        println("4 - Listar todos os produtos diponíveis no estoque.")
        println("5 - Encerrar.\n")
        println("Insira o n° aqui: ")
        val option = readln().toInt()

        when (option) {

            1 -> {
                do {
                println("Insira o nome do produto para adicioná-lo ao estoque: ")
                val produto = readln()
                if (produto != "") {
                    produtos.add(produto)
                } else {
                    break
                }
            } while (produto != "")
        }

            2 -> {
                println("Insira o nome do produto para deletá-lo do estoque: ")
                val produto = readln()
                if (produtos.contains(produto)) {
                    produtos.remove(produto)
                    break
                } else {
                    println("Desculpe, o produto '$produto' não consta no estoque.")
                }
            }

            3 -> {

                println("Insira o nome do produto que você queira editar: ")
                val att = readln()

                if (produtos.contains(att)) {
                    val index = produtos.indexOf(att)
                    println("Por gentileza, insira o nome do novo produto: ")
                    val produto = readln()

                    produtos[index] = produto
                    println("A atualização foi concluída com sucesso!")
                } else {
                    println("Desculpe, o produto '$att' não consta no estoque.")
                }
            }

            4 -> {

                println("Veja abaixo todos os produtos disponíveis em seu estoque:\n")

                produtos.forEach {
                    print("$it, \n")
            }

            println()
        }
            5 -> {
                break
            } else  -> println("Desculpe, essa opção não está disponível em nosso sistema.\n")
        }
    }
}
