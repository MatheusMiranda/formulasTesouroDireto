package LTN;

import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.Before;
import org.junit.Test;

public class LTNTest {
	
	LTN ltn;
	
	@Before
	public void setUp() throws Exception {
		ltn = new LTN();
	}
	
	@Test
	public void testCalculaPrecoUnitario(){
		double taxaIndicativa = 14.12746573;
		assertEquals(989.27808435,ltn.calculaPrecoUnitario(taxaIndicativa),0.00000001);
	}
	
}
