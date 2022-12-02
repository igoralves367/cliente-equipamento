package br.com.suprematech.clienteequipamento.equipamento.application.api;

import java.util.UUID;

import br.com.suprematech.clienteequipamento.equipamento.domain.Marca;
import br.com.suprematech.clienteequipamento.equipamento.domain.TipoDeEquipamento;
import lombok.Value;
@Value
public class EquipamentoClienteListResponseParametro {
	private UUID idEquipamento;
	private TipoDeEquipamento tipoDeEquipamento;
	private Marca marca;
	private String modelo;
}
