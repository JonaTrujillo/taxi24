package com.taxi24.facade;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.taxi24.repository.ConductorRepository;
import com.taxy24.entity.Conductor;

@Component
@Transactional
public class ConductorFacade {

	@Autowired
	private ConductorRepository conductorRepository;
	
	
	public List<Conductor> obtieneConductores(){
		return conductorRepository.findAll();
	}
	
	public List<Conductor> conductoresDisponibles(){
		return conductorRepository.findByActivo();
	}
	
	public Optional<Conductor> obtieneConductorId(int id) {
		return conductorRepository.findById(id);
	}
}
