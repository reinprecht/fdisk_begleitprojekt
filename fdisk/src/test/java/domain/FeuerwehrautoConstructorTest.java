package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class FeuerwehrautoConstructorTest {
	public String typ;
	public int sitzplaetze;
	public Feuerwehr feuerwehr;
	public ArrayList<Geraet> geraete;

	public FeuerwehrautoConstructorTest(String typ, int sitzplaetze,
			Feuerwehr feuerwehr, ArrayList<Geraet> geraete) {
		this.typ = typ;
		this.sitzplaetze = sitzplaetze;
		this.feuerwehr = feuerwehr;
		this.geraete = geraete;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] {
				{ "", 1, new Feuerwehr(), new ArrayList<Geraet>() },
				{ null, 1, new Feuerwehr(), new ArrayList<Geraet>() },
				{ "A", 0, new Feuerwehr(), new ArrayList<Geraet>() },
				{ "A", 1, null, new ArrayList<Geraet>() },
				{ "A", 1, new Feuerwehr(), null }, };
		return Arrays.asList(data);
	}

	@Test(expected = IllegalArgumentException.class)
	public void whenCreatingWithNullArguments() {
		new Feuerwehrauto(typ, sitzplaetze, feuerwehr, geraete);
	}
}
