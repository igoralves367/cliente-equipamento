package br.com.suprematech.clienteequipamento.equipamento.infra;

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
		log.info("[inicia] EquipamentoInfraRepository - salvaEquipamento");
		return equipamento;
	}

}
