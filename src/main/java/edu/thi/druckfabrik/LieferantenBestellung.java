package edu.thi.druckfabrik;


import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class LieferantenBestellung implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		String lieferant = (String) execution.getVariable("lieferant");
		String material = (String) execution.getVariable("material");
		Long menge = (Long) execution.getVariable("benoetigteMenge");
		//aufrunden auf den naechsten Tausender. Filament wird oft in 1KG=1000g Gebinden als kleinste Groeße angeboten 
		Long bestellmenge = (((menge+1500)/1000)*1000);
		
		System.out.println("Hallo " + lieferant + ",");
		System.out.println("bitte schicken Sie uns folgende Artikel.");
		System.out.println(material + " : " + bestellmenge + "g");
		System.out.println("Bitte verwenden Sie für Ihre Antwort die LieferantenbestellungsID: ...");
		
	}
	
}
