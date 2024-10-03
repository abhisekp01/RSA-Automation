package StepsDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import WebDriverManager.driverManager;
import io.cucumber.java.en.*;

public class spicerStepDefinition {
	
	private WebDriver driver=driverManager.getDriver();

	
	@Given("user is on weekly page of Spicer")
	public void user_is_on_weekly_page_of_spicer() throws InterruptedException {
		
        Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div/div/div[3]/div[2]/div[1]/div/div/img")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div/div/div[3]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div")).click();
		
		Thread.sleep(4000);
		
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div/div/div[3]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div[2]/div/ul/li[8]")).click();
		

		
	    	}

	@Then("I count the total number in Spicer")
	public void i_count_the_total_number_in_spicer() throws InterruptedException {
		
		  Thread.sleep(4000);
		
	       driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[3]/div/div/div[1]/div[1]/div/button/span")).click();
			
			Thread.sleep(4000);
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[3]/div/div/div[1]/div[1]/div/div/div/div/a[1]/div/div[2]/p")).click();
			
	         Thread.sleep(4000);
			
			WebElement text = driver.findElement(By.xpath("//div[@class='found-items']"));
			
	        System.out.println(text.getText());

		
		
	    	}

	@When("I click on products in Spicer market")
	public void i_click_on_products_in_spicer_market() throws InterruptedException {
		
        Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[1]/div[1]/div[1]/div[1]/button/span")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[1]/div[1]/div[1]/div[2]/div/div[1]/div[1]/div[2]/div/div[1]/label")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[1]/div[1]/div[1]/div[2]/div/div[2]/button[2]")).click();
		

		
	    	}

	@And("I count all products in Spicer market")
	public void i_count_all_products_in_spicer_market() throws InterruptedException {
		
		Thread.sleep(4000);
		
        WebElement text = driver.findElement(By.xpath("//div[@class='found-items']"));
		
		System.out.println(text.getText()); 
		
	    
	}

}
