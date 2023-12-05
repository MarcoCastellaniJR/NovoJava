import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class CalcularTest {
	Calcular calc = new Calcular();
	
	
	@Test
	void testCalcularSomaMetodo() {
		int n = calc.calcularSoma(15,50);
		assertEquals(65, n);
	}
	@Test
	void testCalcularMultiplicacaoMetodo() {
		int n = calc.calcularMultiplay(500,2);
		assertEquals(1000,n);
	}
	@Test
	void testeCalcularDivisao() {
		int n = calc.calcularDivisao(500, 2);
		assertEquals(250, n);
	}
	@Test
	void testeCalcularDoisValoresNegativos() {
		int n = calc.calcularSoma(-10, -25);
		assertEquals(-35, n);
	}
	@Test
	void testeCalcularUmValorNegativo() {
		int n = calc.calcularSoma(-10, 25);
		assertEquals(15, n);
	}

}
