package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hyperlink {

	public static void main(String[] args)

	{
		// setup chrome driver
		WebDriverManager.chromedriver().setup();

//				launch the browser
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

//				load the url
		driver.get("http://leafground.com/pages/Link.html");

		driver.findElement(By.linkText("Go to Home Page")).click();

		driver.findElement(By.xpath("//img[@alt='Link']")).click();

		WebElement find = driver.findElement(By.linkText("Find where am supposed to go without clicking me?"));
		System.out.println(find.getAttribute("href"));

		WebElement error = driver.findElement(By.partialLinkText("Verify am "));
		error.getAttribute("href");

		driver.findElement(By.xpath("(//a[@link='blue'])[3]")).click();

		driver.findElement(By.xpath("//img[@alt='Link']")).click();

		boolean displayed = driver.findElement(By.partialLinkText("How many links are")).isDisplayed();
		System.out.println(displayed);

	}

}
