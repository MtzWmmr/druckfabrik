package edu.thi.druckfabrik;

import java.io.Serializable;

public class Prototypbean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long hoehe;
	private Long breite;
	private Long laenge;

	public Long getHoehe() {
		return hoehe;
	}

	public void setHoehe(Long hoehe) {
		this.hoehe = hoehe;
	}

	public Long getBreite() {
		return breite;
	}

	public void setBreite(Long breite) {
		this.breite = breite;
	}

	public Long getLaenge() {
		return laenge;
	}

	public void setLaenge(Long laenge) {
		this.laenge = laenge;
	}
}
