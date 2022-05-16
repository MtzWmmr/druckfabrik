package edu.thi.druckfabrik.servicetasks;

import java.math.BigDecimal;


import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import edu.thi.druckfabrik.beans.AngebotBean;
import edu.thi.druckfabrik.beans.KundenauftragBean;


public class GesamtpreisBerechnen implements JavaDelegate{
	
	
	BigDecimal gesamtPreis;
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		KundenauftragBean auftrag = (KundenauftragBean) execution.getVariable("kundenauftrag");
		AngebotBean angebot = (AngebotBean) execution.getVariable("angebot");
		Boolean gratisExpressversand = (Boolean) execution.getVariable("gratisExpressversand");
		BigDecimal versandKosten = new BigDecimal(15);
		long druckanzahl = (long) auftrag.getDruckanzahl();
		
		if (druckanzahl >=1 && druckanzahl <=99)
			 gesamtPreis = new BigDecimal(druckanzahl * angebot.getPreis1());
		
		if(druckanzahl >=100  && druckanzahl <=999) {
			gesamtPreis = new BigDecimal(druckanzahl * angebot.getPreis100());
			
		}	
		if(druckanzahl >=1000) {
			gesamtPreis = new BigDecimal(druckanzahl * angebot.getPreis1000());
		}
		
		if (!gratisExpressversand) {
			gesamtPreis = gesamtPreis.add(versandKosten);
			
		}
		auftrag.setGesamtPreis(gesamtPreis);
	}
}
