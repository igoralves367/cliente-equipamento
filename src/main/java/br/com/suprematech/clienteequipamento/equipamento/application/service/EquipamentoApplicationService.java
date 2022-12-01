package br.com.suprematech.clienteequipamento.equipamento.application.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.suprematech.clienteequipamento.cliente.application.service.ClienteService;
import br.com.suprematech.clienteequipamento.equipamento.application.api.EquipamentoClienteDetalhadoResponse;
import br.com.suprematech.clienteequipamento.equipamento.application.api.EquipamentoClienteListResponse;
import br.com.suprematech.clienteequipamento.equipamento.application.api.EquipamentoRequest;
import br.com.suprematech.clienteequipamento.equipamento.application.api.EquipamentoResponse;
import br.com.suprematech.clienteequipamento.equipamento.application.repository.EquipamentoRepository;
import br.com.suprematech.clienteequipamento.equipamento.domain.Equipamento;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Log4j2
@Service
@RequiredArgsConstructor
public class EquipamentoApplicationService implements EquipamentoService {
	private final ClienteService clienteService;
	private final EquipamentoRepository equipamentoRepository;

	@Override
	public EquipamentoResponse criaEquipamento(UUID idCliente, @Valid EquipamentoRequest equipamentoRequest) {
		log.info("[inicia] EquipamentoApplicationService - criaEquipamento");
		clienteService.buscaClienteAtravesId(idCliente);
		Equipamento equipamento = equipamentoRepository.salvaEquipamento(new Equipamento(idCliente, equipamentoRequest));
		log.info("[finaliza] EquipamentoApplicationService - criaEquipamento");
		return new EquipamentoResponse(equipamento.getIdEquipamento());
	}

	@Override
	public List<EquipamentoClienteListResponse> buscaEquipamentosDoClienteComId(UUID idCliente) {
		log.info("[inicia] EquipamentoApplicationService - buscaEquipamentosDoClienteComId");
		clienteService.buscaClienteAtravesId(idCliente);
		List<Equipamento> equipamentosDoCliente = equipamentoRepository.buscaEquipamentosDoClienteComId(idCliente);
		log.info("[finaliza] EquipamentoApplicationService - buscaEquipamentosDoClienteComId");
		return EquipamentoClienteListResponse.converte(equipamentosDoCliente);
	}

	@Override
	public EquipamentoClienteDetalhadoResponse buscaEquipamentoDoClienteComId(UUID idCliente, UUID idEquipamento) {
		log.info("[inicia] EquipamentoApplicationService - buscaEquipamentoDoClienteComId");
		clienteService.buscaClienteAtravesId(idCliente);
		log.info("[finaliza] EquipamentoApplicationService - buscaEquipamentoDoClienteComId");
		return null;
	}

}
