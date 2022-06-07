/* Simon Kreutel
 * Alexander Horn
 */
package edu.thi.druckfabrik.servicetasks;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class PrototypBeanLoeschen implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {		
		execution.removeVariable("Prototyp");
		
	}
	
}
