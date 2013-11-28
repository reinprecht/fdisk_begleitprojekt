package repository;

import java.util.ArrayList;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import domain.Ausbildung;
import domain.Charge;
import domain.Feuerwehr;
import domain.Feuerwehrauto;
import domain.Kommandant;
import domain.Mitglied;

public class FeuerwehrRepositoryTest {

	@Test
	public void testMe() {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(
				RepositoryTestConfiguration.class);
		FeuerwehrRepository repository = context.getBean(FeuerwehrRepository.class);
		repository.save(new Feuerwehr("PKDF", new ArrayList<Mitglied>(),
				new ArrayList<Charge>(), new Kommandant(),
				new ArrayList<Feuerwehrauto>(), new ArrayList<Ausbildung>()));

		Feuerwehr byid = repository.findById((long) 1);
		System.out.println(byid.toString());
	}
}
