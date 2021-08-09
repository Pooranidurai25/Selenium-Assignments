package week3day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException

	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");

		driver.manage().window().maximize();

		WebElement search = driver.findElement(By.name("searchVal"));
		search.sendKeys("bags");
		search.sendKeys(Keys.ENTER);

		// driver.findElement(By.xpath("//span[text()='gender']"));
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(2500);

		driver.findElement(By.xpath("//span[text()='category']"));
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();

		System.out.println("Brand");

		// when more number of elements needs to be found,then use findelements by
		List<WebElement> brand = driver.findElements(By.className("brand"));

		for (WebElement list : brand) {
			String text = list.getText();
			System.out.println(text);}
			
			List<WebElement> bagname = driver.findElements(By.className("name"));
			for (WebElement list2 : bagname) 
			{
				String text2 = list2.getText();
				System.out.println(text2);
			}
			
			List<WebElement> itemsfound = driver.findElements(By.className("length"));
			for (WebElement count : itemsfound) 
			{
				String text3= count.getText();
				System.out.println(text3);
			}
			
			
		
		

	}

}
