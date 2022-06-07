/* Matthias Wimmer
 * Simon Kreutel
 * Alexander Horn
 */
package edu.thi.druckfabrik.beans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class KundenauftragBean implements Serializable{
	private int kundenauftragID;
	private int bestellungID;
	private Date liefertermin;
	private PrototypBean prototyp;
	private long druckanzahl;
	private Boolean expressversandGewuenscht;
	
	
	public Boolean getExpressversandGewuenscht() {
		return expressversandGewuenscht;
	}
	public void setExpressversandGewuenscht(Boolean expressversandGewuenscht) {
		this.expressversandGewuenscht = expressversandGewuenscht;
	}
	private BigDecimal gesamtPreis;
	
	
	public BigDecimal getGesamtPreis() {
		return gesamtPreis;
	}
	public void setGesamtPreis(BigDecimal gesamtPreis) {
		this.gesamtPreis = gesamtPreis;
	}
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
	public long getDruckanzahl() {
		return druckanzahl;
	}
	public void setDruckanzahl(long druckanzahl) {
		this.druckanzahl = druckanzahl;
	}
	
	
}
