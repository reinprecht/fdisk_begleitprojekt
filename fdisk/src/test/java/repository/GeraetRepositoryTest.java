package repository;

import java.util.Date;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.util.Assert;

import domain.Feuerwehrauto;
import domain.Geraet;

public class GeraetRepositoryTest {

	@Test
	public void testMe() {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(
				RepositoryTestConfiguration.class);
		GeraetRepository repository = context.getBean(GeraetRepository.class);
		repository.save(new Geraet("S", new Date(), new Feuerwehrauto()));

		Geraet geraet = repository.findById((long) 1);
		Assert.notNull(geraet);
	}
}
