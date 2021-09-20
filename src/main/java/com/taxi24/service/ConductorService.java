package com.taxi24.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taxi24.facade.ConductorFacade;
import com.taxy24.entity.Conductor;

@Service
public class ConductorService {
	
	@Autowired
	private ConductorFacade conductorFacade;
	
	public List<Conductor> obtieneConductores(){
		return conductorFacade.obtieneConductores();
	}
	
	public List<Conductor> conductoresDisponibles(){
		return conductorFacade.conductoresDisponibles();
	}
	
	public Optional<Conductor> obtieneConductorId(int id) {
		return conductorFacade.obtieneConductorId(id);
	}

}
