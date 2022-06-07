/* Simon Kreutel
 * Alexander Horn
 */
package edu.thi.druckfabrik;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import edu.thi.druckfabrik.beans.KundenauftragBean;

public class ZahlungserinnerungSenden implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		KundenauftragBean kundenauftrag = (KundenauftragBean) execution.getVariable("kundenauftrag");
		System.out.println("Betreff: Zahlungserinnerung");
		System.out.println("BestellungID: " + kundenauftrag.getBestellungID());
		System.out.println("Sehr geehrter Kunde,\nSie haben bisher die Rechnung zu Ihrer Bestellung nicht beglichen. Bitte tun Sie dies innerhalb der nächsten 7 Tage.");
		System.out.println("\n\nViele Grüße \nIhr Druckfabrik-Team");
		
	}
	
}
