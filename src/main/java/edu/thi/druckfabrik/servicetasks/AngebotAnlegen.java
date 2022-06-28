/* Matthias Wimmer
 */
package edu.thi.druckfabrik.servicetasks;


import java.util.Map;
import java.util.Random;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import edu.thi.druckfabrik.beans.AngebotBean;
import edu.thi.druckfabrik.beans.PrototypBean;

public class AngebotAnlegen implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		PrototypBean prototyp = (PrototypBean) execution.getVariable("Prototyp");
		Map <String, Object> preise = (Map <String, Object>) execution.getVariable("preise");
		double preis1 = (double) preise.get("preis1");
		double preis100 = (double) preise.get("preis100");
		double preis1000 = (double) preise.get("preis1000");
		
		AngebotBean angebot = new AngebotBean();
		angebot.setAngebotID(new Random().nextInt(900000) + 100000);
		angebot.setPrototyp(prototyp);
		angebot.setPreis1(preis1);
		angebot.setPreis100(preis100);
		angebot.setPreis1000(preis1000);
		
		execution.setVariable("angebot", angebot);
		
		System.out.println("Beim Übersenden der Bestellung bitte folgende AngebotID verwenden: " + angebot.getAngebotID());
	}

}

