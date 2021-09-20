package com.taxi24.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taxi24.service.ViajeService;
import com.taxy24.entity.Viaje;

@RestController
@RequestMapping("/viajes")
public class ViajeController {
	
	@Autowired
	private ViajeService viajeService;

	@PostMapping
	public ResponseEntity<?> generarViaje(@RequestBody Viaje viaje){
		return ResponseEntity.status(HttpStatus.CREATED).body(viajeService.generarViaje(viaje));
	}
	
	@PutMapping
	public ResponseEntity<?> completarViaje(@RequestBody Viaje viaje){
		return ResponseEntity.status(HttpStatus.OK).body(viajeService.completarViaje(viaje));
	}
	
	@GetMapping
	public ResponseEntity<?> viajesDisponibles(){
		return ResponseEntity.status(HttpStatus.OK).body(viajeService.viajesDisponibles());
	}
}
