package week5.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class WindowsAssignment extends BaseClass{
  @Test
  public void windowsHandles() throws InterruptedException {
	  driver.findElement(By.xpath("//a[text()='Contacts']")).click();
	  driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
	  driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
	  Set<String> windowHandles = driver.getWindowHandles();
	  List<String> lstname= new ArrayList<String>(windowHandles);
	  driver.switchTo().window(lstname.get(1));
	  System.out.println(driver.getTitle());
	  driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
	  Thread.sleep(1000);
	  driver.switchTo().window(lstname.get(0));
	  driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	  Set<String> WindowHandles2=	driver.getWindowHandles();
	  List<String>  lstwindow2 = new ArrayList<String>(WindowHandles2);
      driver.switchTo().window(lstwindow2.get(1));
      driver.findElement(By.xpath("(//a[@class='linktext'])[5]")).click();
      driver.switchTo().window(lstname.get(0));
      driver.findElement(By.xpath("//a[text()='Merge']")).click();
      Alert alert1= driver.switchTo().alert();
      alert1.accept();
     // String title = driver.getTitle();
     System.out.println("Browser Title:"+ driver.getTitle());
      
	  
	 
	 
	  
	  
	  
  }
}
