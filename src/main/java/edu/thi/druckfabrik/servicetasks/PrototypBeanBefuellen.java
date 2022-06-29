/* Alexander Horn
 */
package edu.thi.druckfabrik.servicetasks;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import edu.thi.druckfabrik.beans.PrototypBean;

public class PrototypBeanBefuellen implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		String material = (String) execution.getVariable("material");
		long hoehe = (long) execution.getVariable("hoehe");
		long breite = (long) execution.getVariable("breite");
		long laenge = (long) execution.getVariable("laenge");
		
		
		PrototypBean prototyp = (PrototypBean) execution.getVariable("prototyp");
		prototyp.setMaterial(material);
		prototyp.setHoehe(hoehe);
		prototyp.setBreite(breite);
		prototyp.setLaenge(laenge);
		prototyp.setAnzahl(Long.valueOf(1));
		
		execution.setVariable("prototyp", prototyp);
		
	}
	

}
