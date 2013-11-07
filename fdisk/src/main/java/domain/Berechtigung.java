package domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "berechtigung")
public class Berechtigung extends BasePersistable {

	private static final long serialVersionUID = 5707680569424613530L;
	private String berechtigung;
	
	public Berechtigung(String berechtigung) {
		super();
		this.berechtigung = berechtigung;
	}
	
	public Berechtigung() {
		super();
		this.berechtigung = "Testberechtigung";
	}

	public String getBerechtigung() {
		return berechtigung;
	}

	public void setBerechtigung(String berechtigung) {
		this.berechtigung = berechtigung;
	}
}
