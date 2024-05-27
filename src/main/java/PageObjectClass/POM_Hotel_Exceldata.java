package PageObjectClass;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import utils.CommonMethodes;

public class POM_Hotel_Exceldata {

	@FindBy(xpath = "(//input[@name='email'])[1]")private WebElement Mobile_NO;
	@FindBy(xpath = "(//input[@name='password'])[1]")private WebElement pass;
	@FindBy(xpath = "(//button[normalize-space()='Sign In'])[1]")private WebElement SighnIn;

//	@FindBy(xpath="(//i[contains(@class, 'fas') and contains(@class, 'fa-sort-down')])[4]")private WebElement GSTR1;
//	@FindBy(xpath = "(//i[@class='fas fa-sort-down'])[4]")
	@FindBy(xpath = "//span[normalize-space()='GSTR1']")private WebElement GSTR1;

	@FindBy(xpath = "(//a[@class='menu-link'])[10]")private WebElement GSTR1FileUpload;

//	@FindBy(xpath="(//li[normalize-space()='1'])[1]")private WebElement Step1;
	@FindBy(xpath = "//li[normalize-space()='1']")private WebElement Step1;

	@FindBy(xpath = "//li[normalize-space()='4']")private WebElement Step4;
	@FindBy(xpath = "//li[normalize-space()='5']")private WebElement Step5;
	@FindBy(xpath = "//li[normalize-space()='6']")private WebElement Step6;
	@FindBy(xpath = "//li[normalize-space()='7']")private WebElement Step7;
	@FindBy(xpath = "(//button[contains(text(),'Proceed to Compare Control Sheet 3 & Liability Led')])[1]")private WebElement Comparecontrolsheet3;


	@FindBy(xpath = "(//label[@class='mat-radio-label'])[1]")private WebElement GreenButtonQ1;
	
	@FindBy(xpath = "(//div[@class='mat-ripple mat-tab-label mat-focus-indicator ng-star-inserted'])[1]")private WebElement ClickQ2;
	@FindBy(xpath = "(//label[@class='mat-radio-label'])[1]")private WebElement GreenButtonQ2;

	@FindBy(xpath = "(//div[@class='mat-ripple mat-tab-label mat-focus-indicator ng-star-inserted'])[2]")private WebElement ClickQ3;
	@FindBy(xpath = "(//div[@class='mat-ripple mat-tab-label mat-focus-indicator ng-star-inserted'])[3]")private WebElement ClickQ4;
	@FindBy(xpath = "(//label[@class='mat-radio-label'])[1]")private WebElement GreenButtonQ4;
	@FindBy(xpath = "(//label[@class='mat-radio-label'])[1]")private WebElement GreenButtonstep6;

	@FindBy(xpath = "(//label[@class='mat-radio-label'])[2]")private WebElement RedButtonQ3;

	@FindBy(xpath = "//button[normalize-space()='save']")private WebElement saveStep;
	@FindBy(xpath = "//i[@class='fa fa-download fa-lg']")private WebElement DownloadFliesQ3;

	@FindBy(xpath = "//button[contains(text(),'Proceed to Compare Control Sheet 2 & E-Way Bill Upload ')]")private WebElement ControlSheet2EWay;



	

	public POM_Hotel_Exceldata(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void Pass_Mobile_NO(WebDriver driver, String Mobile) throws InterruptedException, IOException {

		Mobile_NO.sendKeys(Mobile);
		Thread.sleep(500);

	}

	public void pass_pass(String Pass) throws InterruptedException, IOException {
		pass.sendKeys(Pass);
		Thread.sleep(500);
	}

	public void Click_Sigh_in() throws InterruptedException, IOException, TesseractException {
		SighnIn.click();

	}

	public void Click_ON_GSTR1(WebDriver driver) throws InterruptedException {
		//GSTR1.click();
		   try {
		    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='GSTR1']")));

		            popup.findElement(By.xpath("//span[normalize-space()='GSTR1']")).click();
		            
		        } catch (Exception e) {
		            System.out.println("Element not present");
		        }		
		
	}

	public void Click_GSTR1FileUpload(WebDriver driver) throws InterruptedException 
	{

		//GSTR1FileUpload.click();
		   try {
		    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='menu-link'])[10]")));

