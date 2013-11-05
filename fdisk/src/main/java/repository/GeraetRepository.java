package repository;

import java.util.List;

import javax.persistence.EntityManager;
import domain.Geraet;

public class GeraetRepository extends AbstractJpaRepository<Geraet>{

	public GeraetRepository(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public List<Geraet> findAll() {
		return entityManager().createQuery("SELECT ge FROM Geraet ge", Geraet.class).getResultList();
	}

	@Override
	public Geraet findById(Long id) {
		return entityManager().find(Geraet.class, id);
	}
}