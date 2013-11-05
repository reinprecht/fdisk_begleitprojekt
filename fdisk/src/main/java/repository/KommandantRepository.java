package repository;

import java.util.List;

import javax.persistence.EntityManager;
import domain.Kommandant;

public class KommandantRepository extends AbstractJpaRepository<Kommandant>{

	public KommandantRepository(EntityManager entityManager) {
		super(entityManager);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Kommandant> findAll() {
		return entityManager().createQuery("SELECT ko FROM Kommandant ko", Kommandant.class).getResultList();
	}

	@Override
	public Kommandant findById(Long id) {
		return entityManager().find(Kommandant.class, id);
	}
}