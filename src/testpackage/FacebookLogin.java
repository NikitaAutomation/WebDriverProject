package testpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FacebookLogin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver");

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MICROSECONDS);
		
		
		WebElement UserName= driver.findElement(By.name("email"));
		UserName.sendKeys("abc@gmail.com");
		
		WebElement Password= driver.findElement(By.id("pass"));
		Password.sendKeys("abhgy@18");
			
		
		
		WebElement LoginLink = driver.findElement(By.name("login"));
		LoginLink.click();
		
		
		
		
	}

}
