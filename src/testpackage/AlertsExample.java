package testpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
	
		
		
		WebElement element = driver.findElement(By.id("alertButton"));
		JavascriptExecutor object = (JavascriptExecutor) driver;
		object.executeScript("arguments[0].scrollIntoView();",element);

		element.click();
		Thread.sleep(3000);
		
		Alert obj = driver.switchTo().alert();
		Thread.sleep(5000);
		obj.accept(); 
		
		WebElement element1 = driver.findElement(By.id("confirmButton"));
		element1.click();
		
		obj = driver.switchTo().alert();
		Thread.sleep(5000);
		obj.dismiss();
		

		
	}

}
