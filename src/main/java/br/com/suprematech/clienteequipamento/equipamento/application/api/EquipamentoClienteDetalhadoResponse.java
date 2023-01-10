package br.com.suprematech.clienteequipamento.equipamento.application.api;

import java.util.UUID;

import br.com.suprematech.clienteequipamento.equipamento.domain.Equipamento;
import br.com.suprematech.clienteequipamento.equipamento.domain.Marca;
import br.com.suprematech.clienteequipamento.equipamento.domain.StatusServico;
import br.com.suprematech.clienteequipamento.equipamento.domain.TipoDeEquipamento;
import lombok.Value;
@Value
public class EquipamentoClienteDetalhadoResponse {
	
	private UUID idEquipamento;
	private TipoDeEquipamento tipoDeEquipamento;
	private Marca marca;
	private String modelo;
	private String numeroDeSerie;
	private String defeito;
	private Boolean equipamentoComCaboDeForça;
	private StatusServico statusServico;
	private String LaudoDoServico;
	
	
	public EquipamentoClienteDetalhadoResponse(Equipamento equipamento) {
		this.idEquipamento = equipamento.getIdEquipamento();
		this.tipoDeEquipamento = equipamento.getTipoDeEquipamento();
		this.marca = equipamento.getMarca();
		this.modelo = equipamento.getModelo();
		this.numeroDeSerie = equipamento.getNumeroDeSerie();
		this.defeito = equipamento.getDefeito();
		this.equipamentoComCaboDeForça = equipamento.getEquipamentoComCaboDeForça();
		this.statusServico = equipamento.getStatusServico();
		this.LaudoDoServico = equipamento.getLaudoDoServico();
	}
}
