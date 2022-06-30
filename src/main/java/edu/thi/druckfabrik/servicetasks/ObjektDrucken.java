/*Simon Kreutel
 */
package edu.thi.druckfabrik.servicetasks;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import edu.thi.druckfabrik.beans.PrototypBean;


public class ObjektDrucken implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		PrototypBean prototyp = (PrototypBean) execution.getVariable("prototyp");
		System.out.println("Druckvorgang");
		System.out.println("Maße in mm: " + prototyp.getHoehe() + " x " + prototyp.getBreite() + " x " + prototyp.getLaenge() + " (H*B*L)");
		System.out.println("Das Objekt wird gedruckt...");
		System.out.println("Das Objekt wurde erfolgreich gedruckt. Sie können es nun entnehmen.");
		
		
	}
	
}
