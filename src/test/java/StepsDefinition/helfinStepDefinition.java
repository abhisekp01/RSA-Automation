package StepsDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import WebDriverManager.driverManager;
import io.cucumber.java.en.*;

public class helfinStepDefinition {
	
	private WebDriver driver=driverManager.getDriver();

	

@Given("user is on all products page of Heflin")
public void user_is_on_all_products_page_of_heflin() throws InterruptedException {
	
	driver.get("https://www.wmgrocery.com");
	
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[2]/div/div[2]/div[2]/div/div[2]/div[3]/button/span")).click();
	
	Thread.sleep(5000);
	
	WebElement drop = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[2]/div/div[1]/div/div[1]/img"));
	
	drop.click();
	
	Thread.sleep(5000);
	
	
	WebElement option = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[2]/div/div[1]/div/div[1]/div/div/ul/li[1]"));
	
	option.click();
    
}



@And("I count the total number in Heflin")
public void i_count_the_total_number_in_heflin() throws InterruptedException {
	
	Thread.sleep(5000);
	
    WebElement text = driver.findElement(By.xpath("//div[@class='found-items']"));
	
	System.out.println(text.getText());

	
	
	
    }

	
	

}
