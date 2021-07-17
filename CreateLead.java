package week2day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		
		// setup chrome driver
				WebDriverManager.chromedriver().setup();

//				launch the browser
				ChromeDriver driver = new ChromeDriver();

//				load the url
				driver.get("http://leaftaps.com/opentaps/control/main");

				// ENTER THE username
			WebElement username = driver.findElement(By.id("username"));
				username.sendKeys("demosalesmanager");

//				enter the pwd
				WebElement pwd = driver.findElement(By.id("password"));
				pwd.sendKeys("crmsfa");

//				login
				driver.findElement(By.className("decorativeSubmit")).click();

//				get title
				String title = "Leaftaps - TestLeaf Automation Platform";
				String title2 = driver.getTitle();

				// compare the titles
				if (title.equals(title2)) {
					System.out.println("equal");
				} else {
					System.out.println("not equal");
				}
				
//				use link text
//				shld have <a>+textl
				
				driver.findElement(By.linkText("CRM/SFA")).click();
				
//				create lead
				driver.findElement(By.linkText("Create Lead")).click();
				
//				company name
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("SAP");
				
//				firstname
				
				String name = "Ananya";
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys(name);
				
//				lastname
				
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Siva");
//				driver.findElement(By.id("createLeadForm_parentPartyId")).sendKeys("hj");
				driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("local");
				driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("dfd");
				driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("title");
				driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("07/17/2021");
				driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("profile");
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("department");
				driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("123");
				driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("100");
				driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("cD23");
				driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("###");
				driver.findElement(By.id("createLeadForm_description")).sendKeys("a have a good job");
				driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("important");
				WebElement councode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
				councode.clear();
//				maintain gap between actions
				Thread.sleep(2500);
				councode.sendKeys("3");
				driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("600129");
				driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("984509984");
				driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("91");
				driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("sheela");
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("pooranidurai25@gmail.com");
				driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.google.com");
				driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("testleaf");
				driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Kiruba");
				driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("no1 first street");
				driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("m r nagaaaaar");
				driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");
				driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("old");
				driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("200992");
				driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("32");
				
				
				
//				click create lead button
				driver.findElement(By.className("smallSubmit")).click();
				
//				get values of firstname
				
				String firstname = driver.findElement(By.id("viewLead_firstName_sp")).getText();
				System.out.println("firstname " + firstname );
				
				if (name.equals(firstname))
				{
					System.out.println("same");
				}
				
				
				

			}
//
		

	}


