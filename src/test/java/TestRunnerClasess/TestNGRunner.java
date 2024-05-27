package TestRunnerClasess;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.testng.annotations.AfterClass;
import StepDefinitions.Emailreport;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
 	    
	  	  
features={"src\\test\\java\\Features\\KAT_GST.feature"},	
glue="StepDefinitions",
monochrome = true,
tags="@KAT_GST_TC",
plugin= {"pretty",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"timeline:test-output-thread/",
		"rerun:target/failedrerun.txt"
	            	               
	                                                                                                                                                                                                                                                                                                                                                                                                                              	                       
 }                                 
)     
     
public class TestNGRunner extends AbstractTestNGCucumberTests {

	// @AfterClass
	public static void SendingMail() throws AddressException, IOException, MessagingException {

		Runtime r = Runtime.getRuntime();
		r.addShutdownHook(new Thread() {
			public void run() {
				Emailreport sm = new Emailreport();
				try {
					sm.mail();
					System.out.println("Report has been sent");
					Thread.sleep(5000);
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println(e);
				}

			}
		});

	}
}
//KAT_GST.feature

