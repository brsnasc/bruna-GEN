import Calculadora.Calculadora
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CalculadoraTest {

    @Test
    fun somaTest(){
        assertEquals(140, Calculadora.adicao(71, 69))

    }

    @Test
    fun subtracaoTest(){
        assertEquals(33, Calculadora.subtracao(74, 41))

    }

    @Test
    fun multiplicacaoTest(){
        assertEquals(238, Calculadora.multiplicacao(17, 14))

    }

    @Test
    fun divisaoTest(){
        assertEquals(8, Calculadora.divisao(96, 12))

    }

    @Test
    fun potenciaTest(){
        assertEquals(784.0, Calculadora.potencia(28.0, 2))

    }

    @Test
    fun radiciacaoTest(){
        assertEquals(3.0, Calculadora.radiciacao(9.0))

    }
}
