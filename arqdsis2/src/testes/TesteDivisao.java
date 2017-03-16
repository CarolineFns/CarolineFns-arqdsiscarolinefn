package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import arqdsis.Calculadora;

public class TesteDivisao {

	Calculadora teste;

	@Before
	public void setUp() {
		// Classe a ser testada
		teste = new Calculadora();
	}

	@Test
	public void divisaoDeUmInteiroPorUmDeveRetornarOInteiro() {
		// Testes
		assertEquals("10 / 1 deve ser 10", teste.dividir(10, 1), 10);
		assertEquals("0 / 1 deve ser 0", teste.dividir(0, 1), 0);
		assertEquals("1 / 1 deve ser 1", teste.dividir(1, 1), 1);
	}

	@Test(expected = ArithmeticException.class)
	public void divisaoPorZeroDeveDarErro() {
		// Teste de Exceção
		assertEquals("10 / 0 deve dar ArithmeticException", teste.dividir(10, 0));
	}

}
