package br.com.desafioavanade.searchdev.service.mapper;

import br.com.desafioavanade.searchdev.model.AnalystDTO;
import br.com.desafioavanade.searchdev.model.AnalystEntity;
import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

@Slf4j
public class AnalystMapper {
	public AnalystDTO entityToDto (AnalystEntity entity){

		log.info("Obj mapping to entity: {}", entity);

		AnalystDTO analyst = new AnalystDTO();
		analyst.setpId(entity.getPId());
		analyst.setActuation(AnalystDTO.ActuationEnum.valueOf(entity.getActuation()));
		analyst.setStack(AnalystDTO.StackEnum.valueOf(entity.getStack()));
		return analyst;
	}
	public AnalystEntity objRequestToEntity(AnalystDTO analystDTO){

		log.info("Mapping: {}", analystDTO);

		AnalystEntity analyst = new AnalystEntity();
		analyst.setpId(analystDTO.getpId());
		analyst.setActuation(analystDTO.getActuation().getValue());
		analyst.setStack(analystDTO.getStack().getValue());
		return analyst;
	}
	public AnalystEntity optionalToEntity(Optional<AnalystEntity> entity, AnalystDTO analystDTO){

		log.info("Mapping: {}", entity);

		entity.get().setpId(analystDTO.getpId());
		entity.get().setActuation(analystDTO.getActuation().getValue());
		entity.get().setStack(analystDTO.getStack().getValue());

		return new AnalystEntity(entity.get().getId(),entity.get().getPId(), entity.get().getActuation(), entity.get().getStack());
	}
}
