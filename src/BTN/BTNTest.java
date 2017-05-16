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
	public void testCalculoPrecoUnitarioAtualizado() {
		double precoUnitarioAnterior = 10.0;
		double taxaReferencial = 0.5;
		assertEquals(5.0, btn.calculaPrecoUnitarioAtualizado(precoUnitarioAnterior,taxaReferencial),0.1);
	}
	

}
