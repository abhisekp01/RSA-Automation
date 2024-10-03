package StepsDefinition;


import org.junit.AfterClass;
import org.junit.runner.RunWith;

import Hooks1.hooks;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features={
				 
				 "/Users/abhisekpatra/eclipse-workspace/RSA/src/test/resources/tealsMarket",
			
		
		
		},
                       
        glue= {"StepsDefinition","TestHooks","Hooks1"},

		monochrome=true,
		
		plugin={"pretty",
				"html:target/HtmlReports/reports.html",
				"json:target/JSONReports/report.json",
				"junit:target/JUnitReports/report.xml",
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
			}
		
		 )



public class TestRunner {
	
	// This method will run after all tests and close the browser
    @AfterClass
    public static void closeBrowser() {
        hooks.closeBrowserAfterAllTests();
	
	
    }
}
