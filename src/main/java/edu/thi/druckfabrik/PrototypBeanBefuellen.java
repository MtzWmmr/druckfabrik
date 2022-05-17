package edu.thi.druckfabrik;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import edu.thi.druckfabrik.beans.PrototypBean;

public class PrototypBeanBefuellen implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		//@SuppressWarnings("unchecked")
		String material = (String) execution.getVariable("material");
		long hoehe = (long) execution.getVariable("hoehe");
		long breite = (long) execution.getVariable("breite");
		long laenge = (long) execution.getVariable("laenge");
		
		
		PrototypBean prototyp = new PrototypBean();
		prototyp.setMaterial(material);
		prototyp.setHoehe(hoehe);
		prototyp.setBreite(breite);
		prototyp.setLaenge(laenge);
		prototyp.setAnzahl(Long.valueOf(1));
		
		execution.setVariable("Prototyp", prototyp);
		
	}
	

}
