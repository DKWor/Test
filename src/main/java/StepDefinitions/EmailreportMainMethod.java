package StepDefinitions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

public class EmailreportMainMethod {
	static String exporthtmlEmailPath = null;
	static String exportpdfEmailPath = null;
//	static StringBuilder html = new StringBuilder();

	public static void main(String[] args)  {

		try { 

			SimpleDateFormat formateDate = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			Date date = new Date();
			String datesystem = formateDate.format(date);

			System.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
			// SimpleEmail email = new SimpleEmail();
			MultiPartEmail email = new MultiPartEmail();
			email.setHostName("smtp.googlemail.com");
			email.setSmtpPort(587);
			email.setAuthenticator(new DefaultAuthenticator("digambar.karande@vernost.in", "hmqk sxuh gvtn kdwq"));
			email.setStartTLSEnabled(true);
			email.setFrom("digambar.karande@vernost.in");
			email.setSubject(" Indigo: Automation Testing Report " + datesystem + "( Holiday for test email only) ");
			email.setMsg("This is a test mail ... :-)");
			email.addTo("kuldeep.ruletiya@vernost.in");
			email.addTo("digambar.karande@vernost.in");
//	        email.addTo("ansari.wasi@vernost.in");				
//	        email.addTo("devendra.patil@vernost.in");				
//	        email.addTo("puja.gupta@vernost.in");
			email.addTo("sanket.dhamale@vernost.in");

			System.out.println("ssss" + System.getProperty("user.dir"));

			EmailAttachment attachment = new EmailAttachment();
			attachment.setPath(System.getProperty("user.dir")+"/test-output/SparkReport/Index.html");
//			attachment.setPath(System.getProperty("user.dir") + getHtmlEmailPath() + "Index.html");
//			attachment.setDisposition(EmailAttachment.ATTACHMENT);

			EmailAttachment attachment1 = new EmailAttachment();
			attachment1.setPath(System.getProperty("user.dir")+"/test output/PdfReport/ExtentPdf.pdf");
//			attachment1.setPath(System.getProperty("user.dir") + getPdfEmailPath() + "ExtentPdf.pdf");
//			attachment1.setDisposition(EmailAttachment.ATTACHMENT);

//			FileReader fr = new FileReader(System.getProperty("user.dir") + getHtmlEmailPath() + "Index.html");
//			BufferedReader br = new BufferedReader(fr);
//			String val;
//			while ((val = br.readLine()) != null) {
//				html.append(val);
//			}
//			String result = html.toString();
//			br.close();
//			email.setMsg(result); 

			email.attach(attachment);
			email.attach(attachment1);
			email.send();

			System.out.println("Email sent successfully.");

		} catch (EmailException e) {
			e.printStackTrace();
		}
	}

	public static String getHtmlEmailPath() {
		String fileSeparator = FileSystems.getDefault().getSeparator();

		System.out.println(System.getProperty("os.name"));
		switch (System.getProperty("os.name")) {
		case "Linux":
			exporthtmlEmailPath = "/test-output/SparkReport/";
			break;
		case "Windows":
			exporthtmlEmailPath = "\\test-output\\SparkReport\\";
			break;
		case "Mac":
			exporthtmlEmailPath = "/test-output/SparkReport/";
			break;
		}
		return exporthtmlEmailPath;

	}

	public static String getPdfEmailPath() {
		String fileSeparator = FileSystems.getDefault().getSeparator();

		System.out.println(System.getProperty("os.name"));
		switch (System.getProperty("os.name")) {
		case "Linux":
			exportpdfEmailPath = "/test output/PdfReport/";
			break;
		case "Windows":
			exportpdfEmailPath = "\\test output\\PdfReport\\";
			break;
		case "Mac":
			exportpdfEmailPath = "/test output/PdfReport/";
			break;
		}
		return exportpdfEmailPath;

	}

}
