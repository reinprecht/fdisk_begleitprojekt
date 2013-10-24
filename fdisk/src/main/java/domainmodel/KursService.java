package domainmodel;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class KursService {

        protected EntityManager em;

        public KursService(EntityManager em) {
                this.em = em;
        }
        
        public Kurs createKurs(long kursid, String kurzBezeichnung, String langBezeichnung,
                        Date startdatum, Date enddatum, Feuerwehr kursOrt){
                Kurs kurs = new Kurs();
                kurs.setKursid(kursid);
                kurs.setKurzBezeichnung(kurzBezeichnung);
                kurs.setLangBezeichnung(langBezeichnung);
                kurs.setStartdatum(startdatum);
                kurs.setEnddatum(enddatum);
                kurs.setKursOrt(kursOrt);
                em.persist(kurs);
                return kurs;
        }
        
        public void removeKurs(int id) {
                Kurs kurs = findKurs(id);
                if (kurs != null) {
                        em.remove(kurs);
                }
        }
        
        public Kurs findKurs(int id) {
                return em.find(Kurs.class, id);
        }
        
        public List<Kurs> findAllKurse() {
                TypedQuery<Kurs> query = em.createQuery("SELECT a FROM Kurs k",
                                Kurs.class);
                return query.getResultList();
        }
}