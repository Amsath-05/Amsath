package week2.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class linkElement {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/Link.html");
	driver.manage().window().maximize();
	System.out.println(driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href"));
	driver.close();
}

}