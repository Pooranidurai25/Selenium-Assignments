package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonPage {

	public static void main(String[] args) 
	
	{
		// setup chrome driver
				WebDriverManager.chromedriver().setup();

//						launch the browser
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();

//						load the url
				driver.get("http://leafground.com/pages/Button.html");
				
				driver.findElement(By.id("home")).click();
				
				driver.findElement(By.xpath("//img[@alt='Buttons']")).click();
				
				WebElement a = driver.findElement(By.xpath("//button[text()='Get Position']"));
				System.out.println(a.getLocation());


				WebElement colour = driver.findElement(By.id("color"));
				
				System.out.println(colour.getAttribute("style"));
				
				WebElement size = driver.findElement(By.id("size"));	
				System.out.println(size.getSize());
				
	}

}
