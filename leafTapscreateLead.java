package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class leafTapscreateLead {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
	    driver.get("http://leaftaps.com/opentaps/control/main");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      
	 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	 driver.findElement(By.id("password")).sendKeys("crmsfa");
	 driver.findElement(By.className("decorativeSubmit")).click();
	 driver.findElement(By.linkText("CRM/SFA")).click();
	 driver.findElement(By.linkText("Leads")).click();
	 driver.findElement(By.linkText("Create Lead")).click();
	 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Amsath");
	 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Khan");
	 WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
	 Select src = new Select(source);
	 src.selectByVisibleText("Employee");
	 WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
	 Select ind = new Select(industry);
	 ind.selectByIndex(2);
	 WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	 Select own= new Select(ownership);
	 own.selectByValue("OWN_CCORP");
	 WebElement marketing= driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	 Select mar=new Select(marketing);
	 mar.selectByVisibleText("Automobile");
	 WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
	 Select cntry=new Select(country);
	 cntry.selectByVisibleText("India");
	 WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	 Select	st = new Select(state);
	 st.selectByVisibleText("TAMILNADU");
	 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Amsa");
	 driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("BE");
	 driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Lead");
	 driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("30000");
	 driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("20");
	 driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("25/11/1999");
	 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("ECE");
	 driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("khan");
	 driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
	 driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("600001");
	 driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("044");
	 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("amsath786khan@gmail.com");
	 driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8270755608");
	 driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("MUgil");
	 driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("leaftaps.com");
	 driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Madhu");
	 driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("JeeKee");
	 driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Testleaf(new)");
	 driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("college road");
	 driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Navalur");
	 driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600001");
	 driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("225");
	 driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("AUTOMATION");
	 driver.findElement(By.id("createLeadForm_description")).sendKeys("Software Test Engineer");
	 driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Ben");
	 driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("$");
	 String firstname = driver.findElement(By.className("inputBox")).getText();
	 System.out.println(firstname);
	 driver.findElement(By.name("submitButton")).click();
	 driver.close();
}
}