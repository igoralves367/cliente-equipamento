package br.com.suprematech.clienteequipamento.cliente.application.api;

import java.util.UUID;

import br.com.suprematech.clienteequipamento.cliente.application.domain.Cliente;
import br.com.suprematech.clienteequipamento.cliente.application.domain.Sexo;
import lombok.Value;

@Value
public class ClienteResponseCpf {

	private UUID idCliente;
	private String nomeCompleto;
	private String email;
	private String celular;
	private String telefone;
	private Sexo sexo;
	private String cpf;

	public ClienteResponseCpf(Cliente cliente) {
		this.idCliente = cliente.getIdCliente();
		this.nomeCompleto = cliente.getNomeCompleto();
		this.email = cliente.getEmail();
		this.celular = cliente.getCelular();
		this.telefone = cliente.getTelefone();
		this.sexo = cliente.getSexo();
		this.cpf = cliente.getCpf();
	}
}