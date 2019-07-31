package com.Dionisio.Dionisio.Domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="PREMIERES")
public class PREMIERES {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int PREMIERE_ID;
	@Column
	private Date RELEASE_DATE;
	@Column
	private String NAME_MOVIE;
	
	@Transient
	private SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");

	public String getCreatedAsShort() {
	return format.format(RELEASE_DATE);
	}
	
	public PREMIERES() {}

	public PREMIERES(int pREMIERE_ID, String rELEASE_DATE, String nAME_MOVIE) throws ParseException {
		super();
		PREMIERE_ID = pREMIERE_ID;
		RELEASE_DATE = format.parse(rELEASE_DATE);
		NAME_MOVIE = nAME_MOVIE;
	}

	public int getPREMIERE_ID() {
		return PREMIERE_ID;
	}

	public void setPREMIERE_ID(int pREMIERE_ID) {
		PREMIERE_ID = pREMIERE_ID;
	}

	public Date getRELEASE_DATE() {
		return RELEASE_DATE;
	}

	public void setRELEASE_DATE(Date rELEASE_DATE) {
		RELEASE_DATE = rELEASE_DATE;
	}

	public String getNAME_MOVIE() {
		return NAME_MOVIE;
	}

	public void setNAME_MOVIE(String nAME_MOVIE) {
		NAME_MOVIE = nAME_MOVIE;
	}

	public SimpleDateFormat getFormat() {
		return format;
	}

	public void setFormat(SimpleDateFormat format) {
		this.format = format;
	}
	
	
	
}
