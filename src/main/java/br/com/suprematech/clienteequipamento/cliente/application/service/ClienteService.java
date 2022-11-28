package br.com.suprematech.clienteequipamento.cliente.application.service;

import br.com.suprematech.clienteequipamento.cliente.application.api.ClienteRequest;
import br.com.suprematech.clienteequipamento.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);

}
