package edu.thi.druckfabrik.servicetasks;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;


public class AngebotDrucken implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		System.out.println("Angebot drucken");
		System.out.println("Das Angebot wird gedruckt...");
		System.out.println("Das Angebot wurde erfolgreich gedruckt.");
		
		
	}
	
}
