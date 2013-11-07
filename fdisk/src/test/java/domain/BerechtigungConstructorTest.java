package domain;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class BerechtigungConstructorTest {

	private String berechtigung;
	
	public BerechtigungConstructorTest(String berechtigung){
		this.berechtigung = berechtigung;
	}
	
	@Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{ //
                {null}, //
                {"test"}};
        return Arrays.asList(data);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void whenCreatingWithNullArguments() {
        new Berechtigung(berechtigung);
    }
}
