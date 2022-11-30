package br.com.suprematech.clienteequipamento.equipamento.application.api;

import java.util.List;
import java.util.UUID;

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
		// TODO Auto-generated method stub
		return null;
	}
}
