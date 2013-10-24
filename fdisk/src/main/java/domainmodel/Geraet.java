package domainmodel;
import java.util.Date;

/**
 * User: Stefan
 * Date: 12.09.13
 * Time: 17:45
 */
public class Geraet {
    private long id;
    private String bezeichnung;
    private Date pruefungstermin;
    private Feuerwehrauto auto;

    public Geraet(long id, String bezeichnung, Date pruefungstermin, Feuerwehrauto auto){
        this.id = id;
        this.bezeichnung = bezeichnung;
        this.pruefungstermin = pruefungstermin;
        this.auto = auto;
    }
    
    public Geraet(){
            id = -1;
            bezeichnung = "Mustergerät";
            pruefungstermin = new Date();
            auto = new Feuerwehrauto();
    }

    public long getId() {
        return id;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public Date getPruefungstermin() {
        return pruefungstermin;
    }

    public void setId(long id) {
        this.id = id;
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