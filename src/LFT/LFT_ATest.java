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
		Vector<Double> taxasPorDia =  new Vector<Double>();
		
		taxasPorDia.addElement(1.12647122);
		taxasPorDia.addElement(7.18242327);
		taxasPorDia.addElement(12.16285628);
		taxasPorDia.addElement(4.19212125);
		taxasPorDia.addElement(20.92847124);	
		
		assertEquals(26076.22811346,lftA.calculaFatorResultante(taxasPorDia),0.00000001);
	}
	
	@Test
	public void testCalculaTaxaSelicDiaria() {
		double taxaSELIC = 2.12312521;
		
		assertEquals(8.337255953172473E-5,lftA.calculaTaxaSelicDiaria(taxaSELIC),0.00000001);
	}
}