		            popup.findElement(By.xpath("(//a[@class='menu-link'])[10]")).click();
		            
		        } catch (Exception e) {
		            System.out.println("Element not present");
		        }	
		   
	}

	public void Click_On_Step1(WebDriver driver) throws InterruptedException 
	{
		//Step1.click();
		   try {
		    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[normalize-space()='1']")));

		            popup.findElement(By.xpath("//li[normalize-space()='1']")).click();
		            
		        } catch (Exception e) {
		            System.out.println("Element not present");
		        }	
	}
	
	public void saveStepOneChanges(WebDriver driver) throws InterruptedException {

		// after add ok text in all fields click on the save button
//				Thread.sleep(1000);
//				saveStep.click();
//				Thread.sleep(3000);
				
				   try {
				    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='save']")));

				            popup.findElement(By.xpath("//button[normalize-space()='save']")).click();
				            
				        } catch (Exception e) {
				            System.out.println("Element not present");
				        }

			}
	
	

	public void selectDateMonth(WebDriver driver) throws InterruptedException 
	{

//		dateDropDown.click();
		driver.findElement(By.cssSelector(".mat-select-arrow")).click();
		Thread.sleep(1000);
//		List<WebElement> allMonthDates = driver
//				.findElements(By.xpath("//div[@id='mat-select-2-panel']//span[@class='mat-option-text']"));

		List<WebElement> allMonthDates = driver.findElements(By.xpath("//mat-option[contains(@class, 'mat-option')]"));

		System.out.println("swwww" + allMonthDates.size());
		for (WebElement currMDate : allMonthDates) {
			String Text_Date = currMDate.getText();
			System.out.println("Text_Date DDD--- " + Text_Date);
			// check for June 23 and select this date for that
			if (Text_Date.equalsIgnoreCase("March-24")) {
				currMDate.click();
				Thread.sleep(5000);
			
				break;
			}

		}
		
	
		   try {
		    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[normalize-space()='1']")));

		            popup.findElement(By.xpath("//li[normalize-space()='1']")).click();
		            
		        } catch (Exception e) {
		            System.out.println("Element not present");
		        }

	}

	
	
	public void uploadGLData(WebDriver driver) throws InterruptedException {
		// This uploading GL - GL Data

		// span[@class='formbold-browse']
		WebElement chooseFile = driver.findElement(By.id("file"));
		chooseFile.sendKeys("C:\\Users\\ADMIN\\eclipse-workspace\\KAT_GST_UIAutomation\\src\\test\\resources\\1GL.csv");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[normalize-space()='Upload']")).click();
		
		  try {
		    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Upload']")));

		            popup.findElement(By.xpath("//button[normalize-space()='Upload']")).click();
		            
		        } catch (Exception e) {
		            System.out.println("Element not present");
		        }

	}

	public void addStepOneRemarks(WebDriver driver) throws InterruptedException {
		
		   try {
		    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text' and @placeholder='Enter Remarks']")));

		    		List<WebElement> allGLInputs = driver
		    				.findElements(By.xpath("//input[@type='text' and @placeholder='Enter Remarks']"));
//		    		Thread.sleep(3000);
		    		System.out.println("all input box size is " + allGLInputs.size());
		    		if (allGLInputs.size() > 0) {
		    			for (WebElement currInput : allGLInputs) {
		    				// sending ok text to every text box
		    				currInput.click();
		    				currInput.sendKeys("ok");
		    				Thread.sleep(500);
		    			}
		    		}		            
		        } catch (Exception e) {
		            System.out.println("Element not present");
		        }
	

	}

	

	public void stepTwoProceed(WebDriver driver) throws InterruptedException {
//		driver.findElement(By.xpath("//button[contains(text(),'Proceed to Compare GL Income & Supply Register Upl')]"))
//				.click();
		
		   try {
		    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Proceed to Compare GL Income & Supply Register Upl')]")));

		            popup.findElement(By.xpath("//button[contains(text(),'Proceed to Compare GL Income & Supply Register Upl')]")).click();
		            
		        } catch (Exception e) {
		            System.out.println("Element not present");
		        }

	}

	public void proceedtoInvoice(WebDriver driver) throws InterruptedException {
//		driver.findElement(By.xpath("//button[normalize-space()='Proceed to E-Invoice Upload']")).click();
//		Thread.sleep(10000);
	
         By ele = By.xpath("//button[normalize-space()='Proceed to E-Invoice Upload']");
         By ele1 = By.xpath("(//li[@class='step ng-star-inserted'])[2]");

   	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		
		   try {
		    	 WebElement intermittentElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(ele));

		    	 intermittentElement .click();		            
		         
		            
		        } 
		   catch (Exception e) {
		            System.out.println("Element not present");
		        }
		   
