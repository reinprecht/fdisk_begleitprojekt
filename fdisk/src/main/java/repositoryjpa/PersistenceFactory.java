package repositoryjpa;

public interface PersistenceFactory {
	
	AusbildungRepository ausbildungsRepository();
	
	Ausr�stungRepository ausr�stungRepository();
	
	ChargeRepository chargeRepostitory();
	
	FeuerwehrautoRepository feuerwehrautoRepository();
	
	FeuerwehrRepository feuerwehrRepository();
	
	GeraetRepository geraeteRepository();
	
	KommandantRepository kommandantRepository();
	
	KursRepository kursRepository();
	
	MitgliedRepository mitgliedRepository();
}
