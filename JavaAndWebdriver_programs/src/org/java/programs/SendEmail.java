package org.java.programs;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail {

	public static void main(String[] args) {
		String from = "";
		String[] to = {""};
		String pass = "";
		String host ="smtp.gmail.com";
		Properties  properties = System.getProperties();
		
//		properties.put("mail.smtp.ssl.trust", host);
//		properties.put("mail.smtp.auth", "true");
//		properties.put("mail.smtp.user", "katrenlouis@gmail.com"); // User name
//		properties.put("mail.smtp.password", "fasur@123"); // password
		properties.put("mail.smtp.starttls.enable", "true"); 
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");

		try{
			System.out.println("checkpoint 1");
			Session session = Session.getDefaultInstance(properties);
			System.out.println("checkpoint 2");
			MimeMessage message = new MimeMessage(session);
//			message.setFrom(new InternetAddress(from));
			
			//multiple mail ID's
			InternetAddress[] toAddress = new InternetAddress[to.length];
			for(int i=0 ; i < to.length ; i++){
				toAddress[i] = new InternetAddress(to[i]);
			}
			for(int i=0 ; i < toAddress.length ; i++){
				message.addRecipient(Message.RecipientType.TO,toAddress[i]);
			}
			
			//single mail ID
//			message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
			
			message.setSubject("this is the subject");
			message.setContent("hello how r u", "text/plain");
			System.out.println("checkpoint 3");
			
			Transport transport = session.getTransport("smtp");
			System.out.println("checkpoint 4");
			transport.connect(host,from,pass);
			System.out.println("checkpoint 5");
			transport.sendMessage(message, message.getAllRecipients());
			transport.close();
			System.out.println("sent mail successfully ...");
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
	}

}
