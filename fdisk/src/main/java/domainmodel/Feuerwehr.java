package domainmodel;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * User: Stefan
 * Date: 01.10.13
 * Time: 09:11
 */
@Entity
@Table(name = "feuerwehr")
public class Feuerwehr {
		
		@Id
        private int standesbuchnummer;
        private String Ort;
        private ArrayList<Mitglied> mitglieder;
        private ArrayList<Charge> chargen;
        private Kommandant kommandant;
        private ArrayList<Feuerwehrauto> autos;
        
        public Feuerwehr(){
                this.standesbuchnummer = -1;
                this.Ort = "Musterort";
                this.mitglieder = new ArrayList<Mitglied>();
                this.chargen = new ArrayList<Charge>();
                this.kommandant = new Kommandant();
                this.autos = new ArrayList<Feuerwehrauto>();
        }
        
        public Feuerwehr(int standesbuchnummer, String ort,
                        ArrayList<Mitglied> mitglieder, ArrayList<Charge> chargen,
                        Kommandant kommandant, ArrayList<Feuerwehrauto> autos) {
                super();
                this.standesbuchnummer = standesbuchnummer;
                Ort = ort;
                this.mitglieder = mitglieder;
                this.chargen = chargen;
                this.kommandant = kommandant;
                this.autos = autos;
        }

        public int getStandesbuchnummer() {
                return standesbuchnummer;
        }

        public void setStandesbuchnummer(int standesbuchnummer) {
                this.standesbuchnummer = standesbuchnummer;
        }

        public String getOrt() {
                return Ort;
        }

        public void setOrt(String ort) {
                Ort = ort;
        }

        public ArrayList<Mitglied> getMitglieder() {
                return mitglieder;
        }

        public void setMitglieder(ArrayList<Mitglied> mitglieder) {
                this.mitglieder = mitglieder;
        }

        public ArrayList<Charge> getChargen() {
                return chargen;
        }

        public void setChargen(ArrayList<Charge> chargen) {
                this.chargen = chargen;
        }

        public Kommandant getKommandant() {
                return kommandant;
        }

        public void setKommandant(Kommandant kommandant) {
                this.kommandant = kommandant;
        }

        public ArrayList<Feuerwehrauto> getAutos() {
                return autos;
        }

        public void setAutos(ArrayList<Feuerwehrauto> autos) {
                this.autos = autos;
        }
}