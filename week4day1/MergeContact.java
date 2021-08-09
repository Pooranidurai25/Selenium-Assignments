package week4day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args)
	
	{
WebDriverManager.chromedriver().setup();
ChromeDriver driver =new ChromeDriver();

driver.get("http://leaftaps.com/opentaps/control/login");

driver.manage().window().maximize();

driver.findElement(By.id("username")).sendKeys("demosalesmanager");

driver.findElement(By.id("password")).sendKeys("crmsfa");

driver.findElement(By.className("decorativeSubmit")).click();

driver.findElement(By.linkText("CRM/SFA")).click();

driver.findElement(By.linkText("Contacts")).click();

driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();

driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[1]")).click();

// get into the next window

Set<String> findcontact = driver.getWindowHandles();

System.out.println(findcontact.size());

// for each

for (String handles : findcontact) 
{
	System.out.println(handles);
}

// Step 2: Move the Set of window handles into a list so that each of the window handle
//         can be accessed using the index value which is not possible with the set

List <String>winlist =new ArrayList<String>(findcontact);
winlist.get(1);

// Switch the control to the specific window by selecting the required window handle
driver.switchTo().window(winlist.get(1));
System.out.println(driver.getTitle());

driver.findElement(By.xpath("(//a[text()='DemoCustomer'])[1]")).click();

driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();






	}

}
