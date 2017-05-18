package LFT;

import java.util.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class LFT_ATest {
	
	LFT_A lftA;
	
	@Before
	public void setUp() throws Exception {
		lftA = new LFT_A();
	}
	
	@Test
	public void testCalculaFatorResultante() {
		assertEquals(12.12312451,lftA.calculaFatorResultante,0.00000001);
	}	
	
}
