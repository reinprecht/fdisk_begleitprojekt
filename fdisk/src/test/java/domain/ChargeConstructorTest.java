package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class ChargeConstructorTest {

	private String vorname;
	private String nachname;
	private String dienstgrad;
	private Date geburtsdatum;
	private String wohnort;
	private Feuerwehr feuerwehr;
	private String fachgebiet;
	private Collection<Ausruestung> ausruestungen;
	private Collection<Kurs> kurse;
	
	 public ChargeConstructorTest(String vorname, String nachname, String dienstgrad,
				Date geburtsdatum, String wohnort, Feuerwehr feuerwehr,
				String fachgebiet, Collection<Ausruestung> ausruestungen,
				Collection<Kurs> kurse) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.dienstgrad = dienstgrad;
        this.wohnort = wohnort;
        this.feuerwehr = feuerwehr;
        this.fachgebiet = fachgebiet;
        this.ausruestungen = ausruestungen;
        this.kurse = kurse;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{ //
                {null, "R", "FM", new Date(), "PKDF", new Feuerwehr(), "R", new ArrayList<Ausruestung>(), new ArrayList<Kurs>()},
                {"", "R", "FM", new Date(), "PKDF", new Feuerwehr(), "R", new ArrayList<Ausruestung>(), new ArrayList<Kurs>()},
                {"S", null, "FM", new Date(), "PKDF", new Feuerwehr(), "R", new ArrayList<Ausruestung>(), new ArrayList<Kurs>()},
                {"S", "", "FM", new Date(), "PKDF", new Feuerwehr(), "R", new ArrayList<Ausruestung>(), new ArrayList<Kurs>()},
                {"S", "R", null, new Date(), "PKDF", new Feuerwehr(), "R", new ArrayList<Ausruestung>(), new ArrayList<Kurs>()},
                {"S", "R", "", new Date(), "PKDF", new Feuerwehr(), "R", new ArrayList<Ausruestung>(), new ArrayList<Kurs>()},
                {"S", "R", "", null, "PKDF", new Feuerwehr(), "R", new ArrayList<Ausruestung>(), new ArrayList<Kurs>()},
                {"S", "R", "", new Date(), null, new Feuerwehr(), "R", new ArrayList<Ausruestung>(), new ArrayList<Kurs>()},
                {"S", "R", "", new Date(), "", new Feuerwehr(), "R", new ArrayList<Ausruestung>(), new ArrayList<Kurs>()},
                {"S", "R", "", new Date(), "PKDF", null, "R", new ArrayList<Ausruestung>(), new ArrayList<Kurs>()},
                {"S", "R", "", new Date(), "PKDF", new Feuerwehr(), null, new ArrayList<Ausruestung>(), new ArrayList<Kurs>()},
                {"S", "R", "", new Date(), "PKDF", new Feuerwehr(), "", new ArrayList<Ausruestung>(), new ArrayList<Kurs>()},
                {"S", "R", "", new Date(), "PKDF", new Feuerwehr(), "R", null, new ArrayList<Kurs>()},
                {"S", "R", "", new Date(), "PKDF", new Feuerwehr(), "R", new ArrayList<Ausruestung>(), null}
                };
        return Arrays.asList(data);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenCreatingWithNullArguments() {
        new Charge(vorname, nachname, dienstgrad,
			geburtsdatum, wohnort, feuerwehr,
			fachgebiet, ausruestungen, kurse);
    }
}
