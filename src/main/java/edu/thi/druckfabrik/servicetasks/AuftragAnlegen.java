/*
 * Simon Kreutel
 * Alexander Horn
 */
package edu.thi.druckfabrik.servicetasks;

import java.util.Date;
import java.util.Random;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import edu.thi.druckfabrik.beans.BestellungBean;
import edu.thi.druckfabrik.beans.KundenauftragBean;

public class AuftragAnlegen implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		BestellungBean bestellung = (BestellungBean) execution.getVariable("bestellung");
		Date liefertermin = (Date) execution.getVariable("liefertermin");
		
		
		KundenauftragBean auftrag = (KundenauftragBean) execution.getVariable("kundenauftrag");
		auftrag.setKundenauftragID(new Random().nextInt(900000) + 100000);
		auftrag.setBestellungID(bestellung.getBestellungID());
		auftrag.setDruckanzahl(bestellung.getDruckanzahl());
		auftrag.setLiefertermin(liefertermin);
		auftrag.setPrototyp(bestellung.getPrototyp());
		auftrag.setExpressversandGewuenscht(bestellung.getExpressversandGewuenscht());
		
		execution.setVariable("kundenauftrag", auftrag);
		
	}
	
}
