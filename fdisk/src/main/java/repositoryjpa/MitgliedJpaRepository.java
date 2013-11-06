package repositoryjpa;

import java.util.List;
import org.springframework.stereotype.Repository;
import domain.Ausbildung;

@Repository
public class MitgliedJpaRepository extends AbstractJpaRepository<Ausbildung>{

	@Override
	public List<Ausbildung> findAll() {
		return entityManager().createQuery("SELECT mi FROM Mitglied mi", Ausbildung.class).getResultList();
	}

	@Override
	public Ausbildung findById(Long id) {
		return entityManager().find(Ausbildung.class, id);
	}
}