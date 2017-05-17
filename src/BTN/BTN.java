package BTN;

import java.util.GregorianCalendar;

public class BTN {
	
	public static GregorianCalendar dia1 = new GregorianCalendar(89,15,12);
	public static GregorianCalendar dia2 = new GregorianCalendar(90,18,9);
	public static GregorianCalendar dia3 = new GregorianCalendar(90,15,11);
	
	public double calculaPrecoUnitarioAtualizado(double precoUnitarioAnterior,
			double taxaReferencial) {
		return precoUnitarioAnterior * taxaReferencial;
	}
	
	public double calculaJuros(double precoUnitarioAtualizado,
			double fatorDeJuros) {
		return precoUnitarioAtualizado * fatorDeJuros;
	}
	
	public double calculaFatorDeJuros(double i, double n) {
		double base = 1.0+(i/100.0);
		double expoente = n/12.0;
		return Math.pow(base,expoente)-1.0;
	}
	
	public double calculaPrincipal(double precoUnitarioDolar,
			double precoUnitarioAtualizado, double quantidade) {		
		if(precoUnitarioDolar > precoUnitarioAtualizado) {
			return precoUnitarioDolar * quantidade; 
		} else {
			return precoUnitarioAtualizado * quantidade;
		}
	}
	
	public double descobreDeflator(GregorianCalendar dia, double dolar) {
		
		return 7.815050956;
	}
}
