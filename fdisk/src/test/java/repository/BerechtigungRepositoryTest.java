
package repository;

import domain.Berechtigung;

import javax.sql.DataSource;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

public class BerechtigungRepositoryTest {
	
    @Test
    public void testMe() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(RepositoryTestConfiguration.class);
        BerechtigungRepository repository = context.getBean(BerechtigungRepository.class);
        repository.save(new Berechtigung("Admin"));

        Berechtigung byid = repository.findById((long) 1);
        System.out.println(byid.toString());
    }
}
