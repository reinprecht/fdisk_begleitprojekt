package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class FeuerwehrConstructorTest {

	public String ort;
	public ArrayList<Mitglied> mitglieder;
	public ArrayList<Charge> chargen;
	public Kommandant kommandant;
	public ArrayList<Feuerwehrauto> autos;
	public ArrayList<Ausbildung> ausbildungen;

	public FeuerwehrConstructorTest(String ort, ArrayList<Mitglied> mitglieder,
			ArrayList<Charge> chargen, Kommandant kommandant,
			ArrayList<Feuerwehrauto> autos, ArrayList<Ausbildung> ausbildungen) {
		this.ort = ort;
		this.mitglieder = mitglieder;
		this.chargen = chargen;
		this.kommandant = kommandant;
		this.autos = autos;
		this.ausbildungen = ausbildungen;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { //
				{ "", new ArrayList<Mitglied>(), new ArrayList<Charge>(),
						new Kommandant(), new ArrayList<Feuerwehrauto>(),
						new ArrayList<Ausbildung>() },
				{ "PKDF", null, new ArrayList<Charge>(), new Kommandant(),
						new ArrayList<Feuerwehrauto>(),
						new ArrayList<Ausbildung>() },
				{ "", new ArrayList<Mitglied>(), null, new Kommandant(),
						new ArrayList<Feuerwehrauto>(),
						new ArrayList<Ausbildung>() },
				{ "", new ArrayList<Mitglied>(), new ArrayList<Charge>(), null,
						new ArrayList<Feuerwehrauto>(),
						new ArrayList<Ausbildung>() },
				{ "", new ArrayList<Mitglied>(), new ArrayList<Charge>(),
						new Kommandant(), null, new ArrayList<Ausbildung>() },
				{ "", new ArrayList<Mitglied>(), new ArrayList<Charge>(),
						new Kommandant(), new ArrayList<Feuerwehrauto>(), null } };
		return Arrays.asList(data);
	}

	@Test(expected = IllegalArgumentException.class)
	public void whenCreatingWithNullArguments() {
		new Feuerwehr(ort, mitglieder, chargen, kommandant, autos, ausbildungen);
	}
}
