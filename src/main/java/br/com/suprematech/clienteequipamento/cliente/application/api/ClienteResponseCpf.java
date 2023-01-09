package br.com.suprematech.clienteequipamento.cliente.application.api;

import java.util.UUID;

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
}