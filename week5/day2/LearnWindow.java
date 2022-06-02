package week5.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindow {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.id("home")).click();
		Set<String> childWindow=driver.getWindowHandles();
		List<String>openNewWindow=new ArrayList<String>(childWindow);
		driver.switchTo().window(openNewWindow.get(1));
		
		driver.findElement(By.xpath("//h5[text()='Edit']")).click();
		String title="TestLeaf - Interact with Edit Fields";
		String title2=driver.getTitle();
		if (title.equals(title2)) {
			System.out.println("Switched to another Window");
		}
			else {
				System.out.println("Control not Switched");
			}
		
		driver.switchTo().window(parentWindow);
		
		driver.findElement(By.xpath("//button[text()='Open Multiple Windows']"));
		int size = driver.getWindowHandles().size();
		System.out.println("size"+size);
			
		}
		
	}
