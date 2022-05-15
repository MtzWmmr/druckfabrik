package edu.thi.druckfabrik;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import edu.thi.druckfabrik.beans.BestellungBean;
import edu.thi.druckfabrik.beans.KundenauftragBean;

public class RechnungSenden implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		BestellungBean bestellung = (BestellungBean) execution.getVariable("bestellung");
		KundenauftragBean auftrag = (KundenauftragBean) execution.getVariable("kundenauftrag");
		System.out.println("Betreff: Rechnung zu Ihrer Bestellung");
		System.out.println("Sehr geehrter Kunde,\nerneut vielen Dank für Ihre Bestellung. Anbei die Rechnung.");
		System.out.println("BestellungID: " + auftrag.getBestellungID());
		System.out.println("Bestelltes Produkt: Ihr 3D-Druck");
		System.out.println("Bestellte Anzahl: " + auftrag.getDruckanzahl());
		System.out.println("Gesamtpreis: " + auftrag.getGesamtPreis() + "€");
		System.out.println("Bitte begleichen Sie den Betrag innerhalb von 14 Tagen");
		
	}
	
}
