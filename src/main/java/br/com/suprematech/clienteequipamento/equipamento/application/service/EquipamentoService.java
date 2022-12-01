package br.com.suprematech.clienteequipamento.equipamento.application.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import br.com.suprematech.clienteequipamento.equipamento.application.api.EquipamentoClienteDetalhadoResponse;
import br.com.suprematech.clienteequipamento.equipamento.application.api.EquipamentoClienteListResponse;
import br.com.suprematech.clienteequipamento.equipamento.application.api.EquipamentoRequest;
import br.com.suprematech.clienteequipamento.equipamento.application.api.EquipamentoResponse;

public interface EquipamentoService {
	EquipamentoResponse criaEquipamento(UUID idCliente, @Valid EquipamentoRequest equipamentoRequest);
	List<EquipamentoClienteListResponse> buscaEquipamentosDoClienteComId(UUID idCliente);
	EquipamentoClienteDetalhadoResponse buscaEquipamentoDoClienteComId(UUID idCliente, UUID idEquipamento);

}
