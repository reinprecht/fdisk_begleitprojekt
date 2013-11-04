package repositoryjpa;

import java.util.List;

import javax.persistence.EntityManager;
import domain.Ausbildung;

public class MitgliedRepository extends AbstractJpaRepository<Ausbildung>{

	public MitgliedRepository(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public List<Ausbildung> findAll() {
		return entityManager().createQuery("SELECT mi FROM Mitglied mi", Ausbildung.class).getResultList();
	}

	@Override
	public Ausbildung findById(Long id) {
		return entityManager().find(Ausbildung.class, id);
	}
}