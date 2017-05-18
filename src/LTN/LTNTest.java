package LTN;

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
		assertEquals(15.16389281,ltn.calculaPrecoUnitario(),0.00000001);
	}
	
}
