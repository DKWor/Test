package StepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import BaseClass.BaseClass;
import PageObjectClass.POM_Hotel_Exceldata;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.sourceforge.tess4j.TesseractException;
import utils.CommonMethodes;
import utils.ExcelReader;

public class SD_Hotel_Excel extends BaseClass {

	POM_Hotel_Exceldata HOME;
	ExcelReader reder;
	List<Map<String, String>> testData;
	public int row;

	@Given("User is on KAT GST Login Page with the {string} environment")
	public void userIsOnElevateTripLandingPageforHotelbooking(String env) throws InterruptedException, IOException {

		LounchBrowser(env);
	}

	@When("User SighnIn with username and password for Hotel Booking")
	public void userLoginforHotel() throws InterruptedException, IOException, TesseractException {

		HOME = new POM_Hotel_Exceldata(driver);
		HOME.Pass_Mobile_NO(driver, CommonMethodes.readDataFromPropertyFile("username1"));
		HOME.pass_pass(CommonMethodes.readDataFromPropertyFile("pass1"));
		HOME.Click_Sigh_in();
	}

	@Then("User click on GSTR1")
	public void UserclickonGSTR1() throws InterruptedException, IOException, TesseractException {

		HOME.Click_ON_GSTR1(driver);

	}

	@Then("User click on GSTR1 File Upload")
	public void UserclickonGSTR1FileUpload() throws InterruptedException, IOException, TesseractException {

		HOME.Click_GSTR1FileUpload(driver);

	}

	@Then("User click on step1")
	public void Userclickonstep1() throws InterruptedException, IOException, TesseractException {

		HOME.Click_On_Step1(driver);

	}

	@And("User select the date")
	public void Userselectthedate() throws InterruptedException, IOException, TesseractException {

		HOME.selectDateMonth(driver);

	}

	@Then("User Upload the GL Income sheet")
	public void UserUploadtheGLIncomesheet() throws InterruptedException, IOException, TesseractException {
		HOME.uploadGLData(driver);
	}

	@Then("User add remarks")
	public void addStepOneRemarks() throws InterruptedException, IOException, TesseractException {
		HOME.addStepOneRemarks(driver);
	}

	@Then("User save the changes")
	public void saveStepOneChanges() throws InterruptedException, IOException, TesseractException {
		HOME.saveStepOneChanges(driver);
	}

	@Then("user proceed step one")
	public void proceedToOneStep() throws InterruptedException, IOException, TesseractException {
		HOME.stepOneProceed(driver);
	}

	@Then("user upload SR file in step two")
	public void UserUploadtheSRsheet() throws InterruptedException, IOException, TesseractException {
		HOME.uploadSupplyRegisterData(driver);
	}

	@Then("user proceed for next step two")
	public void proceedTwoStep() throws InterruptedException, IOException, TesseractException {
		HOME.stepTwoProceed(driver);
	}

	@Then("user click on proceed to invoice button")
	public void proceedtoInvoice() throws InterruptedException, IOException, TesseractException {
		HOME.proceedtoInvoice(driver);
	}

	@Then("user upload E invoice file in step three")
	public void uploadEInvoiceData() throws InterruptedException, IOException, TesseractException {
		HOME.uploadEInvoiceData(driver);
	}

	@Then("user proceed step three")
	public void proceedThreeStep() throws InterruptedException, IOException, TesseractException {
		HOME.proceesedToEInvoice(driver);
	}

	@Then("user click on step4")
	public void gotToFourthStep() throws InterruptedException, IOException, TesseractException {
		HOME.Click_On_Step4(driver);
	}

	@And("user upload Eway fiel on step4")
	public void uploadEWayData() throws InterruptedException, IOException, TesseractException {
		HOME.uploadEWayData(driver);
	}

