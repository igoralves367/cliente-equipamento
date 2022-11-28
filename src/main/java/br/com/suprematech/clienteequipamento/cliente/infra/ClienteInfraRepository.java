package br.com.suprematech.clienteequipamento.cliente.infra;

import org.springframework.stereotype.Repository;

import br.com.suprematech.clienteequipamento.cliente.application.domain.Cliente;
import br.com.suprematech.clienteequipamento.cliente.application.repository.ClienteRepository;
import lombok.extern.log4j.Log4j2;
@Repository
@Log4j2
public class ClienteInfraRepository implements ClienteRepository {

	@Override
	public Cliente salva(Cliente cliente) {
		log.info("[inicia] ClienteInfraRepository - salva");
		log.info("[finaliza] ClienteInfraRepository - salva");
		return null;
	}

}
