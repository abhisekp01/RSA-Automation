package WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverManager {
	
	private static WebDriver driver;

    // Private constructor to prevent instantiation
    private driverManager() {}

    // Singleton instance of WebDriver
    public static WebDriver getDriver() {
        if (driver == null) {
            // Set the path to the WebDriver executable (adjust path as necessary)
            System.setProperty("webdriver.chrome.driver", "/Users/abhisekpatra/eclipse-workspace/RSA/Driver/chromedriver");

            // Initialize the WebDriver
            driver = new ChromeDriver();

            

            // Maximize browser window
            driver.manage().window().maximize();
        }
        return driver;
    }

    // Method to close the browser
    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}
