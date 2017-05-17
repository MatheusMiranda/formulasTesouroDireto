package BTN;

import static org.junit.Assert.assertEquals;

import java.util.GregorianCalendar;

import org.junit.Before;
import org.junit.Test;

public class BTNTest {

	BTN btn;
	
	@Before
	public void setUp() throws Exception {
		btn = new BTN();
	}
	
	@Test
	public void testCalculaPrecoUnitarioAtualizado() {
		double precoUnitarioAnterior = 10.101011;
		double taxaReferencial = 0.512341;
		assertEquals(5.175162, btn.calculaPrecoUnitarioAtualizado(precoUnitarioAnterior,taxaReferencial),0.000001);
	}
	
	@Test
	public void testCalculaJuros() {
		
		double precoUnitarioAtualizado = 14.120315;
		double fatorDeJuros = 0.243218;
		
		assertEquals(3.434314, btn.calculaJuros(precoUnitarioAtualizado,fatorDeJuros),0.000001);
	}
	
	@Test
	public void testCalculaFatorDeJuros() {
		double i = 0.1231451;
		double n = 5.0;
		
		assertEquals(0.00051292, btn.calculaFatorDeJuros(i,n),0.00000001);
	}
	
	@Test
	public void testCalculaPrincipalDolar() {
		double precoUnitarioDolar = 30.369369;
		double precoUnitarioAtualizado = 10.123123;
		int quantidade = 5;
		
		assertEquals(151.846845, btn.calculaPrincipal(precoUnitarioDolar,
				precoUnitarioAtualizado, quantidade),0.000001);
	}
	
	@Test
	public void testCalculaPrincipalAtualizado() {
		double precoUnitarioDolar = 10.123123;
		double precoUnitarioAtualizado = 12.123123;
		int quantidade = 5;		
		assertEquals(60.615615, btn.calculaPrincipal(precoUnitarioDolar,
				precoUnitarioAtualizado, quantidade),0.000001);
	}
	
	@Test
	public void testDescobreDeflatorDia1() {
		GregorianCalendar  dia1 = new GregorianCalendar(89,15,12);
		double dolar = 10.123123;
		assertEquals(7.815050956, btn.descobreDeflator(dia1, dolar),0.000001);
	}
	
	@Test
	public void testDescobreDeflatorDia2() {
		GregorianCalendar dia2 = new GregorianCalendar(90,18,9);
		double dolar = 10.123123;
		assertEquals(7.815050956, btn.descobreDeflator(dia2, dolar),0.000001);
	}
	
	@Test
	public void testDescobreDeflatorDia3() {
		double dolar = 10.123123;
		GregorianCalendar dia3 = new GregorianCalendar(90,15,11);		
		assertEquals(7.815050956, btn.descobreDeflator(dia3, dolar),0.000001);
	}
}
