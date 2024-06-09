package com.vstype.carRental.services;

import org.springframework.stereotype.Service;

import com.vstype.carRental.entities.Entradas;
import com.vstype.carRental.entities.Resultado;

@Service
public class CalculosService {
	
	public Resultado somar (Entradas entrada) {
		
		Resultado resultado = new Resultado();
		
		
		Integer soma = 0;
		if (entrada.getLista() != null)
			for (int i=0; i < entrada.getLista().size(); i++) {
				soma += entrada.getLista().get(i);
			}
		resultado.setSoma(soma);
		
		
		Double media = (double) (soma/entrada.getLista().size());
		resultado.setMedia(media);
		
		
		Integer maiorNumero = 0;
		if (entrada.getLista() != null) {
			for(Integer e: entrada.getLista()){
				if(e > maiorNumero) {
					maiorNumero = e;
				}
			resultado.setMaiorNumero(maiorNumero);	
			}
		}
		
		Integer menorNumero = entrada.getLista().get(0);
		if (entrada.getLista() != null) {
			for(Integer e: entrada.getLista()){
				if(e < menorNumero) {
					menorNumero = e;
				}
			resultado.setMenorNumero(menorNumero);	
			}
		}
		
		Integer totalDeNumeros = entrada.getLista().size();
		resultado.setTotalDosNumeros(totalDeNumeros);
		
		
		
		return resultado;
	
	
	}	
	
}
