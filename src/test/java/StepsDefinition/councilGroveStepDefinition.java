package StepsDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import WebDriverManager.driverManager;
import io.cucumber.java.en.*;

public class councilGroveStepDefinition {
	
	private WebDriver driver=driverManager.getDriver();

	
	@Given("user is on weekly page of CouncilGrove")
	public void user_is_on_weekly_page_of_council_grove() throws InterruptedException {
		
        Thread.sleep(5000);
		
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[2]/div/div[2]/div")).click();
		
		WebElement drop = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[2]/div/div[2]/div[2]/div/div[2]/div[2]/div"));
		  
		
		drop.click();
		
		Thread.sleep(5000);
		
		WebElement option = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[2]/div/div[2]/div[2]/div/div[2]/div[2]/div/div[2]/div/ul/li[3]"));

		option.click();
		
	    
	}

	@Then("I count the total number in CouncilGrove")
	public void i_count_the_total_number_in_council_grove() throws InterruptedException {
		
		
        Thread.sleep(5000);
		
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[1]/div/button/span")).click();

        Thread.sleep(5000);
        
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[1]/div/div/div/div/a[1]/div/div[2]/p")).click();
		
		Thread.sleep(5000);
		
		WebElement text = driver.findElement(By.xpath("//div[@class='found-items']"));
		
        System.out.println(text.getText());
	    
	}

	@When("I click on products in CouncilGrove market")
	public void i_click_on_products_in_council_grove_market() throws InterruptedException {
		
         Thread.sleep(5000);
		
		WebElement drop = driver.findElement(By.xpath("//img[@alt='DownIcon']"));
		
		drop.click();
		
		Thread.sleep(5000);
		 WebElement option1 = driver.findElement(By.xpath("//li[text()='Products']"));
		
		 option1.click();

		
	    	}

	@And("I count all products in CouncilGrove market")
	public void i_count_all_products_in_council_grove_market() throws InterruptedException {
		
		
       Thread.sleep(5000);
		
        WebElement text = driver.findElement(By.xpath("//div[@class='found-items']"));
		
		System.out.println(text.getText());

	    
	}


}
