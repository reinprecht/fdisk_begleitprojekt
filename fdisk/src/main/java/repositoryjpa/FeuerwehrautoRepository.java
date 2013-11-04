package repositoryjpa;

import java.util.List;

import javax.persistence.EntityManager;
import domain.Feuerwehrauto;

public class FeuerwehrautoRepository extends AbstractJpaRepository<Feuerwehrauto> {

	public FeuerwehrautoRepository(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public List<Feuerwehrauto> findAll() {
		return entityManager().createQuery("SELECT fa FROM Feuerwehrauto fa", Feuerwehrauto.class).getResultList();
	}

	@Override
	public Feuerwehrauto findById(Long id) {
		return entityManager().find(Feuerwehrauto.class, id);
	}
}