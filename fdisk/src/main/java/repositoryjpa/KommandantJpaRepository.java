package repositoryjpa;

import java.util.List;
import org.springframework.stereotype.Repository;
import domain.Kommandant;

@Repository
public class KommandantJpaRepository extends AbstractJpaRepository<Kommandant>{

	@Override
	public List<Kommandant> findAll() {
		return entityManager().createQuery("SELECT ko FROM Kommandant ko", Kommandant.class).getResultList();
	}

	@Override
	public Kommandant findById(Long id) {
		return entityManager().find(Kommandant.class, id);
	}
}