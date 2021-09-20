package com.taxi24.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.taxi24.service.ConductorService;

@RestController
@RequestMapping("/conductores")
public class ConductorController {
	
	@Autowired
	private ConductorService conductorService;
	
	@GetMapping
	public ResponseEntity<?> obtieneCondutores(){
		return ResponseEntity.status(HttpStatus.OK).body(conductorService.obtieneConductores());
	}
	
	@GetMapping("/disponibles")
	public ResponseEntity<?> conductoresDisponibles(){
		return ResponseEntity.status(HttpStatus.OK).body(conductorService.conductoresDisponibles());
	}
	
	@GetMapping("/id")
	public ResponseEntity<?> obtieneConductorId(@RequestParam int id){
		return ResponseEntity.status(HttpStatus.OK).body(conductorService.obtieneConductorId(id));
	}

}
