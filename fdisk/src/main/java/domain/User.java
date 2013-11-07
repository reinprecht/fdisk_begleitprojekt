package domain;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User extends BasePersistable{

	private static final long serialVersionUID = 2056184011070687603L;
	private String username;
	private String passwort;
	private ArrayList<Berechtigung> berechtigungen;
	private Mitglied mitglied;
	
	public User(String username, String passwort,
			ArrayList<Berechtigung> berechtigungen, Mitglied mitglied) {
		super();
		this.username = username;
		this.passwort = passwort;
		this.berechtigungen = berechtigungen;
		this.mitglied = mitglied;
	}
	
	public User() {
		super();
		this.username = "Admin";
		this.passwort = "admin";
		this.berechtigungen = null;
		this.mitglied = null;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasswort() {
		return passwort;
	}
	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}
	public ArrayList<Berechtigung> getBerechtigungen() {
		return berechtigungen;
	}
	public void setBerechtigungen(ArrayList<Berechtigung> berechtigungen) {
		this.berechtigungen = berechtigungen;
	}
	public Mitglied getMitglied() {
		return mitglied;
	}
	public void setMitglied(Mitglied mitglied) {
		this.mitglied = mitglied;
	}
}