//		   WebElement alwaysVisibleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(ele1));
//
//		   alwaysVisibleElement.click();	

	}

	public void uploadSupplyRegisterData(WebDriver driver) throws InterruptedException {
		// This uploading GL - GL Data

		// span[@class='formbold-browse']
		WebElement chooseFile = driver.findElement(By.id("file"));
		chooseFile.sendKeys("C:\\Users\\ADMIN\\eclipse-workspace\\KAT_GST_UIAutomation\\src\\test\\resources\\2SR.csv");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Upload']")).click();

	}

	public void stepOneProceed(WebDriver driver) throws InterruptedException 
	{
		   try {
		    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Proceed to Supply Register Upload']")));

		            popup.findElement(By.xpath("//button[normalize-space()='Proceed to Supply Register Upload']")).click();
		            
		        } catch (Exception e) {
		            System.out.println("Element not present");
		        }
	}

	public void proceesedToEInvoice(WebDriver driver) throws InterruptedException {
//		driver.findElement(By.xpath("//button[contains(text(),'Proceed to Compare Control Sheet 1 & E-Invoice Upl')]"))
//				.click();
//		Thread.sleep(10000);
		
		   try {
		    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Proceed to Compare Control Sheet 1 & E-Invoice Upl')]")));

		            popup.findElement(By.xpath("//button[contains(text(),'Proceed to Compare Control Sheet 1 & E-Invoice Upl')]")).click();
		            
		        } catch (Exception e) {
		            System.out.println("Element not present");
		        }

	}

	public void uploadEInvoiceData(WebDriver driver) throws InterruptedException {
		// This uploading E Invoice - E Invoice Data

		WebElement chooseFile = driver.findElement(By.id("file"));
		chooseFile.sendKeys("C:\\Users\\ADMIN\\eclipse-workspace\\KAT_GST_UIAutomation\\src\\test\\resources\\3EInv.csv");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//button[normalize-space()='Upload']")).click();
		   try {
		    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Upload']")));

		            popup.findElement(By.xpath("//button[normalize-space()='Upload']")).click();
		            
		        } catch (Exception e) {
		            System.out.println("Element not present");
		        }
	}

	public void Click_On_Step4(WebDriver driver) throws InterruptedException {
		//Step4.click();
		 try {
	    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='btn btn-success btn-lg ng-star-inserted'])[2]")));

	            popup.findElement(By.xpath("(//button[@class='btn btn-success btn-lg ng-star-inserted'])[2]")).click();
	            
	        } catch (Exception e) {
	            System.out.println("Element not present");
	        }

	}
	

	public void Click_On_Step5(WebDriver driver) throws InterruptedException {
		//Step5.click();
		//li[normalize-space()='5']
		 try {
	    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='btn btn-success btn-lg ng-star-inserted'])[2]")));

	            popup.findElement(By.xpath("(//button[@class='btn btn-success btn-lg ng-star-inserted'])[2]")).click();
	            
	        } catch (Exception e) {
	            System.out.println("Element not present");
	        }
