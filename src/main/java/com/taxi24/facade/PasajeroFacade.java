package com.taxi24.facade;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.taxi24.repository.PasajeroRepository;
import com.taxy24.entity.Pasajero;

@Component
@Transactional
public class PasajeroFacade {
	
	@Autowired
	private PasajeroRepository pasajeroRepository;
	
	public List<Pasajero> obtienePasajeros(){
		return pasajeroRepository.findAll();
	}
	
	public Optional<Pasajero> obtienePasajeroId(int id){
		return pasajeroRepository.findById(id);
	}
}
