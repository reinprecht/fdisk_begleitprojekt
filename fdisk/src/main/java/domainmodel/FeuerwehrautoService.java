package domainmodel;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class FeuerwehrautoService {

        protected EntityManager em;

        public FeuerwehrautoService(EntityManager em) {
                this.em = em;
        }
        
        public Feuerwehrauto createFeuerwehrauto(String kennzeichen, String typ, int sitzplaetze,
                        Feuerwehr feuerwehr, ArrayList<Geraet> geräte){
                Feuerwehrauto feu = new Feuerwehrauto();
                feu.setKennzeichen(kennzeichen);
                feu.setTyp(typ);
                feu.setSitzplaetze(sitzplaetze);
                feu.setFeuerwehr(feuerwehr);
                feu.setGeräte(geräte);
                em.persist(feu);
                return feu;
        }
        
        public void removeFeuerwehrauto(int id) {
                Feuerwehrauto feu = findFeuerwehrauto(id);
                if (feu != null) {
                        em.remove(feu);
                }
        }
        
        public Feuerwehrauto findFeuerwehrauto(int id) {
                return em.find(Feuerwehrauto.class, id);
        }
        
        public List<Feuerwehrauto> findAllFeuerwehrautos() {
                TypedQuery<Feuerwehrauto> query = em.createQuery("SELECT a FROM Feuerwehrauto f",
                                Feuerwehrauto.class);
                return query.getResultList();
        }
}