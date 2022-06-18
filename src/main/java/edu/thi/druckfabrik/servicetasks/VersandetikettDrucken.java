/*
 * Simon Kreutel
 */
package edu.thi.druckfabrik.servicetasks;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import edu.thi.druckfabrik.beans.KundenBean;


public class VersandetikettDrucken implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		KundenBean kunde = (KundenBean) execution.getVariable("kunde");
		System.out.println("Versandetikett drucken");
		System.out.println("Das Versandetikett wird gedruckt...");
		System.out.println("Vorname: " + kunde.getVorname());
		System.out.println("Nachname: " + kunde.getNachname());
		System.out.println("Straße: " + kunde.getStrasse());
		System.out.println("Hausnummer: " + kunde.getHausnummer());
		System.out.println("Postleitzahl: " + kunde.getPostleitzahl());
		System.out.println("Stadt: " + kunde.getStadt());
		System.out.println("Das Versandetikett wurde erfolgreich gedruckt.");
		
		
	}
	
}
