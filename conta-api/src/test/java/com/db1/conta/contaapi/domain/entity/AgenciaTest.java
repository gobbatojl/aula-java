package com.db1.conta.contaapi.domain.entity;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class AgenciaTest {

	@Test
	public void deveRetornaAgenciaObrigatorio(){
		String mensagem = null;
		Cidade cidade = Mockito.mock(Cidade.class);
		
		try {		
			Agencia numero = new Agencia(null, "1", cidade);
		}catch (Exception e) {
			mensagem = e.getMessage();
		}
		Assert.assertEquals("Numero é obrigatorio", mensagem);
		
	}
	
	
	@Test
	public void deveRetornaDigitoObrigatorio(){
		String mensagem = null;
		Cidade cidade = Mockito.mock(Cidade.class);
		
		try {		
			Agencia digito = new Agencia("11342", null, cidade);
		}catch (Exception e) {
			mensagem = e.getMessage();
		}
		Assert.assertEquals("Digito é obrigatorio", mensagem);
		
	}
	
	@Test
	public void deveRetornaCidadeOrigatorio(){
		String mensagem = null;
				
		try {		
			Agencia cidade = new Agencia("11342", "02", null);
		}catch (Exception e) {
			mensagem = e.getMessage();
		}
		Assert.assertEquals("Cidade é obrigatorio", mensagem);
		
	}
	
	@Test
	public void deveCriarUmaNovaAgencia(){
		Agencia agencia = null;
		String mensagem = null;
		Cidade cidade = Mockito.mock(Cidade.class);
		
		try {		
			agencia = new Agencia("11342", "45", cidade);
		}catch (Exception e) {
			mensagem = e.getMessage();
		}
		
		Assert.assertNull(mensagem);
		Assert.assertEquals("11342", agencia.getNumero());
		Assert.assertEquals("45", agencia.getDigito());
		
	}
}
