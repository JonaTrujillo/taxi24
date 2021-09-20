package com.taxi24.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taxi24.facade.ViajeFacade;
import com.taxy24.entity.Viaje;

@Service
public class ViajeService {
	
	@Autowired
	private ViajeFacade viajeFacade;
	
	public String generarViaje(Viaje viaje) {
		return viajeFacade.generarViaje(viaje);
	}
	
	public String completarViaje(Viaje viaje) {
		return viajeFacade.completarViaje(viaje);
	}
	
	public List<Viaje> viajesDisponibles(){
		return viajeFacade.viajesDisponibles();
	}
}
