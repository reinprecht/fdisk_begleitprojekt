package repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import domain.Kommandant;

public interface KommandantRepository extends CrudRepository<Kommandant, Long>{

	List<Kommandant> findAll();

	Kommandant findById(Long id);
}