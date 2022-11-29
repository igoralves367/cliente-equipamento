package br.com.suprematech.clienteequipamento.equipamento.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Equipamento {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idEquipamento", updatable = false, unique = true, nullable = false)
	private UUID idEquipamento;
	@NotNull
	@Column(columnDefinition = "uuid", name = "idClienteDono", nullable = false)
	private UUID idClienteDono;
	@NotNull
	@Enumerated(EnumType.STRING)
	private TipoDeEquipamento TipoDeEquipamento;
	@NotNull
	@Enumerated(EnumType.STRING)
	private Marca marca;
	@NotBlank
	private String modelo;
	@NotNull
	private String numeroDeSerie;
	private String defeito;
	private Boolean equipamentoComCaboDeForça;
	
	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;


}
