package repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.data.repository.CrudRepository;

import domain.Kommandant;

public interface KommandantRepository extends CrudRepository<Kommandant, Long>{




	public List<Kommandant> findAll();


	public Kommandant findById(Long id);
}