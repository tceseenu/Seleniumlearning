package week4.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class MarathonFirst {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Hyderabad",Keys.ENTER);
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore",Keys.ENTER);
		driver.findElement(By.xpath("//a[text()='Tomorrow']")).click();
		String text = driver.findElement(By.xpath("(//div[@class='operator-info col s12 m5 l5'])[1]//h5")).getText();
		System.out.println("First Bus Name :"+text);
		String text2 = driver.findElement(By.xpath("//div[@class='text-grey']//small")).getText();
		System.out.println("Available Seats:"+text2);
		driver.findElement(By.xpath("(//button[text()='Show Seats'])[1]")).click();
		driver.findElement(By.xpath("//span[text()='U6']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'container checkbox')])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(("(//div[contains(@class,'container checkbox-container  md ')])[2]"))).click();
		String text3 = driver.findElement(By.xpath("//span[text()='Base Fare :']")).getText();
		System.out.println(text3);
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		


	}

}