//		 try {
//	    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//	    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[normalize-space()='5']")));
//
//	            popup.findElement(By.xpath("//li[normalize-space()='5']")).click();
//	            
//	        } catch (Exception e) {
//	            System.out.println("Element not present");
//	        }
	}

	public void uploadEWayData(WebDriver driver) throws InterruptedException {
		// This uploading E way - E Way Data

		WebElement chooseFile = driver.findElement(By.id("file"));
		chooseFile.sendKeys("C:\\Users\\ADMIN\\eclipse-workspace\\KAT_GST_UIAutomation\\src\\test\\resources\\4Ew.csv");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[normalize-space()='Upload']")).click();
//		Thread.sleep(10000);
		 try {
	    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Upload']")));

	            popup.findElement(By.xpath("//button[normalize-space()='Upload']")).click();
	            
	        } catch (Exception e) {
	            System.out.println("Element not present");
	        }

	}

	public void proceesedEWayBill(WebDriver driver) throws InterruptedException {
//		driver.findElement(By.xpath("//button[contains(text(),'Proceed to Compare Control Sheet 2 & E-Way Bill Up')]"))
//				.click();
//		Thread.sleep(10000);
		
		 try {
	    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Proceed to Compare Control Sheet 2 & E-Way Bill Up')]")));

	            popup.findElement(By.xpath("//button[contains(text(),'Proceed to Compare Control Sheet 2 & E-Way Bill Up')]")).click();
	            
	        } catch (Exception e) {
	            System.out.println("Element not present");
	        }

	}
	
	public void uploadEWayBillData(WebDriver driver) throws InterruptedException {
		// This uploading E way Bill - E Way Bill Data
		Thread.sleep(100);
		List<WebElement> allMonthDates = driver
				.findElements(By.xpath("//div[@id='mat-select-2-panel']//span[@class='mat-option-text']"));

		for (WebElement currMDate : allMonthDates) {
			String Text_Date = currMDate.getText();
			System.out.println("Text_Date DDD--- " + Text_Date);
			// check for June 23 and select this date for that
			if (Text_Date.equalsIgnoreCase("June-23")) {
				currMDate.click();
				Thread.sleep(1000);
				break;
			}

		}

	}

	

	public void ProceedtoCompareControlSheet2andEWayBillUpload(WebDriver driver) throws InterruptedException {
//		ControlSheet2EWay.click();
//		Thread.sleep(1000);
		
		 try {
	    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Proceed to Compare Control Sheet 2 & E-Way Bill Upload ')]")));

	            popup.findElement(By.xpath("//button[contains(text(),'Proceed to Compare Control Sheet 2 & E-Way Bill Upload ')]")).click();
	            
	        } catch (Exception e) {
	            System.out.println("Element not present");
	        }

	}
	
	public void uploadset1Q1(WebDriver driver) throws InterruptedException {
		// This uploading E way - E Way Data

		WebElement chooseFile = driver.findElement(By.id("file"));
		chooseFile.sendKeys("C:\\Users\\ADMIN\\OneDrive\\Documents\\KAT_GST_ExcelFiles\\Set 1\\Advance-5-Q1.csv");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[normalize-space()='Upload']")).click();
//		Thread.sleep(10000);
		 try {
	    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Upload']")));

	            popup.findElement(By.xpath("//button[normalize-space()='Upload']")).click();
	            
	        } catch (Exception e) {
	            System.out.println("Element not present");
	        }

	}

	public void clickongreenbuttonQ1() throws InterruptedException {
		GreenButtonQ1.click();
		Thread.sleep(500);

	}

	public void ClickQ3Green(WebDriver driver) throws InterruptedException {
		
//		ClickQ3.click();
//		Thread.sleep(500);
		 try {
	    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='mat-ripple mat-tab-label mat-focus-indicator ng-star-inserted'])[2]")));

	            popup.findElement(By.xpath("(//div[@class='mat-ripple mat-tab-label mat-focus-indicator ng-star-inserted'])[2]")).click();
	            
	        } catch (Exception e) {
	            System.out.println("Element not present");
	        }

