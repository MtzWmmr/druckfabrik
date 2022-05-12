package edu.thi.druckfabrik.beans;

import java.util.Date;

public class KundenauftragBean {
	private int kundenauftragID;
	private int bestellungID;
	private Date liefertermin;
	private PrototypBean prototyp;
	private int druckanzahl;
	public int getKundenauftragID() {
		return kundenauftragID;
	}
	public void setKundenauftragID(int kundenauftragID) {
		this.kundenauftragID = kundenauftragID;
	}
	public int getBestellungID() {
		return bestellungID;
	}
	public void setBestellungID(int bestellungID) {
		this.bestellungID = bestellungID;
	}
	public Date getLiefertermin() {
		return liefertermin;
	}
	public void setLiefertermin(Date liefertermin) {
		this.liefertermin = liefertermin;
	}
	public PrototypBean getPrototyp() {
		return prototyp;
	}
	public void setPrototyp(PrototypBean prototyp) {
		this.prototyp = prototyp;
	}
	public int getDruckanzahl() {
		return druckanzahl;
	}
	public void setDruckanzahl(int druckanzahl) {
		this.druckanzahl = druckanzahl;
	}
	
	
}
