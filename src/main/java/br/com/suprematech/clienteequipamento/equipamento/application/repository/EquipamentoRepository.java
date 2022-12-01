package br.com.suprematech.clienteequipamento.equipamento.application.repository;

import java.util.List;
import java.util.UUID;

import br.com.suprematech.clienteequipamento.equipamento.domain.Equipamento;

public interface EquipamentoRepository {
	Equipamento salvaEquipamento(Equipamento equipamento);
	List<Equipamento> buscaEquipamentosDoClienteComId(UUID idCliente);
	Equipamento buscaEquipamentoPeloId(UUID idEquipamento);

}
