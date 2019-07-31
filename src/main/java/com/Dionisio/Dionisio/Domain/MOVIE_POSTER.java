package com.Dionisio.Dionisio.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MOVIE_POSTER")
public class MOVIE_POSTER {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int POSTER_ID;
	@Column
	private int MOVIE_ID;
	@Column
	private int PRESALE_ID;
	@Column
	private int PREMIERE_ID;
	@Column
	private String TITLE;
	@Column
	private String URL_POSTER;
	
	public MOVIE_POSTER() {}

	public MOVIE_POSTER(int pOSTER_ID, int mOVIE_ID, int pRESALE_ID, int pREMIERE_ID, String tITLE, String uRL_POSTER) {
		super();
		POSTER_ID = pOSTER_ID;
		MOVIE_ID = mOVIE_ID;
		PRESALE_ID = pRESALE_ID;
		PREMIERE_ID = pREMIERE_ID;
		TITLE = tITLE;
		URL_POSTER = uRL_POSTER;
	}

	public int getPOSTER_ID() {
		return POSTER_ID;
	}

	public void setPOSTER_ID(int pOSTER_ID) {
		POSTER_ID = pOSTER_ID;
	}

	public int getMOVIE_ID() {
		return MOVIE_ID;
	}

	public void setMOVIE_ID(int mOVIE_ID) {
		MOVIE_ID = mOVIE_ID;
	}

	public int getPRESALE_ID() {
		return PRESALE_ID;
	}

	public void setPRESALE_ID(int pRESALE_ID) {
		PRESALE_ID = pRESALE_ID;
	}

	public int getPREMIERE_ID() {
		return PREMIERE_ID;
	}

	public void setPREMIERE_ID(int pREMIERE_ID) {
		PREMIERE_ID = pREMIERE_ID;
	}

	public String getTITLE() {
		return TITLE;
	}

	public void setTITLE(String tITLE) {
		TITLE = tITLE;
	}

	public String getURL_POSTER() {
		return URL_POSTER;
	}

	public void setURL_POSTER(String uRL_POSTER) {
		URL_POSTER = uRL_POSTER;
	}
	
	
	
}