//		GreenButtonQ1.click();
//		Thread.sleep(1000);
		
		 try {
	    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//label[@class='mat-radio-label'])[1]")));

	            popup.findElement(By.xpath("(//label[@class='mat-radio-label'])[1]")).click();
	            
	        } catch (Exception e) {
	            System.out.println("Element not present");
	        }

	}

	  private static File getMostRecentFile(String dirPath) {
	        File dir = new File(dirPath);
	        File[] files = dir.listFiles();

	        if (files != null && files.length > 0) {
	            // Sort files by last modified date in descending order
	            Arrays.sort(files, Comparator.comparingLong(File::lastModified).reversed());
	            return files[0]; // Most recent file
	        }

	        return null;
	    }
	
	public void UploadandDownloadforQ3(WebDriver driver) throws InterruptedException 
	{
		
		//DownloadFliesQ3.click();
//		Thread.sleep(5000);
		
		 try {
	    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-download fa-lg']")));

	            popup.findElement(By.xpath("//i[@class='fa fa-download fa-lg']")).click();
	            
	        } catch (Exception e) {
	            System.out.println("Element not present");
	        }
		
			Thread.sleep(5000);

			 try {
					String downloadDirPath = "C:\\Users\\ADMIN\\Downloads";
					//System.out.println("The downloadDirPath :"+downloadDirPath);
					File recentFile = getMostRecentFile(downloadDirPath);

					if (recentFile != null) 
					{
						
						WebElement chooseFile = driver.findElement(By.xpath("//input[@type='file']"));


						chooseFile.sendKeys(recentFile.getAbsolutePath());
						System.out.println("The recentFile path :"+recentFile.getAbsolutePath());
					    
					    System.out.println("Succefully Uploaded recent file");
					    }
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();}

//		WebElement chooseFile = driver.findElement(By.xpath("//input[@type='file']"));
//		//WebElement chooseFile =driver.findElement(By.xpath("//button[normalize-space()='Upload']"));
//
//		chooseFile.sendKeys("C:\\Users\\ADMIN\\OneDrive\\Documents\\KAT_GST_ExcelFiles\\Set 1\\Advance-5-Q1.csv");
//		Thread.sleep(3000);
//		//driver.findElement(By.xpath("//button[normalize-space()='Upload']")).click();
//		Thread.sleep(10000);
		
		
	   			Thread.sleep(5000);



	}


	public void ClickStep6(WebDriver driver) throws InterruptedException {
//		Thread.sleep(1000);
//        Step6.click();
//		Thread.sleep(1000);
		//button[@class='btn btn-primary btn-lg']
	
		 try {
	    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-primary btn-lg']")));

	            popup.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']")).click();
	            
	        } catch (Exception e) {
	            System.out.println("Element not present");
	        }
		 

		 try {
	    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='btn btn-success btn-lg ng-star-inserted'])[2]")));

	            popup.findElement(By.xpath("(//button[@class='btn btn-success btn-lg ng-star-inserted'])[2]")).click();
	            
	        } catch (Exception e) {
	            System.out.println("Element not present");
	        }

	}
	
	public void ClickStep7(WebDriver driver) throws InterruptedException {
		
		Step7.click();
		Thread.sleep(500);
		
//		 try {
//	    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//	    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[normalize-space()='7']")));
//
//	            popup.findElement(By.xpath("//li[normalize-space()='7']")).click();
//	            
//	        } catch (Exception e) {
//	            System.out.println("Element not present");
//	        }

	}
	public void Clickonredbuttonasweworkingonset1(WebDriver driver) throws InterruptedException {
//		RedButtonQ3.click();
//		Thread.sleep(500);
		
		 try {
	    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//label[@class='mat-radio-label'])[2]")));

	            popup.findElement(By.xpath("(//label[@class='mat-radio-label'])[2]")).click();
	            
	        } catch (Exception e) {
	            System.out.println("Element not present");
	        }

	}
	
	
	public void uploadLiabilityLedgeronstep7(WebDriver driver) throws InterruptedException {
		// This uploading E way - E Way Data

		WebElement chooseFile = driver.findElement(By.id("file"));
		chooseFile.sendKeys("C:\\Users\\ADMIN\\OneDrive\\Documents\\KAT_GST_ExcelFiles\\Set 1\\Liability Ledger-07.csv");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[normalize-space()='Upload']")).click();
//		Thread.sleep(10000);
		
		 try {
	    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Upload']")));

	            popup.findElement(By.xpath("//button[normalize-space()='Upload']")).click();
	            
	        } catch (Exception e) {
	            System.out.println("Element not present");
	        }

	}
	
	
	public void Click_ToCompareControlsheet3() throws InterruptedException {
		Comparecontrolsheet3.click();
		Thread.sleep(500);

	}
	
	
	public void selectDateMonthSet2(WebDriver driver) throws InterruptedException 
	{

//		dateDropDown.click();
		driver.findElement(By.cssSelector(".mat-select-arrow")).click();
		Thread.sleep(1000);
//		List<WebElement> allMonthDates = driver
//				.findElements(By.xpath("//div[@id='mat-select-2-panel']//span[@class='mat-option-text']"));

		List<WebElement> allMonthDates = driver.findElements(By.xpath("//mat-option[contains(@class, 'mat-option')]"));

		System.out.println("swwww" + allMonthDates.size());
		for (WebElement currMDate : allMonthDates) {
			String Text_Date = currMDate.getText();
			System.out.println("Text_Date DDD--- " + Text_Date);
			// check for June 23 and select this date for that
			if (Text_Date.equalsIgnoreCase("April-24")) {
				currMDate.click();
				Thread.sleep(5000);
			
				break;
			}

		}
		
	
		   try {
		    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[normalize-space()='1']")));

		            popup.findElement(By.xpath("//li[normalize-space()='1']")).click();
		            
		        } catch (Exception e) {
		            System.out.println("Element not present");
		        }

	}
	
	
	public void clickongreenbuttonQ2(WebDriver driver) throws InterruptedException {
		ClickQ2.click();
		Thread.sleep(500);
	
		   
		GreenButtonQ2.click();
		Thread.sleep(1000);
		

	}
	
	public void uploadset2Q2(WebDriver driver) throws InterruptedException {
		// This uploading E way - E Way Data

		WebElement chooseFile = driver.findElement(By.id("file"));
		chooseFile.sendKeys("C:\\Users\\ADMIN\\OneDrive\\Documents\\KAT_GST_ExcelFiles\\Set 2\\Advance -05-Q2.xlsx");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[normalize-space()='Upload']")).click();
//		Thread.sleep(10000);
		
		
		 try {
	    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Upload']")));

	            popup.findElement(By.xpath("//button[normalize-space()='Upload']")).click();
	            
	        } catch (Exception e) {
	            System.out.println("Element not present");
	        }

	}
	
	
	public void ClickQ4Green(WebDriver driver) throws InterruptedException {
		
	
		Thread.sleep(1000);

		GreenButtonQ4.click();
		Thread.sleep(1000);

	

	}
	
	
	public void ClickQ3redbutton(WebDriver driver) throws InterruptedException {
		
//		ClickQ3.click();
//		Thread.sleep(500);
		
		 try {
	    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='mat-ripple mat-tab-label mat-focus-indicator ng-star-inserted'])[2]")));

	            popup.findElement(By.xpath("(//div[@class='mat-ripple mat-tab-label mat-focus-indicator ng-star-inserted'])[2]")).click();
	            
	        } catch (Exception e) {
	            System.out.println("Element not present");
	        }

