/* Matthias Wimmer
 */
package edu.thi.druckfabrik;


import java.util.Random;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class LieferantenBestellung implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		String lieferant = (String) execution.getVariable("lieferant");
		String material = (String) execution.getVariable("material");
		Long menge = (Long) execution.getVariable("benoetigteMenge");
		
		int lieferantenbestellungID = new Random().nextInt(900000) + 100000;
		//aufrunden auf den naechsten Tausender. Filament wird oft in 1KG=1000g Gebinden als kleinste Groeße angeboten 
		Long bestellmenge = (((menge+1000)/1000)*1000);
		
		execution.setVariable("lieferantenbestellungID", lieferantenbestellungID);
		
		System.out.println("Hallo " + lieferant + ",");
		System.out.println("bitte schicken Sie uns folgende Artikel.");
		System.out.println(material + " : " + bestellmenge + "g");
		System.out.println("[KORRELATION INFO] Bitte verwenden Sie für Ihre Antwort die folgende LieferantenbestellungsID: " + lieferantenbestellungID);
		
	}
	
}
