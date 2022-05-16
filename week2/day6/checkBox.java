package week2.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkBox {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/checkbox.html");
	driver.manage().window().maximize();
	driver.navigate().to("http://www.leafground.com/pages/checkbox.html");
	System.out.println(driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected());
	driver.close();
}
}