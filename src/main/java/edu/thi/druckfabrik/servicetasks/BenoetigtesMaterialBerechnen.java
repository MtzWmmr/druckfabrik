package edu.thi.druckfabrik.servicetasks;

import java.math.BigDecimal;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import edu.thi.druckfabrik.beans.BestellungBean;
import edu.thi.druckfabrik.beans.PrototypBean;

public class BenoetigtesMaterialBerechnen implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		BestellungBean bestellung = (BestellungBean) execution.getVariable("bestellung");
		PrototypBean prototyp = (PrototypBean) bestellung.getPrototyp();
		//Cast von Long zu Integer uebernommen von stackoverflow user Jaime Saiz; https://stackoverflow.com/questions/1590831/safely-casting-long-to-int-in-java
		//wenn der Long groeßer als der Integer moegliche Bereich ist tritt eine ArithmeticException auf
		int hoehe = new BigDecimal(prototyp.getHoehe()).intValueExact();
		int breite = new BigDecimal(prototyp.getBreite()).intValueExact();
		int laenge = new BigDecimal(prototyp.getLaenge()).intValueExact();
		long druckanzahl = bestellung.getDruckanzahl();
		
		int volumenObjekt = hoehe * breite * laenge;
		//60g filament pro 100.000mm^2 -> 0,0006g pro 1mm^2 
		int mengeFilamentProObjekt = (int) Math.round(volumenObjekt * 0.0006);
		long benoetigteMenge = mengeFilamentProObjekt * druckanzahl;
		
		execution.setVariable("benoetigteMenge", benoetigteMenge);
	}
	
}
