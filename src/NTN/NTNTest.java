package NTN;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NTNTest {
	
	NTN ntn;
	
	@Before
	public void setUp() throws Exception {
		ntn = new NTN();
	}
	
	@Test
	public void testCalculaPrecoUnitarioDeAmortizacao() {
		double dolar1 = 10.123123;
		double dolar2 = 20.321321;
		double valorLiquido = 1.321321;		
		assertEquals(0.658219, ntn.calculaPrecoUnitarioDeAmortizacao(dolar1, dolar2, valorLiquido),0.000001);
	}
	
	@Test
	public void testCalculaJuros() {
		double precoUnitarioAmortizado = 0.658219;
		double somatoriaDeJuros = 10.123123;
		
		assertEquals(6.663231, ntn.calculaJuros(precoUnitarioAmortizado, somatoriaDeJuros),0.000001);
	}	
}
