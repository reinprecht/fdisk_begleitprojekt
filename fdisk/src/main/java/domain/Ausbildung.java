package domain;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
	
	@Column(name = "ort", nullable = false)
	private Feuerwehr ort;
	
	@Temporal(TemporalType.DATE)
	@NotNull
	@Column(name = "datum", nullable = false)
	private Date datum;

	public Ausbildung(String bezeichnung, String kurz_bezeichnung,
			Feuerwehr ort, Date datum) {
		super();
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