	@Then("user proceed step four")
	public void userproceedstepfour() throws InterruptedException, IOException, TesseractException {
		HOME.ProceedtoCompareControlSheet2andEWayBillUpload(driver);
	}
	
	
	@Then("user click on step5")
	public void userclickonstep5() throws InterruptedException, IOException, TesseractException {
		HOME.Click_On_Step5(driver);
	}
	
	
	@And("click on green button Q1")
	public void clickongreenbuttonQ1() throws InterruptedException, IOException, TesseractException {
		HOME.clickongreenbuttonQ1();
	}
	
	@And("user upload Eway fiel on step5 Q1")
	public void useruploadEwayfielonstep5Q1() throws InterruptedException, IOException, TesseractException {
		HOME.uploadset1Q1(driver);
	}
	
	@Then("click on green button Q3")
	public void clickongreenbuttonQ3() throws InterruptedException, IOException, TesseractException {
		HOME.ClickQ3Green(driver);
	}
	
	@And("user upload Eway fiel on step5 Q3")
	public void useruploadEwayfielonstep5Q3() throws InterruptedException, IOException, TesseractException {
		HOME.UploadandDownloadforQ3(driver);
	}
	
	@Then("user click on step6")
	public void userclickonstep6() throws InterruptedException, IOException, TesseractException {
		HOME.ClickStep6(driver);
	}
	
	
	@And("User click on red button as we working on set1")
	public void Userclickonredbuttonasweworkingonset1() throws InterruptedException, IOException, TesseractException {
		HOME.Clickonredbuttonasweworkingonset1(driver);
	}
	
	
	@Then("user click on step7")
	public void userclickonstep7() throws InterruptedException, IOException, TesseractException {
		HOME.ClickStep7(driver);
	}
	
	
	@And("user upload Liability Ledger  on step7")
	public void useruploadLiabilityLedgeronstep7() throws InterruptedException, IOException, TesseractException {
		HOME.uploadLiabilityLedgeronstep7(driver);
	}
	
	@Then("User click on compare control sheet 3")
	public void Userclickoncomparecontrolsheet3() throws InterruptedException, IOException, TesseractException {
		HOME.Click_ToCompareControlsheet3();
	}
	
	@And("User select the date for set2")
	public void Userselectthedateforset2() throws InterruptedException, IOException, TesseractException {
		HOME.selectDateMonthSet2(driver);
	}
	
	@And("click on green button Q2")
	public void clickongreenbuttonQ2() throws InterruptedException, IOException, TesseractException {
		HOME.clickongreenbuttonQ2(driver);
	}
	
	@And("user upload Eway fiel on step5 Q2")
	public void useruploadEwayfielonstep5Q2() throws InterruptedException, IOException, TesseractException {
		HOME.uploadset2Q2(driver);
	}
	
	@And("click on green button Q4")
	public void clickongreenbuttonQ4() throws InterruptedException, IOException, TesseractException {
		HOME.ClickQ4Green(driver);
	}
	
	@And("click on red button Q3")
	public void clickonredbuttonQ3() throws InterruptedException, IOException, TesseractException {
		HOME.ClickQ3redbutton(driver);
	}
	
	@And("user upload Eway fiel on step5 Q4")
	public void useruploadEwayfielonstep5Q4() throws InterruptedException, IOException, TesseractException {
		HOME.uploadset2Q4(driver);
	}
	
	@Then("User click on greed button step6")
	public void Userclickongreenbuttonstep6() throws InterruptedException, IOException, TesseractException {
		HOME.Clickstep6Green();
	}
	
	@Then("Invoice Amendment Upload here")
	public void InvoiceAmendmentUploadhere() throws InterruptedException, IOException, TesseractException {
		HOME.uploadset2step6(driver);
	}
	
	@And("user upload Liability Ledger set2 on step7")
	public void useruploadLiabilityLedgerset2onstep7() throws InterruptedException, IOException, TesseractException {
		HOME.uploadset2step7(driver);
	}
	
	
	
	
}