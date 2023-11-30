package br.com.desafioavanade.searchdev.service;

import br.com.desafioavanade.searchdev.model.AnalystDTO;
import br.com.desafioavanade.searchdev.model.AnalystEntity;
import br.com.desafioavanade.searchdev.validation.exception.AnalystException;

import java.util.List;

public interface AnalystService {
	AnalystEntity analystCreate(AnalystDTO analystEntity) throws AnalystException;

	AnalystDTO getAnalystById(Long pId) throws AnalystException;

	AnalystDTO updateAnalyst(AnalystDTO analystEntity) throws AnalystException;

	Void deleteAnalystById(Long pId) throws AnalystException;
	List<AnalystDTO> getAllAnalyst();
}
