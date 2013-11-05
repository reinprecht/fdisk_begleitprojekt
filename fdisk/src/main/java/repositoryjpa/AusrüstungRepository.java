package repositoryjpa;

import java.util.List;

import javax.persistence.EntityManager;
import domain.Ausrüstung;

public class AusrüstungRepository extends AbstractJpaRepository<Ausrüstung> {

	public AusrüstungRepository(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public List<Ausrüstung> findAll() {
		return entityManager().createQuery("SELECT aus FROM Ausrüstung aus", Ausrüstung.class).getResultList();
	}

	@Override
	public Ausrüstung findById(Long id) {
		return entityManager().find(Ausrüstung.class, id);
	}
}