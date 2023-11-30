package br.com.desafioavanade.searchdev.service.impl;

import br.com.desafioavanade.searchdev.model.AnalystDTO;
import br.com.desafioavanade.searchdev.model.AnalystEntity;
import br.com.desafioavanade.searchdev.repository.AnalystRepository;
import br.com.desafioavanade.searchdev.service.AnalystService;
import br.com.desafioavanade.searchdev.service.mapper.AnalystMapper;
import br.com.desafioavanade.searchdev.validation.Validate;
import br.com.desafioavanade.searchdev.validation.exception.AnalystException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
@Service
public class AnalystServiceImpl implements AnalystService {
	@Autowired
	private AnalystRepository analystRepository;
	private AnalystMapper analystMapper = new AnalystMapper();
	@Autowired
	private Validate validate;

	@Override
	public AnalystEntity analystCreate(AnalystDTO analystDTO) throws AnalystException {
		try {
			log.info("Analyst: {} ", analystDTO);

			if (validate.existsAnalystById(analystDTO.getpId())) {
				throw new AnalystException("Already exist pId on Internal Talent");
			}

			AnalystEntity analyst = analystMapper.objRequestToEntity(analystDTO);
			analystRepository.save(analyst);
			return analyst;

		} catch (RuntimeException e) {
			throw new AnalystException(e.getMessage(), e.getCause(), false, false);
		}
	}

	/**
	 * @param pId
	 * @return
	 * @throws AnalystException
	 */
	@Override
	@Transactional
	public AnalystDTO getAnalystById(Long pId) throws AnalystException {
		Optional<AnalystEntity> analystEntity = analystRepository.findbyPId(pId);
		try {
			log.info("PID Analyst: {} ", pId);
			if (!analystEntity.isPresent()) {
				throw new AnalystException("PId not found on Internal Talent");
			}

			return analystMapper.entityToDto(analystEntity.get());

		} catch (RuntimeException e) {
			throw new AnalystException(e.getMessage(), e.getCause(), false, false);
		}
	}

	/**
	 * @return
	 * @throws AnalystException
	 */
	@Override
	@Transactional
	public AnalystDTO updateAnalyst(AnalystDTO analystDTO) throws AnalystException {
		try {
			log.info("Update Analyst: {} ", analystDTO);
			Optional<AnalystEntity> analystEntity = analystRepository.findbyPId(analystDTO.getpId());

			if (!analystEntity.isPresent()) {
				throw new AnalystException("Error to update data Analyst");
			}

			AnalystEntity analyst = analystMapper.optionalToEntity(analystEntity, analystDTO);
			analystRepository.saveAndFlush(analyst);

			return analystMapper.entityToDto(analyst);

		} catch (RuntimeException e) {
			throw new AnalystException(e.getMessage(), e.getCause(), false, false);
		}
	}
	/**
	 * @return
	 * @throws AnalystException
	 */
	@Override
	@Transactional
	public Void deleteAnalystById(Long pId) throws AnalystException {
		try {
			log.info("Delete Analyst by pId: {} ", pId);
			Optional<AnalystEntity> analystEntity = analystRepository.findbyPId(pId);

			if (!analystEntity.isPresent()) {
				throw new AnalystException("Error to delete Analyst");
			}
			analystRepository.delete(analystEntity.get());

		} catch (RuntimeException e) {
			throw new AnalystException(e.getMessage(), e.getCause(), false, false);
		}
		return null;
	}

	/**
	 * @return
	 */
	@Override
	public List<AnalystDTO> getAllAnalyst() {
		try {
			log.info("Get all Analyst");
			List<AnalystEntity> analystEntity = analystRepository.findAll();

			if (ObjectUtils.isEmpty(analystEntity)) {
				throw new AnalystException("Database Internal talent is empty");
			}

			Stream<AnalystDTO> dtoStream = analystEntity.stream().map(analystEntity1 -> {
				return analystMapper.entityToDto(analystEntity1);
			});

			return dtoStream.collect(Collectors.toList());

		} catch (RuntimeException e) {
			throw new AnalystException(e.getMessage(), e.getCause(), false, false);
		}
	}
}

