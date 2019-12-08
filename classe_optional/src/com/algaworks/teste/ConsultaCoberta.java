package com.algaworks.teste;

import java.util.Optional;

import com.algaworks.model.Caminhao;
import com.algaworks.model.Motorista;
import com.algaworks.model.Seguro;
import com.algaworks.repository.Motoristas;

public class ConsultaCoberta {
	
	public static void main(String[] args) {
		Motoristas motoristas = new Motoristas();
		
		Optional<String> coberturaOptional = motoristas.porNome("Gabrielly")
				.flatMap(Motorista::getCaminhao)
				.flatMap(Caminhao::getSeguro)
				.map(Seguro::getCobertura);
		
		coberturaOptional.ifPresent(System.out::println);
		
		String cobertura = motoristas.porNome("João")
							.flatMap(Motorista::getCaminhao)
							.flatMap(Caminhao::getSeguro)
							.map(Seguro::getCobertura)
							.orElse("Sem cobertura");
		
		
		System.out.println("A cobertura é: " + cobertura);
	}
}
