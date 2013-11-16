package domain;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class BerechtigungConstructorTest {
	private String name;
	
	public BerechtigungConstructorTest(String name){
		this.name = name;
	}
	
	@Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{ //
                {null}, //
                {""}};
        return Arrays.asList(data);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void whenCreatingWithNullArguments() {
        new Berechtigung(name);
    }
}
