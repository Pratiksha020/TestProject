package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Scenario2 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Software\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.growthengineering.co.uk/contact/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
	    WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("Pratiksha");
		
		Thread.sleep(2000);
		
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("Karande");
		
		Thread.sleep(2000);
		
		WebElement WorkEmail = driver.findElement(By.xpath("//input[@name='email']"));
		WorkEmail.sendKeys("pratikshakarande1999@gmail.com");
		
		Thread.sleep(2000);
		
		WebElement Telephone = driver.findElement(By.xpath("//input[@name='phone']"));
		Telephone.sendKeys("7448107093");
		
		Thread.sleep(2000);
		
		WebElement CompanyName = driver.findElement(By.xpath("//input[@name='company']"));
		CompanyName.sendKeys("Hexaware");
		
		Thread.sleep(2000);
		
		WebElement Country = driver.findElement(By.xpath("//select[@name='country_']"));
		
		Select s1 = new Select(Country);
		s1.selectByVisibleText("India");
		
		Thread.sleep(2000);
		
		WebElement role = driver.findElement(By.xpath("//select[@name='role_description']"));
		
		Select s2 = new Select(role);
		s2.selectByVisibleText("Other");
		
		Thread.sleep(2000);
		
		WebElement enquiry = driver.findElement(By.xpath("//select[@name='what_is_the_purpose_of_your_enquiry_']"));
		
		Select s3 = new Select(enquiry);
		s3.selectByVisibleText("To share how I can help Growth Engineering");
		
		driver.findElement(By.xpath("//label[@class='hs-form-booleancheckbox-display']")).click();		
				
		Thread.sleep(2000);
		driver.close();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
