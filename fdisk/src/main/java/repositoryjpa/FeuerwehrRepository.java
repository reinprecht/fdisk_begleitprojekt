package repositoryjpa;

import java.util.List;

import javax.persistence.EntityManager;

import domain.Feuerwehr;

public class FeuerwehrRepository extends AbstractJpaRepository<Feuerwehr>{

	public FeuerwehrRepository(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public List<Feuerwehr> findAll() {
		return entityManager().createQuery("SELECT fe FROM Feuerwehr fe", Feuerwehr.class).getResultList();
	}

	@Override
	public Feuerwehr findById(Long id) {
		return entityManager().find(Feuerwehr.class, id);
	}
}