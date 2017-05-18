package LFT;

import java.util.*;

public class LFT {
	
	public double calculaValorNominalAtualizado(double valorNominalDeDataBase,double fatorResultante){
		return valorNominalDeDataBase * fatorResultante;
	}

	public double calculaFatorResultante(Vector<Double> taxasPorDia) {
		double fatorResultante = 1.0; 
		
		for(Double taxa : taxasPorDia){
			fatorResultante *= (1.0 + taxa);
		}

		return fatorResultante;
	}
	
	public double calculaTaxaSelicDiaria(double taxaSELIC){
		return 14.12345125;
	}

}