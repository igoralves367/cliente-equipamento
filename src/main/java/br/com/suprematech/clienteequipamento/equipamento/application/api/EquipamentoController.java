package br.com.suprematech.clienteequipamento.equipamento.application.api;

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
}
