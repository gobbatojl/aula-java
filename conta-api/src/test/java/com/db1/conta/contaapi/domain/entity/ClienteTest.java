package com.db1.conta.contaapi.domain.entity;

import org.junit.Assert;
import org.junit.Test;

public class ClienteTest {
	
	@Test
	public void deveRetornarNomeObrigatorio() {
		String mensagem = null;
		try {
			Cliente cliente = new Cliente(null, "22222223332");
		} catch (Exception e) {
			mensagem = e.getMessage();
		}
		Assert.assertEquals("Nome é obrigatório", mensagem);
	}
	
	@Test
	public void deveRetornarCpfObrigatorio() {
		String mensagem = null;
		try {
			Cliente cliente = new Cliente("Joao Lucasa", null);
		} catch (Exception e) {
			mensagem = e.getMessage();
		}
		Assert.assertEquals("CPF é obrigatório", mensagem);
	}
	
	@Test
	public void deveRetornarCpfInvalido() {
		String mensagem = null;
		try {
			Cliente cliente = new Cliente("Joao Lucas", "2222332");
		} catch (Exception e) {
			mensagem = e.getMessage();
		}
		Assert.assertEquals("CPF inválido", mensagem);
	}
	
	@Test
	public void deveCriarCliente() {
		String mensagem = null;
		Cliente cliente = null;
		
		try {
			cliente = new Cliente("Joao Lucas", "22222223332");
		} catch (Exception e) {
			mensagem = e.getMessage();
		}
		Assert.assertNull(mensagem);
		Assert.assertEquals("Joao Lucas", cliente.getNome());
		Assert.assertEquals("22222223332", cliente.getCpf());
		
	}

	
}
