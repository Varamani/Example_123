package TestBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Base {
	
	@Test
	public void setUp()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\eclipse-workspace\\Karim\\src\\main\\resources\\Drivers\\Firefox\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		
		
		driver.findElement(By.name("email")).sendKeys("karim");
		driver.findElement(By.name("pass")).sendKeys("karim");
		
		driver.findElement(By.name("login")).click();
		
	    
	}

}
