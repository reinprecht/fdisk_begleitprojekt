package repositoryjpa;

import java.util.List;
import javax.persistence.EntityManager;
import domain.Ausbildung;

public class AusbildungRepository extends AbstractJpaRepository<Ausbildung>{

        public AusbildungRepository(EntityManager entityManager) {
                super(entityManager);
        }

		@Override
		public List<Ausbildung> findAll() {
			return entityManager().createQuery("SELECT aus FROM Ausbildung aus", Ausbildung.class).getResultList();
		}

		@Override
		public Ausbildung findById(Long id) {
			return entityManager().find(Ausbildung.class, id);
		}
}