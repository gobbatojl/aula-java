package com.db1.db1star;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.db1.db1start.Calculadora;

public class CalculadoraTest {
	
	private Calculadora calculadora;	
	
	@Before
	public void setUp() {
		calculadora = new Calculadora(50, 2);
	}
	
	@Test
	public void Soma() {
		int resultado = calculadora.soma();
		Assert.assertEquals(52, resultado);
	}
	
	@Test
	public void subtracao() {
		int resultado = calculadora.subtra();
		Assert.assertEquals(48, resultado);
	}
	
	@Test
	public void multiplicacao() {
		int resultado = calculadora.mult();
		Assert.assertEquals(100, resultado);
	}
	
	@Test
	public void divisao() {
		double resultado = calculadora.div();
		Assert.assertEquals(25, resultado, 0.0001);
	}
	
	@Test
	public void pariedade() {
		String resultado = calculadora.par();
		Assert.assertEquals("PAR", resultado);
	}
	
	@Test
	public void maior() {
		int resultado = calculadora.maior();
		Assert.assertEquals(50, resultado);
	}
	
	@Test
	public void numerosimper () {
		int resultado = calculadora.impar();
		Assert.assertEquals(25, resultado);
	}
	
	
}
