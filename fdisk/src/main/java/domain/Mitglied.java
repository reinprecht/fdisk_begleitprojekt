package domain;

import help.EnsureService;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "mitglied")
public class Mitglied extends BasePersistable {

	private static final long serialVersionUID = -8246771010077369302L;
	
	@Size(max = 15)
	@NotNull
	@Column(name = "vorname", nullable = false, length = 15)
	private String vorname;
	
	@Size(max = 20)
	@NotNull
	@Column(name = "nachname", nullable = false, length = 20)
	private String nachname;
	
	@Size(max = 3)
	@NotNull
	@Column(name = "dienstgrad", nullable = false, length = 3)
	private String dienstgrad;
	
	@Temporal(TemporalType.DATE)
	@NotNull
	@Column(name = "gebdat", nullable = false)
	private Date geburtsdatum;
	
	@Size(max = 15)
	@NotNull
	@Column(name = "wohnort", nullable = false, length = 15)
	private String wohnort;
	
	@ManyToOne
	@Transient
	private Feuerwehr feuerwehr;
	
	@OneToMany
	private Collection<Ausruestung> ausruestungen;
	
	@OneToMany
	private Collection<Kurs> kurse;

	public Mitglied() {
		//for jpa
	}

	public Mitglied(String vorname, String nachname, String dienstgrad,
			Date geburtsdatum, String wohnort, Feuerwehr feuerwehr,
			Collection<Ausruestung> ausruestungen, Collection<Kurs> kurse) {
		super();
		EnsureService.notEmpty("vorname", vorname);
		EnsureService.notEmpty("nachname", nachname);
		EnsureService.notEmpty("dienstgrad", dienstgrad);
		EnsureService.notNull("geburtsdatum", geburtsdatum);
		EnsureService.notEmpty("wohnort", wohnort);
		EnsureService.notNull("feuerwehr", feuerwehr);
		EnsureService.notNull("ausruestungen", ausruestungen);
		EnsureService.notNull("kurse", kurse);
		this.vorname = vorname;
		this.nachname = nachname;
		this.dienstgrad = dienstgrad;
		this.geburtsdatum = geburtsdatum;
		this.wohnort = wohnort;
		this.feuerwehr = feuerwehr;
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

	public Collection<Ausruestung> getAusruestungen() {
		return ausruestungen;
	}

	public void setAusruestungen(Collection<Ausruestung> ausruestungen) {
		this.ausruestungen = ausruestungen;
	}

	public Collection<Kurs> getKurse() {
		return kurse;
	}

	public void setKurse(Collection<Kurs> kurse) {
		this.kurse = kurse;
	}
}