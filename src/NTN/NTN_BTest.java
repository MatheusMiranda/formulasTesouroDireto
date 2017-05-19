package NTN;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NTN_BTest {
	NTN_B ntn_b;
	
	@Before
	public void setUP() throws Exception {
		ntn_b = new NTN_B();
	}
	
	@Test
	public void testCalculaValorNominalAtualizado() {
		double fator = 10.123123;
		double IPCA1 = 20.123123;
		double IPCA2 = 30.123123;
		double valorNominal = 40.123123;
		
		assertEquals(271.334257, ntn_b.calculaValorNominalAtualizado(fator, IPCA1, IPCA2, valorNominal), 0.000001);
	}
	
	@Test
	public void testCalculaJuros() {
		double valorNominalAtualizado = 10.123123;
		double fator = 20.123123;
		
		assertEquals(193.585726, ntn_b.calculaJuros(valorNominalAtualizado, fator), 0.000001);
	}
	
}
