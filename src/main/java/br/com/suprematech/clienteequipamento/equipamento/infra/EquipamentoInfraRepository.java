package br.com.suprematech.clienteequipamento.equipamento.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import br.com.suprematech.clienteequipamento.equipamento.application.repository.EquipamentoRepository;
import br.com.suprematech.clienteequipamento.equipamento.domain.Equipamento;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Repository
@Log4j2
@RequiredArgsConstructor
public class EquipamentoInfraRepository implements EquipamentoRepository {
	private final EquipamentoSpringaDataJPARepository equipamentoSpringaDataJPARepository;

	@Override
	public Equipamento salvaEquipamento(Equipamento equipamento) {
		log.info("[inicia] EquipamentoInfraRepository - salvaEquipamento");
		equipamentoSpringaDataJPARepository.save(equipamento);
		log.info("[finaliza] EquipamentoInfraRepository - salvaEquipamento");
		return equipamento;
	}

	@Override
	public List<Equipamento> buscaEquipamentosDoClienteComId(UUID idCliente) {
		log.info("[inicia] EquipamentoInfraRepository - buscaEquipamentosDoClienteComId");
		var equipamentos = equipamentoSpringaDataJPARepository.findByIdClienteDono(idCliente);
		log.info("[finaliza] EquipamentoInfraRepository - buscaEquipamentosDoClienteComId");
		return equipamentos;
	}

}
