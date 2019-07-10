package fr.CCI.Java.Oceanback.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.CCI.Java.Oceanback.model.Espece;

@Repository
public interface EspeceDAO extends JpaRepository<Espece, Integer>{
	
	Espece findById(int id);
	Espece findByNomIgnoreCase(String nom);
	void deleteById(Integer id);
}
