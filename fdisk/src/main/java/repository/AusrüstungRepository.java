package repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import domain.Ausrüstung;

public interface AusrüstungRepository extends CrudRepository<Ausrüstung, Long> {

	List<Ausrüstung> findAll();

	Ausrüstung findById(Long id);
}