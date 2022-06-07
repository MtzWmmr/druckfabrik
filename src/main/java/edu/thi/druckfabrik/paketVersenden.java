/*
 * Simon Kreutel
 */
package edu.thi.druckfabrik;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import edu.thi.druckfabrik.beans.BestellungBean;

public class paketVersenden implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		System.out.println("Betreff: Ihr Paket");
		System.out.println("Sehr geehrter Kunde,\nihr Paket wurde versendet");
		System.out.println("\n\nViele Grüße \nIhr Druckfabrik-Team");
		
		
	}
	
}
