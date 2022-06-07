/* Matthias Wimmer
 * Simon Kreutel
 * Alexander Horn
 */
package edu.thi.druckfabrik;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Properties;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import edu.thi.druckfabrik.beans.AnfrageBean;
import edu.thi.druckfabrik.beans.KundenBean;


public class RueckfrageMail implements JavaDelegate{
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		//am 30.05.2022 wurde diese Möglichkeit E-Mails über Google Mail zu schreiben aus Sicherheitsgründen entfernt, deshalb lediglich ausgabe in der Console
		KundenBean kunde = (KundenBean) execution.getVariable("kunde");
		AnfrageBean anfrage = (AnfrageBean) execution.getVariable("anfrage");
		
		String reason = (String) execution.getVariable("rueckfragegrund");
		String text = (String) execution.getVariable("rueckfragetext");
		String anrede = kunde.getAnrede();
		String nachname = kunde.getNachname();
		String email = kunde.getEmail();
		Date startdate = (Date) execution.getVariable("startdate");
		Integer anfrageID = anfrage.getAnfrageID();
		String hours = String.valueOf(startdate.getHours());
		String minutes = String.valueOf(startdate.getMinutes());
		
		LocalDate datum = startdate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		int day = datum.getDayOfMonth();
		int month = datum.getMonthValue();
		int year = datum.getYear();
		
		String betreff = "Rückfrage aus Grund: " + reason;
		
		StringBuilder nachricht = new StringBuilder();
		nachricht.append("Hallo " + anrede +" " + nachname + ",\n");
		nachricht.append("Vielen Dank für Ihre Anfrage vom " + day + "." + month + "." + year + " " + minutes + ":" + hours + ".\n");
		nachricht.append("AnfrageID: " + anfrageID + "\nBitte geben Sie diese ID bei Ihrer Antwort an \n");
		nachricht.append(text);
		nachricht.append("\n\nViele Grüße \nIhr Druckfabrik-Team");
		
		System.out.println("Mail To: " + email);
		System.out.println("Betreff: " + betreff);
		System.out.println("Nachricht: " + nachricht.toString());

	}
}
