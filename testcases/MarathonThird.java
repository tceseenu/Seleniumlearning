package testcases;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MarathonThird {
	@Test
	public  void amazon() throws InterruptedException {
		//Launch Chrome 
		ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//input[@id='twotabsearchtextbox'])[1]")).sendKeys("Bags for b");
		driver.findElement(By.xpath(("(//span[text()='oys'])[1]"))).click();
		Thread.sleep(1000);
		//List<WebElement> searchList = driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));
		//String listVal;
		String text = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
		System.out.println("Total NO of Result :"+text);//
		driver.findElement(By.xpath("(//span[text()='Skybags'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text()='Gear'])")).click();
		driver.findElement(By.className("a-dropdown-prompt")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		String text2 = driver.findElement(By.xpath(("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]"))).getText();
		System.out.println("Name of the Bag :"+text2);
		String text3 = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println("Bag Discount Price :"+text3);
		String title = driver.getTitle();
		System.out.println("Page Title :"+title);
		driver.close();
		
		
		
		
		
	}

}
