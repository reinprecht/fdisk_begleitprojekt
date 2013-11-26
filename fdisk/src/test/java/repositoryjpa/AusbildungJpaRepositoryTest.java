package repositoryjpa;

import java.util.Date;

import domain.Ausbildung;
import domain.Feuerwehr;

import org.junit.Assert;
import org.junit.Test;

public class AusbildungJpaRepositoryTest extends AbstractJpaRepositoryTest {
    @Test
    public void verifyFindByUnknownId() {
    	AusbildungJpaRepository classRoomJpaRepository = new AusbildungJpaRepository();
        classRoomJpaRepository.setEntityManager(entityManager);

        Ausbildung classRoom = classRoomJpaRepository.findById(1l);

        Assert.assertNull(classRoom);
    }

    @Test
    public void verifyFindById() {
    	AusbildungJpaRepository classRoomJpaRepository = new AusbildungJpaRepository();
        classRoomJpaRepository.setEntityManager(entityManager);

        Ausbildung classRoom = new Ausbildung("Test", "T",
    			new Feuerwehr(), new Date(), new Date());
        classRoomJpaRepository.persist(classRoom);

        Ausbildung classRoom2 = classRoomJpaRepository.findById(classRoom.getId());

        Assert.assertNotNull(classRoom2);
        Assert.assertEquals(classRoom, classRoom2);
    }
}
