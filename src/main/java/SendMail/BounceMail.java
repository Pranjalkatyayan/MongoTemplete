package SendMail;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class BounceMail {
	public static void main(String[] args) throws MessagingException {

		String smtpServer = "smtp.gmail.com";
		int port = 587;
		final String userid = "pranjalkatyayan01@gmail.com";// From email 
		final String password = "08877713763";// 
		String contentType = "text/html";
		String subject = "test: bounce an email to a different address " + "from the sender";
		String from = "pranjalkatyayan01@gmail.com";
		String to = "bouncer@fauxmail.com";// some invalid address  (To email)
		String cc="pranjalkatyayan03@gmail.com";

		String bounceAddr = "pranjalkatyayan03@gmail.com";// other person email
		String body = "Test: get message to bounce to a separate email address";

		Properties props = new Properties();

		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", smtpServer);
		props.put("mail.smtp.port", "587");
		props.put("mail.transport.protocol", "smtp");
		props.put("mail.smtp.from", bounceAddr);

		Session mailSession = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(userid, password);
			}
		});

		MimeMessage message = new MimeMessage(mailSession);
	
			message.addFrom(InternetAddress.parse(from));
			message.setRecipients(Message.RecipientType.TO, to);

			message.setSubject(subject);
			message.setContent(body, contentType);

			
		
		Transport transport;
		try {
			transport = mailSession.getTransport();
			System.out.println("Sending ....");
			transport.connect(smtpServer, port, userid, password);
			transport.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
			System.out.println("Sending done ...");
			System.out.println("End of try");
			//transport.close();

		} catch (SendFailedException e) {
			

			System.out.print("i am inside the catch");
			System.err.println("Error Sending: ");

			e.printStackTrace();

		} catch (Exception e) {
			// TODO Auto-generated catch block

			Transport transport2 = mailSession.getTransport();
			System.out.println("Sending ....");
			transport2.connect(smtpServer, port, userid, password);
			transport2.sendMessage(message, message.getRecipients(Message.RecipientType.CC));
			System.out.println("Hi i am in catch");
			e.printStackTrace();
			System.out.println("Hi i am in catch 2");
		}
		
	}
}