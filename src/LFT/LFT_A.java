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
}
