package edu.thi.druckfabrik;

import java.util.Random;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import edu.thi.druckfabrik.beans.BestellungBean;
import edu.thi.druckfabrik.beans.PrototypBean;

public class BestellungAnlegen implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		String bestellungsID = String.valueOf(new Random().nextInt(900000) + 100000);
		String angebotID = (String) execution.getVariable("angebotID");
		PrototypBean prototyp = (PrototypBean) execution.getVariable("Prototyp");
		int druckanzahl = (Integer) execution.getVariable("druckanzahl");
		
		BestellungBean bestellung = new BestellungBean();
		bestellung.setBestellungID(bestellungsID);
		bestellung.setAngebotID(angebotID);
		bestellung.setPrototyp(prototyp);
		bestellung.setDruckanzahl(druckanzahl);
		
		execution.setVariable("bestellung", bestellung);
	}

}
