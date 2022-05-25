class Preguica(nome: String, idade: Int) : Animal(nome, idade) {
    override fun som() {
        println("A preguiça emitiu sons de balido.")
    }

    override fun deslocamento() {
        println("A preguiça começou a subir a árvore.")
    }

    companion object {
        fun som() {
            println("aAaHAAAHaAA")
        }
    }
}