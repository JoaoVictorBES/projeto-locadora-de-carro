package com.vstype.carRental.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vstype.carRental.entities.Carro;

public interface CarroRepository extends JpaRepository <Carro, Long>{

}
