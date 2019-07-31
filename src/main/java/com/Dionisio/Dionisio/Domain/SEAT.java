package com.Dionisio.Dionisio.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SEAT")
public class SEAT {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int SEAT_ID;
	@Column
	private int ROOM_ID;
	@Column
	private String ROW;
	@Column
	private int NUMBER;
	@Column
	private String VIP;
	
	public SEAT() {}

	public SEAT(int sEAT_ID, int rOOM_ID, String rOW, int nUMBER, String vIP) {
		super();
		SEAT_ID = sEAT_ID;
		ROOM_ID = rOOM_ID;
		ROW = rOW;
		NUMBER = nUMBER;
		VIP = vIP;
	}

	public int getSEAT_ID() {
		return SEAT_ID;
	}

	public void setSEAT_ID(int sEAT_ID) {
		SEAT_ID = sEAT_ID;
	}

	public int getROOM_ID() {
		return ROOM_ID;
	}

	public void setROOM_ID(int rOOM_ID) {
		ROOM_ID = rOOM_ID;
	}

	public String getROW() {
		return ROW;
	}

	public void setROW(String rOW) {
		ROW = rOW;
	}

	public int getNUMBER() {
		return NUMBER;
	}

	public void setNUMBER(int nUMBER) {
		NUMBER = nUMBER;
	}

	public String getVIP() {
		return VIP;
	}

	public void setVIP(String vIP) {
		VIP = vIP;
	}
	
}
