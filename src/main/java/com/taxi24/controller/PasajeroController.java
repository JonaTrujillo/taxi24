package com.taxi24.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.taxi24.service.PasajeroService;

@RestController
@RequestMapping("/pasajeros")
public class PasajeroController {

	@Autowired
	private PasajeroService pasajeroService;
	
	@GetMapping
	public ResponseEntity<?> obtenerPasajeros(){
		return ResponseEntity.status(HttpStatus.OK).body(pasajeroService.obtenerPasajeros());
	}
	
	@GetMapping("/id")
	public ResponseEntity<?> obtenerPasajeroId(@RequestParam int id){
		return ResponseEntity.status(HttpStatus.OK).body(pasajeroService.obtienePasajeroId(id));
	}
}
