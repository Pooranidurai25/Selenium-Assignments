package week3day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Uniquetrainlist {

	public static void main(String[] args) throws InterruptedException
	{

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		driver.findElement(By.id("chkSelectDateOnly")).click();
		WebElement from = driver.findElement(By.id("txtStationFrom"));
		from.clear();
		from.sendKeys("Tambaram", Keys.ENTER);
		
				
		WebElement to = driver.findElement(By.id("txtStationTo"));
		to.clear();
		to.sendKeys("sikkim", Keys.ENTER);
		
		
		Thread.sleep(3000);
		
		List<WebElement> trainname = driver.findElements(By.tagName("Click on train number to View fare and schedule"));
		for (WebElement collection : trainname) 
		{
			String names = collection.getText();
			System.out.println("Train names "+ names);
		}
		
	}

}
