class Cachorro(nome: String, idade: Int) :Animal(nome, idade) {
    override fun som() {
        println("O cachorro começa a latir.")
    }

    override fun deslocamento() {
        println("O cachorro está correndo.")
    }

    companion object {
        fun som() {
            println("AU AU AUAUAUAU AU")
        }
    }
}