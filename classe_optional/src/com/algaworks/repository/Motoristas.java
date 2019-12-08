package com.algaworks.repository;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.algaworks.model.Caminhao;
import com.algaworks.model.Motorista;
import com.algaworks.model.Seguro;

public class Motoristas {
	
	private Map<String, Optional<Motorista>> motoristas = new HashMap<>();
	
	public Motoristas() {
		Seguro seguro = new Seguro("Parcial - não cobre roubo", new BigDecimal("5000"));
		Caminhao caminhao1 = new Caminhao("Mercedes Atron", Optional.ofNullable(seguro));
		Caminhao caminhao2 = new Caminhao("Scania", Optional.ofNullable(seguro));
		Caminhao caminhao3 = new Caminhao("Mercedes-Benz", Optional.ofNullable(seguro));
		
		Optional<Motorista> motorista1 = Optional.of(new Motorista("João", 40, Optional.ofNullable(caminhao1)));
		Optional<Motorista> motorista2 = Optional.of(new Motorista("José", 25, Optional.ofNullable(null)));
		Optional<Motorista> motorista3 = Optional.of(new Motorista("Gabriel", 57, Optional.ofNullable(caminhao2)));
		Optional<Motorista> motorista4 = Optional.of(new Motorista("Gabrielly", 15, Optional.ofNullable(null)));
		Optional<Motorista> motorista5 = Optional.of(new Motorista("Honda", 78, Optional.ofNullable(caminhao3)));
		Optional<Motorista> motorista6 = Optional.of(new Motorista("Jorge", 41, Optional.ofNullable(null)));
		Optional<Motorista> motorista7 = Optional.of(new Motorista("Lia", 31, Optional.ofNullable(caminhao3)));
		
		motoristas.put(motorista1.get().getNome(), motorista1);
		motoristas.put(motorista2.get().getNome(), motorista2);
		motoristas.put(motorista3.get().getNome(), motorista3);
		motoristas.put(motorista4.get().getNome(), motorista4);
		motoristas.put(motorista5.get().getNome(), motorista5);
		motoristas.put(motorista6.get().getNome(), motorista6);
		motoristas.put(motorista7.get().getNome(), motorista7);
		
	}
	
	public Optional<Motorista> porNome(String nome) {
		return motoristas.get(nome);
	}
	
}
