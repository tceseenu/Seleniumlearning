package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("bags", Keys.ENTER);
		driver.findElement(By.xpath("(//label[contains(@class,'facet-linkname-Men')])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		//Total Count of Bags
				Thread.sleep(3000);
				String text = driver.findElement(By.xpath("//div[@class='length']/strong")).getText();
				System.out.println(text);
		List<WebElement> count = driver.findElements(By.xpath("(//div[@class='brand']/strong)"));
		List<String> brands = new ArrayList<String>();
		for (int i = 0; i < count.size(); i++) {
			String brandName = count.get(i).getText();
			// System.out.println(brandName);
			brands.add(brandName);
		}
		// System.out.println(brands);
		Collections.sort(brands);
		System.out.println(brands);

		List<WebElement> bags = driver.findElements(By.xpath("//div[@class='nameCls']"));
		List<String> bagNames = new ArrayList<String>();
		for (int j = 0; j < bags.size(); j++) {
			String bagNa = bags.get(j).getText();
			bagNames.add(bagNa);
		}
		// System.out.println(bagNames);
		Collections.sort(bagNames);
		System.out.println(bagNames);
	}
}
