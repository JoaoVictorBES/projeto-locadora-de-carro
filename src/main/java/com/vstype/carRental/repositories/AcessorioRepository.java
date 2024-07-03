package com.vstype.carRental.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vstype.carRental.entities.Acessorio;

public interface AcessorioRepository extends JpaRepository<Acessorio, Long> {
	
}