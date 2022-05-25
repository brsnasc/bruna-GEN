class Cavalo(nome: String, idade: Int) : Animal(nome, idade) {
    override fun som() {
        println("O cavalo relinchou.")
    }

    override fun deslocamento() {
        println("O cavalo passa a correr no campo.")
    }

    companion object {
        fun som() {
            println("HIIN IN IN")
        }
    }
}