package app;

import java.util.HashMap;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import repositoryjpa.AusbildungRepository;
import repositoryjpa.AusrüstungRepository;
import repositoryjpa.ChargeRepository;
import repositoryjpa.FeuerwehrRepository;
import repositoryjpa.FeuerwehrautoRepository;
import repositoryjpa.GeraetRepository;
import repositoryjpa.JpaRepository;
import repositoryjpa.KommandantRepository;
import repositoryjpa.KursRepository;
import repositoryjpa.MitgliedRepository;
import repositoryjpa.PersistenceFactory;

public class PersistenceFactoryImpl implements PersistenceFactory {

	private EntityManagerFactory entityManagerFactory;

    private EntityManager entityManager;

    private final HashMap<Class<?>, JpaRepository> repositories = new HashMap<>();

    public void setup(){
    	entityManagerFactory = Persistence.createEntityManagerFactory("fdisk");
        entityManager = entityManagerFactory.createEntityManager();
        
        repositories.put(AusbildungRepository.class, new AusbildungRepository(entityManager));
        repositories.put(AusrüstungRepository.class, new AusrüstungRepository(entityManager));
        repositories.put(ChargeRepository.class, new ChargeRepository(entityManager));
        repositories.put(FeuerwehrautoRepository.class, new FeuerwehrautoRepository(entityManager));
        repositories.put(FeuerwehrRepository.class, new FeuerwehrRepository(entityManager));
        repositories.put(GeraetRepository.class, new GeraetRepository(entityManager));
        repositories.put(KommandantRepository.class, new KommandantRepository(entityManager));
        repositories.put(KursRepository.class, new KursRepository(entityManager));
        repositories.put(MitgliedRepository.class, new MitgliedRepository(entityManager));
    }
    
    public void teardown() {
        if (entityManager != null) {
            entityManager.close();
        }
        if (entityManagerFactory != null) {
            entityManagerFactory.close();
        }
    }
    
	public AusbildungRepository ausbildungsRepository() {
		return (AusbildungRepository)repositories.get(AusbildungRepository.class);
	}

	public AusrüstungRepository ausrüstungRepository() {
		return (AusrüstungRepository)repositories.get(AusrüstungRepository.class);
	}

	public ChargeRepository chargeRepostitory() {
		return (ChargeRepository)repositories.get(ChargeRepository.class);
	}

	public FeuerwehrautoRepository feuerwehrautoRepository() {
		return (FeuerwehrautoRepository)repositories.get(FeuerwehrautoRepository.class);
	}

	public FeuerwehrRepository feuerwehrRepository() {
		return (FeuerwehrRepository)repositories.get(FeuerwehrRepository.class);
	}

	public GeraetRepository geraeteRepository() {
		return (GeraetRepository)repositories.get(GeraetRepository.class);
	}

	public KommandantRepository kommandantRepository() {
		return (KommandantRepository)repositories.get(KommandantRepository.class);
	}

	public KursRepository kursRepository() {
		return (KursRepository)repositories.get(KursRepository.class);
	}

	public MitgliedRepository mitgliedRepository() {
		return (MitgliedRepository)repositories.get(MitgliedRepository.class);
	}

}
