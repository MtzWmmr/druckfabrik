package edu.thi.druckfabrik;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import edu.thi.druckfabrik.beans.KundenauftragBean;

public class StornierungSenden implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		KundenauftragBean kundenauftrag = (KundenauftragBean) execution.getVariable("kundenauftrag");
		System.out.println("Betreff: Stornierung Ihrer Bestellung");
		System.out.println("Sehr geehrter Kunde,\nleider kann Ihre Bestellung mit ID "+ kundenauftrag.getBestellungID() + " nicht ausgeführt werden, da wir Ihre Zahlung nicht im geforderten Zeitraum erhalten haben.");
		System.out.println("\n\nViele Grüße \nIhr Druckfabrik-Team");
		
		
	}
	
}
