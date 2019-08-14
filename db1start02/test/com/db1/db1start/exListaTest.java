package com.db1.db1start;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class exListaTest {
	
	@Test
	public void retornoCores(){
		
		exLista cor= new exLista();
		
		List<String> cores = cor.cores();
		
		Assert.assertEquals(5, cores.size());
		Assert.assertTrue(cores.contains("azul"));
		Assert.assertTrue(cores.contains("verde"));
		Assert.assertTrue(cores.contains("preto"));
		
	}
	
	
	@Test
	public void retornoLista() {
		
		exLista list = new exLista();
		
		List<String> Lista = list.Lista();
		
		Assert.assertEquals(5, Lista.size());
	}
	
	
	@Test
	public void retornoEx0303() {
		
		exLista list = new exLista();
		
		List<String> ex0303 = list.ex0303();
		
		Assert.assertTrue(ex0303.contains("algo1"));
		Assert.assertTrue(ex0303.contains("algo3"));
		Assert.assertFalse(ex0303.contains("algo2"));
		
	}
	
	
	@Test
	public void retornoEx0304() {
		
		exLista list = new exLista();
		
		List<String> ex0304 = list.ex0304();		
		
		Assert.assertEquals("amarelo", ex0304.get(0));
		Assert.assertEquals("azul",    ex0304.get(1));
		Assert.assertEquals("preto",   ex0304.get(2));
		Assert.assertEquals("roxo",    ex0304.get(3));
		Assert.assertEquals("verde",   ex0304.get(4)); 
	
	}
	
	
	@Test
	public void retornoEx0305() {
		
		exLista list = new exLista();		
		List<String> ex0305 = list.ex0305();			
		Assert.assertFalse(ex0305.contains("preto"));
		
	}
	
	
	@Test
	public void retornoEx0306() {
		
		exLista list = new exLista();	
		List<String> ex0306 = list.ex0306();	
		Assert.assertEquals("Arnaldo", ex0306.get(3)); 
	}
	
	
	@Test
	public void retornoEx0307() {
		
		exLista list = new exLista();
		List<Object> ex0307 = list.ex0307();
		Assert.assertEquals(2, ex0307.size());		
	}

	
	@Test
	public void retornoEx0309() {
		
		exLista list = new exLista();
		int ex0309 = list.ex0309();
		Assert.assertEquals(115, ex0309);
		
	}
	
	@Test
	public void retornoEx0310() {
		
		exLista list = new exLista();
		double ex0310 = list.ex0310();
		Assert.assertEquals(7.77, ex0310, 0.01);
		
	}


	@Test
	public void retornoEx0311() {
		
		exLista list = new exLista();
		int ex0311 = list.ex0311();
		Assert.assertEquals(10, ex0311);
		
	}
	
	
	@Test
	public void retornoEx0312() {
		
		exLista list = new exLista();
		int ex0312 = list.ex0312();
		Assert.assertEquals(69, ex0312);
		
	}
	
	
	@Test
	public void retornoEx0313() {
		
		exLista list = new exLista();	
		List<Integer> ex0313 = list.ex0313();	
		
		Assert.assertFalse(ex0313.contains(13));
	}
	
	
	@Test
	public void retornoEx0314() {
		
		exLista list = new exLista();	
		List<Character> ex0314 = list.ex0314();	
		
		Assert.assertTrue(ex0314.contains('E'));
	}

}
