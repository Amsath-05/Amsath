package week5.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");
		WebElement brands = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions act= new Actions(driver);
		act.moveToElement(brands).perform();
		driver.findElement(By.linkText("L'Oreal Paris")).click();
		String title = driver.getTitle();
		if (title.contains("L'Oreal Paris")) {
			System.out.println("Page name is correct");
		}
		else {
			System.out.println("Incorrect page name");
		}
		
	}

}