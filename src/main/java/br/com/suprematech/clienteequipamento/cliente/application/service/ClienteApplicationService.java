package br.com.suprematech.clienteequipamento.cliente.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.suprematech.clienteequipamento.cliente.application.api.ClienteAlteracaoRequest;
import br.com.suprematech.clienteequipamento.cliente.application.api.ClienteDetalhadoResponse;
import br.com.suprematech.clienteequipamento.cliente.application.api.ClienteListResponse;
import br.com.suprematech.clienteequipamento.cliente.application.api.ClienteRequest;
import br.com.suprematech.clienteequipamento.cliente.application.api.ClienteResponse;
import br.com.suprematech.clienteequipamento.cliente.application.api.ClienteResponseCpf;
import br.com.suprematech.clienteequipamento.cliente.application.domain.Cliente;
import br.com.suprematech.clienteequipamento.cliente.application.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Service
@Log4j2
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService {
	private final ClienteRepository clienteRepository;

	@Override
	public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteApplicationService - criaCliente");
		Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
		log.info("[finaliza] ClienteApplicationService - criaCliente");
		return ClienteResponse.builder()
				.idCliente(cliente.getIdCliente())
				.build(); 
		}

	@Override
	public List<ClienteListResponse> buscarTodosClientes() {
		log.info("[inicia] ClienteApplicationService - buscarTodosClientes");
		List<Cliente> clientes = clienteRepository.buscaTodosClientes();
		log.info("[finaliza] ClienteApplicationService - buscarTodosClientes");
		return ClienteListResponse.converte(clientes);
	}

	@Override
	public ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente) {
		log.info("[inicia] ClienteApplicationService - buscaClienteAtravesId");
		Cliente cliente = clienteRepository.buscaClienteAtravesId(idCliente);
		log.info("[finaliza] ClienteApplicationService - buscaClienteAtravesId");
		return new ClienteDetalhadoResponse(cliente);
	}

	@Override
	public void deletaClienteAtravesId(UUID idCliente) {
		log.info("[inicia] ClienteApplicationService - deletaClienteAtravesId");
		Cliente cliente = clienteRepository.buscaClienteAtravesId(idCliente);
		clienteRepository.deletaCliente(cliente);
		log.info("[finaliza] ClienteApplicationService - deletaClienteAtravesId");
		
	}

	@Override
	public void patchAlteraCliente(UUID idCliente, ClienteAlteracaoRequest clienteAlteracaoRequest) {
		log.info("[inicia] ClienteApplicationService - pathAlteraCliente");
		Cliente cliente = clienteRepository.buscaClienteAtravesId(idCliente);
		cliente.altera(clienteAlteracaoRequest);
		clienteRepository.salva(cliente);
		log.info("[finaliza] ClienteApplicationService - pathAlteraCliente");
		
	}

	@Override
	public ClienteResponseCpf getClienteAtravesDoCpf(String cpf) {
		log.info("[inicia] ClienteApplicationService - getClienteAtravesDoCpf");
		log.info("[finaliza] ClienteApplicationService - getClienteAtravesDoCpf");
		return null;
	}
}
