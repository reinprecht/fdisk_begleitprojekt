package domain;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * User: Stefan
 * Date: 12.09.13
 * Time: 17:45
 */
@Entity
@Table(name = "gerät")
public class Geraet  extends BasePersistable {
	
    private String bezeichnung;
    private Date pruefungstermin;
    private Feuerwehrauto auto;

    public Geraet(String bezeichnung, Date pruefungstermin, Feuerwehrauto auto){
        this.bezeichnung = bezeichnung;
        this.pruefungstermin = pruefungstermin;
        this.auto = auto;
    }
    
    public Geraet(){
            bezeichnung = "Mustergerät";
            pruefungstermin = new Date();
            auto = new Feuerwehrauto();
    }


    public String getBezeichnung() {
        return bezeichnung;
    }

    public Date getPruefungstermin() {
        return pruefungstermin;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public void setPruefungstermin(Date pruefungstermin) {
        this.pruefungstermin = pruefungstermin;
    }

        public Feuerwehrauto getAuto() {
                return auto;
        }

        public void setAuto(Feuerwehrauto auto) {
                this.auto = auto;
        }
    
}