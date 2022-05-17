package edu.thi.druckfabrik.beans;

import java.io.Serializable;

public class PrototypBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String material;
	private Long hoehe;
	private Long breite;
	private Long laenge;
	private Long volumen;
	private Long anzahl;


	public Long getAnzahl() {
		return anzahl;
	}

	public void setAnzahl(Long anzahl) {
		this.anzahl = anzahl;
	}

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

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	public Long getVolumen() {
		return volumen;
	}

	public void setVolumen(Long volumen) {
		this.volumen = hoehe*breite*laenge;
	}
}
