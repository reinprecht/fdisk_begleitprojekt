package domainmodel;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class AusbildungsService {

        protected EntityManager em;

        public AusbildungsService(EntityManager em) {
                this.em = em;
        }
        
        public Ausbildung createAusbildung(int kennnummer, String bezeichnung, String kurz_bezeichnung, Feuerwehr ort, Date datum){
                Ausbildung aus = new Ausbildung();
                aus.setKennnummer(kennnummer);
                aus.setBezeichnung(bezeichnung);
                aus.setKurz_bezeichnung(kurz_bezeichnung);
                aus.setOrt(ort);
                aus.setDatum(datum);
                em.persist(aus);
                return aus;
        }
        
        public void removeAusbildung(int id) {
                Ausbildung aus = findAusbildung(id);
                if (aus != null) {
                        em.remove(aus);
                }
        }
        
        public Ausbildung findAusbildung(int id) {
                return em.find(Ausbildung.class, id);
        }
        
        public List<Ausbildung> findAllAusbildungen() {
                TypedQuery<Ausbildung> query = em.createQuery("SELECT a FROM Ausbildung a",
                                Ausbildung.class);
                return query.getResultList();
        }
}