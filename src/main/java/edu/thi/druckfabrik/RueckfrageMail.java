package edu.thi.druckfabrik;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Properties;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;


import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;




public class RueckfrageMail implements JavaDelegate{
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		//am 30.05.2022 wurde diese Möglichkeit E-Mails über Google Mail zu schreiben aus Sicherheitsgründen entfernt, deshalb lediglich ausgabe in der Console
		String reason = (String) execution.getVariable("rueckfragegrund");
		String text = (String) execution.getVariable("rueckfragetext");
		String anrede = (String) execution.getVariable("anrede");
		String name = (String) execution.getVariable("nachname");
		String email = (String) execution.getVariable("email");
		Date startdate = (Date) execution.getVariable("startdate");
		String hours = String.valueOf(startdate.getHours());
		String minutes = String.valueOf(startdate.getMinutes());
		
		LocalDate datum = startdate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		int day = datum.getDayOfMonth();
		int month = datum.getMonthValue();
		int year = datum.getYear();
		
		String betreff = "Rückfrage aus Grund: " + reason;
		
		StringBuilder nachricht = new StringBuilder();
		nachricht.append("Hallo " + anrede +" " + name + ",\n");
		nachricht.append("Vielen Dank für Ihre Anfrage vom " + day + "." + month + "." + year + " " + minutes + ":" + hours + ".\n");
		nachricht.append(text);
		nachricht.append("\n\nViele Grüße \nIhr Druckfabrik-Team");
		
		System.out.println("Mail To: " + email);
		System.out.println("Betreff: " + betreff);
		System.out.println("Nachricht: " + nachricht.toString());

	}
	/*public void execute(DelegateExecution execution) throws Exception {
		String reason = (String) execution.getVariable("rueckfragegrund");
		String text = (String) execution.getVariable("rueckfragetext");
		String anrede = (String) execution.getVariable("anrede");
		String name = (String) execution.getVariable("nachname");
		String email = (String) execution.getVariable("email");
		Date startdate = (Date) execution.getVariable("startdate");
		String hours = String.valueOf(startdate.getHours());
		String minutes = String.valueOf(startdate.getMinutes());
		
		LocalDate datum = startdate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		int day = datum.getDayOfMonth();
		int month = datum.getMonthValue();
		int year = datum.getYear();
		
		String betreff = "Rückfrage aus Grund: " + reason;
		
		StringBuilder nachricht = new StringBuilder();
		nachricht.append("Hallo " + anrede +" " + name + ",\n");
		nachricht.append("Vielen Dank für Ihre Anfrage vom " + day + "." + month + "." + year + " " + minutes + ":" + hours + ".\n");
		nachricht.append(text);
		nachricht.append("\n\nViele Grüße \nIhr Druckfabrik-Team");
		
		Session session = getGMailSession("kontakt.kinoin@gmail.com", "start99999");
		postMail(session, email, betreff, nachricht.toString());
		
		
		
	}
		  

	//Folgender Code ist von Christian Ullenboom java 7- Mehr als eine Insel Ã¼bernommen https://openbook.rheinwerk-verlag.de/java7/1507_11_012.html	
		
	
	public static Session getGMailSession( String user, String pass ){
	    final Properties props = new Properties();
	    // Zum Senden
	    props.setProperty( "mail.smtp.host", "smtp.gmail.com" );
	    props.setProperty( "mail.smtp.auth", "true" );
	    props.setProperty( "mail.smtp.port", "465" );
	    props.setProperty( "mail.smtp.socketFactory.port", "465" );
	    props.setProperty( "mail.smtp.socketFactory.class",
	                       "javax.net.ssl.SSLSocketFactory" );
	    props.setProperty( "mail.smtp.socketFactory.fallback", "false" );

	    return Session.getInstance(props, new javax.mail.Authenticator() {
	    	@Override 
	    	protected PasswordAuthentication getPasswordAuthentication() {
	    		return new PasswordAuthentication(user, pass);
	    	}
	    } );
	  }
	
//Ã¼bernommen aus Kapitel 11.12.7 - Versand von E-mail	
	public static void postMail( Session session, String recipient, String subject, String message )throws MessagingException {
	Message msg = new MimeMessage( session );
	
	InternetAddress addressTo = new InternetAddress( recipient );
	msg.setRecipient( Message.RecipientType.TO, addressTo );
	
	msg.setSubject( subject );
	msg.setContent( message, "text/plain" );
	Transport.send( msg );
	}*/
}
