package br.com.suprematech.clienteequipamento.equipamento.application.api;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.suprematech.clienteequipamento.equipamento.domain.Marca;
import br.com.suprematech.clienteequipamento.equipamento.domain.StatusServico;
import br.com.suprematech.clienteequipamento.equipamento.domain.TipoDeEquipamento;
import lombok.Value;
@Value
public class EquipamentoAlteracaoRequest {
	private TipoDeEquipamento tipoDeEquipamento;
	@NotNull
	private Marca marca;
	@NotBlank
	private String modelo;
	@NotNull
	private String numeroDeSerie;
	private String defeito;
	private Boolean equipamentoComCaboDeForça;
	private StatusServico statusServico;
	private String LaudoDoServico;
}