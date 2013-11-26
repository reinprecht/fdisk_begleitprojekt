package repositoryjpa;

public interface PersistenceFactory {
	
	AusbildungJpaRepository ausbildungsRepository();
	
	AusruestungJpaRepository ausruestungRepository();
	
	BerechtigungJpaRepository berechtigungRepository();
	
	ChargeJpaRepository chargeRepostitory();
	
	FeuerwehrautoJpaRepository feuerwehrautoRepository();
	
	FeuerwehrJpaRepository feuerwehrRepository();
	
	GeraetJpaRepository geraeteRepository();
	
	KommandantJpaRepository kommandantRepository();
	
	MitgliedJpaRepository mitgliedRepository();
	
	UserJpaRepository userRepository();
}
