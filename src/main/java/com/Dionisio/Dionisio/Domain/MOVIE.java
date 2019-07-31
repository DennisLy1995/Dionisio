package com.Dionisio.Dionisio.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MOVIE")
public class MOVIE {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int MOVIE_ID;
	@Column
	private String NAME;
	@Column
	private String DIRECTOR;
	@Column
	private String STUDIO;
	
	public MOVIE() {}

	public MOVIE(int mOVIE_ID, String nAME, String dIRECTOR, String sTUDIO) {
		super();
		MOVIE_ID = mOVIE_ID;
		NAME = nAME;
		DIRECTOR = dIRECTOR;
		STUDIO = sTUDIO;
	}

	public int getMOVIE_ID() {
		return MOVIE_ID;
	}

	public void setMOVIE_ID(int mOVIE_ID) {
		MOVIE_ID = mOVIE_ID;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public String getDIRECTOR() {
		return DIRECTOR;
	}

	public void setDIRECTOR(String dIRECTOR) {
		DIRECTOR = dIRECTOR;
	}

	public String getSTUDIO() {
		return STUDIO;
	}

	public void setSTUDIO(String sTUDIO) {
		STUDIO = sTUDIO;
	}
	
	
	
	
}
