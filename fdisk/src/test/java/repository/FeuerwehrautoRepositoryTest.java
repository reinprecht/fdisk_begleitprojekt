package repository;

import java.util.ArrayList;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import domain.Feuerwehr;
import domain.Feuerwehrauto;
import domain.Geraet;

public class FeuerwehrautoRepositoryTest {

	@Test
	public void testMe() {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(
				RepositoryTestConfiguration.class);
		FeuerwehrautoRepository repository = context.getBean(FeuerwehrautoRepository.class);
		repository.save(new Feuerwehrauto("A", 1, new Feuerwehr(),
				new ArrayList<Geraet>()));

		Feuerwehrauto byid = repository.findById((long) 1);
		System.out.println(byid.toString());
	}
}
