/*
 * Alexander Horn
 */
package edu.thi.druckfabrik;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import edu.thi.druckfabrik.beans.AnfrageBean;

public class PlagiatswarnungSenden implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		AnfrageBean anfrage = (AnfrageBean) execution.getVariable("anfrage");
		System.out.println("Betreff: Plagiatsverdacht bei Anfrage");
		System.out.println("Sehr geehrter Kunde,\nleider kann Ihre Anfrage mit ID "+ anfrage.getAnfrageID() + " nicht bearbeitet werden, da hier ein Plagiatsverdacht vorliegt.");
		System.out.println("\n\nViele Grüße \nIhr Druckfabrik-Team");
		
		
	}
	
}
