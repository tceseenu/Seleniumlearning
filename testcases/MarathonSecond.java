package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MarathonSecond {
@Test
	public void pvrCinimas() throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(opt);
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//img[@alt='Chennai']")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("nav-icon")).click();
		driver.findElement(By.xpath("//a[text()='Movie Library']")).click();
		WebElement city = driver.findElement(By.name("city"));
		Select drop1=new Select(city);
		drop1.selectByVisibleText("Chennai");
		Thread.sleep(1000);
		WebElement test = driver.findElement(By.name("genre"));
		Select drop2=new Select(test);
		drop2.selectByVisibleText("ANIMATION");
		Thread.sleep(1000);
		WebElement language = driver.findElement(By.name("lang"));
		Select drop3=new Select(language);
		drop3.selectByVisibleText("ENGLISH");
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//div[@class='movie-list']//img[1]")).click();
		driver.findElement(By.xpath("//div[@class='movie-wrapper ng-star-inserted']//img")).click();
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		WebElement cName = driver.findElement(By.id("cinemaName"));
		Select drop4= new Select(cName);
		drop4.selectByVisibleText("PVR Velachery Chennai");
		driver.findElement(By.xpath("//div[@class='datepicker-container datepicker-default']//input[1]")).click();
		driver.findElement(By.xpath("//span[text()='23']")).click();
		//WebElement sTime = ;
		Select drop5=new Select(driver.findElement(By.name("timings")));
		drop5.selectByValue("03:00 PM - 06:00 PM");
		driver.findElement(By.name("noOfTickets")).sendKeys("5",Keys.ENTER);
		driver.findElement(By.name("name")).sendKeys("Srinivasan",Keys.ENTER);
		driver.findElement(By.xpath("//label[text()='Name']/following::input")).sendKeys("tceseenu@gmail.com",Keys.ENTER);
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9884966332",Keys.ENTER);
		Select drop6=new Select(driver.findElement(By.name("food")));
		drop6.selectByIndex(0);
		driver.findElement(By.xpath("//input[@name='comment']")).sendKeys("For booking Ticket",Keys.ENTER);
		WebElement ele1 = driver.findElement(By.xpath("//span[text()='Copy To Self']"));
		driver.executeScript("arguments[0].click();", ele1);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[text()='SEND REQUEST']"))));
		//driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		//WebElement ele2 = driver.findElement(By.xpath("(//button[text()='CANCEL'])[1]"));
		//driver.executeScript("arguments[0].click();", ele2);
		driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
		driver.findElement(By.className("swal2-close")).click();
		String title = driver.getTitle();
		System.out.println("Page Title is :"+title);
	}

}
