package repositoryjpa;

public interface PersistenceFactory {
	
	AusbildungJpaRepository ausbildungsRepository();
	
	Ausr�stungJpaRepository ausr�stungRepository();
	
	BerechtigungJpaRepository berechtigungRepository();
	
	ChargeJpaRepository chargeRepostitory();
	
	FeuerwehrautoJpaRepository feuerwehrautoRepository();
	
	FeuerwehrJpaRepository feuerwehrRepository();
	
	GeraetJpaRepository geraeteRepository();
	
	KommandantJpaRepository kommandantRepository();
	
	KursJpaRepository kursRepository();
	
	MitgliedJpaRepository mitgliedRepository();
	
	UserJpaRepository userRepository();
}
