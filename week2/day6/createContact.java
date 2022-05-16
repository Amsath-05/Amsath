package week2.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class createContact{
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
    driver.findElement(By.className("decorativeSubmit")).click();
    driver.findElement(By.xpath("//a[contains(text(),' CRM/SFA')]")).click();
    driver.findElement(By.linkText("Contacts")).click();
    driver.findElement(By.linkText("Create Contact")).click();
    driver.findElement(By.id("firstNameField")).sendKeys("Akash");
    driver.findElement(By.id("lastNameField")).sendKeys("Surendhar");
    driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("jey kee");
    driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Madhu");
    driver.findElement(By.id("createContactForm_departmentName")).sendKeys("software");
    driver.findElement(By.id("createContactForm_description")).sendKeys("Best software company");
    driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("salman51719@gmail.com");
    WebElement findElement = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
    Select se=new Select(findElement);
    se.selectByVisibleText("New York");
    driver.findElement(By.name("submitButton")).click();
    
    
}
}