package week2.day3;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class navigate {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.facebook.com/login/");
	driver.manage().window().maximize();
	driver.navigate().to("http://leaftaps.com/opentaps/control/login");
	driver.navigate().forward();
	driver.navigate().back();
	driver.navigate().refresh();
}

}