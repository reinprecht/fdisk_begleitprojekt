package domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * User: Stefan
 * Date: 01.10.13
 * Time: 09:09
 */
@Entity
@Table(name = "kurs")
public class Kurs  extends BasePersistable {
        
        private String kurzBezeichnung;
        private String langBezeichnung;
        private Date startdatum;
        private Date enddatum;
        private Feuerwehr kursOrt;
        
        public Kurs(String kurzBezeichnung, String langBezeichnung,
                        Date startdatum, Date enddatum, Feuerwehr kursOrt) {
                super();
                this.kurzBezeichnung = kurzBezeichnung;
                this.langBezeichnung = langBezeichnung;
                this.startdatum = startdatum;
                this.enddatum = enddatum;
                this.kursOrt = kursOrt;
        }
        
        public Kurs(){
                this.kurzBezeichnung = "TK";
                this.langBezeichnung = "Test Kurs";
                this.startdatum = new Date();
                this.enddatum = new Date();
                this.kursOrt = new Feuerwehr();
        }

        public String getKurzBezeichnung() {
                return kurzBezeichnung;
        }

        public void setKurzBezeichnung(String kurzBezeichnung) {
                this.kurzBezeichnung = kurzBezeichnung;
        }

        public String getLangBezeichnung() {
                return langBezeichnung;
        }

        public void setLangBezeichnung(String langBezeichnung) {
                this.langBezeichnung = langBezeichnung;
        }

        public Date getStartdatum() {
                return startdatum;
        }

        public void setStartdatum(Date startdatum) {
                this.startdatum = startdatum;
        }

        public Date getEnddatum() {
                return enddatum;
        }

        public void setEnddatum(Date enddatum) {
                this.enddatum = enddatum;
        }

        public Feuerwehr getKursOrt() {
                return kursOrt;
        }

        public void setKursOrt(Feuerwehr kursOrt) {
                this.kursOrt = kursOrt;
        }

        
        
}