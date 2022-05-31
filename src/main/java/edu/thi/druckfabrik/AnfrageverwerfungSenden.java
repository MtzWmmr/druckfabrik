package edu.thi.druckfabrik;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class AnfrageverwerfungSenden implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		System.out.println("Betreff: Aufwandsentschädigung");
		System.out.println("Business Key: " + execution.getBusinessKey());
		System.out.println("Sehr geehrter Kunde,\nWir haben Ihre Stornierung erhalten. Da wir keine kostenpflichtigen Leistungen durchgeführt haben, müssen Sie keine Aufwandsentschädigung zahlen. Ihre Anfrage haben wir verworfen.");
		System.out.println("Viele Grüße \nIhr Druckfabrik-Team");
		
	}
	
}
