package fr.CCI.Java.Oceanback.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.CCI.Java.Oceanback.model.Poisson;

@Repository
public interface PoissonDAO extends JpaRepository<Poisson, Integer>{
	
	Poisson findById(int id);
	Poisson findByNomIgnoreCase(String nom);
	List<Poisson> findByTypeId(Integer id);
	void deleteById(Integer id);
}
