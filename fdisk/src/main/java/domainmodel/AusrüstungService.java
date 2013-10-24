package domainmodel;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class AusrüstungService {

        protected EntityManager em;

        public AusrüstungService(EntityManager em) {
                this.em = em;
        }
        
        public Ausrüstung createAusAusrüstung(int kennnummer, String bezeichnung, Mitglied benutzer,
                        Date ausgegeben){
                Ausrüstung aus = new Ausrüstung();
                aus.setKennnummer(kennnummer);
                aus.setBezeichnung(bezeichnung);
                aus.setBenutzer(benutzer);
                aus.setAusgegeben(ausgegeben);
                em.persist(aus);
                return aus;
        }
        
        public void removeAusrüstung(int id) {
                Ausrüstung aus = findAusrüstung(id);
                if (aus != null) {
                        em.remove(aus);
                }
        }
        
        public Ausrüstung findAusrüstung(int id) {
                return em.find(Ausrüstung.class, id);
        }
        
        public List<Ausrüstung> findAllEmployees() {
                TypedQuery<Ausrüstung> query = em.createQuery("SELECT a FROM Ausrüstung a",
                                Ausrüstung.class);
                return query.getResultList();
        }
}