package domainmodel;

import java.util.Date;

public class Ausr�stung {
        private int kennnummer;
        private String bezeichnung;
        private Mitglied benutzer;
        private Date ausgegeben;
        
        public Ausr�stung(int kennnummer, String bezeichnung, Mitglied benutzer,
                        Date ausgegeben) {
                super();
                this.kennnummer = kennnummer;
                this.bezeichnung = bezeichnung;
                this.benutzer = benutzer;
                this.ausgegeben = ausgegeben;
        }

        public Ausr�stung(){
                kennnummer = -1;
                bezeichnung = "Testausr�stung";
                benutzer = new Mitglied();
                ausgegeben = new Date();
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

        public Mitglied getBenutzer() {
                return benutzer;
        }

        public void setBenutzer(Mitglied benutzer) {
                this.benutzer = benutzer;
        }

        public Date getAusgegeben() {
                return ausgegeben;
        }

        public void setAusgegeben(Date ausgegeben) {
                this.ausgegeben = ausgegeben;
        }
        
}