package com.taxi24.facade;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.taxi24.repository.ViajeRepository;
import com.taxy24.entity.Viaje;

@Component
@Transactional
public class ViajeFacade {
	
	@Autowired
	private ViajeRepository viajeRepository;
	
	public String generarViaje(Viaje viaje){
		return viajeRepository.generarViaje(viaje.getIdConductor(),viaje.getIdPasajero());
	}
	
	public String completarViaje(Viaje viaje){
		return viajeRepository.completarViaje(viaje.getIdConductor(),viaje.getIdPasajero());
	}
	
	public List<Viaje> viajesDisponibles(){
		return viajeRepository.findByActivo();
	}
}
