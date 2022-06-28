/*
 * Simon Kreutel
 * Alexander Horn
 */
package edu.thi.druckfabrik;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class AufwandsentschaedigungForderungSenden implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		System.out.println("Betreff: Aufwandsentschädigung");
		System.out.println("Business Key: " + execution.getVariable("BusinessKey"));
		System.out.println("Sehr geehrter Kunde,\nWir haben Ihre Stornierung erhalten. Aufgrund bisher erfolgter Tätigkeiten erheben wir eine Aufwandsentschädigung in Höhe von 100€. Bitte überweisen Sie uns diesen Betrag unverzüglich.");
		System.out.println("Viele Grüße \nIhr Druckfabrik-Team");
		
	}
	
}
