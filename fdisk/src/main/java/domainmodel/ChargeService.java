package domainmodel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class ChargeService {

        protected EntityManager em;

        public ChargeService(EntityManager em) {
                this.em = em;
        }
        
        public Charge createCharge(int standesbuchnummer, String vorname, String nachname,
                        String dienstgrad, Date geburtsdatum, String wohnort,
                        Feuerwehr feuerwehr, String fachgebiet, ArrayList<Ausrüstung> ausrüstungen,
                        ArrayList<Kurs> kurse){
                Charge ch = new Charge();
                ch.setStandesbuchnummer(standesbuchnummer);
                ch.setVorname(vorname);
                ch.setNachname(nachname);
                ch.setDienstgrad(dienstgrad);
                ch.setGeburtsdatum(geburtsdatum);
                ch.setWohnort(wohnort);
                ch.setFeuerwehr(feuerwehr);
                ch.setFachgebiet(fachgebiet);
                ch.setAusrüstungen(ausrüstungen);
                ch.setKurse(kurse);
                em.persist(ch);
                return ch;
        }
        
        public void removeCharge(int id) {
                Charge ch = findCharge(id);
                if (ch != null) {
                        em.remove(ch);
                }
        }
        
        public Charge findCharge(int id) {
                return em.find(Charge.class, id);
        }
        
        public List<Charge> findAllEmployees() {
                TypedQuery<Charge> query = em.createQuery("SELECT a FROM Charge c",
                                Charge.class);
                return query.getResultList();
        }
}