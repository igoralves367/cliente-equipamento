package br.com.suprematech.clienteequipamento.equipamento.application.service;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.suprematech.clienteequipamento.equipamento.application.api.EquipamentoRequest;
import br.com.suprematech.clienteequipamento.equipamento.application.api.EquipamentoResponse;
import lombok.extern.log4j.Log4j2;
@Log4j2
@Service
public class EquipamentoApplicationService implements EquipamentoService {

	@Override
	public EquipamentoResponse criaEquipamento(UUID idCliente, @Valid EquipamentoRequest equipamentoRequest) {
		log.info("[inicia] EquipamentoApplicationService - criaEquipamento");
		log.info("[inicia] EquipamentoApplicationService - criaEquipamento");
		return null;
	}

}
