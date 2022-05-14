package edu.thi.druckfabrik;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import edu.thi.druckfabrik.beans.BestellungBean;

public class BestellbestaetigungSenden implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		BestellungBean bestellung = (BestellungBean) execution.getVariable("bestellung");
		System.out.println("Betreff: Ihre Bestellung");
		System.out.println("Sehr geehrter Kunde,\nvielen Dank für Ihre Bestellung. Anbei die Bestellbestätigung.");
		System.out.println("BestellungID: " + bestellung.getBestellungID());
		System.out.println("Bestelltes Produkt: Ihr Prototyp");
		//System.out.println("Bestelltes Produkt: " + bestellung.getPrototyp());
		System.out.println("Bestellte Anzahl: " + bestellung.getDruckanzahl());
		
	}
	
}
