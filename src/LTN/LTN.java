package LTN;

public class LTN {
	
	public double calculaPrecoUnitario(double taxaIndicativa){
		double precoUnitario = 1000.0/Math.pow((1.0 + taxaIndicativa),(1.0/252.0));
		return precoUnitario;
	}
	
}
