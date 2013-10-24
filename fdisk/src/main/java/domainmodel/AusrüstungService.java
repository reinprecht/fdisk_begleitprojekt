package domainmodel;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class Ausr�stungService {

        protected EntityManager em;

        public Ausr�stungService(EntityManager em) {
                this.em = em;
        }
        
        public Ausr�stung createAusAusr�stung(int kennnummer, String bezeichnung, Mitglied benutzer,
                        Date ausgegeben){
                Ausr�stung aus = new Ausr�stung();
                aus.setKennnummer(kennnummer);
                aus.setBezeichnung(bezeichnung);
                aus.setBenutzer(benutzer);
                aus.setAusgegeben(ausgegeben);
                em.persist(aus);
                return aus;
        }
        
        public void removeAusr�stung(int id) {
                Ausr�stung aus = findAusr�stung(id);
                if (aus != null) {
                        em.remove(aus);
                }
        }
        
        public Ausr�stung findAusr�stung(int id) {
                return em.find(Ausr�stung.class, id);
        }
        
        public List<Ausr�stung> findAllEmployees() {
                TypedQuery<Ausr�stung> query = em.createQuery("SELECT a FROM Ausr�stung a",
                                Ausr�stung.class);
                return query.getResultList();
        }
}