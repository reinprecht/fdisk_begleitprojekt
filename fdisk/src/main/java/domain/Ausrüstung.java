package domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ausr�stung")
public class Ausr�stung  extends BasePersistable {

	private String bezeichnung;
	private Mitglied benutzer;
	private Date ausgegeben;

	public Ausr�stung(String bezeichnung, Mitglied benutzer,
			Date ausgegeben) {
		super();
		this.bezeichnung = bezeichnung;
		this.benutzer = benutzer;
		this.ausgegeben = ausgegeben;
	}

	public Ausr�stung() {
		bezeichnung = "Testausr�stung";
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