package domain;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "kommandant")
public class Kommandant extends Mitglied {

	private static final long serialVersionUID = -9031056576232458294L;
	
	private Feuerwehr kommandant_feuerwehr;

	public Kommandant() {
		//for jpa
	}

	public Kommandant(String vorname, String nachname, String dienstgrad,
			Date geburtsdatum, String wohnort, Feuerwehr feuerwehr,
			Collection<Ausruestung> ausruestungen, Collection<Ausbildung> ausbildung,
			Feuerwehr kommandant_feuerwehr) {
		super(vorname, nachname, dienstgrad, geburtsdatum, wohnort,
				feuerwehr, ausruestungen, ausbildung);
		this.setKommandant_feuerwehr(kommandant_feuerwehr);
	}

	public Feuerwehr getKommandant_feuerwehr() {
		return kommandant_feuerwehr;
	}

	public void setKommandant_feuerwehr(Feuerwehr kommandant_feuerwehr) {
		this.kommandant_feuerwehr = kommandant_feuerwehr;
	}
}