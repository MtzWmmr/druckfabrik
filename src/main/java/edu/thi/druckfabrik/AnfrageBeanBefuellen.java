/* Matthias Wimmer
 * Simon Kreutel
 * Alexander Horn
 */
package edu.thi.druckfabrik;

import java.util.Date;
import java.util.Random;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import edu.thi.druckfabrik.beans.AnfrageBean;
import edu.thi.druckfabrik.beans.KundenBean;

public class AnfrageBeanBefuellen implements JavaDelegate{
	
	public void execute(DelegateExecution execution) throws Exception {
		AnfrageBean anfrage = new AnfrageBean();
		KundenBean kunde = (KundenBean) execution.getVariable("kunde");
		
		String link = (String) execution.getVariable("link");
		
		anfrage.setLink(link);
		anfrage.setAnfrageID(new Random().nextInt(900000) + 100000);
		anfrage.setKundenID(kunde.getKundenID());
			
		execution.removeVariable("link");
		
		execution.setVariable("anfrage", anfrage);	
		
	}

}
