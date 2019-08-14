package com.db1.db1star;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.db1.db1start.Texto;

public class TextoTest {
	
	private Texto texto;
	
	@Before
	public void setUp() {
		
		texto = new Texto("  Escrever algo aki  ");
		
	}
	
	
	@Test
	public void ex0201() {
		String resultado = texto.ex0201();
		Assert.assertEquals("  ESCREVER ALGO AKI  ", resultado);
	}
	
	
	@Test
	public void ex0202() {
		String resultado = texto.ex0202();
		Assert.assertEquals("  escrever algo aki  ", resultado);
	}
	
	
	@Test
	public void ex0203() {
		int resultado = texto.ex0203();
		Assert.assertEquals(21, resultado);
	}
	
	
	@Test
	public void ex0204() {
		int resultado = texto.ex0204();
		Assert.assertEquals(17, resultado);
	}
	
	
//	@Test
//	public void ex0205() {
//		int resultado = texto.ex0205();
//		Assert.assertEquals(15, resultado);
//	}
	
	
	@Test
	public void ex0206() {
		String resultado = texto.ex0206();
		Assert.assertEquals("Escr", resultado);
	}
	
	
	@Test
	public void ex0207() {
		String resultado = texto.ex0207();
		Assert.assertEquals("ever algo aki", resultado);
	}
	
	
	@Test
	public void ex0208() {
		String resultado = texto.ex0208();
		Assert.assertEquals(" aki", resultado);
	}
	
	@Test
	public void ex0209() {
		String resultado = texto.ex0209();
		Assert.assertEquals("ALUNO/ALUNA algo aki", resultado);
	}
	
	

}
