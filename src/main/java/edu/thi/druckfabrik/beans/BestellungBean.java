package edu.thi.druckfabrik.beans;



public class BestellungBean {
	private String bestellungID;
	private String angebotID;
	private PrototypBean prototyp;
	private int druckanzahl;
	
	public String getBestellungID() {
		return bestellungID;
	}
	public void setBestellungID(String bestellungID) {
		this.bestellungID = bestellungID;
	}
	public String getAngebotID() {
		return angebotID;
	}
	public void setAngebotID(String angebotID) {
		this.angebotID = angebotID;
	}
	public PrototypBean getPrototyp() {
		return prototyp;
	}
	public void setPrototyp(PrototypBean prototpyID) {
		this.prototyp = prototpyID;
	}
	public int getDruckanzahl() {
		return druckanzahl;
	}
	public void setDruckanzahl(int druckanzahl) {
		this.druckanzahl = druckanzahl;
	}
	
	
	
	
}
