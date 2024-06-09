package com.vstype.carRental.services;

import org.springframework.stereotype.Service;

import com.vstype.carRental.entities.Carro;

@Service
public class CarroService {
	
	public String save(Carro carro) {
		
		return ("Carro salvo com sucesso!");
	}
	
	
	public Carro findById(int id) {
		
		if(id == 1){
			Carro carro = new Carro();
			
			carro.setAno(2006);
			carro.setMarca("Volksvagem");
			carro.setModelo("Hatch");
			carro.setNome("Fox");
			
			return carro;
			
		}else {
			
			return null;
			
		}
		
		
	}
}
