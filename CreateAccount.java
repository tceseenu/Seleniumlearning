package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://leaftaps.com/opentaps/control/main");
		  driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		  driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click the "Login" button.
		  driver.findElement(By.className("decorativeSubmit")).click();
		//CRM/SFA-Click on the "CRM/SFA" link.
		  driver.findElement(By.linkText("CRM/SFA")).click();
		//Accounts-Click on the "Accounts" tab.
		  driver.findElement(By.linkText("Accounts")).click();
		//- Click on the "Create Account" button.
		  driver.findElement(By.linkText("Create Account")).click();
		//Enter an account name.
		  driver.findElement(By.id("accountName")).sendKeys("Srinivasan");
		//- Enter a description as "Selenium Automation Tester."
		  driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		//- Select "ComputerSoftware" as the industry.
		
		  Select dropDownText= new Select(driver.findElement(By.name("industryEnumId")));
		  dropDownText.selectByVisibleText("Computer Software");
		
		//- Select "S-Corporation" as ownership using SelectByVisibleText.
		
		  Select dropDownText1=new Select(driver.findElement(By.name("ownershipEnumId")));
		  dropDownText1.selectByVisibleText("S-Corporation");
		
		//- Select "Employee" as the source using SelectByValue.
		  Select dropDownText2=new Select(driver.findElement(By.id("dataSourceId")));
		   dropDownText2.selectByVisibleText("Employee");
		
		//- Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
		  Select dropDownText3=new Select(driver.findElement(By.id("marketingCampaignId")));
		  dropDownText3.selectByVisibleText("eCommerce Site Internal Campaign");
		
		//- Select "Texas" as the state/province using SelectByValue.
		  Select dropDownText4=new Select(driver.findElement(By.id("generalStateProvinceGeoId")));
		  dropDownText4.selectByVisibleText("Texas");
		
		//- Click the "Create Account" button.
		  	driver.findElement(By.className("smallSubmit")).click();
		
		/*- Verify that the account name is displayed correctly.
		  String AccName="Srinivasan";
		  String test="";
		  test=driver.findElement(By.className("tabletext")).getText();
		  System.out.println(test);
		 System.out.println(AccName);*/
			
		//- Close the browser window.
		 driver.close();
		  	


	}

}
