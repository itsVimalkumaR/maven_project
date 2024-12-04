import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().driverVersion("131.0").setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("Welcome.....");
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		System.out.println("Bye....");
		driver.quit();
	}

}
