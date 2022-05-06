package edu.thi.druckfabrik;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class prototypDrucken implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		//@SuppressWarnings("unchecked")
		long hoehe = (long) execution.getVariable("hoehe");
		long breite = (long) execution.getVariable("breite");
		long laenge = (long) execution.getVariable("laenge");
		
		Prototypbean prototyp = new Prototypbean();
		prototyp.setHoehe(hoehe);
		prototyp.setBreite(breite);
		prototyp.setLaenge(laenge);
		
		execution.setVariable("Prototyp", prototyp);
		
	}
	

}
