package edu.thi.druckfabrik.servicetasks;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;


public class VersandetikettDrucken implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		System.out.println("Versandetikett drucken");
		System.out.println("Das Versandetikett wird gedruckt...");
		System.out.println("Das Versandetikett wurde erfolgreich gedruckt.");
		
		
	}
	
}
