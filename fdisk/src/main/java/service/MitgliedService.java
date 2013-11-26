package service;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Service;

import domain.Ausbildung;
import domain.Ausruestung;
import domain.Feuerwehr;
import domain.Mitglied;

import repositoryjpa.MitgliedJpaRepository;

@Service
public class MitgliedService {

	private MitgliedJpaRepository mitgliedJpaRepository;
	
	public void createNewMitglied(String vorname, String nachname, String dienstgrad,
			Date geburtsdatum, String wohnort, Feuerwehr feuerwehr,
			ArrayList<Ausruestung> ausruestungen, ArrayList<Ausbildung> ausbildung){
		Mitglied mitglied = new Mitglied(vorname, nachname, dienstgrad, geburtsdatum,
				wohnort, feuerwehr, ausruestungen, ausbildung);
		mitgliedJpaRepository.persist(mitglied);
	}
}
