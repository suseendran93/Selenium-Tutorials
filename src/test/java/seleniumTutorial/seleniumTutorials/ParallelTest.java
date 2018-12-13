package seleniumTutorial.seleniumTutorials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTest {
	static WebDriver driver;

	@Parameters("browser")
	@Test
	public void sessionOne(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("One");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssndr\\Documents\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://toolsqa.com/automation-practice-switch-windows/");
			
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.out.println("Two");
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\ssndr\\Documents\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("http://toolsqa.com/automation-practice-switch-windows/");
			
		} else if (browser.equalsIgnoreCase("edge")) {
			System.out.println("Three");
			System.setProperty("webdriver.edge.driver", "C:\\Users\\ssndr\\Documents\\Drivers\\MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
			driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		}

	}

}
