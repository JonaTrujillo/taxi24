package com.taxi24.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.taxy24.entity.Conductor;


@Repository
public interface ConductorRepository extends JpaRepository<Conductor, Integer> {
	
	@Query(value = "SELECT co FROM Conductor co WHERE co.activo= 1")
	public List<Conductor> findByActivo();
}
