package domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import help.EnsureService;

@Entity
@Table(name = "ausbildung")
public class Ausbildung extends BasePersistable {

	private static final long serialVersionUID = 4601413807692718572L;
	
	@Size(max = 30)
	@NotNull
	@Column(name = "bezeichnung", nullable = false, length = 30)
	private String bezeichnung;
	
	@Size(max = 3)
	@NotNull
	@Column(name = "kurzbezeichnung", nullable = false, length = 3)
	private String kurz_bezeichnung;
	
	@ManyToOne
	@Transient
	private Feuerwehr ort;
	
	@Temporal(TemporalType.DATE)
	@NotNull
	@Column(name = "datum", nullable = false)
	private Date datum;

	public Ausbildung(String bezeichnung, String kurz_bezeichnung,
			Feuerwehr ort, Date datum) {
		super();
		EnsureService.notEmpty("bezeichnung", bezeichnung);
		EnsureService.notEmpty("kurz_bezeichnung", kurz_bezeichnung);
		EnsureService.notNull("ort", ort);
		EnsureService.notNull("datum", datum);
		this.bezeichnung = bezeichnung;
		this.kurz_bezeichnung = kurz_bezeichnung;
		this.ort = ort;
		this.datum = datum;
	}

	public Ausbildung() {
		// required for JPA
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public String getKurz_bezeichnung() {
		return kurz_bezeichnung;
	}

	public void setKurz_bezeichnung(String kurz_bezeichnung) {
		this.kurz_bezeichnung = kurz_bezeichnung;
	}

	public Feuerwehr getOrt() {
		return ort;
	}

	public void setOrt(Feuerwehr ort) {
		this.ort = ort;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

}