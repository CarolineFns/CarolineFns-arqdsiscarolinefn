package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import arqdsis.Calculadora;

public class TesteMultiplicacao {

	@Test
	public void multiplicacaoDeUmInteiroPorZeroDeveRetornarZero() {

		// Classe a ser testada
		Calculadora teste = new Calculadora();

		// Testes
		for (int i = 0; i < 100; i++) {
			assertEquals(i + " X 0 deve ser 0", teste.multiplicar(i, 0), 0);
		}
	}

}
