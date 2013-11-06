package repositoryjpa;

import java.util.List;
import org.springframework.stereotype.Repository;
import domain.Ausrüstung;

@Repository
public class AusrüstungJpaRepository extends AbstractJpaRepository<Ausrüstung> {

	@Override
	public List<Ausrüstung> findAll() {
		return entityManager().createQuery("SELECT aus FROM Ausrüstung aus", Ausrüstung.class).getResultList();
	}

	@Override
	public Ausrüstung findById(Long id) {
		return entityManager().find(Ausrüstung.class, id);
	}
}