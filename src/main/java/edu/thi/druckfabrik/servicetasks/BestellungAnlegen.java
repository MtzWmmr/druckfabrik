package edu.thi.druckfabrik.servicetasks;

import java.util.Random;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import edu.thi.druckfabrik.beans.AngebotBean;
import edu.thi.druckfabrik.beans.BestellungBean;
import edu.thi.druckfabrik.beans.PrototypBean;

public class BestellungAnlegen implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		AngebotBean angebot = (AngebotBean) execution.getVariable("angebot");
		PrototypBean prototyp = angebot.getPrototyp();
		int druckanzahl = (Integer) execution.getVariable("druckanzahl");
		Boolean expressVersand = (Boolean) execution.getVariable("expressversandGewuenscht");
		
		BestellungBean bestellung = new BestellungBean();
		bestellung.setBestellungID(new Random().nextInt(900000) + 100000);
		bestellung.setAngebotID(angebot.getAngebotID());
		bestellung.setPrototyp(prototyp);
		bestellung.setDruckanzahl(druckanzahl);
		bestellung.setExpressversandGewuenscht(expressVersand);
		
		execution.setVariable("bestellung", bestellung);
	}

}
