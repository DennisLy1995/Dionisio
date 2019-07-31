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
@Table(name="FUNCTIONS")
public class FUNCTIONS {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int FUNCTION_ID;
	@Column
	private int MOVIE_ID;
	@Column
	private int ROOM_ID;
	@Column
	private Date FUNCTION_DATE;
	
	
	
	@Transient
	private SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");

	public String getCreatedAsShort() {
	return format.format(FUNCTION_DATE);
	}
	
	
	public FUNCTIONS() {}



	public FUNCTIONS(int fUNCTION_ID, int mOVIE_ID, int rOOM_ID, String fUNCTION_DATE) throws ParseException {
		super();
		FUNCTION_ID = fUNCTION_ID;
		MOVIE_ID = mOVIE_ID;
		ROOM_ID = rOOM_ID;
		FUNCTION_DATE = format.parse(fUNCTION_DATE);
	}



	public int getFUNCTION_ID() {
		return FUNCTION_ID;
	}



	public void setFUNCTION_ID(int fUNCTION_ID) {
		FUNCTION_ID = fUNCTION_ID;
	}



	public int getMOVIE_ID() {
		return MOVIE_ID;
	}



	public void setMOVIE_ID(int mOVIE_ID) {
		MOVIE_ID = mOVIE_ID;
	}



	public int getROOM_ID() {
		return ROOM_ID;
	}



	public void setROOM_ID(int rOOM_ID) {
		ROOM_ID = rOOM_ID;
	}



	public Date getFUNCTION_DATE() {
		return FUNCTION_DATE;
	}



	public void setFUNCTION_DATE(Date fUNCTION_DATE) {
		FUNCTION_DATE = fUNCTION_DATE;
	}
	
	
	
}
