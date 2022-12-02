package br.com.suprematech.clienteequipamento.equipamento.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.suprematech.clienteequipamento.equipamento.application.repository.EquipamentoRepository;
import br.com.suprematech.clienteequipamento.equipamento.domain.Equipamento;
import br.com.suprematech.clienteequipamento.handler.APIException;
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

	@Override
	public Equipamento buscaEquipamentoPeloId(UUID idEquipamento) {
		log.info("[inicia] EquipamentoInfraRepository - buscaEquipamentoPeloId");
		var equipamento = equipamentoSpringaDataJPARepository.findById(idEquipamento)
				.orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Equipamento não encontrado para o idEquipamento = " + idEquipamento));
		log.info("[finaliza] EquipamentoInfraRepository - buscaEquipamentoPeloId");
		return equipamento;
	}

	@Override
	public void deletaEquipamento(Equipamento equipamento) {
		log.info("[inicia] EquipamentoInfraRepository - deletaEquipamento");
		equipamentoSpringaDataJPARepository.delete(equipamento);
		log.info("[finaliza] EquipamentoInfraRepository - deletaEquipamento");
		
	}

}
