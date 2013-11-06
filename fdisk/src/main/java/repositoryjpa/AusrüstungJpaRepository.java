package repositoryjpa;

import java.util.List;
import org.springframework.stereotype.Repository;
import domain.Ausr�stung;

@Repository
public class Ausr�stungJpaRepository extends AbstractJpaRepository<Ausr�stung> {

	@Override
	public List<Ausr�stung> findAll() {
		return entityManager().createQuery("SELECT aus FROM Ausr�stung aus", Ausr�stung.class).getResultList();
	}

	@Override
	public Ausr�stung findById(Long id) {
		return entityManager().find(Ausr�stung.class, id);
	}
}