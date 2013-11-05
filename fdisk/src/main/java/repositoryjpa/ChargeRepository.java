package repositoryjpa;

import java.util.List;

import javax.persistence.EntityManager;
import domain.Charge;

public class ChargeRepository extends AbstractJpaRepository<Charge> {

	public ChargeRepository(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public List<Charge> findAll() {
		return entityManager().createQuery("SELECT ch FROM Charge ch", Charge.class).getResultList();
	}

	@Override
	public Charge findById(Long id) {
		return entityManager().find(Charge.class, id);
	}

}