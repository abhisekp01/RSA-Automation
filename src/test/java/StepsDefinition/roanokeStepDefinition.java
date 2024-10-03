package StepsDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import WebDriverManager.driverManager;
import io.cucumber.java.en.*;

public class roanokeStepDefinition {
	
	private WebDriver driver=driverManager.getDriver();

	
	@Given("user is on all products page of Roanoke")
	public void user_is_on_all_products_page_of_roanoke() throws InterruptedException {
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[2]/div/div[2]/div/div/img")).click();
		
		Thread.sleep(4000);
		
		WebElement drop = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[2]/div/div[2]/div[2]/div/div[2]/div[2]/div"));
		
		drop.click();
		
		Thread.sleep(5000);
		
		WebElement option = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[2]/div/div[2]/div[2]/div/div[2]/div[2]/div/div[2]/div/ul/li[2]"));
		
		option.click();
		
		Thread.sleep(4000);
		
		WebElement products = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[2]/div/div[1]/div/div[1]/img"));
		
		products.click();
		
		Thread.sleep(4000);
		
		WebElement productsDrop = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[2]/div/div[1]/div/div[1]/div/div/ul/li[1]"));
		
		
		productsDrop.click();
		
	    	}

	@And("I count the total number in Roanoke")
	public void i_count_the_total_number_in_roanoke() throws InterruptedException {
		
        Thread.sleep(5000);
		
	    WebElement text = driver.findElement(By.xpath("//div[@class='found-items']"));
		
		System.out.println(text.getText());

		
	    
	}

}
