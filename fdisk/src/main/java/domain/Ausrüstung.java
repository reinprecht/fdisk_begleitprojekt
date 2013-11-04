package domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ausrüstung")
public class Ausrüstung  extends BasePersistable {

	private String bezeichnung;
	private Mitglied benutzer;
	private Date ausgegeben;

	public Ausrüstung(String bezeichnung, Mitglied benutzer,
			Date ausgegeben) {
		super();
		this.bezeichnung = bezeichnung;
		this.benutzer = benutzer;
		this.ausgegeben = ausgegeben;
	}

	public Ausrüstung() {
		bezeichnung = "Testausrüstung";
		benutzer = new Mitglied();
		ausgegeben = new Date();
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