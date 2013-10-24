package domainmodel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class MitlgiedService {

        protected EntityManager em;

        public MitlgiedService(EntityManager em) {
                this.em = em;
        }
        
        public Mitglied createMitglied(int standesbuchnummer, String vorname, String nachname,
                        String dienstgrad, Date geburtsdatum, String wohnort,
                        Feuerwehr feuerwehr, ArrayList<Ausrüstung> ausrüstungen,
                        ArrayList<Kurs> kurse){
                Mitglied mit = new Mitglied();
                mit.setStandesbuchnummer(standesbuchnummer);
                mit.setVorname(vorname);
                mit.setNachname(nachname);
                mit.setDienstgrad(dienstgrad);
                mit.setGeburtsdatum(geburtsdatum);
                mit.setWohnort(wohnort);
                mit.setFeuerwehr(feuerwehr);
                mit.setAusrüstungen(ausrüstungen);
                mit.setKurse(kurse);
                em.persist(mit);
                return mit;
        }
        
        public void removeMitglied(int id) {
                Mitglied mit = findMitglied(id);
                if (mit != null) {
                        em.remove(mit);
                }
        }
        
        public Mitglied findMitglied(int id) {
                return em.find(Mitglied.class, id);
        }
        
        public List<Mitglied> findAllMitglieder() {
                TypedQuery<Mitglied> query = em.createQuery("SELECT a FROM Mitglied m",
                                Mitglied.class);
                return query.getResultList();
        }
}