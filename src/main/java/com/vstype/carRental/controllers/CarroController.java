package com.vstype.carRental.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vstype.carRental.entities.Carro;
import com.vstype.carRental.services.CarroService;

@RestController
@RequestMapping("/carro")
public class CarroController {

	@Autowired
	private CarroService carroService;
	
	@PostMapping("/save")
	public ResponseEntity<String> save(@RequestBody Carro carro){
		
		try {
			
			String mensagem = this.carroService.save(carro);
			return new ResponseEntity<String>(mensagem, HttpStatus.OK);
			
		}catch(Exception e) {
			
			return new ResponseEntity<String>("Erro ao salvar!", HttpStatus.BAD_REQUEST);
			
		}
	}
	
}
