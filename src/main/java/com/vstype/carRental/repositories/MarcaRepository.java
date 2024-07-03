package com.vstype.carRental.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vstype.carRental.entities.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Long> {
	
}
