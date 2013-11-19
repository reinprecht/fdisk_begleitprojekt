package domain;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * User: Stefan Date: 01.10.13 Time: 09:11
 */
@Entity
@Table(name = "feuerwehr")
public class Feuerwehr extends BasePersistable {

	private static final long serialVersionUID = 4011028919765324284L;
	
	@Size(max = 20)
	@NotNull
	@Column(name = "ort", nullable = false, length = 20)
	private String ort;
	
	@OneToMany
	private Collection<Mitglied> mitglieder;
	
	@OneToMany
	private Collection<Charge> chargen;
	
	@ManyToOne
	private Kommandant kommandant;
	
	@OneToMany
	private Collection<Feuerwehrauto> autos;
	
	@OneToMany
	private Collection<Ausbildung> ausbildungen;

	public Feuerwehr() {
		//for jpa
	}

	public Feuerwehr(String ort, ArrayList<Mitglied> mitglieder,
			ArrayList<Charge> chargen, Kommandant kommandant,
			ArrayList<Feuerwehrauto> autos, ArrayList<Ausbildung> ausbildungen) {
		super();
		this.ort = ort;
		this.mitglieder = mitglieder;
		this.chargen = chargen;
		this.kommandant = kommandant;
		this.autos = autos;
		this.ausbildungen = ausbildungen;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public Collection<Mitglied> getMitglieder() {
		return mitglieder;
	}

	public void setMitglieder(Collection<Mitglied> mitglieder) {
		this.mitglieder = mitglieder;
	}

	public Collection<Charge> getChargen() {
		return chargen;
	}

	public void setChargen(Collection<Charge> chargen) {
		this.chargen = chargen;
	}

	public Kommandant getKommandant() {
		return kommandant;
	}

	public void setKommandant(Kommandant kommandant) {
		this.kommandant = kommandant;
	}

	public Collection<Feuerwehrauto> getAutos() {
		return autos;
	}

	public void setAutos(Collection<Feuerwehrauto> autos) {
		this.autos = autos;
	}
	
	public Collection<Ausbildung> getAusbildungen() {
		return ausbildungen;
	}

	public void setAusbildungen(Collection<Ausbildung> ausbildungen) {
		this.ausbildungen = ausbildungen;
	}
}