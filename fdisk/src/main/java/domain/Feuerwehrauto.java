package domain;

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
public class Feuerwehrauto  extends BasePersistable {
	
    private String typ;
    private int sitzplaetze;
    private Feuerwehr feuerwehr;
    private ArrayList<Geraet> geräte;
    
        public Feuerwehrauto(String typ, int sitzplaetze,
                        Feuerwehr feuerwehr, ArrayList<Geraet> geräte) {
                super();
                this.typ = typ;
                this.sitzplaetze = sitzplaetze;
                this.feuerwehr = feuerwehr;
                this.geräte = geräte;
        }
    
        public Feuerwehrauto(){
                this.typ = "Mustertyp";
                this.sitzplaetze = 0;
                this.feuerwehr = new Feuerwehr();
                this.geräte = new ArrayList<Geraet>();
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

        public ArrayList<Geraet> getGeräte() {
                return geräte;
        }

        public void setGeräte(ArrayList<Geraet> geräte) {
                this.geräte = geräte;
        }
        
}