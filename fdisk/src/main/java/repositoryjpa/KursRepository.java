package repositoryjpa;

import java.util.List;

import javax.persistence.EntityManager;
import domain.Ausbildung;

public class KursRepository extends AbstractJpaRepository<Ausbildung>{

	public KursRepository(EntityManager entityManager) {
		super(entityManager);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Ausbildung> findAll() {
		return entityManager().createQuery("SELECT ku FROM Kurs ku", Ausbildung.class).getResultList();
	}

	@Override
	public Ausbildung findById(Long id) {
		return entityManager().find(Ausbildung.class, id);
	}
}