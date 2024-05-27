package StepDefinitions;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import BaseClass.BaseClass;

public class Emailreport extends BaseClass{
	
	public void mail()throws Exception {
		  
		 try {
			 
			 SimpleDateFormat formateDate=new SimpleDateFormat("ddMMMyyyy HH:mm:ss");
			 Date date=new Date();
			 String datesystem = formateDate.format(date);
			 
	            System.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
	            //SimpleEmail email = new SimpleEmail();
	            MultiPartEmail email = new MultiPartEmail();
	            email.setHostName("smtp.googlemail.com");
	            email.setSmtpPort(587);
	            email.setAuthenticator(new DefaultAuthenticator("digambar.karande@vernost.in", "hmqk sxuh gvtn kdwq"));
	            email.setStartTLSEnabled(true);
	            email.setFrom("digambar.karande@vernost.in");
	            email.setSubject("KAT-GST_Automation Report "+datesystem+" ");
	            email.setMsg("This is a test mail ... :-)");
	            email.addTo("digambar.karande@vernost.in");
	            email.addTo("kuldeep.ruletiya@vernost.in");
	            email.addTo("sanket.dhamale@vernost.in");
	          			




				EmailAttachment attachment = new EmailAttachment();
				attachment.setPath(System.getProperty("user.dir")+"\\test-output\\SparkReport\\Index.html");
				attachment.setDisposition(EmailAttachment.ATTACHMENT);

				EmailAttachment attachment1 = new EmailAttachment();
				attachment1.setPath(System.getProperty("user.dir")+"\\test output\\PdfReport\\ExtentPdf.pdf");
				attachment1.setDisposition(EmailAttachment.ATTACHMENT);

				//sanket.dhamale@vernost.in
				    
				email.attach(attachment);
				email.attach(attachment1);
	            email.send();
 
	            System.out.println("Email sent successfully.");

	        } catch (EmailException e) {
	            e.printStackTrace();
	        }
	    }
	}