/*
 * Simon Kreutel
 * Alexander Horn
 */
package edu.thi.druckfabrik;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class StornierungsablehnungSenden implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		System.out.println("Betreff: Stornierungsablehnung");
		System.out.println("Business Key: " + execution.getBusinessKey());
		System.out.println("Sehr geehrter Kunde,\nWir haben Ihre Stornierung erhalten. Diese ist aufgrund der bereits von Ihnen geleisteten Zahlung unwirksam. Daher werden wir wie gehabt die Ware drucken und an Sie versenden.");
		System.out.println("Viele Grüße \nIhr Druckfabrik-Team");
		
	}
	
}
