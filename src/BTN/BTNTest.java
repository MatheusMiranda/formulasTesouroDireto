package BTN;

import static org.junit.Assert.*;
import org.junit.Before;

import org.junit.Test;

public class BTNTest {

	BTN btn;
	
	@Before
	public void setUp() throws Exception {
		btn = new BTN();
	}
	
	@Test
	public void testCalculaPrecoUnitarioAtualizado() {
		double precoUnitarioAnterior = 10.101011;
		double taxaReferencial = 0.512341;
		assertEquals(5.175162, btn.calculaPrecoUnitarioAtualizado(precoUnitarioAnterior,taxaReferencial),0.000001);
	}
	
	@Test
	public void testCalculaJuros() {
		
		double precoUnitarioAtualizado = 14.120315;
		double fatorDeJuros = 0.243218;
		
		assertEquals(3.434314, btn.calculaJuros(precoUnitarioAtualizado,fatorDeJuros),0.000001);
	}
	
	@Test
	public void testCalculaFatorDeJuros() {
		double i = 0.1231451;
		double n = 5.0;
		
		assertEquals(0.00051292, btn.calculaFatorDeJuros(i,n),0.00000001);
	}
	
	@Test
	public void testCalculaPrincipalDolar() {
		double precoUnitarioDolar = 30.369369;
		double precoUnitarioAtualizado = 10.123123;
		int quantidade = 5;
		
		assertEquals(151.846845, btn.calculaPrincipal(precoUnitarioDolar,
				precoUnitarioAtualizado, quantidade),0.000001);
	}
}
