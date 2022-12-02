package br.com.suprematech.clienteequipamento.equipamento.application.api;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1/cliente/{idCliente}/equipamento")
public interface EquipamentoAPI {
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	EquipamentoResponse postEquipamento(@PathVariable UUID idCliente, 
			@Valid @RequestBody EquipamentoRequest equipamentoRequest);
	
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	List<EquipamentoClienteListResponse> getEquipamentosDoClienteComId
	(@PathVariable UUID idCliente);
	
	@GetMapping(value = "/{idEquipamento}")
	@ResponseStatus(code = HttpStatus.OK)
	EquipamentoClienteDetalhadoResponse getEquipamentoDoClienteComId
	(@PathVariable UUID idCliente, @PathVariable UUID idEquipamento);
	
	@DeleteMapping(value = "/{idEquipamento}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void deleteEquipamentoClienteComId(@PathVariable UUID idCliente, @PathVariable UUID idEquipamento);
	
	@PatchMapping(value = "/{idEquipamento}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void patchtEquipamento(@PathVariable UUID idCliente, @PathVariable UUID idEquipamento,
			@Valid @RequestBody EquipamentoAlteracaoRequest equipamentoAlteracaoRequest);
}
