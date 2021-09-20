package com.taxi24.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taxy24.entity.Pasajero;

@Repository
public interface PasajeroRepository extends JpaRepository<Pasajero, Integer>{

}
