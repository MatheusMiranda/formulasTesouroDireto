package NTN;

public class NTN {

	public double calculaPrecoUnitarioDeAmortizacao(double dolar1, double dolar2, double valorLiquido) {
		return (dolar1/dolar2)*valorLiquido;
	}
	
	public double calculaJuros(double precoUnitarioAmortizado, double somatoriaDeJuros) {		
		return precoUnitarioAmortizado*somatoriaDeJuros;
	}
	
}