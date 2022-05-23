package edu.thi.druckfabrik.servicetasks;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import edu.thi.druckfabrik.beans.KundenauftragBean;

public class KundenauftragBeanAnlegen implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {		
		KundenauftragBean kundenauftrag = new KundenauftragBean();
		
		execution.setVariable("kundenauftrag", kundenauftrag);
		
	}
	
}
