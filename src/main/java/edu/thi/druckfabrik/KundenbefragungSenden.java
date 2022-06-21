/* Matthias Wimmer
 * Simon Kreutel
 * Alexander Horn
 */
package edu.thi.druckfabrik;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class KundenbefragungSenden implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		String nachname = (String) execution.getVariable("nachname");
		
		System.out.println("Betreff: Kundenbefragung");
		System.out.println("Business Key: " + execution.getVariable("corrKey"));
		System.out.println("Sehr geehrte/r Frau/Herr " + nachname + ",\nim Rahmen unserer Qualitätssicherung führen wir Kundenbefragungen durch.\nWir würden uns sehr freuen, wenn Sie daran teilnehmen.\nBitte bewerten Sie uns auf einer Skala von 1 bis 10. Weiterhin können Sie uns zusätzliche Anmerkungen mitteilen.");
		System.out.println("Viele Grüße \nIhr Druckfabrik-Team");
		
	}
	
}
