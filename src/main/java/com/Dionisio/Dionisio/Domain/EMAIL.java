package com.Dionisio.Dionisio.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMAIL")
public class EMAIL {

	@Id
	private String EMAIL;
	@Column
	private String PASSWORD_EMAIL;
	@Column
	private String VALID;
	
	public EMAIL() {}

	public EMAIL(String eMAIL, String pASSWORD_EMAIL, String vALID) {
		super();
		EMAIL = eMAIL;
		PASSWORD_EMAIL = pASSWORD_EMAIL;
		VALID = vALID;
	}

	public String getEMAIL() {
		return EMAIL;
	}

	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}

	public String getPASSWORD_EMAIL() {
		return PASSWORD_EMAIL;
	}

	public void setPASSWORD_EMAIL(String pASSWORD_EMAIL) {
		PASSWORD_EMAIL = pASSWORD_EMAIL;
	}

	public String getVALID() {
		return VALID;
	}

	public void setVALID(String vALID) {
		VALID = vALID;
	}
	

}
