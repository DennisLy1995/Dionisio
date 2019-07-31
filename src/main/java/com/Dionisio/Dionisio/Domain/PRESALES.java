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
@Table(name="PRESALES")
public class PRESALES {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int PRESALE_ID;
	@Column
	private Date RELEASE_DATE;
	@Column
	private String NAME;
	
	@Transient
	private SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");

	public String getCreatedAsShort() {
	return format.format(RELEASE_DATE);
	}
	
	public PRESALES() {}
	
	public PRESALES(int pRESALE_ID, String rELEASE_DATE, String nAME) throws ParseException {
		super();
		PRESALE_ID = pRESALE_ID;
		RELEASE_DATE = format.parse(rELEASE_DATE);
		NAME = nAME;
	}

	public int getPRESALE_ID() {
		return PRESALE_ID;
	}

	public void setPRESALE_ID(int pRESALE_ID) {
		PRESALE_ID = pRESALE_ID;
	}

	public Date getRELEASE_DATE() {
		return RELEASE_DATE;
	}

	public void setRELEASE_DATE(Date rELEASE_DATE) {
		RELEASE_DATE = rELEASE_DATE;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public SimpleDateFormat getFormat() {
		return format;
	}

	public void setFormat(SimpleDateFormat format) {
		this.format = format;
	}
	
}
