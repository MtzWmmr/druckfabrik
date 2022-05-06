package edu.thi.druckfabrik;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import edu.thi.druckfabrik.beans.KundenBean;

public class AnfrageToBean implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
			KundenBean kunde = new KundenBean();
			kunde.setAnrede((String) execution.getVariable("anrede"));
			kunde.setVorname((String) execution.getVariable("vorname"));
			kunde.setNachname((String) execution.getVariable("nachname"));
			kunde.setEmail((String) execution.getVariable("email"));
			kunde.setStrasse((String) execution.getVariable("strasse"));
			kunde.setHausnummer((String) execution.getVariable("hausnummer"));
			kunde.setPostleitzahl((String) execution.getVariable("postleitzahl"));
			kunde.setStadt((String) execution.getVariable("stadt"));
			kunde.setTelefonnummer((String) execution.getVariable("telefonnummer")) ;
			kunde.setStammkunde(false);
			
//Hier erfolgt eine Ueberpruefung ob der Kunde ein Stammkunde ist. Ueberprueft wird anhand eines dummy files			
			File file = new File("../standalone/tmp/stammkunde.txt");	
			
			try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			    String line;
			    while ((line = br.readLine()) != null) {
			    	if(!line.strip().isEmpty() && line.strip().equals(kunde.getEmail())) {
			    		kunde.setStammkunde(true);
			    	}
			    }
			    
			}
			
			
			execution.setVariable("kunde", kunde);
		
	}
	
}
