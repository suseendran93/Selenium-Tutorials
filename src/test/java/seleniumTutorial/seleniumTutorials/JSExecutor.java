package seleniumTutorial.seleniumTutorials;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

public class JSExecutor {
	static WebDriver driver;

	// TODO Auto-generated method stub

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssndr\\Documents\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://toolsqa.com/automation-practice-form/");

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	@Test

	public void test1() {
		WebElement drop = driver.findElement(By.xpath("//select[@id='continents']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('hello world');");
		Alert al = driver.switchTo().alert();
		al.accept();
		js.executeScript("arguments[0].scrollIntoView(true)", drop);
		Select select = new Select(drop);
		select.selectByVisibleText("Europe");
	}

	@Test()
	public void test2() {
		WebElement drop = driver.findElement(By.xpath("//select[@id='continents']"));
		Select select = new Select(drop);
		List<WebElement> options = select.getOptions();
		for (WebElement x : options) {
			System.out.println(x.getText());
		}
	}

	@AfterMethod
	public void quit() {
		driver.quit();
	}

}
