package domainmodel;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "ausbildung")
public class Ausbildung {
        
        @Id
        private int kennnummer;
        private String bezeichnung;
        private String kurz_bezeichnung;
        private Feuerwehr ort;
        private Date datum;
        
        public Ausbildung(int kennnummer, String bezeichnung,
                        String kurz_bezeichnung, Feuerwehr ort, Date datum) {
                super();
                this.kennnummer = kennnummer;
                this.bezeichnung = bezeichnung;
                this.kurz_bezeichnung = kurz_bezeichnung;
                this.ort = ort;
                this.datum = datum;
        }

        public Ausbildung(){
                kennnummer = -1;
                bezeichnung = "TestAusbildung";
                kurz_bezeichnung = "Test";
                ort = new Feuerwehr();
                datum = new Date();
        }

        public int getKennnummer() {
                return kennnummer;
        }

        public void setKennnummer(int kennnummer) {
                this.kennnummer = kennnummer;
        }

        public String getBezeichnung() {
                return bezeichnung;
        }

        public void setBezeichnung(String bezeichnung) {
                this.bezeichnung = bezeichnung;
        }

        public String getKurz_bezeichnung() {
                return kurz_bezeichnung;
        }

        public void setKurz_bezeichnung(String kurz_bezeichnung) {
                this.kurz_bezeichnung = kurz_bezeichnung;
        }

        public Feuerwehr getOrt() {
                return ort;
        }

        public void setOrt(Feuerwehr ort) {
                this.ort = ort;
        }

        public Date getDatum() {
                return datum;
        }

        public void setDatum(Date datum) {
                this.datum = datum;
        }
        
        
}