package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class createLead {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String text= driver.findElement(By.tagName("h2")).getText();	
		System.out.println(text);
		driver.findElement(By.linkText("CRM/SFA")).click();
		String title =driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Amsath");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Khan");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("25/11/1999");
		driver.findElement(By.id("createLeadForm_currencyUomId")).sendKeys("INR - Indian Rupee");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("870755608");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("amsath786khan@gmail.com");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Jeykishan Nagar");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Madhusudhanapuram");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Kumbakkonam");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("Tamil Nadu");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600001");
		driver.findElement(By.id("createLeadForm_generalCountryGeoId")).sendKeys("India");
		driver.findElement(By.className("smallSubmit")).click();
		
	}

}
