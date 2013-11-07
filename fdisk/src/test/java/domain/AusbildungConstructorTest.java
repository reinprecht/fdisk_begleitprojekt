package domain;

import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class AusbildungConstructorTest {

	private String bezeichnung;
	private String kurz_bezeichnung;
	private Feuerwehr ort;
	private Date datum;
	
	public AusbildungConstructorTest(String bez, String kbez, Feuerwehr ort,
			Date datum){
		this.bezeichnung = bez;
		this.kurz_bezeichnung = kbez;
		this.ort = ort;
		this.datum = datum;
	}
	
	@Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{ //
                {null, null, null, null}, //
                {"Testbez", null, null, null}, //
                {null, "Testkbez", null, null}, //
                {null, null, new Feuerwehr(), null},
                {null, null, null, new Date()},
                {"Testbez", "Testkbez", null, null}};
        return Arrays.asList(data);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void whenCreatingWithNullArguments() {
        new Ausbildung(bezeichnung, kurz_bezeichnung, ort, datum);
    }
}
