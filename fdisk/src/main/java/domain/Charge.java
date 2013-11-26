package domain;

import help.EnsureService;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "charge")
public class Charge extends Mitglied {

	private static final long serialVersionUID = -4720638043052019587L;
	
	@Size(max = 15)
	@NotNull
	@Column(name = "fachgebiet", nullable = false, length = 15)
	private String fachgebiet;

	public Charge() {
		//for jpa
	}

	public Charge(String vorname, String nachname, String dienstgrad,
			Date geburtsdatum, String wohnort, Feuerwehr feuerwehr,
			String fachgebiet, Collection<Ausruestung> ausruestungen,
			Collection<Kurs> kurse) {
		super(vorname, nachname, dienstgrad, geburtsdatum, wohnort,
				feuerwehr, ausruestungen, kurse);
		EnsureService.notEmpty("fachgebiet", fachgebiet);
		this.fachgebiet = fachgebiet;
	}

	public String getFachgebiet() {
		return fachgebiet;
	}

	public void setFachgebiet(String fachgebiet) {
		this.fachgebiet = fachgebiet;
	}
}