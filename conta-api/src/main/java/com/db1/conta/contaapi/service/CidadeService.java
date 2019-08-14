package com.db1.conta.contaapi.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.db1.conta.contaapi.adapter.CidadeAdapter;
import com.db1.conta.contaapi.domain.dto.CidadePersistDTO;
import com.db1.conta.contaapi.domain.dto.CidadeResponseDTO;
import com.db1.conta.contaapi.domain.entity.Cidade;
import com.db1.conta.contaapi.domain.entity.Estado;
import com.db1.conta.contaapi.repository.CidadeRepository;

@Service
public class CidadeService {
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	public CidadeResponseDTO save(CidadePersistDTO dto) {
		Cidade cidade = new Cidade(dto.getNome(), dto.getEstado());
		cidadeRepository.save(cidade);
		return CidadeAdapter.entityToResponse(cidade);		
	}
	
	public CidadeResponseDTO update(Long cidadeId, CidadePersistDTO dto) {
		Optional<Cidade> opCidade = cidadeRepository.findById(cidadeId);
		if (opCidade.isPresent()) {
			Cidade cidade = opCidade.get();
			cidade.alterar(dto.getNome(), dto.getEstado());
			cidadeRepository.save(cidade);
			return CidadeAdapter.entityToResponse(cidade);
		}
		throw new RuntimeException("Cidade de ID" + cidadeId + " não encontrada");
	}
	
	public CidadeResponseDTO findByName(String nome) {
		Optional<Cidade> opCidade = cidadeRepository.findByNomeOptional(nome);
		if (opCidade.isPresent()) {
			Cidade cidade = opCidade.get();
			CidadeResponseDTO cidadeResponse = CidadeAdapter.entityToResponse(cidade);
			return cidadeResponse;
		}
		throw new RuntimeException("Cidade de nome " + nome + " não  encontrada"); 	
	}
	
	public void delete(Long cidadeId) {
		Optional<Cidade> opCidade = cidadeRepository.findById(cidadeId);
		if (opCidade.isPresent()) {
			Cidade cidade = opCidade.get();		
			cidadeRepository.delete(cidade);			
		}
		throw new RuntimeException("Cidade de ID" + cidadeId + " não encontrada");
	}
	
	
	public List<CidadeResponseDTO> findAll(){
		List<Cidade> cidades = cidadeRepository.findAll();
		List<CidadeResponseDTO> response =  CidadeAdapter.entityToResponse(cidades);
		return response;
	}

	
	public Cidade procuraCidadePorId(Long cidadeId) {
		
		Optional<Cidade> opCidade = cidadeRepository.findById(cidadeId);
		if (opCidade.isPresent()) {
			Cidade cidade = opCidade.get();
			return cidade;
		}
		throw new RuntimeException("Cidade De ID" + cidadeId + "Não Encontrada");
	}
	
	
	public Cidade procurarCidadePorNome(String nome, Estado estado) {
		Cidade cidade = cidadeRepository.findByNome(nome);
		Assert.notNull(cidade, "Cidade De Nome" + nome + "Não Encontrada");
		return cidade;
	}
	
	

}
