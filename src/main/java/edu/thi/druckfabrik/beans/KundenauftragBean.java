package edu.thi.druckfabrik.beans;

import java.util.Date;

public class KundenauftragBean {
	private String kundenauftragID;
	private String bestellungID;
	private Date liefertermin;
	private PrototypBean prototyp;
	private int druckanzahl;
	public String getKundenauftragID() {
		return kundenauftragID;
	}
	public void setKundenauftragID(String kundenauftragID) {
		this.kundenauftragID = kundenauftragID;
	}
	public String getBestellungID() {
		return bestellungID;
	}
	public void setBestellungID(String bestellungID) {
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
