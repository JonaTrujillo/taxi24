package com.taxy24.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "viajes")
@NoArgsConstructor
public class Viaje implements Serializable {

	
	private static final long serialVersionUID = 1L;

	
	@Id
	@Column(name = "id_conductor")
	private int idConductor;
	
	@Column(name = "id_pasajero")
	private int idPasajero;
	
	@Column(name = "activo")
	private int activo;
}
