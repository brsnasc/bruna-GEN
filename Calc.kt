fun main() {

    print("*** CALCULADORA DE ADIÇÃO ONLINE ***" +
                "\n\n")
    println("Olá, seja bem-vinde à nossa calculadora online. " +
                "\nPor favor, digite o 1° valor: ")
    val n1 = readln().toInt()
    println("Agora digite o 2° valor: ")
    val n2 = readln().toInt()
    println("A soma entre $n1 e $n2 é: ${soma(n1, n2)}")
}
fun soma(n1: Int, n2: Int): Int{
    return n1 + n2
}