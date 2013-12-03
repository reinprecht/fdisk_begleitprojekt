package repository;

import org.junit.BeforeClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 *
 */
public class AbstractRepositoryTest {

	@BeforeClass
	public static void beforeClass() {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(
				RepositoryTestConfiguration.class);
	}
}