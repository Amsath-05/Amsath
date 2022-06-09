package week5.day1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class learnAlert {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.leafground.com/pages/Alert.html");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
	    driver.switchTo().alert().accept();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
	    driver.switchTo().alert().dismiss();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
	    driver.switchTo().alert().dismiss();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
	    driver.switchTo().alert().sendKeys("jey kee");
	    driver.switchTo().alert().accept();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[text()='Line Breaks?']")).click();
	    String text = driver.switchTo().alert().getText();
	    driver.switchTo().alert().accept();
	    Thread.sleep(2000);
	    System.out.println(text);
	    driver.close();
	    
	}

}
