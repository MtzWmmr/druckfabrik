/* Matthias Wimmer
 * Simon Kreutel
 * Alexander Horn
 */
package edu.thi.druckfabrik;

import java.util.Date;
import java.util.Random;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import edu.thi.druckfabrik.beans.KundenBean;

public class KundenBeanBefuellen implements JavaDelegate{
	
	public void execute(DelegateExecution execution) throws Exception {
		KundenBean kunde = new KundenBean();
		
		String anrede = (String) execution.getVariable("anrede");
		String nachname = (String) execution.getVariable("nachname");
		String email = (String) execution.getVariable("email");
		String vorname = (String) execution.getVariable("vorname");
		String strasse = (String) execution.getVariable("strasse");
		String hausnummer = (String) execution.getVariable("hausnummer");
		String postleitzahl = (String) execution.getVariable("postleitzahl");
		String stadt = (String) execution.getVariable("stadt");
		String telefonnummer = (String) execution.getVariable("telefonnummer");
		Boolean stammkunde = (Boolean) execution.getVariable("stammkunde");
		
		kunde.setAnrede(anrede);
		kunde.setEmail(email);
		kunde.setNachname(nachname);
		kunde.setVorname(vorname);
		kunde.setStrasse(strasse);
		kunde.setHausnummer(hausnummer);
		kunde.setPostleitzahl(postleitzahl);
		kunde.setStadt(stadt);
		kunde.setTelefonnummer(telefonnummer);
		kunde.setStammkunde(stammkunde);
		kunde.setKundenID(new Random().nextInt(900000) + 100000);
		
		execution.removeVariable("anrede");
		execution.removeVariable("nachname");
		execution.removeVariable("vorname");
		execution.removeVariable("email");
		execution.removeVariable("strasse");
		execution.removeVariable("hausnummer");
		execution.removeVariable("postleitzahl");
		execution.removeVariable("stadt");
		execution.removeVariable("telefonnummer");
		execution.removeVariable("stammkunde");
		
		
		execution.setVariable("kunde", kunde);
		
		
	}

}
