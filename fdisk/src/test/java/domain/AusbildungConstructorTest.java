package domain;

import static org.junit.Assert.*;

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
	
	 public AusbildungConstructorTest(String b, String kb, Feuerwehr ort, Date date) {
	        this.bezeichnung = b;
	        this.kurz_bezeichnung = kb;
	        this.ort = ort;
	        this.datum = date;
	    }

	    @Parameterized.Parameters
	    public static Collection<Object[]> data() {
	        Object[][] data = new Object[][]{ //
	                {"Test", "T", new Feuerwehr(), new Date()}
	                };
	        return Arrays.asList(data);
	    }

	    @Test(expected = IllegalArgumentException.class)
	    public void whenCreatingWithNullArguments() {
	        new Ausbildung(bezeichnung, kurz_bezeichnung, ort, datum);
	    }

}