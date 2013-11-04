package repositoryjpa;

import java.util.List;

import javax.persistence.EntityManager;
import domain.Ausr�stung;

public class Ausr�stungRepository extends AbstractJpaRepository<Ausr�stung> {

	public Ausr�stungRepository(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public List<Ausr�stung> findAll() {
		return entityManager().createQuery("SELECT aus FROM Ausr�stung aus", Ausr�stung.class).getResultList();
	}

	@Override
	public Ausr�stung findById(Long id) {
		return entityManager().find(Ausr�stung.class, id);
	}
}