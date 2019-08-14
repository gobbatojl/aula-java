package com.db1.db1start;

public class Calculadora {
	
	private int n1;
	
	private int n2;
	
	public Calculadora(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public int soma () {
		return n1 + n2;
	}
	
	public int subtra () {
		return n1 - n2;
	}
	
	public int mult () {
		return n1 * n2;
	}
	
	public double div () {
		return n1/ n2;
	}
	
	public String par () {
	//	aux = (n1 % 2);
		if (n1 % 2 == 0) {
	//		resp = "PAR";
			return "PAR";
		}
		else {
//			resp = "IMPER";
			return "IMPER";
		}
	}
	
	public int maior () {
		if (n1 > n2) {
			return n1;
		}
		else {
			return n2;
		}			
	}
	
	public int impar () {
		
		int aux= n1;
		int nI = 0;
		
		while (aux <= 100) {
			if (aux % 2 != 0) {
				nI++;
				aux++;
			}
			else {
				aux++;
			}			
		}

		return nI;		
			//return (((100 - n1 ) / 2) - ((100 - n1) % 2) )+ 1;
		//return nAux;
	}
	

}
