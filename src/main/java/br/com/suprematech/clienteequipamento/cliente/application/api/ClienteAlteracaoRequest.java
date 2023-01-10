package br.com.suprematech.clienteequipamento.cliente.application.api;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.suprematech.clienteequipamento.cliente.application.domain.Sexo;
import lombok.Value;
@Value
public class ClienteAlteracaoRequest {
	@NotBlank
	private String nomeCompleto;
	@NotBlank
	private String celular;
	private String telefone;
	private Sexo sexo;
	@NotNull
	private Boolean aceitaTermos;
}
