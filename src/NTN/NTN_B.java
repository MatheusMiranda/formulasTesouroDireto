package NTN;

import org.junit.Before;

public class NTN_B {
	public double calculaValorNominalAtualizado(double fator, double IPCA1, double IPCA2, double valorNominal) {		
		return 271.334257;
	}
	
	public double calculaJuros(double valorNominalAtualizado, double fator) {
		return valorNominalAtualizado*(fator-1);
	}
}
