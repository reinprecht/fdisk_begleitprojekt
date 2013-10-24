package domainmodel;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class GeraeteService {

        protected EntityManager em;

        public GeraeteService(EntityManager em) {
                this.em = em;
        }
        
        public Geraet createGeraet(long id, String bezeichnung, Date pruefungstermin, Feuerwehrauto auto){
                Geraet ger = new Geraet();
                ger.setId(id);
                ger.setBezeichnung(bezeichnung);
                ger.setPruefungstermin(pruefungstermin);
                ger.setAuto(auto);
                em.persist(ger);
                return ger;
        }
        
        public void removeGeraet(int id) {
                Geraet ger = findGeraet(id);
                if (ger != null) {
                        em.remove(ger);
                }
        }
        
        public Geraet findGeraet(int id) {
                return em.find(Geraet.class, id);
        }
        
        public List<Geraet> findAllGeraet() {
                TypedQuery<Geraet> query = em.createQuery("SELECT a FROM Geraet g",
                                Geraet.class);
                return query.getResultList();
        }
}