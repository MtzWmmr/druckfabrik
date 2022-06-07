/* Matthias Wimmer
 * Simon Kreutel
 * Alexander Horn
 */
package edu.thi.druckfabrik;

import org.camunda.bpm.engine.TaskService;
import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.TaskListener;
import org.camunda.bpm.engine.impl.TaskServiceImpl;
import org.camunda.bpm.engine.impl.interceptor.CommandExecutorImpl;

//aus dem Skript uebernommen
public class BenutzeraufgabenUeberspringen implements TaskListener{
	
	@Override
	public void notify (DelegateTask delegateTask) {
		if ((Boolean) delegateTask.getExecution().getVariable("completionCondition")) {
			TaskServiceImpl taskService = new TaskServiceImpl();
			taskService.setCommandExecutor(new CommandExecutorImpl());
			this.finishCurrentTask(taskService, delegateTask);
		}
	}
	
	private void finishCurrentTask (TaskService taskService, DelegateTask currentTask) {
		taskService.complete(currentTask.getId());
	}

}
