package edu.thi.druckfabrik.servicetasks;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;


public class ObjektDrucken implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		System.out.println("Druckvorgang");
		System.out.println("Das Objekt wird gedruckt...");
		System.out.println("Das Objekt wurde erfolgreich gedruckt. Sie können es nun entnehmen.");
		
		
	}
	
}
