package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAccountCreation {

	public static void main(String[] args) {
		// - Initialize ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		//- Maximize the browser window
		driver.manage().window().maximize();
		//Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
		//- Click on the Create new account button.
		driver.findElement(By.linkText("Create new account")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//- Enter the First name.-		firstname
		driver.findElement(By.name("firstname")).sendKeys("tvpichai");
		//- Enter the Surname.-lastname
		driver.findElement(By.name("lastname")).sendKeys("tavaiyapuri");
		//- Enter the Mobile number or email address.-reg_email__
		driver.findElement(By.name("reg_email__")).sendKeys("tvpichai@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("tvpichai@gmail.com");
		//- Enter the New password.-password_step_input
		driver.findElement(By.id("password_step_input")).sendKeys("Tvpichai@123");
		//- Handle all three dropdowns in Date of birth -day,month,year
		Select dateOn=new Select(driver.findElement(By.id("day")));
		dateOn.selectByValue("5");
		
		Select monthOf= new Select(driver.findElement(By.id("month")));
		monthOf.selectByValue("6");
		
		Select yearOf=new Select(driver.findElement(By.id("year")));
		yearOf.selectByValue("1980");
		//- Select the radio button in Gender-male
		driver.findElement(By.xpath("//*[contains(text(),'Male')]")).click();
		
	

	}

}
