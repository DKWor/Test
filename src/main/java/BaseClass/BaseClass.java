package BaseClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import com.aventstack.extentreports.ExtentReports;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.CommonMethodes;

public class BaseClass extends CommonMethodes {

	protected static WebDriver driver;
	ExtentReports extent;

	public void LounchBrowser(String environment) throws IOException, InterruptedException {

		if (CommonMethodes.readDataFromPropertyFile("browser").equalsIgnoreCase("Chrome")) {

			WebDriverManager.chromedriver().setup();

			ChromeOptions option = new ChromeOptions();
			// option.addArguments("--incognito");
		//	option.addArguments("--remote-allow-origins=*","--incognito");
//			        option.addArguments("disable-infobars");
			
			option.addArguments("--remote-allow-origins=*");


			switch (environment.toLowerCase()) {
			case "prod":
				driver = new ChromeDriver(option);
				driver.manage().window().maximize();
				driver.get(CommonMethodes.readDataFromPropertyFile("PRODURL"));
				System.out.println("User is on Prod_URL");
				break;
			case "uat":
				driver = new ChromeDriver(option);
				driver.manage().window().maximize();
				driver.get(CommonMethodes.readDataFromPropertyFile("UATNEW"));
				System.out.println("User is on UAT_URL");
				break;
			}

			// driver.get(CommonMethodes.readDataFromPropertyFile("UATNEW"));

			System.out.println("Successfully Launch the URL with Chrome");
			// PRODURL
			// UATNEW
                      Thread.sleep(2000);
                      
                 
                    
		} 
		else if (CommonMethodes.readDataFromPropertyFile("browser").equalsIgnoreCase("Firefox")) {
			WebDriverManager.chromedriver().setup();

			ChromeOptions option = new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
//			        option.addArguments("disable-infobars");

			switch (environment.toLowerCase()) {
			case "prod":
				driver = new ChromeDriver(option);
				driver.manage().window().maximize();
				driver.get(CommonMethodes.readDataFromPropertyFile("PRODURL"));
				System.out.println("User is on Prod_URL");
				break;
			case "uat":
				driver = new ChromeDriver(option);
				driver.manage().window().maximize();
				driver.get(CommonMethodes.readDataFromPropertyFile("UATNEW"));
				System.out.println("User is on UAT_URL");
				break;
			}

			// driver.get(CommonMethodes.readDataFromPropertyFile("UATNEW"));

			System.out.println("Successfully Launch the URL with Chrome");
			// PRODURL
			// UATNEW
                      Thread.sleep(2000);
                      
        
		} else if (CommonMethodes.readDataFromPropertyFile("browser").equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			EdgeOptions option = new EdgeOptions();
			option.addArguments("--remote-allow-origins=*", "--disable-popup-blocking");
			driver = new EdgeDriver(option);
			driver.manage().window().maximize();
			driver.get(CommonMethodes.readDataFromPropertyFile("PRODURL"));
			System.out.println("Successfully Launch the URL with Edge");
			CommonMethodes.wait1(driver, 10);

		}

	}

}
