package domainmodel;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * User: Stefan
 * Date: 12.09.13
 * Time: 17:45
 */
@Entity
@Table(name = "feuerwehrauto")
public class Feuerwehrauto {
	
	@Id
    private String kennzeichen;
    private String typ;
    private int sitzplaetze;
    private Feuerwehr feuerwehr;
    private ArrayList<Geraet> ger�te;
    
        public Feuerwehrauto(String kennzeichen, String typ, int sitzplaetze,
                        Feuerwehr feuerwehr, ArrayList<Geraet> ger�te) {
                super();
                this.kennzeichen = kennzeichen;
                this.typ = typ;
                this.sitzplaetze = sitzplaetze;
                this.feuerwehr = feuerwehr;
                this.ger�te = ger�te;
        }
    
        public Feuerwehrauto(){
                this.kennzeichen = "Z 99999";
                this.typ = "Mustertyp";
                this.sitzplaetze = 0;
                this.feuerwehr = new Feuerwehr();
                this.ger�te = new ArrayList<Geraet>();
        }

        public String getKennzeichen() {
                return kennzeichen;
        }

        public void setKennzeichen(String kennzeichen) {
                this.kennzeichen = kennzeichen;
        }

        public String getTyp() {
                return typ;
        }

        public void setTyp(String typ) {
                this.typ = typ;
        }

        public int getSitzplaetze() {
                return sitzplaetze;
        }

        public void setSitzplaetze(int sitzplaetze) {
                this.sitzplaetze = sitzplaetze;
        }

        public Feuerwehr getFeuerwehr() {
                return feuerwehr;
        }

        public void setFeuerwehr(Feuerwehr feuerwehr) {
                this.feuerwehr = feuerwehr;
        }

        public ArrayList<Geraet> getGer�te() {
                return ger�te;
        }

        public void setGer�te(ArrayList<Geraet> ger�te) {
                this.ger�te = ger�te;
        }
        
}