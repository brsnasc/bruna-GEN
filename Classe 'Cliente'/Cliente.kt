class Cliente(var nome: String) {

    var endereco = ""
    var telefone = ""
    val listadeCompras = mutableListOf<String>()

    init {
        if (nome == ""){
            throw Exception("A classe só poderá ser utilizada se for instanciada.")
        }
    }

    constructor(nome: String, endereco: String) : this(nome) {
        this.endereco = endereco
    }

    constructor(nome: String, endereco: String, telefone: String) : this(nome, endereco) {
        this.telefone = telefone.toString()

    }

    fun adicionarProduto(produto: String){
        if(produto != "") {
            listadeCompras.add(produto)
            println("\nProduto adicionado com sucesso!")
        }else{
            println("\nO campo não pode ficar em branco.")
        }
    }

    fun removerProduto(produto: String){
        if(listadeCompras.contains(produto)) {
            listadeCompras.remove(produto)
            println("\nProduto removido com sucesso!")
        }else{
            println("\nProduto inválido.")

        }
    }

    fun listadeCompras(){
        println("\nLista de Produtos para Comprar:\n")
        listadeCompras.forEach(){
            println(it)

        }

        println()

    }
}