package testpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Empty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);

		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("lakshit1908@gmail.com");

		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("123456");

		WebElement loginBtn = driver.findElement(By.name("login"));
		loginBtn.click();

	}

}
