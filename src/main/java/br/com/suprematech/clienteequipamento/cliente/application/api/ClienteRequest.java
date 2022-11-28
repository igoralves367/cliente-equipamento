package br.com.suprematech.clienteequipamento.cliente.application.api;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;

import br.com.suprematech.clienteequipamento.cliente.application.domain.Sexo;
import lombok.Value;

@Value
public class ClienteRequest {
	@NotBlank
	private String nomeCompleto;
	@NotBlank
	@Email
	private String email;
	@NotBlank
	private String celular;
	private String telefone;
	private Sexo sexo;
	@CPF
	private String cpf; 
	@NotNull
	private Boolean aceitaTermos;

}
