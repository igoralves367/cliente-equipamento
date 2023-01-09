package br.com.suprematech.clienteequipamento.cliente.application.repository;

import java.util.List;
import java.util.UUID;

import br.com.suprematech.clienteequipamento.cliente.application.domain.Cliente;

public interface ClienteRepository {
	Cliente salva(Cliente cliente);
	List<Cliente> buscaTodosClientes();
	Cliente buscaClienteAtravesId(UUID idCliente);
	void deletaCliente(Cliente cliente);
	Cliente getClienteAtravesDoCpf(String cpf);
}