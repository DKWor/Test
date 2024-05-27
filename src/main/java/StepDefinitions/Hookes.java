package StepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.gherkin.model.Scenario;

import BaseClass.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hookes extends BaseClass {

	
	@Before("@SmokeTest")
	public void Flightbooking()
	{
		System.out.println("Select the origin and destination as per requirementes");
	}
	
   @After(order = 1)
	public void TakscreenshotOfFailureTestCases(io.cucumber.java.Scenario scenario) throws Exception
	{
		if(scenario.isFailed())
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			byte[] src = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(src, "image/png", "screenshot");
		}
      
		
	
	}
	
    @After(order = 0)
	public void closeBrowser() throws Exception
	{
	   driver.quit();
      
	
	}


	
	 
}
