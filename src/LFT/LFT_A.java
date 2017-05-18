package LFT;

import java.util.*;

public class LFT_A {
	
	public double calculaFatorResultante(Vector<Double> taxasPorDia) {
		double fatorResultante = 1.0; 
		
		for(Double taxa : taxasPorDia){
			fatorResultante *= (1.0 + taxa);
		}

		return fatorResultante;
	}
	
	public double calculaTaxaSelicDiaria(double taxaSELIC){
		double base = ((taxaSELIC/100.0) + 1.0);
		double expoente = 1.0/252.0;
		
		return Math.pow(base,expoente) - 1.0;
	}
	
	public double calculaValorNominalAtualizado(double valorNominalDeEmissao, double fatorResultante,double numeroDeDiasUteisAteAtualizacao,
			double numeroDeDiasUteisAtePagamento, double numeroDeParcelas,double numeroDeParcelasAmortizadas) {
		
		double tac = 0.000245;
		
		double fator1 = fatorResultante * valorNominalDeEmissao * Math.pow(( 1.0 + tac/100.0),(numeroDeDiasUteisAteAtualizacao/numeroDeDiasUteisAtePagamento)); 
		double fator2 = fatorResultante * valorNominalDeEmissao * Math.pow( (1.0 + tac),(numeroDeDiasUteisAteAtualizacao/numeroDeDiasUteisAtePagamento));
		double fator3 = (1.0 / numeroDeParcelas - numeroDeParcelasAmortizadas);
		
		return fator1 - fator2 * fator3;
	}
}
