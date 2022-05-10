package edu.thi.druckfabrik;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import edu.thi.druckfabrik.beans.BestellungBean;

public class AuftragsabsageSenden implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		BestellungBean bestellung = (BestellungBean) execution.getVariable("bestellung");
		System.out.println("Sehr geehrter Kunde,\nleider kann Ihre Bestellung mit ID "+ bestellung.getBestellungID() + " nicht ausgeführt werden, da die benötigten Materialien nicht erhältlich sind.");
		
		
	}
	
}
