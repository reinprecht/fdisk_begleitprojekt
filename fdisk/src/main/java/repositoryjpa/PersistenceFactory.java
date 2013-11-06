package repositoryjpa;

public interface PersistenceFactory {
	
	AusbildungJpaRepository ausbildungsRepository();
	
	AusrüstungJpaRepository ausrüstungRepository();
	
	ChargeJpaRepository chargeRepostitory();
	
	FeuerwehrautoJpaRepository feuerwehrautoRepository();
	
	FeuerwehrJpaRepository feuerwehrRepository();
	
	GeraetJpaRepository geraeteRepository();
	
	KommandantJpaRepository kommandantRepository();
	
	KursJpaRepository kursRepository();
	
	MitgliedJpaRepository mitgliedRepository();
}
