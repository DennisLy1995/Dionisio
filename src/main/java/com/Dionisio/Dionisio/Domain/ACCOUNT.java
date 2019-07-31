package com.Dionisio.Dionisio.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ACCOUNT")
public class ACCOUNT {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ACCOUNT_ID;
	@Column
	private String EMAIL;
	@Column
	private String NAME_ACCOUNT;
	@Column
	private String LAST_NAME;
	@Column
	private String ROLE_ACCOUNT;
	
	
	public ACCOUNT() {}


	public ACCOUNT(int aCCOUNT_ID, String eMAIL, String nAME_ACCOUNT, String lAST_NAME, String rOLE_ACCOUNT) {
		super();
		ACCOUNT_ID = aCCOUNT_ID;
		EMAIL = eMAIL;
		NAME_ACCOUNT = nAME_ACCOUNT;
		LAST_NAME = lAST_NAME;
		ROLE_ACCOUNT = rOLE_ACCOUNT;
	}


	public int getACCOUNT_ID() {
		return ACCOUNT_ID;
	}


	public void setACCOUNT_ID(int aCCOUNT_ID) {
		ACCOUNT_ID = aCCOUNT_ID;
	}


	public String getEMAIL() {
		return EMAIL;
	}


	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}


	public String getNAME_ACCOUNT() {
		return NAME_ACCOUNT;
	}


	public void setNAME_ACCOUNT(String nAME_ACCOUNT) {
		NAME_ACCOUNT = nAME_ACCOUNT;
	}


	public String getLAST_NAME() {
		return LAST_NAME;
	}


	public void setLAST_NAME(String lAST_NAME) {
		LAST_NAME = lAST_NAME;
	}


	public String getROLE_ACCOUNT() {
		return ROLE_ACCOUNT;
	}


	public void setROLE_ACCOUNT(String rOLE_ACCOUNT) {
		ROLE_ACCOUNT = rOLE_ACCOUNT;
	}
	
	
	
}
