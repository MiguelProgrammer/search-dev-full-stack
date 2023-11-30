package br.com.desafioavanade.searchdev.api;

import _generated_sources_swagger.AnalystApi;
import br.com.desafioavanade.searchdev.model.AnalystDTO;
import br.com.desafioavanade.searchdev.service.AnalystService;
import br.com.desafioavanade.searchdev.validation.exception.AnalystException;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnalystController implements AnalystApi {
	@Autowired
	private AnalystService analystService;

	@Override
	public ResponseEntity<AnalystDTO> _addAnalyst(AnalystDTO analyst) throws AnalystException {
		analystService.analystCreate(analyst);
		return ResponseEntity.ok(analyst);
	}

	@Override
	public ResponseEntity<AnalystDTO> _getAnalystById(Long pId) throws AnalystException {
		AnalystDTO analys = analystService.getAnalystById(pId);
		return ObjectUtils.isEmpty(analys) ? ResponseEntity.badRequest().body(analys) : ResponseEntity.ok(analys);
	}

	@Override
	public ResponseEntity<AnalystDTO> _updateAnalyst(AnalystDTO dto) throws AnalystException {
		AnalystDTO analys = analystService.updateAnalyst(dto);
		return ObjectUtils.isEmpty(analys) ? ResponseEntity.badRequest().body(analys) : ResponseEntity.ok(analys);
	}

	@Override
	public ResponseEntity<Void> _deleteAnalystById(Long pId) throws AnalystException {
		analystService.deleteAnalystById(pId);
		return ResponseEntity.ok().build();
	}

	@Override
	public ResponseEntity<List<AnalystDTO>> _getAllAnalyst(){
		List<AnalystDTO> allAnalyst = analystService.getAllAnalyst();
		return ResponseEntity.ok(allAnalyst);
	}
}
