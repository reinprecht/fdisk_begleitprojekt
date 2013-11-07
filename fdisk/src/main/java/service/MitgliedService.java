package service;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Service;

import domain.Ausrüstung;
import domain.Feuerwehr;
import domain.Kurs;
import domain.Mitglied;

import repositoryjpa.MitgliedJpaRepository;

@Service
public class MitgliedService {

	private MitgliedJpaRepository mitgliedJpaRepository;
	
	public void createNewMitglied(String vorname, String nachname, String dienstgrad,
			Date geburtsdatum, String wohnort, Feuerwehr feuerwehr,
			ArrayList<Ausrüstung> ausrüstungen, ArrayList<Kurs> kurse){
		Mitglied mitglied = new Mitglied(vorname, nachname, dienstgrad, geburtsdatum,
				wohnort, feuerwehr, ausrüstungen, kurse);
		mitgliedJpaRepository.persist(mitglied);
	}
}
