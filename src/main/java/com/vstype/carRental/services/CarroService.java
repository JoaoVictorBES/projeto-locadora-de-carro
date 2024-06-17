package com.vstype.carRental.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vstype.carRental.entities.Carro;
import com.vstype.carRental.entities.Marca;
import com.vstype.carRental.repositories.CarroRepository;

@Service
public class CarroService {
	
	
	@Autowired
	private CarroRepository carroRepository;
	
	public String save(Carro carro) {
		
		//Regra de negócio de validação do nome do carro
		this.verificarNomeCarro(carro.getNome(), carro.getAno());
		
		this.carroRepository.save(carro);
		return ("Carro salvo com sucesso!");
	}
	
	public boolean verificarNomeCarro(String nome, int ano) {
		
		if(nome.equals("Jeep Compass") && ano < 2006)
			throw new RuntimeException();
		
		return true;
	}
	
	public Carro findById(Long id) {
		
		Carro carro = this.carroRepository.findById(id).get();
		return carro;		
	}
	
	
	public void delete (Carro carro) {
		
		this.carroRepository.delete(carro);
	
	}
	
	public List<Carro> findAll(){
		
		List <Carro> lista = this.carroRepository.findAll();
		return lista;
		
	}
	
	public String update(Carro carro, Long id) {
		
		this.verificarNomeCarro(carro.getNome(), carro.getAno());
		
		carro.setId(id);
		this.carroRepository.save(carro);
		return ("Carro atualizado com sucesso!");
	}
	
	public List<Carro> findByNome(String nome){
		
		return this.carroRepository.findByNome(nome);
		
	}
	
	public List<Carro> findByMarca(long idMarca){
		
		Marca marca = new Marca();
		marca.setId(idMarca);
		return this.carroRepository.findByMarca(marca);
		
	}
	
	public List<Carro> findAcimaAno(int ano){
		
		return this.carroRepository.findAcimaAno(ano);
		
	}
	
	
}
