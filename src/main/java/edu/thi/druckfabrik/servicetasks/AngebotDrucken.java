/*
 * Simon Kreutel
 */
package edu.thi.druckfabrik.servicetasks;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import edu.thi.druckfabrik.beans.AngebotBean;


public class AngebotDrucken implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		AngebotBean angebot = (AngebotBean) execution.getVariable("angebot");
		System.out.println("Angebot drucken");
		System.out.println("Das Angebot wird gedruckt...");
		System.out.println("Preis pro Stück bei Bestellmenge ab 1 Stück: " + angebot.getPreis1() + "0€");
		System.out.println("Preis pro Stück bei Bestellmenge ab 100 Stück: " + angebot.getPreis100() + "0€");
		System.out.println("Preis pro Stück bei Bestellmenge ab 1000 Stück: " + angebot.getPreis1000() + "0€");
		System.out.println("Das Angebot wurde erfolgreich gedruckt.");
		
		
	}
	
}
