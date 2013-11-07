package service;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Service;

import domain.Ausruestung;
import domain.Feuerwehr;
import domain.Kurs;
import domain.Mitglied;

import repositoryjpa.MitgliedJpaRepository;

@Service
public class MitgliedService {

	private MitgliedJpaRepository mitgliedJpaRepository;
	
	public void createNewMitglied(String vorname, String nachname, String dienstgrad,
			Date geburtsdatum, String wohnort, Feuerwehr feuerwehr,
			ArrayList<Ausruestung> ausruestungen, ArrayList<Kurs> kurse){
		Mitglied mitglied = new Mitglied(vorname, nachname, dienstgrad, geburtsdatum,
				wohnort, feuerwehr, ausruestungen, kurse);
		mitgliedJpaRepository.persist(mitglied);
	}
}
