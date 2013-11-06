package repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import domain.Ausbildung;

public interface KursRepository extends CrudRepository<Ausbildung, Long>{

	public List<Ausbildung> findAll();

	public Ausbildung findById(Long id);
}