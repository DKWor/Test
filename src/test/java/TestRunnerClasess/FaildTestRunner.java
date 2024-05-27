package TestRunnerClasess;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
 	    
	  	  
features={"@target/failedrerun.txt"},	
glue="StepDefinitions",monochrome = true,
tags="@Hotel_Regression_TestCases or @Hotel_Sanity_TestCases or @Flight_Regression_TestCases or @Flight_Sanity_TestCases",
plugin= {"pretty",
		"rerun:target/failedrerun.txt"
	   	        
                                                                                                                                                                                                                                                                                                              
                                                                                                                                                                                                                                                     	                                                  	                              
}          
) 
public class FaildTestRunner extends AbstractTestNGCucumberTests {

	
}
