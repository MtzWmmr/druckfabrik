package edu.thi.druckfabrik.beans;

import java.io.Serializable;

public class AngebotBean implements Serializable{
	private int angebotID;
	private PrototypBean prototyp;
	private double preis1;
	private double preis100;
	private double preis1000;
	
	public int getAngebotID() {
		return angebotID;
	}
	public void setAngebotID(int angebotID) {
		this.angebotID = angebotID;
	}
	public PrototypBean getPrototyp() {
		return prototyp;
	}
	public void setPrototyp(PrototypBean prototyp) {
		this.prototyp = prototyp;
	}
	public double getPreis1() {
		return preis1;
	}
	public void setPreis1(double preis1) {
		this.preis1 = preis1;
	}
	public double getPreis100() {
		return preis100;
	}
	public void setPreis100(double preis100) {
		this.preis100 = preis100;
	}
	public double getPreis1000() {
		return preis1000;
	}
	public void setPreis1000(double preis1000) {
		this.preis1000 = preis1000;
	}
	
}
