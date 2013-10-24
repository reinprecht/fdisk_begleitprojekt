package domainmodel;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class FeuerwehrService {

        protected EntityManager em;

        public FeuerwehrService(EntityManager em) {
                this.em = em;
        }
        
        public Feuerwehr createFeuerwehr(int standesbuchnummer, String ort,
                        ArrayList<Mitglied> mitglieder, ArrayList<Charge> chargen,
                        Kommandant kommandant, ArrayList<Feuerwehrauto> autos){
                Feuerwehr fw = new Feuerwehr();
                fw.setStandesbuchnummer(standesbuchnummer);
                fw.setOrt(ort);
                fw.setMitglieder(mitglieder);
                fw.setChargen(chargen);
                fw.setKommandant(kommandant);
                fw.setAutos(autos);
                em.persist(fw);
                return fw;
        }
        
        public void removeFeuerwehr(int id) {
                Feuerwehr fw = findFeuerwehr(id);
                if (fw != null) {
                        em.remove(fw);
                }
        }
        
        public Feuerwehr findFeuerwehr(int id) {
                return em.find(Feuerwehr.class, id);
        }
        
        public List<Feuerwehr> findAllEmployees() {
                TypedQuery<Feuerwehr> query = em.createQuery("SELECT a FROM Feuerwehr f",
                                Feuerwehr.class);
                return query.getResultList();
        }
}