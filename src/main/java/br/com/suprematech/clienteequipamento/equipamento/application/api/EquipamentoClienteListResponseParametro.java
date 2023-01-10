package br.com.suprematech.clienteequipamento.equipamento.application.api;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.suprematech.clienteequipamento.equipamento.domain.Equipamento;
import br.com.suprematech.clienteequipamento.equipamento.domain.Marca;
import br.com.suprematech.clienteequipamento.equipamento.domain.TipoDeEquipamento;
import lombok.Value;
@Value
public class EquipamentoClienteListResponseParametro {
	private UUID idEquipamento;
	private TipoDeEquipamento tipoDeEquipamento;
	private Marca marca;
	private String modelo;
	
	public static List<EquipamentoClienteListResponseParametro> converte(
			List<Equipamento> equipamentosDoClienteParametro) {
		return equipamentosDoClienteParametro.stream()
				.map(EquipamentoClienteListResponseParametro::new)
				.collect(Collectors.toList());
	}

	public EquipamentoClienteListResponseParametro(Equipamento equipamento) {
		this.idEquipamento = equipamento.getIdEquipamento();
		this.tipoDeEquipamento = equipamento.getTipoDeEquipamento();
		this.marca = equipamento.getMarca();
		this.modelo = equipamento.getModelo();
	}	
}
