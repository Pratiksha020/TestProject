package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Software\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://growthengineering.co.uk/");
		//driver.manage().window().maximize();
		
		//Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath("//a[text()='Our Products']"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).click().build().perform();
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
