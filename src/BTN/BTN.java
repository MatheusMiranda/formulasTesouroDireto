package BTN;

public class BTN {
	
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
}
