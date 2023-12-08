package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
	
	static String companyname="Excelacom";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Enter the Login details
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.linkText("Create Lead")).click();
				driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys(companyname);
				driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Deepa");
				driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Srinivasan");
				driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Sales");
				driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Testing Purpose");
				driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("saravananl@gmail.com");
				Thread.sleep(2000);
				Select drop1=new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
				drop1.selectByVisibleText("Indiana");
				driver.findElement(By.xpath("//input[@name='submitButton']")).click();
				driver.findElement(By.linkText("Edit")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
				
				driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("Edit the values");
				driver.findElement(By.xpath("//input[@value='Update']")).click();
				String title = driver.getTitle();
			  	System.out.println("Page Title :"+title);
			  	Thread.sleep(1000);
			  	driver.close();
				
	}

}
