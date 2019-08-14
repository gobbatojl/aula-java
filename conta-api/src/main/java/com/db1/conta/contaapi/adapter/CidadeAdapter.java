package com.db1.conta.contaapi.adapter;


import java.util.ArrayList;
import java.util.List;

import com.db1.conta.contaapi.domain.dto.CidadeResponseDTO;
import com.db1.conta.contaapi.domain.entity.Cidade;

public class CidadeAdapter {
	
	public static CidadeResponseDTO entityToResponse(Cidade cidade) {
		
		CidadeResponseDTO responDTO = new CidadeResponseDTO();
		responDTO.setId(cidade.getId());
		responDTO.setNome(cidade.getNome());
		responDTO.setEstado(cidade.getEstado());
		return responDTO;
	}
	
	
	public static List<CidadeResponseDTO> entityToResponse(List<Cidade> cidades){
		
		List<CidadeResponseDTO> cidadesResponse = new ArrayList<CidadeResponseDTO>();
		for (Cidade cidade : cidades) {
			cidadesResponse.add(entityToResponse(cidade));
		}
		return cidadesResponse;
	}

}
