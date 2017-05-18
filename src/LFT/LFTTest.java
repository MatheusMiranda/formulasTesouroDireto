package LFT;

import java.util.*;
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
		Vector<Double> taxasPorDia =  new Vector<Double>();
		
		taxasPorDia.addElement(1.12647582);
		taxasPorDia.addElement(2.18265827);
		taxasPorDia.addElement(3.16285628);
		taxasPorDia.addElement(4.19283145);
		taxasPorDia.addElement(5.92847124);

		assertEquals(1013.63948818,lft.calculaFatorResultante(taxasPorDia),0.00000001);
	}
	
	@Test
	public void testCalculaTaxaSelicDiaria() {
		double taxaSELIC = 2.14234566;
		assertEquals(8.411941130592737E-5,lft.calculaTaxaSelicDiaria(taxaSELIC),0.00000001);
	}
	
}
