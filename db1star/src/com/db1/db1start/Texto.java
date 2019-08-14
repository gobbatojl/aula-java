package com.db1.db1start;

public class Texto {
	
	private String texto;
		
	public Texto(String texto) {
		
		this.texto = texto;

	}
	
	public String ex0201 () {
		return texto.toUpperCase();
	}
	
	
	public String ex0202() {
		return texto.toLowerCase();
	}
	
	
	public int ex0203(){
		
		if (texto != null) {
			return  texto.length();
		}
		return  0;
	}
	
	
	public int ex0204() {
		if (texto != null) {
			return  texto.trim().length();
		}
		return  0;
	}
	
	
	public int ex0205() {
				
		int aux = 0;
		
		for (int i = 0; i <= texto.length(); i++) {
			
			if(texto.charAt(i) != ' ') { aux++; }	
			
		}		
		return aux;		
	}
		
	
	public String ex0206() {
		String exibir = "";
		
		for (int i = 0; i < 4; i++) {
			exibir += texto.trim().charAt(i);
		}
		
		return exibir;
	}
	
	
	public String ex0207() {
		int parada = texto.trim().length();
		String exibir = "";
		
		for (int i = 4; i < parada ; i++) {
			exibir +=  texto.trim().charAt(i);
		}
		return exibir;
	}
	
	
	public String ex0208() {
		
		int parada = texto.trim().length();
		int inicio = (texto.trim().length()) - 4;
		String exibir = "" ;
		
		for (int i = inicio ; i < parada ; i++) {
			exibir +=  texto.trim().charAt(i);
		}
		return exibir;
	}
	
	
	public String ex0209() {
		
		String al = "ALUNO/ALUNA";
		String aux = texto.trim(); 
		String[] Test = aux.split(" ");
		
		for(int i= 1; i < Test.length; i++) {al += " " + Test[i];}
		
		return al;
	}
		
	
	public String ex0210{
		
		String Texto = "banana, maçã, melancia";
		String[] aux = Texto.split("\\,");
		String s;
		
		for (int i= 0; i < aux.length; i++) {
			return aux[i];
		}
				
	} 
	


}
