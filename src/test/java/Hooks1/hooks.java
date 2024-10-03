package Hooks1;

import org.openqa.selenium.WebDriver;

import WebDriverManager.driverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	
	private static WebDriver driver;

	// Flag to ensure the browser is only started once
    private static boolean isBrowserStarted = false;

    // Runs before any test, starts the browser if not already started
    @Before
    public void setUp() {
        if (!isBrowserStarted) {
            
            driver = driverManager.getDriver();  // Start the browser
            isBrowserStarted = true;  // Set the flag to true so browser isn't restarted
        }
    }

    // Runs after all tests, closes the browser once
    @After
    public static void tearDown() {
        // Optionally, you can handle browser closing after all features, or here if needed.
    	
    
    }
    
    

    // Use this method to close the browser after all tests are done
    public static void closeBrowserAfterAllTests() {
        System.out.println("Closing browser instance after all tests...");
        driverManager.closeDriver();  // Close the browser
    }
	

}
