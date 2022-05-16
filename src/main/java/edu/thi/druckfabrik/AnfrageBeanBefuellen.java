package edu.thi.druckfabrik;

import java.util.Date;
import java.util.Random;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import edu.thi.druckfabrik.beans.AnfrageBean;

public class AnfrageBeanBefuellen implements JavaDelegate{
	
	public void execute(DelegateExecution execution) throws Exception {
		//am 30.05.2022 wurde diese Möglichkeit E-Mails über Google Mail zu schreiben aus Sicherheitsgründen entfernt, deshalb lediglich ausgabe in der Console
		AnfrageBean anfrage = new AnfrageBean();
		
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
		anfrage.setAnfrageID(new Random().nextInt(900000) + 100000);
		
		execution.removeVariable("anrede");
		execution.removeVariable("nachname");
		execution.removeVariable("vorname");
		execution.removeVariable("email");
		execution.removeVariable("strasse");
		execution.removeVariable("hausnummer");
		execution.removeVariable("postleitzahl");
		execution.removeVariable("stadt");
		execution.removeVariable("link");
		execution.removeVariable("telefonnummer");
		
		
		execution.setVariable("anfrage", anfrage);
		
		
	}

}
