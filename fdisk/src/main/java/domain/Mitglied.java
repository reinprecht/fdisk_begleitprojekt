package domain;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mitglied")
public class Mitglied  extends BasePersistable{
        
        private String vorname;
        private String nachname;
        private String dienstgrad;
        private Date geburtsdatum;
        private String wohnort;
        private Feuerwehr feuerwehr;
        private ArrayList<Ausrüstung> ausrüstungen;
        private ArrayList<Kurs> kurse;
        
        public Mitglied(){
                this.vorname = "Max";
                this.nachname = "Mustermann";
                this.dienstgrad = "Musterdienstgrad";
                this.geburtsdatum = new Date();
                this.wohnort = "Musterwohnort";
                this.feuerwehr = new Feuerwehr();
                this.ausrüstungen = new ArrayList<Ausrüstung>();
                this.kurse = new ArrayList<Kurs>();
        }

        public Mitglied(String vorname, String nachname,
                        String dienstgrad, Date geburtsdatum, String wohnort,
                        Feuerwehr feuerwehr, ArrayList<Ausrüstung> ausrüstungen,
                        ArrayList<Kurs> kurse) {
                super();
                this.vorname = vorname;
                this.nachname = nachname;
                this.dienstgrad = dienstgrad;
                this.geburtsdatum = geburtsdatum;
                this.wohnort = wohnort;
                this.feuerwehr = feuerwehr;
                this.ausrüstungen = ausrüstungen;
                this.kurse = kurse;
        }

        public String getVorname() {
                return vorname;
        }

        public void setVorname(String vorname) {
                this.vorname = vorname;
        }

        public String getNachname() {
                return nachname;
        }

        public void setNachname(String nachname) {
                this.nachname = nachname;
        }

        public String getDienstgrad() {
                return dienstgrad;
        }

        public void setDienstgrad(String dienstgrad) {
                this.dienstgrad = dienstgrad;
        }

        public Date getGeburtsdatum() {
                return geburtsdatum;
        }

        public void setGeburtsdatum(Date geburtsdatum) {
                this.geburtsdatum = geburtsdatum;
        }

        public String getWohnort() {
                return wohnort;
        }

        public void setWohnort(String wohnort) {
                this.wohnort = wohnort;
        }

        public Feuerwehr getFeuerwehr() {
                return feuerwehr;
        }

        public void setFeuerwehr(Feuerwehr feuerwehr) {
                this.feuerwehr = feuerwehr;
        }

        public ArrayList<Ausrüstung> getAusrüstungen() {
                return ausrüstungen;
        }

        public void setAusrüstungen(ArrayList<Ausrüstung> ausrüstungen) {
                this.ausrüstungen = ausrüstungen;
        }

        public ArrayList<Kurs> getKurse() {
                return kurse;
        }

        public void setKurse(ArrayList<Kurs> kurse) {
                this.kurse = kurse;
        }        
}