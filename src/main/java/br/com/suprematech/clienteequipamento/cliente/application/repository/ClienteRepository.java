package br.com.suprematech.clienteequipamento.cliente.application.repository;

import java.util.List;

import br.com.suprematech.clienteequipamento.cliente.application.domain.Cliente;

public interface ClienteRepository {
	Cliente salva(Cliente cliente);
	List<Cliente> buscaTodosClientes();

}
