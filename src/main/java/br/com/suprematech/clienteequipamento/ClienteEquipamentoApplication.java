package br.com.suprematech.clienteequipamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class ClienteEquipamentoApplication {
	
	@GetMapping
	public String getHineTeste() {
		return "Cliente Equipamento - API Teste Home";
	}

	public static void main(String[] args) {
		SpringApplication.run(ClienteEquipamentoApplication.class, args);
	}
}
