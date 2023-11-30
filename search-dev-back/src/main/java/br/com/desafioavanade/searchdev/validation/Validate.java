package br.com.desafioavanade.searchdev.validation;

import br.com.desafioavanade.searchdev.model.AnalystEntity;
import br.com.desafioavanade.searchdev.repository.AnalystRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Validate {
	@Autowired
	private AnalystRepository analystRepository;
	public Boolean existsAnalystById(Long pId){

		Optional<AnalystEntity> analystEntity = analystRepository.findbyPId(pId);
		return analystEntity.isPresent();
	}

}
