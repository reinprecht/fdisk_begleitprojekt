package repository;

import java.util.Date;

import com.mysema.query.jpa.impl.JPAQuery;

import domain.Ausbildung;
import domain.QAusbildung;
import domain.Feuerwehr;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(classes = RepositoryTestConfiguration.class)
public class AusbildungQuerydslTest extends AbstractJUnit4SpringContextTests {

    @PersistenceContext
    EntityManager entityManager;

    @Autowired
    AusbildungRepository ausbildungRepository;

    @Before
    public void setup() {
        ausbildungRepository.deleteAll();
    }

    @Test
    public void testFindByName() {
        // given
    	ausbildungRepository.save(new Ausbildung("Atemschutz", "AS", new Feuerwehr(), new Date(), new Date()));
    	ausbildungRepository.save(new Ausbildung("Truppman", "TM", new Feuerwehr(), new Date(), new Date()));
    	ausbildungRepository.save(new Ausbildung("Grundlagen Führen", "GFÜ", new Feuerwehr(), new Date(), new Date()));

        // when
        JPAQuery query = new JPAQuery(entityManager);
        QAusbildung ausbildung = new QAusbildung("Test");
        query.from(ausbildung).
                where(ausbildung.bezeichnung.eq("Atemschutz")).
                orderBy(ausbildung.startdatum.asc());

        Ausbildung result = query.singleResult(ausbildung);

        // then
        Assert.assertNotNull(result);
        Assert.assertEquals("Atemschutz", result.getBezeichnung());
    }
}
