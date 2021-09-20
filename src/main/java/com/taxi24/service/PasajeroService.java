package com.taxi24.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taxi24.facade.PasajeroFacade;
import com.taxy24.entity.Pasajero;

@Service
public class PasajeroService {

	@Autowired
	private PasajeroFacade pasajeroFacade;
	
	public List<Pasajero> obtenerPasajeros(){
		return pasajeroFacade.obtienePasajeros();
	}
	
	public Optional<Pasajero> obtienePasajeroId(int id){
		return pasajeroFacade.obtienePasajeroId(id);
	}
}
