package LFT;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class LFTTest {
	
	LFT lft;
	
	@Before
	public void setUp() throws Exception {
		lft = new LFT();
	}
	
	@Test
	public void testCalculaValorNominalAtualizado() {
		double valorNominalDeDataBase = 7.981425;
		double fatorResultante = 10.123215;
		assertEquals(80.797681,lft.calculaValorNominalAtualizado(valorNominalDeDataBase,fatorResultante),0.000001);
	}
	
	@Test
	public void testCalculaFatorResultante() {
		double taxaSELIC = 17.17263841;
		double n = 5;
		assertEquals(52.12312412,lft.calculaFatorResultante(taxaSELIC,n),0.00000001);
	}
	
}
