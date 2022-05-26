package Calculadora

import kotlin.math.pow
import kotlin.math.sqrt

class Calculadora {

    companion object {

        fun adicao(x: Int, y: Int): Int {
            return x + y
        }

        fun subtracao(x: Int, y: Int): Int {
            return x - y
        }

        fun multiplicacao(x: Int, y: Int): Int {
            return x * y
        }

        fun divisao(x: Int, y: Int): Int {
            return x / y
        }

        fun potencia(x: Double, y: Int): Double {
            return x.pow(y)
        }

        fun radiciacao(x: Double): Double {
            return sqrt(x)
        }
    }
}

private fun Int.pow(x: Double) {

}
