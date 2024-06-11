package com.vstype.carRental.services;

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
