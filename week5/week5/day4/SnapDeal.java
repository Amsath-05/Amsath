package week5.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();
	driver.get("https://www.snapdeal.com/");
	WebElement mens = driver.findElement(By.xpath("(//span[@class='catText'])[1]"));
	Actions act= new Actions(driver);
	act.moveToElement(mens).perform();
	//WebElement count = driver.findElement(By.xpath("//div[text()='4066']"));
	//String text = count.getText();
	//System.out.println(text);
	driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
	String title = driver.getTitle();
	System.out.println(title);
	String title1="Sports Shoes For Men - Upto 70% OFF on Top Shoe Brands";
	if (title==title1) {
		System.out.println("correct title");
	}
	else {
		System.out.println("incorrect title");
	}

	
}
}