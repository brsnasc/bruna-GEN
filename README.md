# bruna-GEN
fun main(){

    print("Olá. Por gentileza, digite o valor do diâmetro do círculo: ")

    var diametro = readln().toDouble()
    var raio = diametro / 2
    var pi = 3.14
    var area = pi * (raio * raio)
    var perimetro = 2 * pi * raio

    println("Conforme o valor digitado, a área do círculo é $area\n" +
            "e o perímetro é de $perimetro.")

}
