package week5.day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicXpath {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement from = driver.findElement(By.id("txtStationFrom"));
		from.clear();
		from.sendKeys("MAS",Keys.ENTER);
		
		WebElement to = driver.findElement(By.id("txtStationTo"));
		to.clear();
		to.sendKeys("KMU",Keys.ENTER);
		
		driver.findElement(By.id("chkSelectDateOnly")).click();
	
				
 				
		

}}
