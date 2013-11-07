package domain;

import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "charge")
public class Charge extends Mitglied {

	private static final long serialVersionUID = -4720638043052019587L;
	private String vorname;
	private String nachname;
	private String dienstgrad;
	private Date geburtsdatum;
	private String wohnort;
	private Feuerwehr feuerwehr;
	private String fachgebiet;
	private ArrayList<Ausruestung> ausruestungen;
	private ArrayList<Kurs> kurse;

	public Charge() {
		this.vorname = "Max";
		this.nachname = "Musterkommandant";
		this.dienstgrad = "Musterdienstgrad";
		this.geburtsdatum = new Date();
		this.wohnort = "Musterwohnort";
		this.feuerwehr = new Feuerwehr();
		this.fachgebiet = "Musterfachgebiet";
		this.ausruestungen = new ArrayList<Ausruestung>();
		this.kurse = new ArrayList<Kurs>();
	}

	public Charge(String vorname, String nachname, String dienstgrad,
			Date geburtsdatum, String wohnort, Feuerwehr feuerwehr,
			String fachgebiet, ArrayList<Ausruestung> ausruestungen,
			ArrayList<Kurs> kurse) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
		this.dienstgrad = dienstgrad;
		this.geburtsdatum = geburtsdatum;
		this.wohnort = wohnort;
		this.feuerwehr = feuerwehr;
		this.fachgebiet = fachgebiet;
		this.ausruestungen = ausruestungen;
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

	public String getFachgebiet() {
		return fachgebiet;
	}

	public void setFachgebiet(String fachgebiet) {
		this.fachgebiet = fachgebiet;
	}

	public ArrayList<Ausruestung> getAusruestungen() {
		return ausruestungen;
	}

	public void setAusruestungen(ArrayList<Ausruestung> ausruestungen) {
		this.ausruestungen = ausruestungen;
	}

	public ArrayList<Kurs> getKurse() {
		return kurse;
	}

	public void setKurse(ArrayList<Kurs> kurse) {
		this.kurse = kurse;
	}
}