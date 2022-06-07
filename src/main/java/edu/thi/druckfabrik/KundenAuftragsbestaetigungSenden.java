/* Matthias Wimmer
 */
package edu.thi.druckfabrik;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import edu.thi.druckfabrik.beans.KundenauftragBean;

public class KundenAuftragsbestaetigungSenden implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		KundenauftragBean auftrag = (KundenauftragBean) execution.getVariable("kundenauftrag");
		System.out.println("Betreff: Ihr Kundenauftrag");
		System.out.println("Vielen Dank für Ihren Auftrag. Anbei die Auftragsbestätigung.");
		System.out.println("Lieferdatum: " + auftrag.getLiefertermin().toString());
		System.out.println("\n\nViele Grüße \nIhr Druckfabrik-Team");
		
		
	}

}
