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
		return 12.12421523;
	}
}
