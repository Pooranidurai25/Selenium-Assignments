package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditFields {

	public static void main(String[] args) {

		// setup chrome driver
		WebDriverManager.chromedriver().setup();

//				launch the browser
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

//				load the url
		driver.get("http://leafground.com/pages/Edit.html");

		driver.findElement(By.id("email")).sendKeys("pooranidurai25@gmail.com");

		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("value");

		 WebElement a1 = driver.findElement(By.name("username"));
		 //String one = a1.getText();
		 System.out.println(a1.getText());
	

		WebElement a2 = driver.findElement(By.xpath("//input[@value='Clear me!!']"));
		a2.clear();
		a2.sendKeys("sudhahar");
		
		boolean confirm = driver.findElement(By.xpath("//label[text()='Confirm that edit field is disabled']")).isEnabled();
		System.out.println(confirm);
		
	}

}
