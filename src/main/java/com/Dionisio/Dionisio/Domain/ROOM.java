package com.Dionisio.Dionisio.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ROOM")
public class ROOM {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ROOM_ID;
	@Column
	private int THEATRE_ID;
	@Column
	private int CAPACITY;
	
	public ROOM() {}

	public ROOM(int rOOM_ID, int tHEATRE_ID, int cAPACITY) {
		super();
		ROOM_ID = rOOM_ID;
		THEATRE_ID = tHEATRE_ID;
		CAPACITY = cAPACITY;
	}

	public int getROOM_ID() {
		return ROOM_ID;
	}

	public void setROOM_ID(int rOOM_ID) {
		ROOM_ID = rOOM_ID;
	}

	public int getTHEATRE_ID() {
		return THEATRE_ID;
	}

	public void setTHEATRE_ID(int tHEATRE_ID) {
		THEATRE_ID = tHEATRE_ID;
	}

	public int getCAPACITY() {
		return CAPACITY;
	}

	public void setCAPACITY(int cAPACITY) {
		CAPACITY = cAPACITY;
	}
	
}
