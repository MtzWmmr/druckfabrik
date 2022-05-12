package edu.thi.druckfabrik.beans;



public class BestellungBean {
	private int bestellungID;
	private int angebotID;
	private PrototypBean prototyp;
	private int druckanzahl;
	
	public int getBestellungID() {
		return bestellungID;
	}
	public void setBestellungID(int bestellungID) {
		this.bestellungID = bestellungID;
	}
	public int getAngebotID() {
		return angebotID;
	}
	public void setAngebotID(int angebotID) {
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
