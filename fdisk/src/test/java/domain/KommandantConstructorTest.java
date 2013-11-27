package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class KommandantConstructorTest {

	private String vorname;
	private String nachname;
	private String dienstgrad;
	private Date geburtsdatum;
	private String wohnort;
	private Feuerwehr feuerwehr;
	private Feuerwehr kommandant_feuerwehr;
	private Collection<Ausruestung> ausruestungen;
	private Collection<Ausbildung> ausbildung;

	public KommandantConstructorTest(String vorname, String nachname,
			String dienstgrad, Date geburtsdatum, String wohnort,
			Feuerwehr feuerwehr, Collection<Ausruestung> ausruestungen,
			Collection<Ausbildung> ausbildung, Feuerwehr kommandant_feuerwehr) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.dienstgrad = dienstgrad;
		this.wohnort = wohnort;
		this.feuerwehr = feuerwehr;
		this.kommandant_feuerwehr = kommandant_feuerwehr;
		this.ausruestungen = ausruestungen;
		this.ausbildung = ausbildung;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { //
				{ null, "R", "FM", new Date(), "PKDF", new Feuerwehr(), new ArrayList<Ausruestung>(), new ArrayList<Ausbildung>(), new Feuerwehr() },
				{ "", "R", "FM", new Date(), "PKDF", new Feuerwehr(), new ArrayList<Ausruestung>(), new ArrayList<Ausbildung>(), new Feuerwehr() },
				{ "S", null, "FM", new Date(), "PKDF", new Feuerwehr(), new ArrayList<Ausruestung>(), new ArrayList<Ausbildung>(), new Feuerwehr() },
				{ "S", "", "FM", new Date(), "PKDF", new Feuerwehr(), new ArrayList<Ausruestung>(), new ArrayList<Ausbildung>(), new Feuerwehr() },
				{ "S", "R", null, new Date(), "PKDF", new Feuerwehr(), new ArrayList<Ausruestung>(), new ArrayList<Ausbildung>(), new Feuerwehr() },
				{ "S", "", "", new Date(), "PKDF", new Feuerwehr(), new ArrayList<Ausruestung>(), new ArrayList<Ausbildung>(), new Feuerwehr() },
				{ "S", "R", "FM", null, "PKDF", new Feuerwehr(), new ArrayList<Ausruestung>(), new ArrayList<Ausbildung>(), new Feuerwehr() },
				{ "S", "R", "FM", new Date(), null, new Feuerwehr(), new ArrayList<Ausruestung>(), new ArrayList<Ausbildung>(), new Feuerwehr() },
				{ "S", "R", "FM", new Date(), "", new Feuerwehr(), new ArrayList<Ausruestung>(), new ArrayList<Ausbildung>(), new Feuerwehr() },
				{ "S", "R", "FM", new Date(), "PKDF", null, new ArrayList<Ausruestung>(), new ArrayList<Ausbildung>(), new Feuerwehr() },
				{ "S", "R", "FM", new Date(), "PKDF", new Feuerwehr(), new ArrayList<Ausruestung>(), new ArrayList<Ausbildung>(), new Feuerwehr() },
				{ "S", "R", "FM", new Date(), "PKDF", new Feuerwehr(), null, new ArrayList<Ausbildung>(), new Feuerwehr() },
				{ "S", "R", "FM", new Date(), "PKDF", new Feuerwehr(), new ArrayList<Ausruestung>(), null, new Feuerwehr() },
				{ "S", "R", "FM", new Date(), "PKDF", new Feuerwehr(), new ArrayList<Ausruestung>(), new ArrayList<Ausbildung>(), null } 
				};
		return Arrays.asList(data);
	}

	@Test(expected = IllegalArgumentException.class)
	public void whenCreatingWithNullArguments() {
		new Kommandant(vorname, nachname, dienstgrad, geburtsdatum, wohnort,
				feuerwehr, ausruestungen, ausbildung, kommandant_feuerwehr);
	}
}
