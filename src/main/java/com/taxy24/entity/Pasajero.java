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
@Table(name = "pasajeros")
@NoArgsConstructor
public class Pasajero implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_pasajero")
	private int idPasajero;
	
	@Column(name = " nombre")
	private String nombre;
	
	@Column(name = "apellido")
	private String apellido;
	
	@Column(name = "latitud")
	private String latitud;
	
	@Column(name ="longitud")
	private String longitud;

	@Column(name = "activo")
	private int activo;

}
