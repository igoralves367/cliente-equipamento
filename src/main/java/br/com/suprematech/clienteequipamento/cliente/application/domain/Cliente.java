package br.com.suprematech.clienteequipamento.cliente.application.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;

import br.com.suprematech.clienteequipamento.cliente.application.api.ClienteAlteracaoRequest;
import br.com.suprematech.clienteequipamento.cliente.application.api.ClienteRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Cliente {
        
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(columnDefinition = "uuid", name = "id", updatable = false, unique = true, nullable = false)
		private UUID idCliente; //segurança
		@NotBlank
		private String nomeCompleto;
		@NotBlank
		@Email
		private String email;
		@NotBlank
		private String celular;
		private String telefone;
		@Enumerated(EnumType.STRING)
		private Sexo sexo;
		@CPF
		@Column(unique = true)
		private String cpf; 
		@NotNull
		private Boolean aceitaTermos;
		
		private LocalDateTime dataHoraDoCadastro;
		private LocalDateTime dataHoraDaUltimaAlteracao;
		
		public Cliente(ClienteRequest clienteRequest) {
			this.nomeCompleto = clienteRequest.getNomeCompleto();
			this.email = clienteRequest.getEmail();
			this.celular = clienteRequest.getCelular();
			this.telefone = clienteRequest.getTelefone();
			this.sexo = clienteRequest.getSexo();
			this.cpf = clienteRequest.getCpf();
			this.aceitaTermos = clienteRequest.getAceitaTermos();
			this.dataHoraDoCadastro = LocalDateTime.now();
		}

		public void altera(ClienteAlteracaoRequest clienteAlteracaoRequest) {
			this.nomeCompleto = clienteAlteracaoRequest.getNomeCompleto();
			this.celular = clienteAlteracaoRequest.getCelular();
			this.telefone = clienteAlteracaoRequest.getTelefone();
			this.sexo = clienteAlteracaoRequest.getSexo();
			this.aceitaTermos = clienteAlteracaoRequest.getAceitaTermos();
			this.dataHoraDaUltimaAlteracao = LocalDateTime.now();
			
		}
}		
