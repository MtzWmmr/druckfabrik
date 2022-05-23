package edu.thi.druckfabrik.servicetasks;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import edu.thi.druckfabrik.beans.PrototypBean;

public class PrototypBeanAnlegen implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {		
		PrototypBean prototyp = new PrototypBean();
		
		execution.setVariable("Prototyp", prototyp);
		
	}
	
}
