package repositoryjpa;

public interface PersistenceFactory {
	
	AusbildungRepository ausbildungsRepository();
	
	AusrüstungRepository ausrüstungRepository();
	
	ChargeRepository chargeRepostitory();
	
	FeuerwehrautoRepository feuerwehrautoRepository();
	
	FeuerwehrRepository feuerwehrRepository();
	
	GeraetRepository geraeteRepository();
	
	KommandantRepository kommandantRepository();
	
	KursRepository kursRepository();
	
	MitgliedRepository mitgliedRepository();
}
