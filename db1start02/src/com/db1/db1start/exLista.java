package com.db1.db1start;

import java.util.ArrayList;
import java.util.List;
//import java.util.SortedMap;
import java.util.*;

public class exLista {
	
	//List<String> cores = new ArryList<Sting>();
	
	public List<String>cores() {
		
		List<String>cores = new ArrayList<String>();
		cores.add("roxo");
		cores.add("azul");
		cores.add("verde");
		cores.add("preto");
		cores.add("amarelo");
		
		return cores;
	}
	
	
	public List<String>Lista(){
		
		List<String>Lista = new ArrayList<String>();
		Lista.add("item1");
		Lista.add("item2");
		Lista.add("item3");
		Lista.add("item4");
		Lista.add("item5");
		
		return Lista;
		
	}
	

	public List<String> ex0303(){
		
		List<String>ex0303 = new ArrayList<String>();
		
		ex0303.add("algo1");
		ex0303.add("algo2");
		ex0303.add("algo3");
		
		ex0303.remove(1);
		
		return ex0303;
		 
	}
	
	
	public List<String> ex0304(){
		
		List<String> ex0304 = cores();
		Collections.sort(ex0304);
		return ex0304;
	}
	

	public List<String> ex0305(){

		List<String> ex0305 = cores();		
		ex0305.remove("preto");		
		return ex0305;
		
	}
	
	
	public List<String> ex0306(){
		
		List<String>ex0306 = new ArrayList<String>();
		List<String>aux = new ArrayList<String>();
		
		ex0306.add("Jose");
		ex0306.add("Maria");
		ex0306.add("Arnaldo");
		ex0306.add("Tiago");
		
		aux = ex0306;
		
		Collections.sort(aux);
		Collections.reverse(aux);
		
		return aux;				
		
	}
	
	
	public List<Object> ex0307(){		
		List<Integer>ex0307 = new ArrayList<Integer>();
		
		ex0307.add(9);
		ex0307.add(21);
		ex0307.add(2);
		ex0307.add(13);
		ex0307.add(33);
		ex0307.add(25);
		ex0307.add(24);
		ex0307.add(26);
		ex0307.add(69);
		ex0307.add(666);
		ex0307.add(64);
				
		List<Integer> N_par   = new ArrayList<Integer>();
		List<Integer> N_impar = new ArrayList<Integer>();
		List <Object> listMae = new ArrayList <Object>();
		
		for (int i = 0; i < ex0307.size(); i++) {

			if (ex0307.get(i) % 2 == 0) {
				
				N_par.add(ex0307.get(i));
				
			} else {
				
				N_impar.add(ex0307.get(i));
			}
		}
		
		listMae.add(N_par);
		listMae.add(N_impar);
		
		return listMae;			
	}
	
	
	public int ex0309(){
		
		List<Integer>ex0309 = new ArrayList<Integer>();
		int aux = 0;
		
		ex0309.add(12);
		ex0309.add(21);
		ex0309.add(69);
		ex0309.add(13);
		
		for(int i = 0; i < ex0309.size(); i++ ) {
			aux += ex0309.get(i);
		}
		
		return aux;
	}
	

	public double ex0310(){
		
		List<Double>ex0310 = new ArrayList<Double>();				
				
		ex0310.add(3.14);
		ex0310.add(12.4);
		ex0310.add(1.24);
		ex0310.add(14.3);
		
		double aux = 0;
		int div = ex0310.size();
		
		for(int i = 0; i < ex0310.size(); i++ ) {
			aux += ex0310.get(i);
		}
				
		return aux/div;
	}
	
	public int ex0311() {		
	
		List<Integer>ex0311 = new ArrayList<Integer>();
		
		ex0311.add(12);
		ex0311.add(21);
		ex0311.add(69);
		ex0311.add(13);
		ex0311.add(10);
		
		int aux = ex0311.get(0);
		
		for(int i = 0; i < ex0311.size(); i++) {
			
			if (aux > ex0311.get(i)) {
				
				aux = ex0311.get(i);
			}			
		}
		
		return aux;		
		
	}
	
	
	public int ex0312() {		
		
		List<Integer>ex0312 = new ArrayList<Integer>();
		
		ex0312.add(12);
		ex0312.add(21);
		ex0312.add(69);
		ex0312.add(13);
		
		int aux = ex0312.get(0);
		
		for(int i = 1; i < ex0312.size(); i++) {
			
			if(aux < ex0312.get(i)) {
				aux = ex0312.get(i);
			}			
		}
		
		return aux;		
		
	}
	
	
	public List<Integer> ex0313() {		
		
		List<Integer>ex0313 = new ArrayList<Integer>();
		
		ex0313.add(12);
		ex0313.add(21);
		ex0313.add(7);
		ex0313.add(13);
		ex0313.add(18);
		ex0313.add(14);
				
		for(int i = 0; i < ex0313.size(); i++) {
									
			if((ex0313.get(i) % 2) > 0 ) {
				ex0313.remove(i);
			}			
		}
		
		return ex0313;	
	}
	
	
	public List<Character> ex0314(){
		
		List<Character>ex0314 = new ArrayList<Character>();
		
		String frase = "Escrever algo aki";
		
		for(int i = 0; i < frase.length(); i++) {
			
			char letra = frase.charAt(i);
			
			if((letra == 'a') || (letra == 'A')) { ex0314.add(letra); }
			if((letra == 'e') || (letra == 'E')) { ex0314.add(letra); }
			if((letra == 'i') || (letra == 'I')) { ex0314.add(letra); }
			if((letra == 'o') || (letra == 'O')) { ex0314.add(letra); }
			if((letra == 'u') || (letra == 'U')) { ex0314.add(letra); }
		}
		
		return ex0314;
	}

}









