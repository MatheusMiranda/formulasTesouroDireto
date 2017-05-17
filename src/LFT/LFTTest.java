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
		double C = 10.123215;
		assertEquals(80.797681,lft.calculaValorNominal(valorNominalDeDataBase,C),0.000001);
	}
	
}
