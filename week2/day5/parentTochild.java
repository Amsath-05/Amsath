package week2.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parentTochild {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver  driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//p[@class='top']/input[@class='inputLogin']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//label[text()='Password']/following-sibling::input")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']/..")).click();
	}

}
