package edu.thi.druckfabrik.servicetasks;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import edu.thi.druckfabrik.beans.AnfrageBean;

public class AngabenAktualisieren implements JavaDelegate{

	public void execute(DelegateExecution execution) throws Exception {
		//am 30.05.2022 wurde diese Möglichkeit E-Mails über Google Mail zu schreiben aus Sicherheitsgründen entfernt, deshalb lediglich ausgabe in der Console
		AnfrageBean anfrage = (AnfrageBean) execution.getVariable("anfrage");
		
		String anrede = (String) execution.getVariable("anrede");
		String nachname = (String) execution.getVariable("nachname");
		String email = (String) execution.getVariable("email");
		String vorname = (String) execution.getVariable("vorname");
		String strasse = (String) execution.getVariable("strasse");
		String hausnummer = (String) execution.getVariable("hausnummer");
		String postleitzahl = (String) execution.getVariable("postleitzahl");
		String stadt = (String) execution.getVariable("stadt");
		String link = (String) execution.getVariable("link");
		String telefonnummer = (String) execution.getVariable("telefonnummer");
		
		anfrage.setAnrede(anrede);
		anfrage.setEmail(email);
		anfrage.setNachname(nachname);
		anfrage.setVorname(vorname);
		anfrage.setStrasse(strasse);
		anfrage.setHausnummer(hausnummer);
		anfrage.setPostleitzahl(postleitzahl);
		anfrage.setStadt(stadt);
		anfrage.setLink(link);
		anfrage.setTelefonnummer(telefonnummer);
		
		execution.setVariable("anfrage", anfrage);
}
	
}
