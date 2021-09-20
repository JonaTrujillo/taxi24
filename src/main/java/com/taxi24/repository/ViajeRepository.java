package com.taxi24.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.taxy24.entity.Viaje;

@Repository
public interface ViajeRepository extends JpaRepository<Viaje, Integer> {

	@Query(value = "CALL spGenerarViaje(:idConductor,:idPasajero)",nativeQuery = true)
	public String generarViaje(int idConductor,int idPasajero);
	
	@Query(value = "CALL spCompletarViaje(:idConductor,:idPasajero)",nativeQuery = true)
	public String completarViaje(int idConductor, int idPasajero);
	
	@Query(value = "SELECT vi FROM Viaje vi WHERE vi.activo= 1")
	public List<Viaje> findByActivo();
}
