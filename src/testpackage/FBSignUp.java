package testpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBSignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		WebElement Signup = driver.findElement(By.xpath("//a[@data-testid=\'open-registration-form-button\']"));
		Signup.click();

				
		WebElement fname = driver.findElement(By.xpath("//input[@name='firstname']"));
		
		fname.sendKeys("Nikita");
		
		WebElement lname = driver.findElement(By.xpath("//input[@name='lastname']"));
		lname.sendKeys("Motwani");
		
		
		WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		email.sendKeys("nikitamotwani@gmailcom");
		
		WebElement pass = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		pass.sendKeys("abcd@123");
		
		
		
		WebElement defaultday= driver.findElement(By.xpath("//select[@title='Day']/option[@selected='1']"));
		System.out.println("Default Date is "+ defaultday.getText());
		
		
		WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
		Select dDay= new Select(day);
	//	dDay.selectByVisibleText("10");
		dDay.selectByValue("22");
		
		
		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		Select Month= new Select(month);
		Month.selectByVisibleText("Feb");
			
		
		WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
		Select yr = new Select(year);
		yr.selectByValue("1995");

		
	//	WebElement gender = driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
		
		
        String Gender = "Female";
		
		/*String dummyXpath = "//label[text()='placeholder']";
		String newXpath = dummyXpath.replace("placeholder", Gender);*/
		
		String newXpath = "//label[text()='" + Gender + "']";
		
		WebElement genderElem = driver.findElement(By.xpath(newXpath));
		genderElem.click();

		
		
	//	WebElement gender = driver.findElement(By.xpath(newXpath));
	//	gender.click();
		
		
			
		List<WebElement> list=driver.findElements(By.xpath("//select[@title='Month']/option"));
		for(WebElement month1:list) {
			System.out.println(month1.getText());

		}
	}

}
