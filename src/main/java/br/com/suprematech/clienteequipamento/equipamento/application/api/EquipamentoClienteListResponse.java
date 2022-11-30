package br.com.suprematech.clienteequipamento.equipamento.application.api;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.suprematech.clienteequipamento.equipamento.domain.Equipamento;
import br.com.suprematech.clienteequipamento.equipamento.domain.Marca;
import br.com.suprematech.clienteequipamento.equipamento.domain.TipoDeEquipamento;
import lombok.Getter;
@Getter
public class EquipamentoClienteListResponse {
	private UUID idEquipamento;
	private TipoDeEquipamento tipoDeEquipamento;
	private Marca marca;
	private String modelo;
	private String numeroDeSerie;
	private String defeito;
	private Boolean equipamentoComCaboDeForça;
	
	
	public static List<EquipamentoClienteListResponse> converte(List<Equipamento> equipamentosDoCliente) {
		return equipamentosDoCliente.stream()
				.map(EquipamentoClienteListResponse::new)
				.collect(Collectors.toList());
	}


	public EquipamentoClienteListResponse(Equipamento equipamento) {
		this.idEquipamento = equipamento.getIdEquipamento();
		this.tipoDeEquipamento = equipamento.getTipoDeEquipamento();
		this.marca = equipamento.getMarca();
		this.modelo = equipamento.getModelo();
		this.numeroDeSerie = equipamento.getNumeroDeSerie();
		this.defeito = equipamento.getDefeito();
		this.equipamentoComCaboDeForça = equipamento.getEquipamentoComCaboDeForça();
	}
	
}
