package br.com.suprematech.clienteequipamento.cliente.application.service;

import java.util.List;
import java.util.UUID;

import br.com.suprematech.clienteequipamento.cliente.application.api.ClienteDetalhadoResponse;
import br.com.suprematech.clienteequipamento.cliente.application.api.ClienteListResponse;
import br.com.suprematech.clienteequipamento.cliente.application.api.ClienteRequest;
import br.com.suprematech.clienteequipamento.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
	List<ClienteListResponse> buscarTodosClientes();
	ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente);

}
