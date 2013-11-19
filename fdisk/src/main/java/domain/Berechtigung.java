package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import help.EnsureService;

@Entity
@Table(name = "berechtigung")
public class Berechtigung extends BasePersistable {

	private static final long serialVersionUID = 5707680569424613530L;
	
	@Size(max = 30)
	@NotNull
	@Column(name = "berechtigung", nullable = false, length = 30)
	private String berechtigung;
	
	public Berechtigung(String berechtigung) {
		super();
		EnsureService.notEmpty("berechtigung", berechtigung);
		EnsureService.notNull("berechtigung", berechtigung);
		this.berechtigung = berechtigung;
	}
	
	public Berechtigung() {
		//for jpa
	}

	public String getBerechtigung() {
		return berechtigung;
	}

	public void setBerechtigung(String berechtigung) {
		this.berechtigung = berechtigung;
	}
}
