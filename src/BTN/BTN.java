package BTN;

public class BTN {
	
	public double calculaPrecoUnitarioAtualizado(double precoUnitarioAnterior,
			double taxaReferencial) {
		
		return precoUnitarioAnterior * taxaReferencial;
	}
	
	public double calculaJuros(double precoUnitarioAtualizado,
			double fatorDeJuros) {
		return 1.0;
	}
}
