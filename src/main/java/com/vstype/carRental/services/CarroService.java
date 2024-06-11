package com.vstype.carRental.services;

import java.util.List;
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
		
		Carro carro = this.carroRepository.findById(id).get();
		return carro;		
	}
	
	
	public void delete (Carro carro) {
		
		this.carroRepository.delete(carro);
	
	}
	
	public List<Carro> findAll(){
		
		List <Carro> lista =this.carroRepository.findAll();
		return lista;
		
	}
	
	public String update(Carro carro, Long id) {
		
		carro.setId(id);
		this.carroRepository.save(carro);
		return ("Carro atualizado com sucesso!");
	}
}
