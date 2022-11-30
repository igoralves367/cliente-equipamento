package br.com.suprematech.clienteequipamento.equipamento.infra;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.suprematech.clienteequipamento.equipamento.domain.Equipamento;

public interface EquipamentoSpringaDataJPARepository extends JpaRepository<Equipamento, UUID>{

}