//		RedButtonQ3.click();
//		Thread.sleep(1000);
		
		 try {
	    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//label[@class='mat-radio-label'])[2]")));

	            popup.findElement(By.xpath("(//label[@class='mat-radio-label'])[2]")).click();
	            
	        } catch (Exception e) {
	            System.out.println("Element not present");
	        }

	}
	
	public void uploadset2Q4(WebDriver driver) throws InterruptedException {
		// This uploading E way - E Way Data

		WebElement chooseFile = driver.findElement(By.id("file"));
		chooseFile.sendKeys("C:\\Users\\ADMIN\\OneDrive\\Documents\\KAT_GST_ExcelFiles\\Set 2\\Advance-05-Q4.xlsx");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[normalize-space()='Upload']")).click();
//		Thread.sleep(10000);
		
		 try {
	    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Upload']")));

	            popup.findElement(By.xpath("//button[normalize-space()='Upload']")).click();
	            
	        } catch (Exception e) {
	            System.out.println("Element not present");
	        }

	}
	
	public void Clickstep6Green() throws InterruptedException {
		
		GreenButtonstep6.click();
		Thread.sleep(1000);


	}
	
	public void uploadset2step6(WebDriver driver) throws InterruptedException {
		// This uploading E way - E Way Data

		WebElement chooseFile = driver.findElement(By.id("file"));
		chooseFile.sendKeys("C:\\Users\\ADMIN\\OneDrive\\Documents\\KAT_GST_ExcelFiles\\Set 2\\Inovoice amendment-06.xlsx");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[normalize-space()='Upload']")).click();
//		Thread.sleep(10000);
		
		 try {
	    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Upload']")));

	            popup.findElement(By.xpath("//button[normalize-space()='Upload']")).click();
	            
	        } catch (Exception e) {
	            System.out.println("Element not present");
	        }
		Thread.sleep(5000);

	}
	
	public void uploadset2step7(WebDriver driver) throws InterruptedException {
		// This uploading E way - E Way Data

		WebElement chooseFile = driver.findElement(By.id("file"));
		chooseFile.sendKeys("C:\\Users\\ADMIN\\OneDrive\\Documents\\KAT_GST_ExcelFiles\\Set 2\\Liability Ledger-07.csv");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[normalize-space()='Upload']")).click();
//		Thread.sleep(10000);
		
		 try {
	    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Upload']")));

	            popup.findElement(By.xpath("//button[normalize-space()='Upload']")).click();
	            
	        } catch (Exception e) {
	            System.out.println("Element not present");
	        }

	}
	
	
	
	
	
	
	
	
	
	
}