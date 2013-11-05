package repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.data.repository.CrudRepository;

import domain.Ausbildung;

public interface MitgliedRepository extends CrudRepository<Ausbildung, Long>{


	public List<Ausbildung> findAll();


	public Ausbildung findById(Long id);
}