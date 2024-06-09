package com.vstype.carRental.services;

import org.springframework.stereotype.Service;

import com.vstype.carRental.entities.Carro;

@Service
public class CarroService {
	
	public String save(Carro carro) {
		
		return ("Carro salvo com sucesso!");
	}
	
}
