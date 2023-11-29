package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class CreateLead {

	public static void main(String[] args) {
		///setup the path and launch chrome browser
		// Instation(object) creation for Chromer Driver class 
		ChromeDriver driver=new ChromeDriver();
		//Maximize the Browser
		driver.manage().window().maximize();
		//Launch the Browser
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Enter the Login details
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("FSS");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Srinivasan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Pichaimuthu");
		driver.findElement(By.name("submitButton")).click();
				System.out.println("Lead Created successfully");
				
				
	}

}
