package repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import domain.Ausr�stung;

public interface Ausr�stungRepository extends CrudRepository<Ausr�stung, Long> {

	List<Ausr�stung> findAll();

	Ausr�stung findById(Long id);
}