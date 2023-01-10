package br.com.suprematech.clienteequipamento.cliente.infra;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.suprematech.clienteequipamento.cliente.application.domain.Cliente;

public interface ClienteSpringDataJPARepository extends JpaRepository<Cliente, UUID>{
}
