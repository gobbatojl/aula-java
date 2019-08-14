package com.db1.db1start;

public class App {
	
	public static void main(String[] args) {
		
		int tamanhoDoNome = Nome.quantidadeDeCaracte("  Joao lucas");
		System.out.println("Tamanho do nome:" + tamanhoDoNome);
	
		MatSma op = new MatSma();
		System.out.println("Total da soma:" + op.soma(20, 33) );
		
		MatSub sub = new MatSub();
		sub.nA = 266;
		sub.nB = 203;
		System.out.println("Total da subtração:" + sub.sub() );
		
		TextoMax pla = new TextoMax();
		pla.entrada = "EscrvA aQuI";
		System.out.println("Palavra reescrita: " + pla.Max() );
		
		TextoMin min = new TextoMin();
		min.entrada = "EscrvA aQuI";
		System.out.println("Palavra reescrita: " + min.Min() );
		
		MenD2 n = new MenD2();
		n.n1 = 23.5;
		n.n2 = 33.8;
		System.out.println("O menor numero: " + n.menor() );
		
		MinD3 minimo = new MinD3();
		minimo.n1 = 32.5;
		minimo.n2 = 10.8;
		minimo.n3 = 3.14;
		System.out.println("O menor numero: " + minimo.min() );
		
		
		
		Texto texto = new Texto("banana, maçã, melancia");
		System.out.println(texto.ex0210());
	
	} 	
}
 