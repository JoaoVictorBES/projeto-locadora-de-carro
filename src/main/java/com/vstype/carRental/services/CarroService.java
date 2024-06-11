package com.vstype.carRental.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vstype.carRental.entities.Carro;
import com.vstype.carRental.repositories.CarroRepository;

@Service
public class CarroService {
	
	
	@Autowired
	private CarroRepository carroRepository;
	
	public String save(Carro carro) {
		
		this.carroRepository.save(carro);
		return ("Carro salvo com sucesso!");
	}
	
	
	public Carro findById(Long id) {
		
		Optional<Carro> carro = this.carroRepository.findById(id);
		return carro.get();		
	}
	
	
	public void delete (Carro carro) {
		
		this.carroRepository.delete(carro);
	
	}
}
