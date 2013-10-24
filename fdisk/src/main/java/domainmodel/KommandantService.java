package domainmodel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class KommandantService {

        protected EntityManager em;

        public KommandantService(EntityManager em) {
                this.em = em;
        }
        
        public Kommandant createKommandant(int standesbuchnummer, String vorname, String nachname,
                        String dienstgrad, Date geburtsdatum, String wohnort,
                        Feuerwehr feuerwehr, ArrayList<Ausrüstung> ausrüstungen,
                        ArrayList<Kurs> kurse){
                Kommandant kom = new Kommandant();
                kom.setStandesbuchnummer(standesbuchnummer);
                kom.setVorname(vorname);
                kom.setNachname(nachname);
                kom.setDienstgrad(dienstgrad);
                kom.setGeburtsdatum(geburtsdatum);
                kom.setWohnort(wohnort);
                kom.setFeuerwehr(feuerwehr);
                kom.setAusrüstungen(ausrüstungen);
                kom.setKurse(kurse);
                em.persist(kom);
                return kom;
        }
        
        public void removeKommandant(int id) {
                Kommandant kom = findKommandant(id);
                if (kom != null) {
                        em.remove(kom);
                }
        }
        
        public Kommandant findKommandant(int id) {
                return em.find(Kommandant.class, id);
        }
        
        public List<Kommandant> findAllKommandanten() {
                TypedQuery<Kommandant> query = em.createQuery("SELECT a FROM Kommandant k",
                                Kommandant.class);
                return query.getResultList();
        }
}