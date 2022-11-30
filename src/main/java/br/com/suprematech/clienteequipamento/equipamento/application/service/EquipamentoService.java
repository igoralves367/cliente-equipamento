package br.com.suprematech.clienteequipamento.equipamento.application.service;

import java.util.UUID;

import javax.validation.Valid;

import br.com.suprematech.clienteequipamento.equipamento.application.api.EquipamentoRequest;
import br.com.suprematech.clienteequipamento.equipamento.application.api.EquipamentoResponse;

public interface EquipamentoService {
	EquipamentoResponse criaEquipamento(UUID idCliente, @Valid EquipamentoRequest equipamentoRequest);

}
