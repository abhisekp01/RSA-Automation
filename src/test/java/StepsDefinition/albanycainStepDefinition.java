package StepsDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import WebDriverManager.driverManager;
import io.cucumber.java.en.*;

public class albanycainStepDefinition {
	
	private WebDriver driver=driverManager.getDriver();
	
	@Given("^user is on weekly page of albanycain location$")
	public void user_is_on_weekly_page_of_albanycain_location() throws InterruptedException {
		
              
		
		driver.get("https://www.cainsfamilymarket.com");
	
	
	
		
		Thread.sleep(5000);
		
         driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[2]/div/div[2]/div[2]/div/div[2]/div[3]/button/span")).click();
		
		
			    
	}

	@Then("^I count the total number in albanycain$")
	public void i_count_the_total_number_in_albanycain() throws InterruptedException {

		
		
        Thread.sleep(5000);
		
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[1]/div/button/span")).click();

        Thread.sleep(5000);
        
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[1]/div/div/div/div/a[1]/div/div[2]/p")).click();
		
		Thread.sleep(5000);
		
		WebElement text = driver.findElement(By.xpath("//div[@class='found-items']"));
		
        System.out.println(text.getText());
        
        		
	    
	}
	
	@When("^I click on products in albanycain market$")
	public void i_click_on_products_in_albanycain_market() throws InterruptedException {
		
		Thread.sleep(6000);
		
		WebElement drop = driver.findElement(By.xpath("//img[@alt='DownIcon']"));
		
		drop.click();
		
		Thread.sleep(6000);
		 WebElement option1 = driver.findElement(By.xpath("//li[text()='Products']"));
		
		 option1.click();
	    
	}

	@And("^I count all products in albanycain market$")
	public void i_count_all_products_in_albanycain_market() throws InterruptedException {
		
        Thread.sleep(6000);
		
        WebElement text = driver.findElement(By.xpath("//div[@class='found-items']"));
		
		System.out.println(text.getText());
		
	     

		
		
	    	}

	
	

}
