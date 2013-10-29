package domainmodel;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "kommandant")
public class Kommandant extends Mitglied{
        
		@Id
        private int standesbuchnummer;
        private String vorname;
        private String nachname;
        private String dienstgrad;
        private Date geburtsdatum;
        private String wohnort;
        private Feuerwehr feuerwehr;
        private ArrayList<Ausrüstung> ausrüstungen;
        private ArrayList<Kurs> kurse;
        
        public Kommandant(){
                this.standesbuchnummer = 0;
                this.vorname = "Max";
                this.nachname = "Musterkommandant";
                this.dienstgrad = "Musterdienstgrad";
                this.geburtsdatum = new Date();
                this.wohnort = "Musterwohnort";
                this.feuerwehr = new Feuerwehr();
                this.ausrüstungen = new ArrayList<Ausrüstung>();
                this.kurse = new ArrayList<Kurs>();
        }

        public Kommandant(int standesbuchnummer, String vorname, String nachname,
                        String dienstgrad, Date geburtsdatum, String wohnort,
                        Feuerwehr feuerwehr, ArrayList<Ausrüstung> ausrüstungen,
                        ArrayList<Kurs> kurse) {
                super();
                this.standesbuchnummer = standesbuchnummer;
                this.vorname = vorname;
                this.nachname = nachname;
                this.dienstgrad = dienstgrad;
                this.geburtsdatum = geburtsdatum;
                this.wohnort = wohnort;
                this.feuerwehr = feuerwehr;
                this.ausrüstungen = ausrüstungen;
                this.kurse = kurse;
        }

        public int getStandesbuchnummer() {
                return standesbuchnummer;
        }

        public void setStandesbuchnummer(int standesbuchnummer) {
                this.standesbuchnummer = standesbuchnummer;
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