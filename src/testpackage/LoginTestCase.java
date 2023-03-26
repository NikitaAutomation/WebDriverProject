package testpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestCase {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver= new ChromeDriver();
				driver.get("https://www.simplilearn.com/");
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MICROSECONDS);
		
		System.out.println("Get the title "+ driver.getTitle());
		
		
		
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		String location=LoginLink.getAttribute("href");
		System.out.println("The link will take you to "+ location	);
		LoginLink.click();
		
		
		WebElement UserName= driver.findElement(By.name("user_login"));
		UserName.sendKeys("nikita.motwani@theporter.in");
		
		WebElement Password=driver.findElement(By.id("password"));
		Password.sendKeys("ABcduoi12");
		
		WebElement Rememberme= driver.findElement(By.className("rememberMe"));
		Rememberme.click();
	
		WebElement LoginButton=driver.findElement(By.name("btn_login"));
		LoginButton.click();
		
		WebElement error = driver.findElement(By.className("error_msg"));
		String errorMsg = error.getText();
		String expErrorMsg = "The email or password you have entered is invalid.";
		
		if(error.isDisplayed() && errorMsg.equals(expErrorMsg)) {
			
			System.out.println("TC Passed");
		}
		else
		{
			
			System.out.println("TC Failed");
		}
		
		List<WebElement> AllLinks= driver.findElements(By.tagName("a"));
		System.out.println("Total Links "+ AllLinks.size());
		
		for(WebElement link : AllLinks)
		{
			System.out.println(link.getAttribute("href"));
		}
		
		
		
		
		driver.close();
	}

}
