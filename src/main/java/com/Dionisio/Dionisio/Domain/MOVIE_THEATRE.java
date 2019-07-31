package com.Dionisio.Dionisio.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MOVIE_THEATRE")
public class MOVIE_THEATRE {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int THEATRE_ID;
	@Column
	private String COUNTRY;
	@Column
	private String DIRECTION;
	
	public MOVIE_THEATRE() {}

	public MOVIE_THEATRE(int tHEATRE_ID, String cOUNTRY, String dIRECTION) {
		super();
		THEATRE_ID = tHEATRE_ID;
		COUNTRY = cOUNTRY;
		DIRECTION = dIRECTION;
	}

	public int getTHEATRE_ID() {
		return THEATRE_ID;
	}

	public void setTHEATRE_ID(int tHEATRE_ID) {
		THEATRE_ID = tHEATRE_ID;
	}

	public String getCOUNTRY() {
		return COUNTRY;
	}

	public void setCOUNTRY(String cOUNTRY) {
		COUNTRY = cOUNTRY;
	}

	public String getDIRECTION() {
		return DIRECTION;
	}

	public void setDIRECTION(String dIRECTION) {
		DIRECTION = dIRECTION;
	}
	
	
	
}
