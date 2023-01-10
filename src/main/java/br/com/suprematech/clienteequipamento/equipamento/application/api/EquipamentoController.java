package br.com.suprematech.clienteequipamento.equipamento.application.api;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import br.com.suprematech.clienteequipamento.equipamento.application.service.EquipamentoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Log4j2
@RestController
@RequiredArgsConstructor
public class EquipamentoController implements EquipamentoAPI {
	private final EquipamentoService equipamentoService;

	@Override
	public EquipamentoResponse postEquipamento(UUID idCliente, @Valid EquipamentoRequest equipamentoRequest) {
		log.info("[inicia] EquipamentoController - postEquipamento");
		log.info("[idCliente] {}", idCliente);
		EquipamentoResponse equipamento = equipamentoService.criaEquipamento(idCliente, equipamentoRequest);
		log.info("[finaliza] EquipamentoController - postEquipamento");
		return equipamento;
	}

	@Override
	public List<EquipamentoClienteListResponse> getEquipamentosDoClienteComId(UUID idCliente) {
		log.info("[inicia] EquipamentoController - getEquipamentosDoClienteComId");
		log.info("[idCliente] {}", idCliente);
		List<EquipamentoClienteListResponse> equipamentosDoCliente = equipamentoService.buscaEquipamentosDoClienteComId(idCliente);
		log.info("[finaliza] EquipamentoController - getEquipamentosDoClienteComId");
		return equipamentosDoCliente;
	}

	@Override
	public EquipamentoClienteDetalhadoResponse getEquipamentoDoClienteComId(UUID idCliente, UUID idEquipamento) {
		log.info("[inicia] EquipamentoController - getEquipamentoDoClienteComId");
		log.info("[idCliente] {} - [idEquipamento] {}", idCliente, idEquipamento);
		EquipamentoClienteDetalhadoResponse equipamento = equipamentoService.buscaEquipamentoDoClienteComId(idCliente,idEquipamento);
		log.info("[finaliza] EquipamentoController - getEquipamentoDoClienteComId");
		return equipamento;
	}

	@Override
	public void deleteEquipamentoClienteComId(UUID idCliente, UUID idEquipamento) {
		log.info("[inicia] EquipamentoController - deleteEquipamentoClienteComId");
		log.info("[idCliente] {} - [idEquipamento] {}", idCliente, idEquipamento);
		equipamentoService.deleteEquipamentoClienteComId(idCliente,idEquipamento);
		log.info("[finaliza] EquipamentoController - deleteEquipamentoClienteComId");	
	}

	@Override
	public void patchtEquipamento(UUID idCliente, UUID idEquipamento,
			@Valid EquipamentoAlteracaoRequest equipamentoAlteracaoRequest) {
		log.info("[inicia] EquipamentoController - EquipamentoAlteracaoRequest");
		log.info("[idCliente] {} - [idEquipamento] {}", idCliente, idEquipamento);
		equipamentoService.aleraEquipamentoClienteComId(idCliente, idEquipamento,equipamentoAlteracaoRequest);
		log.info("[finaliza] EquipamentoController - EquipamentoAlteracaoRequest");		
	}

	@Override
	public List<EquipamentoClienteListResponseParametro> getEquipamentosDoClienteParametro(UUID idCliente) {
		log.info("[inicia] EquipamentoController - getEquipamentosDoClienteParametro");
		log.info("[idCliente] {}", idCliente);
		List<EquipamentoClienteListResponseParametro> equipamentosDoClienteParametro = equipamentoService.buscaEquipamentosDoClienteParametro(idCliente);
		log.info("[finaliza] EquipamentoController - getEquipamentosDoClienteParametro");
		return equipamentosDoClienteParametro;
	}
}
